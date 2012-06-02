package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuestionReponse;
import model.Utilisateur;
import model.dao.UtilisateurDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class UtilisateurListServlet
 */
public class UtilisateurListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Utilisateur> listUtilisateur = UtilisateurDAO.getInstance().findAll();
			request.setAttribute("listUtilisateur", listUtilisateur);
			RequestDispatcher dispatcher = request.getRequestDispatcher("listeutilisateur.jsp");
			dispatcher.forward(request, response);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			List<Utilisateur> listUtilisateur = null;
			
			if(request.getParameter("login") != null){
				Query query = session.createQuery("SELECT q FROM Utilisateur q WHERE  q." + Utilisateur.PROP_ID + ".Login like '" + request.getParameter("login")  + "%'");
				listUtilisateur = query.list();
			}
			request.setAttribute("listUtilisateur", listUtilisateur);
			RequestDispatcher dispatcher = request.getRequestDispatcher("listeutilisateur.jsp");
			dispatcher.forward(request, response);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
