package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.QuestionReponse;
import model.dao.QuestionReponseDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;

/**
 * Servlet implementation class AddFAQServlet
 */
public class AddFAQServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFAQServlet() {
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
	

		QuestionReponse questionReponse = new QuestionReponse();
		QuestionReponseDAO questionReponseDAO = new QuestionReponseDAO();
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		try {
			_RootDAO.initialize();
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		// Variable du formulaire
		String question = "";
		String reponse = "";
		
		if(request.getParameter("question") != null && request.getParameter("question") != "" ){
			question = (String) request.getParameter("question");
		}else{
			listErrors.add("la question est obligatoire");
		}
		// Vérification de la présence du login
		if(request.getParameter("reponse") != null && request.getParameter("reponse") != "" ){
			reponse = (String) request.getParameter("reponse");
		}else{
			listErrors.add("la reponse est obligatoire");
		}

		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("listefaq.jsp");
			dis.forward(request, response);
		}
		else{
			questionReponse.setQuestion(question);
			questionReponse.setReponse(reponse);
			try {
				questionReponseDAO.save(questionReponse);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher dis = request.getRequestDispatcher("listefaq.jsp");
			dis.forward(request, response);
		}
	}

}
