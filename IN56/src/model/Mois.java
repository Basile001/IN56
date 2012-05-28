package model;

import model.base.BaseMois;

/**
 * This is the object class that relates to the mois table.
 * Any customizations belong here.
 */
public class Mois extends BaseMois {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Mois () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Mois (java.util.Date _mois) {
		super(_mois);
	}

	/**
	 * Constructor for required fields
	 */
	public Mois (
		java.util.Date _mois,
		model.Jeu _idJeu) {

		super (
			_mois,
			_idJeu);
	}

/*[CONSTRUCTOR MARKER END]*/
}