<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.QuestionReponse"%>
<%@ page import="model.dao.QuestionReponseDAO"%>
<%@ page import="net.sf.hibernate.HibernateException"%>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>AbonGame - Administration - Edition d'une FAQ</title>
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
				<li><a href="accueiladministration.jsp">Accueil Administration</a></li>
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
				</form>
				<p>Edition d'une FAQ</p>
				<%
				QuestionReponse questionReponse = null;
				
				long ID = Long.parseLong(request.getParameter("id"));
				try {
					questionReponse = QuestionReponseDAO.getInstance().load(ID);
					
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
				<form method="get" action="FAQEditServlet">
					<table>
					<tr>
						<td>Question : </td><td><textarea name="question" cols="60" rows="3" ><% if(request.getAttribute("question") != null && ((String) request.getAttribute("question")) != ""){ 
								out.print((String) request.getAttribute("question"));
							}else{
								out.println(questionReponse.getQuestion());
							} %></textarea></td>
					</tr>
					<tr>
						<td>Réponse : </td><td><textarea name="reponse" cols="60" rows="3" ><% if(request.getAttribute("reponse") != null && ((String) request.getAttribute("reponse")) != ""){
								out.print((String) request.getAttribute("reponse"));
							}else{
								out.println(questionReponse.getReponse());
							}
							%></textarea></td>
					</tr>
					<tr>
						<td></td><td><input type="submit" name="Envoyer" value="Enregistrer" /></rd>
					</tr>
					<input type="hidden" name="id" value="<%= Long.valueOf(ID) %>" />
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

