package servlet;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionServlet
 */
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
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
		
		
		//UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		
		//Utilisateur utilisateur = new Utilisateur();
		// Vérification des champs du formulaire pour savoir s'ils sont rempli
		
		
		
		
		// Ajouter l'utilisateur s'il n'y a pas d'erreur
		//utilisateurDAO.create(utilisateur);
		// Sinon afficher le formulaire d'inscription avec les erreurs
		
		
	}

}
