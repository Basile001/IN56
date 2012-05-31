<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Liste des utilisateurs</title>
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
			<a href="accueiladministration.jsp">Accueil Administration</a> |<a href="listeutilisateur.jsp">Liste des utilisateur</a> | <a href="listejeux.jsp">Liste des jeux</a>
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
	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">
	
			// Affiche la liste des users  / Modification / Suppression
			
			<p><center><h3>Inscription</h3></center></p>
			<p><center>Veulliez remplir le formulaire d'inscription</center></p>
			<%
			ArrayList<String> listErrors;
			if(request.getAttribute("errors") != null){
				listErrors = ((ArrayList<String>) request.getAttribute("errors"));
				for(int i = 0; i < listErrors.size(); i++){
					out.println(listErrors.get(i) + "</br>");
				}
			}
			 %>
				<form action="InscriptionAdministrationServlet" method="post">
					<table>
						<tr>
							<td>E-mail :</td>
							<td><input type="text" name="email" value="" /> *</td>
						</tr>
						<tr>
							<td>Login :</td>
							<td><input type="text" name="login" value="" /> *</td>
						</tr>
						<tr>
							<td>Mot de passe :</td>
							<td><input type="password" name="motdepasse" value="" /> Taille minimum 6 caractères / Taille maximum 32 caractères *</td>
						</tr>
						<tr>
							<td>Civilité :</td>
							<td><input type="radio" name="civilite" value="Madame" />Madame
								<input type="radio" name="civilite" value="Mademoiselle" />Mademoiselle
								<input type="radio" name="civilite" value="Monsieur" />Monsieur
								*</td>
						</tr>
						<tr>
							<td>Nom :</td>
							<td><input type="text" name="nom" value="" /> *</td>
						</tr>
						<tr>
							<td>Prénom :</td>
							<td><input type="text" name="prenom" value="" /> *</td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td><input type="text" name="telephone" value="" /></td>
						</tr>
						<tr>
							<td>N° Rue :</td>
							<td><input type="text" name="numero_rue" value="" /></td>
						</tr>
						<tr>
							<td>Rue :</td>
							<td><input type="text" name="rue" value="" /></td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td><input type="text" name="codepostal" value="" /></td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td><input type="text" name="ville" value="" /> *</td>
						</tr>
						<tr>
							<td>Pays :</td>
							<td><input type="text" name="pays" value="" /> *</td>
						</tr>
						<tr>
							<td>Droit :</td>
							<td>limité <input type="radio" name="droit" value="Limite" />
								admin <input type="radio" name="droit" value="Administrateur" />*</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" name="inscription"
								value="Envoyer" /></td>
						</tr>
						<tr>
							<td></td><td>* Champs obligatoires</td>
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

