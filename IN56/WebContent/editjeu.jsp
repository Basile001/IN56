<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Jeu"%>
<%@ page import="model.dao.JeuDAO"%>
<%@ page import="model.TypeJeu"%>
<%@ page import="model.dao.TypeJeuDAO"%>
<%@ page import="net.sf.hibernate.HibernateException"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Edition d'un jeu</title>
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
				
				<%
				Jeu jeu = null;
				
				long ID = Long.parseLong(request.getParameter("id"));
				try {
					jeu = JeuDAO.getInstance().load(ID);
					
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
				
				
				
				<center>
				<h2>Editer un jeu</h2>
				<form method="post" action="JeuEditServlet">
				<table>
					<tr>
						<td>Titre :</td>
						<td><input type="text" name="titre" value="<%= jeu.getTitreJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Contexte :</td>
						<td><input type="text" name="contexte" value="<%= jeu.getContexteJeu()%>" />*</td>
					</tr>
					<tr>
						<td>Règle :</td>
						<td><input type="text" name="regle" value="<%= jeu.getTitreJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Lien officiel :</td>
						<td><input type="text" name="lien" value="<%= jeu.getLienOfficiel() %>" />*</td>
					</tr>
					<tr>
						<td>Information :</td>
						<td><input type="text" name="info" value="<%= jeu.getInfoJeu() %>" />*</td>
					</tr>
					<tr>
						<td>URL :</td>
						<td><input type="text" name="url" value="<%= jeu.getUrlJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Point :</td>
						<td><input type="text" name="point" value="<%= jeu.getPointJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Materiel :</td>
						<td><input type="text" name="materiel" value="<%= jeu.getMaterielJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Adresse image jeu :</td>
						<td><input type="text" name="image" value="<%= jeu.getAdresseImageJeu() %>" />*</td>
					</tr>
					<tr>
						<td>Type de jeu :</td>
						<td><select name="type">
								<%
									List<TypeJeu> listTypeJeu = null;
									try {
									listTypeJeu = null;
									listTypeJeu = TypeJeuDAO.getInstance().findAll();
									for (TypeJeu typeJeu : listTypeJeu) {
										if(jeu.getIdTypeJeu().getIdTypeJeu()== typeJeu.getIdTypeJeu()){
											out.print("<option type value=\"" + typeJeu.getIdTypeJeu() + "\" selected=\"selected\" >"
													+ typeJeu.getLibelleTypeJeu() + "</option>");
										}else{
											out.print("<option type value=\"" + typeJeu.getIdTypeJeu() + "\" >"
													+ typeJeu.getLibelleTypeJeu() + "</option>");
										}
									}
								} catch (HibernateException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}	
								%>
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><center><input type="submit" name="addJeu" value="Envoyer" /></center></td>
					</tr>
					<tr>
						<td colspan="2"><center>* Champs obligatoires</center></td>
					</tr>
				</table>
					<input type="hidden" name="id" value="<%= Long.valueOf(ID) %>" />
			</form></center>
				
			</div>
		</div>
	</div>
	<div id="bottom">
		<p>Copyright 2012 | AbonGame</p>
	</div>
</body>
</html>

