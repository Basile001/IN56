package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Jeu;
import model.Utilisateur;
import model.dao.JeuDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class JeuListServlet
 */
public class JeuListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JeuListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Jeu> listJeu = JeuDAO.getInstance().findAll();
			request.setAttribute("listJeu", listJeu);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("listejeux.jsp");
			dispatcher.forward(request, response);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			List<Jeu> listJeu = null;

			if (request.getParameter("titre") != null) {
				Query query = session.createQuery("SELECT j FROM Jeu j WHERE  j." + Jeu.PROP_TITRE_JEU + " like '"	+ request.getParameter("titre") + "%'");
				listJeu = query.list();
			}
			request.setAttribute("listJeu", listJeu);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("listejeux.jsp");
			dispatcher.forward(request, response);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
