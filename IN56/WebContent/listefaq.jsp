<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Utilisateur"%>
<%@ page import="model.QuestionReponse"%>
<%@ page import="java.util.ArrayList" %>

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
						+ "<td>( <a href=\"accueil.jsp\">Accueil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">Déconnexion</a> )</td>"
						+ "</tr>" + "</table>" + "</div>"%>
		
	</div>
	<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->
	<div id="menuh">
		<div class="element_menuh">
			<a href="accueiladministration.jsp">Accueil Administration</a> |<a href="listeutilisateur.jsp">Liste des utilisateur</a> | <a href="listejeux.jsp">Liste des jeux</a> | <a href="typejeu.jsp">Liste type de jeu</a>
			| <a href="listejeumois.jsp">Liste des jeux du mois</a> | <a href="FAQListServlet">Liste des FAQ</a> | <a href="newsletters.jsp">Newsletters</a> | <a href="accueil.jsp">Retour au site</a> |
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
				<li><a href="FAQListServlet">Liste des FAQ</a></li>
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
				<center><p><h2>Liste des FAQ</h2></p></center>
					<% ArrayList<QuestionReponse> FAQ= null;
					if(request.getAttribute("FAQ") != null ) FAQ = (ArrayList<QuestionReponse>) request.getAttribute("FAQ");
					if(FAQ != null && FAQ.size() > 0){
						out.println("<center><table border=\"1\"");
						for(QuestionReponse questionReponse : FAQ){
							
								out.println("<tr>");
									out.println("<th>");
										out.println("Question");
									out.println("</th>");
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><textarea name=\"reponse\" cols=\"60\" rows=\"3\" readonly=\"\">");
									out.println(questionReponse.getQuestion());
									out.println("</textarea></td>");
								out.println("</tr>");
								out.println("<tr>");
									out.println("<th>");
										out.println("Réponse");
									out.println("</th>");
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><textarea name=\"question\" cols=\"60\" rows=\"3\" readonly=\"\">");
										out.println(questionReponse.getReponse());
									out.println("</textarea></td>");
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td>");
										out.println("<a href=\"editfaq.jsp?id="+ questionReponse.getIdQuestionReponse() + "\">Modifier</a> ");
										out.println(" <a href=\"FAQRemoveServlet?id=" + questionReponse.getIdQuestionReponse() +"\">Supprimer</a>");
									out.println("</td>");
							out.println("</tr>");
							
						}
						out.println("</table></center>");
					}else{
						out.println("<p>Aucune FAQ</p>");
					}
					%>
				<center><p>Ajouter une FAQ</p></center>
				<%
				
				ArrayList<String> listErrors;
				if( request.getAttribute("errors") != null ){
					listErrors = (ArrayList<String>) request.getAttribute("errors");
					for(int i = 0; i < listErrors.size(); i++){
						out.println(listErrors.get(i) + "</br>");
					}
				}
				
				%>
				<form method="post" action="AddFAQServlet">
					<table>
					<tr>
						<td>Question : </td><td><textarea name="question" cols="60" rows="3" ><% if(request.getAttribute("question") != null) out.print((String) request.getAttribute("question")); %></textarea></td>
					</tr>
					<tr>
						<td>Réponse : </td><td><textarea name="reponse" cols="60" rows="3" ><% if(request.getAttribute("reponse") != null) out.print((String) request.getAttribute("reponse")); %></textarea></td>
					</tr>
					<tr>
						<td></td><td><input type="submit" name="Envoyer" value="Enregistrer" /></rd>
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

