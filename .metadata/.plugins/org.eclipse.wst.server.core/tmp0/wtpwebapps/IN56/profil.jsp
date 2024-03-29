<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Profil</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div id="header">
		<div id="header_logo">
			<div class="element_logo"></div>
		</div>
		<%
			if (request.getSession().getAttribute("Utilisateur") == null) {
		%>
		<%="<div id=\"header_connect\">"
						+ "<div class=\"element_header_connect\">"
						+ "<form action=\"ConnexionServlet\" method=\"post\">"
						+ "<table>"
						+ "<tr>"
						+ "<td>Login</td>"
						+ "<td><input type=\"text\" size=\"19\" name=\"login\" /></td>"
						+ "</tr>"
						+ "<tr>"
						+ "<td>Password</td>"
						+ "<td><input type=\"password\" size=\"19\" name=\"password\" /></td>"
						+ "</tr>"
						+ "<tr>"
						+ "<td><a href=\"inscription.jsp\"><p class=\"element_header_connect_inscription\"></p></a></td>"
						+ "<td><input type=\"submit\" name=\"connexion\" value=\"\" /></td>"
						+ "</tr>" + "</table>" + "</form>" + "</div>"
						+ "</div>"%>
		<%
			} else {
		%>
		<%="<div id=\"header_connect\">"
						+ "<table>"
						+ "<tr>"
						+ "<td>( <a href=\"profil.jsp\">Profil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">D�connexion</a> )</td>"
						+ "</tr>" + "</table>" + "</div>"%>
		<%
			}
		%>
	</div>

	<!-- Ajouter un acc�s au profil quand l'utilisateur est connect� -->
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueil.jsp">Accueil</a> | <a href="inscription.jsp">Inscription</a>
			|
			<%
				if (request.getSession().getAttribute("Utilisateur") == null) {
					out.println("<a href=\"connexion.jsp\">Connexion</a> |");
				}
			%>
			<a href="jeumois.jsp">Jeu du mois</a> | <a href="jeux.jsp">Jeux</a> |
			<a href="faq.jsp">FAQ</a> | <a href="contact.jsp">Contact</a> |
			<%
				if (request.getSession().getAttribute("Utilisateur") != null) {
					out.println("<a href=\"profil.jsp\">Profil</a> | <a href=\"DeconnexionServlet\">D�connexion</a>");
				}
			%>
		</div>
	</div>


	<!-- Ajouter un acc�s au profil quand l'utilisateur est connect� -->
	<div id="menuv">
		<div id="top_menuv"></div>
		<div class="element_menuv">
			<ul>
				<li><a href="accueil.jsp">Accueil</a></li>
				<li><a href="inscription.jsp">Inscription</a></li>
				<%
					if (request.getSession().getAttribute("Utilisateur") == null) {
						out.println("<li><a href=\"connexion.jsp\">Connexion</a></li>");
					}
				%>
				<li><a href="jeumois.jsp">Jeu du Mois</a></li>
				<li><a href="jeux.jsp">Jeux</a></li>
				<li><a href="faq.jsp">FAQ</a></li>
				<li><a href="contact.jsp">Contact</a></li>
				<%
					if (request.getSession().getAttribute("Utilisateur") != null) {
						out.println("<li><a href=\"profil.jsp\">Profil</a></li><li><a href=\"DeconnexionServlet\">D�connexion</a></li>");
					}
				%>
			</ul>
		</div>
		<div id="bottom_menuv"></div>

	</div>

	<%
		HttpSession sessionLogin = request.getSession();
		Utilisateur utilisateur = ((Utilisateur)sessionLogin.getAttribute("Utilisateur"));
	%>

	<div id="corps">
		<div id="contenu">
			<div class="element_contenu">
				<form action="ProfilServlet" method="post">
					<table>
						<tr>
							<td>E-mail :</td>
							<td><input type="text" name="email" value="<%= utilisateur.getId().getEmail()  %>" /> *</td>
						</tr>
						<tr>
							<td>Login :</td>
							<td><input type="text" name="login" value="<%= utilisateur.getId().getLogin()  %>" /> *</td>
						</tr>
						<tr>
							<td>Civilit� :</td>
							<td><input type="radio" name="civilite" value="Madame" />Madame
								<input type="radio" name="civilite" value="Mademoiselle" />Mademoiselle
								<input type="radio" name="civilite" value="Monsieur" />Monsieur
								*</td>
						</tr>
						<tr>
							<td>Nom :</td>
							<td><input type="text" name="nom" value="<%= utilisateur.getNomUtilisateur()  %>"/> *</td>
						</tr>
						<tr>
							<td>Pr�nom :</td>
							<td><input type="text" name="prenom" value="<%= utilisateur.getPrenomUtilisateur()  %>"/> *</td>
						</tr>
						<tr>
							<td>T�l�phone :</td>
							<td><input type="text" name="telephone" value="<%= utilisateur.getTelephone()  %>"/></td>
						</tr>
						<tr>
							<td>N� Rue :</td>
							<td><input type="text" name="numero_rue" value="<%= utilisateur.getNumrue()  %>"/></td>
						</tr>
						<tr>
							<td>Rue :</td>
							<td><input type="text" name="rue" value="<%= utilisateur.getRue()  %>" /></td>
						</tr>
						<tr>
							<td>Code Postal :</td>
							<td><input type="text" name="codepostal" value="<%= utilisateur.getCodepostal()  %>" /></td>
						</tr>
						<tr>
							<td>Ville :</td>
							<td><input type="text" name="ville" value="<%= utilisateur.getVille()  %>" /> *</td>
						</tr>
						<tr>
							<td>Pays :</td>
							<td><input type="text" name="pays" value="<%= utilisateur.getPays()  %>" /> *</td>
						</tr>
						<tr>
							<td>Abonnement :</td>
							<td><input type="text" name="abonnement"  /> *</td>
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
		<p>Copyright 2012 | AbonGame |

		<%
			if (request.getSession().getAttribute("Utilisateur") != null) {
				// R�cup�ration de l'utilisateur
				utilisateur = (Utilisateur) request.getSession()
						.getAttribute("Utilisateur");
				if (utilisateur.getDroit() == 1) {
					out.println("<p><a href=\"administration.jsp\">Administration</a></p>");
				}
			}
		%>
		 </p>
	</div>
</body>
</html>

