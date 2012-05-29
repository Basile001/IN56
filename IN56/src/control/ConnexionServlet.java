package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

import model.Utilisateur;
import model.dao._RootDAO;

/**
 * Servlet implementation class ConnexionServlet
 */
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionServlet() {
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
		HttpSession sessionLogin = request.getSession();
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		String login = request.getParameter("login");
		String mdp = request.getParameter("password");
		try {
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			Query query = session.createQuery("SELECT u FROM Utilisateur u WHERE u.Id.Login=:log");
			query.setParameter("log", login);
			Utilisateur util = (Utilisateur)query.uniqueResult();
			if (util!=null){
				if(mdp.equals(util.getMotdepasse())){
					sessionLogin.setAttribute("Utilisateur", util); 
					RequestDispatcher dispatcher = request.getRequestDispatcher("accueil.jsp");
					dispatcher.forward(request, response);
				}
				else{
					sessionLogin.setAttribute("Utilisateur", null);
					listErrors.add("Le login ou le mot de passe n'est pas valide");
					request.setAttribute("errors", listErrors);
					RequestDispatcher dis = request.getRequestDispatcher("connexion.jsp");
					dis.forward(request, response);
				}
			}
			else{
				sessionLogin.setAttribute("Utilisateur", null);
				listErrors.add("Le login ou le mot de passe n'est pas valide");
				request.setAttribute("errors", listErrors);
				RequestDispatcher dis = request.getRequestDispatcher("connexion.jsp");
				dis.forward(request, response);
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
