<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
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
		%>
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueiladministration.jsp">Accueil Administration</a> |<a href="listeutilisateur.jsp">Liste des utilisateur</a> | <a href="listejeux.jsp">Liste des jeux</a> | <a href="typejeu.jsp">Liste type de jeu</a>
			| <a href="listejeumois.jsp">Liste des jeux du mois</a> | <a href="listefaq.jsp">Liste des FAQ</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
			<a href="DeconnexionServlet">Déconnexion</a>
		</div>
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
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
				<li><a href="DeconnexionServlet">Déconnexion</a></li>
			</ul>
		</div>
		<div id="bottom_menuv"></div>
	</div>
	// Affichage des jeux + Ajout en jeu du mois +  Modifier + Supprimer 
	<p>Ajout d'un jeu</p>
		<form method="post" action="AddJeuServlet">
			<table>
						<tr>
							<td>Titre :</td>
							<td><input type="text" name="titre" value="" /> *</td>
						</tr>
						<tr>
							<td>Contexte :</td>
							<td><input type="text" name="contexte" value="" /> *</td>
						</tr>
						<tr>
							<td>Règle :</td>
							<td><input type="text" name="regle" value="" />*</td> 
						</tr>
						<tr>
							<td>Lien officiel :</td>
							<td><input type="text" name="lien" value="" /> *</td>
						</tr>
						<tr>
							<td>Information :</td>
							<td><input type="text" name="info" value="" /> *</td>
						</tr>
						<tr>
							<td>URL :</td>
							<td><input type="text" name="url" value="" /></td>
						</tr>
						<tr>
							<td>Point :</td>
							<td><input type="text" name="point" value="" /></td>
						</tr>
						<tr>
							<td>Materiel :</td>
							<td><input type="text" name="materiel" value="" /></td>
						</tr>
						<tr>
							<td>Adresse image jeu :</td>
							<td><input type="text" name="image" value="" /></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" name="addJeu"
								value="Envoyer" /></td>
						</tr>
						<tr>
							<td></td><td>* Champs obligatoires</td>
						</tr>
						
						// ajouter combobox pour type de jeu 
			</table>
		</form>
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">

			</div>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
	</div>
</body>
</html>

