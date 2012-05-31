package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuestionReponse;
import model.TypeJeu;
import model.dao.QuestionReponseDAO;
import model.dao.TypeJeuDAO;
import net.sf.hibernate.HibernateException;

/**
 * Servlet implementation class TypeJeuEditServlet
 */
public class TypeJeuEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeJeuEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TypeJeuDAO typeJeuDAO = new TypeJeuDAO();
		TypeJeu typeJeu = null;
		long ID = Long.parseLong(request.getParameter("id"));
		try {
			typeJeu = typeJeuDAO.load(ID);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		// Variable du formulaire
		String libelle = "";
		
		
		if(request.getParameter("libelle") != null && request.getParameter("libelle") != "" ){
			// Vérification de la taille de la question
			if(((String)request.getParameter("libelle")).length() > 126){
				listErrors.add("Le libellé dépasse les 128 caractères");
			}else{
				libelle =  ((String) request.getParameter("libelle"));
			}
		}else{
			listErrors.add("Le libellé est obligatoire");
		}
		
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			request.setAttribute("libelle", libelle );
			RequestDispatcher dis = request.getRequestDispatcher("edittypejeu.jsp");
			dis.forward(request, response);
		}
		else{
			try {
				typeJeu.setLibelleTypeJeu(libelle);
				typeJeuDAO.update(typeJeu);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect(response.encodeRedirectURL("TypeJeuListServlet"));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
