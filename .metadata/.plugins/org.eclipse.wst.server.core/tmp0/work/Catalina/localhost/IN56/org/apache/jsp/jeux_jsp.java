package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Utilisateur;

public final class jeux_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n");
      out.write("<title>AbonGame - Liste des Jeux</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div id=\"header_logo\">\r\n");
      out.write("\t\t\t<div class=\"element_logo\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
 	
		if(request.getSession().getAttribute("Utilisateur") == null){ 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print( "<div id=\"header_connect\">" +
					"<div class=\"element_header_connect\">" +
					"<form action=\"ConnexionServlet\" method=\"post\">" +
						"<table>" +
							"<tr>" +
							"<td>Login</td>" +
							"<td><input type=\"text\" size=\"19\" name=\"login\" /></td>" +
						"</tr>" +
						"<tr>" +
							"<td>Password</td>" +
							"<td><input type=\"password\" size=\"19\" name=\"password\" /></td>" +
						"</tr>" +
						"<tr>" +
							"<td><a href=\"inscription.jsp\"><p class=\"element_header_connect_inscription\"></p></a></td>" +
							"<td><input type=\"submit\" name=\"connexion\" value=\"\" /></td>" +
						"</tr>" +
					"</table>" +
				"</form>" +
			"</div>" +
		"</div>" );
      out.write("\r\n");
      out.write("\t\t");
  }else{ 
      out.write("\r\n");
      out.write("\t\t");
      out.print( "<div id=\"header_connect\">" +
			 "<table>" +
				"<tr>" +
					"<td>( <a href=\"profil.jsp\">Profil</a></td><td>|</td><td><a href=\"DeconnexionServlet\">Déconnexion</a> )</td>" +
				"</tr>" +
			"</table>" +
		"</div>" );
      out.write("\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->\r\n");
      out.write("\t<div id=\"menuh\">\r\n");
      out.write("\t\t<div class=\"element_menuh\">\r\n");
      out.write("\t\t\t<a href=\"accueil.jsp\">Accueil</a> | <a href=\"inscription.jsp\">Inscription</a> |\r\n");
      out.write("\t\t\t");
 	if(request.getSession().getAttribute("Utilisateur") == null){
					out.println("<a href=\"connexion.jsp\">Connexion</a> |");
			 } 
      out.write("\t\r\n");
      out.write("\t\t\t <a href=\"jeumois.jsp\">Jeu du mois</a> | <a href=\"jeux.jsp\">Jeux</a> | <a href=\"faq.jsp\">FAQ</a> | <a href=\"contact.jsp\">Contact</a> |\r\n");
      out.write("\t\t\t ");
 if(request.getSession().getAttribute("Utilisateur") != null){
				out.println("<a href=\"profil.jsp\">Profil</a> | <a href=\"DeconnexionServlet\">Déconnexion</a>");
			 } 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Ajouter un accès au profil quand l'utilisateur est connecté -->\r\n");
      out.write("\t<div id=\"menuv\">\r\n");
      out.write("\t\t<div id=\"top_menuv\"></div>\r\n");
      out.write("\t\t<div class=\"element_menuv\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"accueil.jsp\">Accueil</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"inscription.jsp\">Inscription</a></li>\r\n");
      out.write("\t\t\t\t");
 	if(request.getSession().getAttribute("Utilisateur") == null){
					out.println("<li><a href=\"connexion.jsp\">Connexion</a></li>");
			 	} 
      out.write("\r\n");
      out.write("\t\t\t\t<li><a href=\"jeumois.jsp\">Jeu du Mois</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"jeux.jsp\">Jeux</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"faq.jsp\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t");
 	if(request.getSession().getAttribute("Utilisateur") != null){
				out.println("<li><a href=\"profil.jsp\">Profil</a></li><li><a href=\"DeconnexionServlet\">Déconnexion</a></li>");
			 } 
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"bottom_menuv\"></div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"corps\">\r\n");
      out.write("\t\t<div id=\"contenu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p>En Construction</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p>Prochainement</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"bottom\">\r\n");
      out.write("\t\t<p>Copyright 2012 | AbonGame</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 	if(request.getSession().getAttribute("Utilisateur") != null){
				// Récupération de l'utilisateur
				Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("Utilisateur");
				if(utilisateur.getDroit() == 2){
					out.println("<p><a href=\"administration.jsp\">Administration</a></p>");
				}
		} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
