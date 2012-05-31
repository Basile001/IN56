<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="java.util.ArrayList"%>
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
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueiladministration.jsp">Accueil Administration</a> |<a
				href="listeutilisateur.jsp">Liste des utilisateur</a> | <a
				href="listejeux.jsp">Liste des jeux</a> | <a href="listejeumois.jsp">Liste
				des jeux du mois</a> | <a href="listefaq.jsp">Liste des FAQ</a> | <a
				href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour
				au site</a> | <a href="DeconnexionServlet">Déconnexion</a>
		</div>
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueiladministration.jsp">Accueil
						Administration</a></li>
				<li><a href="UtilisateurListServlet">Liste des utilisateur</a></li>
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


				<p>Recherche d'un utilisateur</p>
				<form method="post" action="UtilisateurListServlet">
					<table>
						<tr>
							<td><input type="text" name="login" /></td>
							<td><input type="submit" name="Rechercher"
								value="Rechercher" /></td>
						</tr>
					</table>
				</form>
				<p>Liste des utilisateur</p>
				<%
					ArrayList<Utilisateur> listUtilisateur = null;
					if (request.getAttribute("listUtilisateur") != null)
						listUtilisateur = (ArrayList<Utilisateur>) request.getAttribute("listUtilisateur");
					if (listUtilisateur != null && listUtilisateur.size() > 0) {
						out.println("<table border=\"1\"");
				%>
				<tr>
					<th>Login</th>
					<th>Email</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Action</th>
				</tr>

				<%
					for (Utilisateur utilisateur : listUtilisateur) {

							out.println("<tr>");
							out.println("<td>");
							out.println(utilisateur.getId().getLogin());
							out.println("</td>");
							out.println("<td>");
							out.println(utilisateur.getId().getEmail());
							out.println("</td>");
							out.println("<td>");
							out.println(utilisateur.getNomUtilisateur());
							out.println("</td>");
							out.println("<td>");
							out.println(utilisateur.getPrenomUtilisateur());
							out.println("</td>");
							out.println("<td>");
							out.println("<a href=\"editutilisateur.jsp?email="
									+ utilisateur.getId().getEmail() + "&login="
									+ utilisateur.getId().getLogin()
									+ "\">Modifier</a> ");
							out.println(" <a href=\"UtilisateurRemoveServlet?email="
									+ utilisateur.getId().getEmail() + "&login="
									+ utilisateur.getId().getLogin()
									+ "\">Supprimer</a>");
							out.println("</td>");
							out.println("</tr>");
						}
						out.println("</table>");
					} else {
						out.println("<p>Aucune FAQ</p>");
					}
				%>
				<p>Ajout d'un utilisateur</p>
				<%
					ArrayList<String> listErrors;
					if (request.getAttribute("errors") != null) {
						listErrors = ((ArrayList<String>) request.getAttribute("errors"));
						for (int i = 0; i < listErrors.size(); i++) {
							out.println(listErrors.get(i) + "</br>");
						}
					}

					if (request.getAttribute("valide") != null) {
						out.println((String) request.getAttribute("valide"));
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
							<td><input type="password" name="motdepasse" value="" />
								Taille minimum 6 caractères / Taille maximum 32 caractères *</td>
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
							<td>Limité <input type="radio" name="droit" value="0"
								CHECKED /> Admin <input type="radio" name="droit" value="1" />*
							</td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" name="inscription" value="Envoyer" /></td>
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

