package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Utilisateur;
import model.UtilisateurPK;
import model.dao.UtilisateurDAO;
import model.dao._RootDAO;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

/**
 * Servlet implementation class InscriptionAdministrationServlet
 */
public class InscriptionAdministrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionAdministrationServlet() {
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
		Utilisateur utilisateur = new Utilisateur();
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		
		ArrayList<String> listErrors = new ArrayList<String>();
		request.setAttribute("errors", null);

		
		// Variable du formulaire
		String email = "";
		String login = "";
		String motdepasse ="";
		String civilite = "";	
		String nom = "";
		String prenom = "";
		String telephone = "";
		String numeroRue = "";
		String rue = "";
		String codePostal = "";
		String ville = "";
		String pays = "";
		String droit= "";
		
		// V�rification que les champs sont remplis
		// V�rification de la pr�sence de l'adresse E-mail
		if(request.getParameter("email") != null && request.getParameter("email") != "" ){
			email = (String) request.getParameter("email");
		}else{
			listErrors.add("L'adresse E-mail est obligatoire");
		}
		// V�rification de la pr�sence du login
		if(request.getParameter("login") != null && request.getParameter("login") != "" ){
			login = (String) request.getParameter("login");
		}else{
			listErrors.add("Le login est obligatoire");
		}
		// V�rification de la pr�sence du mot de passe
		if(request.getParameter("motdepasse") != null && request.getParameter("motdepasse") != "" ){
			motdepasse = (String) request.getParameter("motdepasse");
		}else{
			listErrors.add("Le mot de passe est obligatoire");
		}
		// V�rification de la pr�sence de la civilite
		if(request.getParameter("civilite") != null && request.getParameter("civilite") != ""){
			civilite = (String) request.getParameter("civilite");
		}else{
			listErrors.add("La civilit� est obligatoire");
		}
		// V�rification de la pr�sence du nom
		if(request.getParameter("nom") != null && request.getParameter("nom") != ""){
			nom = (String) request.getParameter("nom");
		}else{
			listErrors.add("Le nom est obligatoire");
		}
		// V�rification de la pr�sence du pr�nom
		if(request.getParameter("prenom") != null  && request.getParameter("prenom") != ""){
			prenom = (String) request.getParameter("prenom");
		}else{
			listErrors.add("Le pr�nom est obligatoire");
		}
		// V�rification de la pr�sence de la ville
		if(request.getParameter("ville") != null && request.getParameter("ville") != ""){
			ville = (String) request.getParameter("ville");
		}else{
			listErrors.add("La ville est obligatoire");
		}
		// V�rification de la pr�sence de la ville
		if(request.getParameter("rue") != null){
			rue = (String) request.getParameter("rue");
		}else{
			listErrors.add("La rue est obligatoire");
		}
		// V�rification de la pr�sence du pays
		if(request.getParameter("pays") != null && request.getParameter("pays") != ""){
			pays = (String) request.getParameter("pays");
		}else{
			listErrors.add("Le pays est obligatoire");
		}
		
		if(request.getParameter("telephone") != null){
			telephone = (String) request.getParameter("telephone");
		}
		if(request.getParameter("numero_rue") !=  null){
			numeroRue = (String) request.getParameter("numero_rue");
		}
		if(request.getParameter("codepostal") != null){
			codePostal = (String) request.getParameter("codepostal");
		}
		
		if(request.getParameter("droit") != null && request.getParameter("droit") != ""){
			droit = (String) request.getParameter("droit");
		}else{
			listErrors.add("Le droit est obligatoire");
		}
		
		// V�rification de la taille du mot de passe
				if(motdepasse.length() < 6 && motdepasse != ""){
					listErrors.add("Le mot de passe est trop court");
				}
				if(motdepasse.length() > 32){
					listErrors.add("Le mot de passe est trop long");
				}
				
		// V�rification de l'existance de l'e-mail et login
		try {
			_RootDAO.initialize();
			Session session = _RootDAO.createSession();
			//System.out.println("FROM Utilisateur U WHERE U."+ Utilisateur.PROP_ID + ".Login='" + login + "'");
			Query query = session.createQuery("FROM Utilisateur U WHERE U."+ Utilisateur.PROP_ID + ".Login='" + login + "'");
			List<Utilisateur> listUtilisateur = query.list();
			if(listUtilisateur.size() > 0){
				listErrors.add("Le login " + login +  " est d�j� utilis�");
			}
			//System.out.println("FROM Utilisateur U WHERE U."+ Utilisateur.PROP_ID + ".Email='" + email +"'");
			query = session.createQuery("FROM Utilisateur U WHERE U."+ Utilisateur.PROP_ID + ".Email='" + email + "'");
			listUtilisateur = query.list();
			if(listUtilisateur.size() > 0){
				listErrors.add("L'adresse Email " + email + " est d�j� utilis�e");
			}
		} catch (HibernateException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// V�rification des chiffres pour le numero de t�l�phone
		if(!Pattern.matches("[0-9]{10}", telephone)){
			listErrors.add("Format du num�ro de t�l�phone incorrect");
		}
		// V�rification des chiffres pour le numero_rue
		if(!Pattern.matches("[0-9]{1,4}", numeroRue)){
			listErrors.add("Format du num�ro de rue incorrect");
		}
		// V�rification des chiffres pour le code postal
		if(!Pattern.matches("[0-9]{5}", codePostal)){
			listErrors.add("Format du code postal incorrect");
		}	
		
		
		if(listErrors.size() > 0){
			request.setAttribute("errors", listErrors);
			RequestDispatcher dis = request.getRequestDispatcher("inscription.jsp");
			dis.forward(request, response);
		}else{
			utilisateur.setId(new UtilisateurPK(login,email));
			utilisateur.setMotdepasse(motdepasse);
			utilisateur.setCivilite(civilite);
			utilisateur.setNomUtilisateur(nom);
			utilisateur.setPrenomUtilisateur(prenom);
			utilisateur.setTelephone(telephone);
			utilisateur.setNumrue(Integer.parseInt(numeroRue));
			utilisateur.setRue(rue);
			utilisateur.setCodepostal(Integer.valueOf(codePostal));
			utilisateur.setVille(ville);
			utilisateur.setPays(pays);
			utilisateur.setNewsletter(0);
			if (droit.equals("Limite")){
				utilisateur.setDroit(0);
			}
			if(droit.equals("Administrateur")){
				utilisateur.setDroit(1);
			}
			try {
				utilisateurDAO.save(utilisateur);
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//response.sendRedirect("/comptevalide.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("comptevalide.jsp");
			dispatcher.forward(request, response);

		}	}

}