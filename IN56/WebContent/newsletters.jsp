<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - NewsLetters</title>
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
						+ "<td>( <a href=\"accueil.jsp\">Accueil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">D�connexion</a> )</td>"
						+ "</tr>" + "</table>" + "</div>"%>
	</div>
	<div id="menuh">
		<div class="element_menuh"><a href="accueiladministration.jsp">Administration</a> | <a href="UtilisateurListServlet">Utilisateurs</a> | <a href="JeuListServlet">Jeux</a> | <a href="TypeJeuListServlet">Type de jeu</a> | <a href="listejeumois.jsp">Jeux du mois</a> | <a href="FAQListServlet">FAQs</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
			<a href="DeconnexionServlet">D�connexion</a>
		</div>
	</div>
	<!-- Ajouter un acc�s au profil quand l'utilisateur est connect� -->
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
				<li><a href="DeconnexionServlet">D�connexion</a></li>
			</ul>
		</div>
		
		<div id="bottom_menuv"></div>
	</div>
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">
			<form action="NewslettersServlet" method="post">
				<center><h2>Newsletters</h2></center>
				<center><p>Veuillez entrer la newsletters � envoyer.</p></center>
				<%
					ArrayList<String> listErrors;
					if( request.getAttribute("errors") != null ){
						listErrors = (ArrayList<String>) request.getAttribute("errors");
						for(int i = 0; i < listErrors.size(); i++){
							out.println(listErrors.get(i) + "</br>");
						}
					}
					
					if(request.getAttribute("valide") != null){
						out.println((String) request.getAttribute("valide"));
					}
				%>
				<center><table>
					<tr>
						<td><textarea name="message" cols="60" rows="10" ></textarea></td>
					</tr>
					<tr>
						<td><center><input type="submit" value="Envoyer"/></center></td>
					</tr>
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

