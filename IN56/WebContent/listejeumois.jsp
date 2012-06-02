<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.Jeu"%>
<%@ page import="model.dao._RootDAO"%>
<%@ page import="net.sf.hibernate.HibernateException"%>
<%@ page import="net.sf.hibernate.Query"%>
<%@ page import="net.sf.hibernate.Session"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Accueil Administration</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<div id="header">
		<div id="header_logo">
			<div class="element_logo"></div>
		</div>
		<%="<div id=\"header_connect\">"
					+ "<table>"
					+ "<tr>"
					+ "<td>( <a href=\"accueil.jsp\">Accueil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">Déconnexion</a> )</td>"
					+ "</tr>" + "</table>" + "</div>"%>
		
	</div>
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueiladministration.jsp">Administration</a> | <a href="UtilisateurListServlet">Utilisateurs</a> | <a href="JeuListServlet">Jeux</a> | <a href="TypeJeuListServlet">Type de jeu</a>
			| <a href="listejeumois.jsp">Jeux du mois</a> | <a href="FAQListServlet">FAQs</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
			<a href="DeconnexionServlet">Déconnexion</a>
		</div>
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueiladministration.jsp">Administration</a></li>
				<li><a href="UtilisateurListServlet">Utilisateurs</a></li>
				<li><a href="listejeumois.jsp">Jeux du mois</a></li>
				<li><a href="JeuListServlet">Jeux</a></li>
				<li><a href="TypeJeuListServlet">Type de jeu</a></li>
				<li><a href="FAQListServlet">FAQs</a></li>
				<li><a href="newsletters.jsp">Newsletters</a></li>
				<li><a href="accueil.jsp">Retour au site</a></li>
				<li><a href="DeconnexionServlet">Déconnexion</a></li>
			</ul>
		</div>
		
		<div id="bottom_menuv"></div>
	</div>

	<%
		try {
			_RootDAO.initialize();
			Session session1 = _RootDAO.createSession();
			Query query = session1.createQuery("SELECT j FROM Jeu j");
			List<Jeu> jeu = query.list();
			request.setAttribute("jeux", jeu);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	%>


	<form>
		<div id="corps">
			<div id="contenu">
				<div class="element_contenu">
					<form method="post" action="AddJeuMoisServlet">
						<table>
							<tr>
								<td>Conseil</td>
								<td><input type="text" name="conseil" value="" />*</td>
							</tr>
							<tr>
								<td>Mois</td>
								<td><input type="text" name="mois" value="" />* dd-mm-yyyy</td>
							</tr>
							<tr>
								<td>Jeu du mois :</td>
								<td><select name="jeu">
										<%
											for (Jeu jeu : (ArrayList<Jeu>) request.getAttribute("jeux")) {
												out.print("<option type value=\"" + jeu.getIdJeu() + "\">"
														+ jeu.getTitreJeu() + "</option>");
											}
										%>

								</select></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="submit" name="addJeuMois" value="Envoyer" /></td>
							</tr>
							<tr>
								<td></td>
								<td>* Champs obligatoires</td>
							</tr>
						</table>
					</form>
				</div>
			</div>
		</div>
		<div id="bottom">
			<p>Copyright 2012 | AbonGame</p>
		</div>
</body>
</html>

