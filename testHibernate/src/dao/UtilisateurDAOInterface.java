package dao;

import java.util.Set;

import bean.Utilisateur;
import bean.UtilisateurPK;

public interface UtilisateurDAOInterface {

	public Set<Utilisateur> getUtilisateurList();
	public Utilisateur getByPK(UtilisateurPK id);
	public Utilisateur create(Utilisateur utilisateur);
	public void update(Utilisateur utilisateur);
	public void delete(Utilisateur utilisateur);
	
}
