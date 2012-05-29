package control;

import hibernate.HibernateUtil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Utilisateur;
import model.UtilisateurPK;
import model.base._BaseRootDAO;
import model.dao.UtilisateurDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

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
	


		Utilisateur utilisateur = new Utilisateur();
		/*
		ArrayList<String> listErrors = new ArrayList<String>();
		
		// Variable du formulaire
		String email = "";
		String login = "";
		String civilite = "";	
		String nom = "";
		String prenom = "";
		String telephone = "";
		String numeroRue = "";
		String rue = "";
		String codePostal = "";
		String ville = "";
		String pays = "";
		// V�rification que les champs sont remplis
		// V�rification de la pr�sence de l'adresse E-mail
		if(request.getAttribute("email") != null){
			email = (String) request.getAttribute("email");
		}else{
			listErrors.add("L'adresse E-mail est obligatoire");
		}
		// V�rification de la pr�sence du login
		if(request.getAttribute("login") != null){
			login = (String) request.getAttribute("login");
		}else{
			listErrors.add("Le login est obligatoire");
		}
		// V�rification de la pr�sence de la civilite
		if(request.getAttribute("civilite") != null){
			civilite = (String) request.getAttribute("civilite");
		}else{
			listErrors.add("La civilit� est obligatoire");
		}
		// V�rification de la pr�sence du nom
		if(request.getAttribute("nom") != null){
			nom = (String) request.getAttribute("nom");
		}else{
			listErrors.add("Le nom est obligatoire");
		}
		// V�rification de la pr�sence du pr�nom
		if(request.getAttribute("prenom") != null){
			prenom = (String) request.getAttribute("prenom");
		}else{
			listErrors.add("Le pr�nom est obligatoire");
		}
		// V�rification de la pr�sence de la ville
		if(request.getAttribute("ville") != null){
			ville = (String) request.getAttribute("ville");
		}else{
			listErrors.add("La ville est obligatoire");
		}
		// V�rification de la pr�sence du pays
		if(request.getAttribute("pays") != null){
			pays = (String) request.getAttribute("pays");
		}else{
			listErrors.add("Le pays est obligatoire");
		}
		
		// V�rification de l'existance de l'e-mail et login
	
		
		
		// V�rification des chiffres pour le numero de t�l�phone
		
		// V�rification des chiffres pour le numero_rue
		
		// V�rification des chiffres pour le code postal
		utilisateur.setId(new UtilisateurPK(login,email));
		utilisateur.setCivilite(civilite);
		utilisateur.setNomUtilisateur(nom);
		utilisateur.setPrenomUtilisateur(prenom);
		utilisateur.setTelephone(Integer.valueOf(telephone));
		utilisateur.setNumrue(Long.valueOf(numeroRue));
		utilisateur.setRue(rue);
		utilisateur.setCodepostal(Long.valueOf(codePostal));
		utilisateur.setVille(ville);
		utilisateur.setPays(pays);
		utilisateur.setDroit(0);
		*/
		
		utilisateur.setId(new UtilisateurPK("Giltia","florian.kozma@wanadoo.fr"));
		utilisateur.setCivilite("Monsieur");
		utilisateur.setNomUtilisateur("KOZMA");
		utilisateur.setPrenomUtilisateur("Florian");
		utilisateur.setMotdepasse("test");
		utilisateur.setTelephone("0380921322");
		utilisateur.setNumrue(12);
		utilisateur.setRue("rue des jonquilles");
		utilisateur.setCodepostal(21500);
		utilisateur.setVille("FAIN-LES-MONTBARD");
		utilisateur.setPays("FRANCE");
		utilisateur.setDroit(0);
		utilisateur.setNewsletter(0);
		System.out.println("Utilisateur Ajout�");
		
		
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		try {
			_BaseRootDAO.initialize();
			utilisateurDAO.save(utilisateur);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			
			Session session = HibernateUtil.currentSession();
			   
			Transaction tx = session.beginTransaction();
			session.save(utilisateur);

			tx.commit();

			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}