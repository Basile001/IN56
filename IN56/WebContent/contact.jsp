<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Contact</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div id="header">
		<div id="header_logo">
			<div class="element_logo"></div>
		</div>
		<% 	
		if(request.getSession().getAttribute("Utilisateur") == null){ %>
			<%= "<div id=\"header_connect\">" +
					"<div class=\"element_header_connect\">" +
					"<form action=\"ConnexionServlet\" method=\"post\">" +
						"<table>" +
							"<tr>" +
							"<td>Login</td>" +
							"<td><input type=\"text\" size=\"19\" name=\"login\" /></td>" +
						"</tr>" +
						"<tr>" +
							"<td>Password</td>" +
							"<td><input type=\"password\" size=\"19\" name=\"password\" /></td>" +
						"</tr>" +
						"<tr>" +
							"<td><a href=\"inscription.jsp\"><p class=\"element_header_connect_inscription\"></p></a></td>" +
							"<td><input type=\"submit\" name=\"connexion\" value=\"\" /></td>" +
						"</tr>" +
					"</table>" +
				"</form>" +
			"</div>" +
		"</div>" %>
		<%  }else{ %>
		<%= "<div id=\"header_connect\">" +
			 "<table>" +
				"<tr>" +
					"<td>( <a href=\"profil.jsp\">Profil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">Déconnexion</a> )</td>" +
				"</tr>" +
			"</table>" +
		"</div>" %>
		<% } %>
	</div>
	
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueil.jsp">Accueil</a> | <a href="inscription.jsp">Inscription</a> |
			<% 	if(request.getSession().getAttribute("Utilisateur") == null){
					out.println("<a href=\"connexion.jsp\">Connexion</a> |");
			 } %>	
			 <a href="jeumois.jsp">Jeu du mois</a> | <a href="jeux.jsp">Jeux</a> | <a href="FAQServlet">FAQ</a> | <a href="contact.jsp">Contact</a> |
			 <% if(request.getSession().getAttribute("Utilisateur") != null){
				out.println("<a href=\"profil.jsp\">Profil</a> | <a href=\"DeconnexionServlet\">Déconnexion</a>");
			 } %>
		</div>
	</div>

	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueil.jsp">Accueil</a></li>
				<li><a href="inscription.jsp">Inscription</a></li>
			<% 	if(request.getSession().getAttribute("Utilisateur") == null){
				out.println("<li><a href=\"connexion.jsp\">Connexion</a></li>");
			 } %>
				<li><a href="jeumois.jsp">Jeu du Mois</a></li>
				<li><a href="jeux.jsp">Jeux</a></li>
				<li><a href="FAQServlet">FAQ</a></li>
				<li><a href="contact.jsp">Contact</a></li>
			<% 	if(request.getSession().getAttribute("Utilisateur") != null){
				out.println("<li><a href=\"profil.jsp\">Profil</a></li><li><a href=\"DeconnexionServlet\">Déconnexion</a></li>");
			 } %>
			</ul>
		</div>
		<div id="bottom_menuv"></div>

	</div>

	<div id="corps">
		<div id="contenu">
			<p>Vous pouvez contacter les créateurs de AbonGame à l'aide du formulaire suivant :</p>
			
			<%  
				ArrayList<String> listErrors;
				if( request.getAttribute("errors") != null ){
					listErrors = (ArrayList<String>) request.getAttribute("errors");
					for(int i = 0; i < listErrors.size(); i++){
						out.println(listErrors.get(i) + "</br>");
					}
				}
				
				if(request.getAttribute("valide") != null){
					out.println(request.getAttribute("valide"));
				}
			%>
			
			<form action="ContactServlet" method="post">
				<table>
					<tr>
						<td><center><h2>Message</h2></center></td>
					</tr>
					<tr>
						<td><textarea name="message" cols="60" rows="10" ></textarea></td>
					</tr>
					<tr>
						<td><center><input type="submit" value="Envoyer"/></center></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
		
		<% 	if(request.getSession().getAttribute("Utilisateur") != null){
				// Récupération de l'utilisateur
				Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("Utilisateur");
				if(utilisateur.getDroit() == 2){
					out.println("<p><a href=\"administration.jsp\">Administration</a></p>");
				}
		} %>
	</div>
</body>
</html>
