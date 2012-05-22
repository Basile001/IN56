package hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			sessionFactory = new Configuration().configure()
					.buildSessionFactory();
			return sessionFactory;
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			buildSessionFactory();
		return sessionFactory;
	}
}