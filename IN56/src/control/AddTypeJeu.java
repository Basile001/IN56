package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TypeJeu;
import model.dao.TypeJeuDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;

/**
 * Servlet implementation class AddTypeJeu
 */
public class AddTypeJeu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTypeJeu() {
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

		TypeJeu typejeu = new TypeJeu();
		TypeJeuDAO typeJeuDAO = new TypeJeuDAO();
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		try {
			_RootDAO.initialize();
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		// Variable du formulaire
		String libelle = "";
		
		if(request.getParameter("libelle") != null && request.getParameter("libelle") != "" ){
			libelle = (String) request.getParameter("libelle");
		}else{
			listErrors.add("le libellé est obligatoire");
		}
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("listefaq.jsp");
			dis.forward(request, response);
		}
		else{
			typejeu.setLibelleTypeJeu(libelle);
			try {
				typeJeuDAO.save(typejeu);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher dis = request.getRequestDispatcher("typejeu.jsp");
			dis.forward(request, response);
		}
	}
}
