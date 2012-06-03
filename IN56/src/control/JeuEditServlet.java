package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Jeu;
import model.TypeJeu;
import model.dao.JeuDAO;
import model.dao.QuestionReponseDAO;
import model.dao.TypeJeuDAO;
import net.sf.hibernate.HibernateException;

/**
 * Servlet implementation class JeuEditServlet
 */
public class JeuEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JeuEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Jeu jeu = new Jeu();

		long ID = Long.parseLong(request.getParameter("id"));
		try {
			jeu = JeuDAO.getInstance().load(ID);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		String titre="";
		String contexte="";
		String regle="";
		String lien="";
		String info="";
		String url="";
		String point="";
		String materiel="";
		String image="";
		String type="";
		
		if(request.getParameter("titre") != null && request.getParameter("titre") != "" ){
			titre = (String) request.getParameter("titre");
		}else{
			listErrors.add("le titre est obligatoire");
		}
		if(request.getParameter("contexte") != null && request.getParameter("contexte").replaceAll("[\r\n]+", "")!= "" ){
			contexte = (String) request.getParameter("contexte").replaceAll("[\r\n]+", "");
		}else{
			listErrors.add("le contexte est obligatoire");
		}
		if(request.getParameter("regle") != null && request.getParameter("regle").replaceAll("[\r\n]+", "") != "" ){
			regle = (String) request.getParameter("regle").replaceAll("[\r\n]+", "");
		}else{
			listErrors.add("les regles sont obligatoires");
		}
		if(request.getParameter("lien") != null && request.getParameter("lien") != "" ){
			lien = (String) request.getParameter("lien");
		}else{
			listErrors.add("le lien est obligatoire");
		}
		if(request.getParameter("info") != null && request.getParameter("info").replaceAll("[\r\n]+", "") != "" ){
			info = (String) request.getParameter("info").replaceAll("[\r\n]+", "");
		}else{
			listErrors.add("l'info est obligatoire");
		}
		if(request.getParameter("url") != null && request.getParameter("url") != "" ){
			url = (String) request.getParameter("url");
		}else{
			listErrors.add("l'url est obligatoire");
		}
		if(request.getParameter("point") != null && request.getParameter("point").replaceAll("[\r\n]+", "") != "" ){
			point = (String) request.getParameter("point").replaceAll("[\r\n]+", "");
		}else{
			listErrors.add("le point est obligatoire");
		}
		if(request.getParameter("materiel") != null && request.getParameter("materiel").replaceAll("[\r\n]+", "") != "" ){
			materiel = (String) request.getParameter("materiel").replaceAll("[\r\n]+", "");
		}else{
			listErrors.add("le materiel est obligatoire");
		}
		if(request.getParameter("image") != null && request.getParameter("image") != "" ){
			image = (String) request.getParameter("image");
		}else{
			listErrors.add("l'image est obligatoire");
		}
		if(request.getParameter("type") != null && request.getParameter("type") != "" ){
			type = (String) request.getParameter("type");
		}else{
			listErrors.add("type est obligatoire");
		}
		
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("editjeu.jsp");
			dis.forward(request, response);
		}
		else{
			
			jeu.setTitreJeu(titre);
			jeu.setContexteJeu(contexte);
			jeu.setRegleJeu(regle);
			jeu.setLienOfficiel(lien);
			jeu.setInfoJeu(info);
			jeu.setUrlJeu(url);
			jeu.setPointJeu(point);
			jeu.setMaterielJeu(materiel);
			jeu.setAdresseImageJeu(image);
			
			try {
				TypeJeu typejeu = TypeJeuDAO.getInstance().load(Long.parseLong(type));
				jeu.setIdTypeJeu(typejeu);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			try {
				JeuDAO.getInstance().update(jeu);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect(response.encodeRedirectURL("JeuListServlet"));
		}
	}

}
