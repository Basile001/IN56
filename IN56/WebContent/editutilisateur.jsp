<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.dao.UtilisateurDAO"%>
<%@ page import="model.UtilisateurPK"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Edition d'un utilisateur</title>
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
			<div class="element_contenu">
				<center><h2>Editer un utilisateur</h2>
				<%
				
				Utilisateur utilisateur = null;
				utilisateur = UtilisateurDAO.getInstance().load(new UtilisateurPK((String)request.getParameter("login"), (String)request.getParameter("email")));
				
				
				
					ArrayList<String> listErrors;
					if (request.getAttribute("errors") != null) {
						listErrors = ((ArrayList<String>) request.getAttribute("errors"));
						for (int i = 0; i < listErrors.size(); i++) {
							out.println(listErrors.get(i) + "</br>");
						}
					}
					
					
				%>
				<form action="UtilisateurEditServlet" method="post">
					<table>
						<tr>
							<td>E-mail :</td>
							<td><input type="text" name="email" value="<%= utilisateur.getId().getEmail() %>" /> *</td>
						</tr>
						<tr>
							<td>Login :</td>
							<td><input type="text" name="login" value="<%= utilisateur.getId().getLogin() %>" /> *</td>
						</tr>
						<tr>
							<td colspan="2">Taille du mot de passe minimum 6 caractères / Taille maximum 32 caractères *</td>
						</tr>
						<tr>
							<td>Mot de passe :</td>
							<td><input type="password" name="motdepasse" value="<%= utilisateur.getMotdepasse() %>" /></td>
						</tr>
						<tr>
							<td>Civilité :</td>
							<td><input type="radio" name="civilite" value="Madame" <%if(utilisateur.getCivilite().equals("Madame")) out.println("CHECKED"); %>/>Madame
								<input type="radio" name="civilite" value="Mademoiselle" <%if(utilisateur.getCivilite().equals("Mademoiselle")) out.println("CHECKED"); %>/>Mademoiselle
								<input type="radio" name="civilite" value="Monsieur" <%if(utilisateur.getCivilite().equals("Monsieur")) out.println("CHECKED"); %>/>Monsieur
								*</td>
						</tr>
						<tr>
							<td>Nom :</td>
							<td><input type="text" name="nom" value="<%= utilisateur.getNomUtilisateur()  %>"/> *</td>
						</tr>
						<tr>
							<td>Prénom :</td>
							<td><input type="text" name="prenom" value="<%= utilisateur.getPrenomUtilisateur()  %>"/> *</td>
						</tr>
						<tr>
							<td>Téléphone :</td>
							<td><input type="text" name="telephone" value="<%= utilisateur.getTelephone()  %>"/></td>
						</tr>
						<tr>
							<td>N° Rue :</td>
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
							<td>Droit :</td>
							<td>Limité <input type="radio" name="droit" value="0" <%if(utilisateur.getDroit() == 0) out.println("CHECKED"); %> /> Administrateur <input type="radio" name="droit" value="1" <%if(utilisateur.getDroit() == 1) out.println("CHECKED"); %> />*
							</td>
						</tr>
						<tr>
							<td colspan="2" ><center><input type="submit" name="inscription" value="Envoyer" /></center></td>
						</tr>
						<tr>
							<td colspan="2"><center>* Champs obligatoires</center></td>
						</tr>
					</table>
						<input type="hidden" name="emailBase" value="<%= utilisateur.getId().getEmail() %>" />
						<input type="hidden" name="loginBase" value="<%= utilisateur.getId().getLogin() %>" />
				</form>
				</center>
			</div>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
	</div>
</body>
</html>

