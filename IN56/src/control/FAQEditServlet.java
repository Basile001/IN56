package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.hibernate.HibernateException;

import model.QuestionReponse;
import model.dao.QuestionReponseDAO;
import model.dao._RootDAO;

/**
 * Servlet implementation class FAQEditServlet
 */
public class FAQEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FAQEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("edition");
		
		QuestionReponseDAO questionReponseDAO = new QuestionReponseDAO();
		QuestionReponse questionReponse = null;
		long ID = Long.parseLong(request.getParameter("id"));
		try {
			questionReponse = QuestionReponseDAO.getInstance().load(ID);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		// Variable du formulaire
		String question = "";
		String reponse = "";
		
		if(request.getParameter("question") != null && request.getParameter("question") != "" ){
			// Vérification de la taille de la question
			if(((String)request.getParameter("question")).length() > 255){
				listErrors.add("La question dépasse les 255 caractères");
			}else{
				question = (String) request.getParameter("question");
			}
		}else{
			listErrors.add("La question est obligatoire");
		}
		// Vérification de la présence du login
		if(request.getParameter("reponse") != null && request.getParameter("reponse") != "" ){
			// Vérification de la taille de la réponse
			if(((String)request.getParameter("reponse")).length() > 255){
				listErrors.add("La réponse dépasse les 255 caractères");
			}else{
				reponse = (String) request.getParameter("reponse");
			}
		}else{
			listErrors.add("La reponse est obligatoire");
		}
		

		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			request.setAttribute("question", question);
			request.setAttribute("reponse", reponse);
			RequestDispatcher dis = request.getRequestDispatcher("FAQListServlet");
			dis.forward(request, response);
		}
		else{
			try {
				questionReponse.setQuestion(question);
				questionReponse.setReponse(reponse);
				questionReponseDAO.update(questionReponse);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect(response.encodeRedirectURL("FAQListServlet"));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
