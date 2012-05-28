package model;

import model.base.BaseAbonnement;

/**
 * This is the object class that relates to the abonnement table.
 * Any customizations belong here.
 */
public class Abonnement extends BaseAbonnement {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Abonnement () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Abonnement (java.lang.Long _idAbonnement) {
		super(_idAbonnement);
	}

	/**
	 * Constructor for required fields
	 */
	public Abonnement (
		java.lang.Long _idAbonnement,
		java.math.BigDecimal _prixAbonnement,
		java.lang.Long _dureeAbonnement) {

		super (
			_idAbonnement,
			_prixAbonnement,
			_dureeAbonnement);
	}

/*[CONSTRUCTOR MARKER END]*/
}