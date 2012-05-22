package hibernate.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import hibernate.dao.SouscrireDAO;

/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseSouscrireDAO extends hibernate.dao._RootDAO {

	public static SouscrireDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static SouscrireDAO getInstance () {
		if (null == instance) instance = new SouscrireDAO();
		return instance;
	}

	/**
	 * hibernate.dao._RootDAO _RootDAO.getReferenceClass()
	 */
	public Class getReferenceClass () {
		return hibernate.Souscrire.class;
	}
	
	public hibernate.Souscrire load(hibernate.Souscrire key)
		throws org.hibernate.HibernateException {
		return (hibernate.Souscrire) load(getReferenceClass(), key);
	}

	public hibernate.Souscrire load(hibernate.Souscrire key, Session s)
		throws org.hibernate.HibernateException {
		return (hibernate.Souscrire) load(getReferenceClass(), key, s);
	}

	public hibernate.Souscrire loadInitialize(hibernate.Souscrire key, Session s) 
			throws org.hibernate.HibernateException { 
		hibernate.Souscrire obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param souscrire a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public hibernate.Souscrire save(hibernate.Souscrire souscrire)
		throws org.hibernate.HibernateException {
		return (hibernate.Souscrire) super.save(souscrire);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param souscrire a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public hibernate.Souscrire save(hibernate.Souscrire souscrire, Session s)
		throws org.hibernate.HibernateException {
		return (hibernate.Souscrire) super.save(souscrire, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param souscrire a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(hibernate.Souscrire souscrire)
		throws org.hibernate.HibernateException {
		super.saveOrUpdate(souscrire);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param souscrire a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(hibernate.Souscrire souscrire, Session s)
		throws org.hibernate.HibernateException {
		super.saveOrUpdate(souscrire, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param souscrire a transient instance containing updated state
	 */
	public void update(hibernate.Souscrire souscrire) 
		throws org.hibernate.HibernateException {
		super.update(souscrire);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param souscrire a transient instance containing updated state
	 * @param the Session
	 */
	public void update(hibernate.Souscrire souscrire, Session s)
		throws org.hibernate.HibernateException {
		super.update(souscrire, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param souscrire the instance to be removed
	 */
	public void delete(hibernate.Souscrire souscrire)
		throws org.hibernate.HibernateException {
		super.delete(souscrire);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param souscrire the instance to be removed
	 * @param s the Session
	 */
	public void delete(hibernate.Souscrire souscrire, Session s)
		throws org.hibernate.HibernateException {
		super.delete(souscrire, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (hibernate.Souscrire souscrire, Session s)
		throws org.hibernate.HibernateException {
		super.refresh(souscrire, s);
	}

    public String getDefaultOrderProperty () {
		return null;
    }

}