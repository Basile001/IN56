package dao;

import java.util.Set;

import bean.Recevoir;
import bean.Utilisateur;

public interface RecevoirDAOInterface {

	public Set<Recevoir> getRecevoirList();
	public Recevoir getById(Long id);
	public Recevoir create(Recevoir recevoir);
	public void update(Recevoir recevoir);
	public void delete(Recevoir recevoir);
	
}
