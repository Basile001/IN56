package hibernate;

import hibernate.base.BaseSouscrire;

/**
 * This is the object class that relates to the souscrire table.
 * Any customizations belong here.
 */
public class Souscrire extends BaseSouscrire {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public Souscrire () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Souscrire (
		java.util.Date _dateAbonnement,
		hibernate.Utilisateur _login,
		hibernate.Abonnement _idAbonnement) {

		super (
			_dateAbonnement,
			_login,
			_idAbonnement);
	}

/*[CONSTRUCTOR MARKER END]*/
}