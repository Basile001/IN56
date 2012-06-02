<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.TypeJeu"%>
<%@ page import="model.dao.TypeJeuDAO"%>
<%@ page import="net.sf.hibernate.HibernateException"%>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Edition d'un Type de Jeu </title>
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
			<a href="accueiladministration.jsp">Administration</a> |<a href="UtilisateurListServlet">Utilisateurs</a> | <a href="JeuListServlet">Jeux</a> | <a href="TypeJeuListServlet">Type de jeu</a>
			| <a href="listejeumois.jsp">Jeux du mois</a> | <a href="FAQListServlet">FAQs</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
			<a href="DeconnexionServlet">Déconnexion</a>
		</div>
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueiladministration.jsp">Accueil Administration</a></li>
				<li><a href="UtilisateurListServlet">Liste des utilisateur</a></li>
				<li><a href="listejeumois.jsp">Liste des jeux du mois</a></li>
				<li><a href="JeuListServlet">Liste des Jeux</a></li>
				<li><a href="TypeJeuListServlet">Liste type de jeu</a></li>
				<li><a href="FAQListServlet">Liste des FAQ</a></li>
				<li><a href="newsletters.jsp">Newsletters</a></li>
				<li><a href="accueil.jsp">Retour au site</a></li>
				<li><a href="DeconnexionServlet">Déconnexion</a></li>
			</ul>
		</div>
		
		<div id="bottom_menuv"></div>
	</div>
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">
				</form>
				<center><h2>Editer un Type de Jeu</h2></center>
				<%
				TypeJeu typeJeu= null;
				
				long ID = Long.parseLong(request.getParameter("id"));
				try {
					typeJeu = TypeJeuDAO.getInstance().load(ID);
				} catch (HibernateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				ArrayList<String> listErrors;
				if( request.getAttribute("errors") != null ){
					listErrors = (ArrayList<String>) request.getAttribute("errors");
					for(int i = 0; i < listErrors.size(); i++){
						out.println(listErrors.get(i) + "</br>");
					}
				}
				
				%>
				<form method="get" action="TypeJeuEditServlet">
					<center><table>
					<tr>
						<td>Libellé : </td><td><input type="text" name="libelle" value="<% if(request.getAttribute("libelle") != null && ((String) request.getAttribute("libelle")) != ""){ 
								out.print((String) request.getAttribute("libelle"));
							}else{
								out.println(typeJeu.getLibelleTypeJeu());
							} %>"/></td>
					</tr>
					<tr>
						<td colspan="2"><center><input type="submit" name="Envoyer" value="Enregistrer" /></center></td>
					</tr>
					<input type="hidden" name="id" value="<%= Long.valueOf(ID) %>" />
					</table></center>					
				</form>
			</div>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
	</div>
</body>
</html>

