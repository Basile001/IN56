package control;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Faq;
import model.QuestionReponse;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class FaqServlet
 */
public class FAQServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FAQServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			Query query = session.createQuery("SELECT q FROM QuestionReponse q");
			List<QuestionReponse> faq = query.list();
			
			/*
			Set<QuestionReponse> faqSet = new HashSet(faqList);
			Faq faq = new Faq();
			faq.setQuestionReponseSet(faqSet);*/
			request.setAttribute("FAQ", faq);
			RequestDispatcher dispatcher = request.getRequestDispatcher("faq.jsp");
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
		
	}
}
