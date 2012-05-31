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
 * Servlet implementation class ContactServlet
 */
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServlet() {
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
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);
		
		String message="";
		
		if(request.getParameter("message") != null && request.getParameter("message") != "" ){
			message = (String) request.getParameter("message");
		}else{
			listErrors.add("Le message est obligatoire");
		}
		
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("contact.jsp");
			dis.forward(request, response);

		}else{
			request.setAttribute("valide", "Message Envoyé !");
			// Envoi du message par une fonction
			RequestDispatcher dis = request.getRequestDispatcher("contact.jsp");
			dis.forward(request, response);
		}
		
		
	}
}
