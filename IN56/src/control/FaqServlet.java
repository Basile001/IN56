package control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Faq;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class FaqServlet
 */
public class FaqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FaqServlet() {
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
		try {
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			Query query = session.createQuery("SELECT f FROM Faq f");
			List<Faq> faqList = query.list();
			request.setAttribute("FaqList", faqList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("faq.jsp");
			dispatcher.forward(request, response);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
