<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Liste des FAQ</title>
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
		%>
	</div>
	<!-- Ajouter un acc�s au profil quand l'utilisateur est connect� -->
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueiladministration.jsp">Accueil Administration</a> |<a href="listeutilisateur.jsp">Liste des utilisateur</a> | <a href="listejeux.jsp">Liste des jeux</a> | <a href="typejeu.jsp">Liste type de jeu</a>
			| <a href="listejeumois.jsp">Liste des jeux du mois</a> | <a href="listefaq.jsp">Liste des FAQ</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
			<a href="DeconnexionServlet">D�connexion</a>
		</div>
	</div>
	<!-- Ajouter un acc�s au profil quand l'utilisateur est connect� -->
	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueiladministration.jsp">accueiladministration</a></li>
				<li><a href="listeutilisateur.jsp">Liste des utilisateur</a></li>
				<li><a href="listejeumois.jsp">Liste des jeux du mois</a></li>
				<li><a href="listejeux.jsp">Liste des Jeux</a></li>
				<li><a href="typejeu.jsp">Liste type de jeu</a></li>
				<li><a href="listefaq.jsp">Liste des FAQ</a></li>
				<li><a href="newsletters.jsp">Newsletters</a></li>
				<li><a href="accueil.jsp">Retour au site</a></li>
				<li><a href="DeconnexionServlet">D�connexion</a></li>
			</ul>
		</div>
		<div id="bottom_menuv"></div>
	</div>

	// Cr�er un formulaire de la liste des utilisateur
	
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">
				<p>Liste des FAQ</p>
				<form>
					<table>
					// Question / R�ponse  + Bouton Modification + Bouton Suppression
				
				
					</table>
				</form>
				<p>Ajout un type de jeu</p>
				<form method="post" action="AddTypeJeu">
					<table>
						<td>Libell� : </td><td><textarea name="libelle"></textarea></td>
						<td></td><td><input type="submit" name="Envoyer" value="Enregistrer" /></rd>
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
