package model.base;

import net.sf.hibernate.Hibernate;
import net.sf.hibernate.Session;
import model.dao.ConsulteDAO;

/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseConsulteDAO extends model.dao._RootDAO {

	public static ConsulteDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static ConsulteDAO getInstance () {
		if (null == instance) instance = new ConsulteDAO();
		return instance;
	}

	/**
	 * model.dao._RootDAO _RootDAO.getReferenceClass()
	 */
	public Class getReferenceClass () {
		return model.Consulte.class;
	}
	
	public model.Consulte load(model.Consulte key)
		throws net.sf.hibernate.HibernateException {
		return (model.Consulte) load(getReferenceClass(), key);
	}

	public model.Consulte load(model.Consulte key, Session s)
		throws net.sf.hibernate.HibernateException {
		return (model.Consulte) load(getReferenceClass(), key, s);
	}

	public model.Consulte loadInitialize(model.Consulte key, Session s) 
			throws net.sf.hibernate.HibernateException { 
		model.Consulte obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param consulte a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public model.Consulte save(model.Consulte consulte)
		throws net.sf.hibernate.HibernateException {
		return (model.Consulte) super.save(consulte);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param consulte a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public model.Consulte save(model.Consulte consulte, Session s)
		throws net.sf.hibernate.HibernateException {
		return (model.Consulte) super.save(consulte, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param consulte a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(model.Consulte consulte)
		throws net.sf.hibernate.HibernateException {
		super.saveOrUpdate(consulte);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param consulte a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(model.Consulte consulte, Session s)
		throws net.sf.hibernate.HibernateException {
		super.saveOrUpdate(consulte, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param consulte a transient instance containing updated state
	 */
	public void update(model.Consulte consulte) 
		throws net.sf.hibernate.HibernateException {
		super.update(consulte);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param consulte a transient instance containing updated state
	 * @param the Session
	 */
	public void update(model.Consulte consulte, Session s)
		throws net.sf.hibernate.HibernateException {
		super.update(consulte, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param consulte the instance to be removed
	 */
	public void delete(model.Consulte consulte)
		throws net.sf.hibernate.HibernateException {
		super.delete(consulte);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param consulte the instance to be removed
	 * @param s the Session
	 */
	public void delete(model.Consulte consulte, Session s)
		throws net.sf.hibernate.HibernateException {
		super.delete(consulte, s);
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
	public void refresh (model.Consulte consulte, Session s)
		throws net.sf.hibernate.HibernateException {
		super.refresh(consulte, s);
	}

    public String getDefaultOrderProperty () {
		return null;
    }

}