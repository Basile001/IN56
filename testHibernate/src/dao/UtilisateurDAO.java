package dao;

import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import resource.HibernateUtil;

import bean.Utilisateur;
import bean.UtilisateurPK;

public class UtilisateurDAO implements UtilisateurDAOInterface {

	

	

	@Override
	public Utilisateur create(Utilisateur utilisateur) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(utilisateur);
			transaction.commit();
		} catch (HibernateException he) {
			if (transaction != null) {
				try {
					transaction.rollback();
				} catch (HibernateException he2) {
					he2.printStackTrace();
				}
			}
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (HibernateException he) {
					he.printStackTrace();
				}
			}
		}
		return utilisateur;
	}

	@Override
	public void update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<Utilisateur> getUtilisateurList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getByPK(UtilisateurPK id) {
		// TODO Auto-generated method stub
		return null;
	}

}
