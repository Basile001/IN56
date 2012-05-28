package model;

import model.base.BaseSouscrire;

/**
 * This is the object class that relates to the souscrire table.
 * Any customizations belong here.
 */
public class Souscrire extends BaseSouscrire {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Souscrire () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Souscrire (
		model.DateAbonnement _dateAbonnement,
		model.Utilisateur _login,
		model.Abonnement _idAbonnement) {

		super (
			_dateAbonnement,
			_login,
			_idAbonnement);
	}

/*[CONSTRUCTOR MARKER END]*/
}