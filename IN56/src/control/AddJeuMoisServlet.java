package control;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Jeu;
import model.Mois;
import model.dao.JeuDAO;
import model.dao.MoisDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class AddJeuMoisServlet
 */
public class AddJeuMoisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddJeuMoisServlet() {
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
		Mois jeu = new Mois();
		MoisDAO jeuDAO = new MoisDAO();
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);	
	
		String conseil="";
		String jeuS="";
		String mois="";
		
		if(request.getParameter("conseil") != null && request.getParameter("conseil") != "" ){
			conseil = (String) request.getParameter("conseil");
		}else{
			listErrors.add("le conseil est obligatoire");
		}
		if(request.getParameter("mois") != null && request.getParameter("mois") != "" ){
			mois = (String) request.getParameter("mois");
		}else{
			listErrors.add("le mois est obligatoire");
		}
		if(request.getParameter("jeu") != null && request.getParameter("jeu") != "" ){
			jeuS = (String) request.getParameter("jeu");
		}else{
			listErrors.add("le jeu est obligatoire");
		}
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("listejeumois.jsp");
			dis.forward(request, response);
		}
		else{
			jeu.setConseilMois(conseil);
			SimpleDateFormat dateF = new SimpleDateFormat("dd-mm-yyyy");
			try {
				jeu.setMois(dateF.parse(mois));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				_RootDAO.initialize();
				JeuDAO jeuxDAO = new JeuDAO();
				Session session = _RootDAO.createSession();
				Jeu jeux = jeuxDAO.load(Long.parseLong(jeuS));
				jeu.setIdJeu(jeux);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			try {
				jeuDAO.save(jeu);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
