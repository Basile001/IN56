<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.Jeu"%>
<%@ page import="model.TypeJeu"%>
<%@ page import="model.dao.TypeJeuDAO"%>
<%@ page import="net.sf.hibernate.HibernateException"%>
<%@ page import="net.sf.hibernate.Query"%>
<%@ page import="net.sf.hibernate.Session"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Liste des Jeux</title>
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
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu"></div>
			<center><h2>Recherche d'un jeu</h2>
				<form method="post" action="JeuListServlet">
					<table>
						<tr>
							<th>Recherche par titre</th>
							<td><input type="text" name="titre" /></td>
							<td><input type="submit" name="Rechercher"
								value="Rechercher" /></td>
						</tr>
					</table>
				</form>
				<h2>Liste des jeux</h2>
				<%
					ArrayList<String> listErrors;
					if( request.getAttribute("errors") != null ){
						listErrors = (ArrayList<String>) request.getAttribute("errors");
						for(int i = 0; i < listErrors.size(); i++){
							out.println(listErrors.get(i) + "</br>");
						}
					}
					
		
					ArrayList<Jeu> listJeu = null;
					if (request.getAttribute("listJeu") != null)
						listJeu = (ArrayList<Jeu>) request.getAttribute("listJeu");
					if (listJeu != null && listJeu.size() > 0) {
						out.println("<table>");
				%>
				<tr>
					<th>Titre</th>
					<th>|</th>
					<th>Action</th>
				</tr>

				<%
					for (Jeu jeu : listJeu) {
							out.println("<tr>");
							out.println("<td>");
							out.println(jeu.getTitreJeu());
							out.println("</td>");
							out.println("<td>");
							out.println("|");
							out.println("</td>");
							out.println("<td>");
							out.println("<a href=\"editjeu.jsp?id="
									+ jeu.getIdJeu() + "\">Modifier</a>");
							out.println(" | <a href=\"JeuRemoveServlet?id="
									+ jeu.getIdJeu()+ "\">Supprimer</a>");
							out.println("</td>");
							out.println("</tr>");
						}
						out.println("</table>");
					} else {
						out.println("<p>Aucun jeu</p>");
					}
				%>
			<h2>Ajout d'un jeu</h2>
			<form method="post" action="AddJeuServlet">
				<table>
					<tr>
						<th>Titre</th>
					</tr>
					<tr>
						<td><center><input type="text" name="titre" value="" /></center></td>
					</tr>
					<tr>
						<th>Contexte</th>
					</tr>
					<tr>
						<td><textarea  name="contexte"  cols="60" rows="3"></textarea></td>
					</tr>
					<tr>
						<th>Règle</th>
					</tr>
					<tr>
						<td><textarea  name="regle"  cols="60" rows="3"></textarea></td>
					</tr>
					<tr>
						<th>Lien officiel</th>
					</tr>
					<tr>
						<td><center><input type="text" name="lien" value="" /></center></td>
					</tr>
					<tr>
						<th>Information</th>
					</tr>
					<tr>
						<td><center><textarea  name="info"  cols="60" rows="3"></textarea></center></td>
					</tr>
					<tr>
						<th>Lien pour jouer</th>
					</tr>
					<tr>
						<td><center><input type="text" name="url" value="" /></center></td>
					</tr>
					<tr>
						<th>Points</th>
					</tr>
					<tr>
						<td><center><textarea  name="point"  cols="60" rows="3"></textarea></center></td>
					</tr>
					<tr>
						<th>Materiel</th>
					</tr>
					<tr>
						<td><center><textarea  name="materiel"  cols="60" rows="3"></textarea></center></td>
					</tr>
					<tr>
						<th>Adresse image jeu</th>
					</tr>
					<tr>
						<td><center><input type="text" name="image" value="" /></center></td>
					</tr>
					<tr>
						<th>Type de jeu</th>
					</tr>
					<tr>
						<td><center><select name="type">
								<%
									List<TypeJeu> listTypeJeu = null;
									try {
									listTypeJeu = TypeJeuDAO.getInstance().findAll();
									for (TypeJeu typeJeu : listTypeJeu) {
										out.print("<option type value=\"" + typeJeu.getIdTypeJeu() + "\">"
												+ typeJeu.getLibelleTypeJeu() + "</option>");
									}
								} catch (HibernateException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
									
								%>
						</select></center></td>
					</tr>
					<tr>
						<td><center><input type="submit" name="addJeu" value="Envoyer" /></center></td>
					</tr>
					<tr>
						<td><center>Tous les champs obligatoires</center></td>
					</tr>
				</table>
			</form></center>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
	</div>
</body>
</html>

