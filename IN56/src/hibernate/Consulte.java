package hibernate;

import hibernate.base.BaseConsulte;

/**
 * This is the object class that relates to the consulte table.
 * Any customizations belong here.
 */
public class Consulte extends BaseConsulte {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*[CONSTRUCTOR MARKER BEGIN]*/
	public Consulte () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Consulte (
		hibernate.Utilisateur _login,
		hibernate.Faq _idFaq) {

		super (
			_login,
			_idFaq);
	}

/*[CONSTRUCTOR MARKER END]*/
}