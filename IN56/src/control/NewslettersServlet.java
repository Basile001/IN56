package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewslettersServlet
 */
public class NewslettersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewslettersServlet() {
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
		
		
		if(request.getParameter("message") != null && request.getParameter("message") != ""){
			// Envoyé le message
			request.setAttribute("valide", "Message envoyé !");
			RequestDispatcher dis = request.getRequestDispatcher("newsletters.jsp");
			dis.forward(request, response);
		}else{
			listErrors.add("Le message est obligatoire");
			request.setAttribute("errors",listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("newsletters.jsp");
			dis.forward(request, response);
		}
	}

}
