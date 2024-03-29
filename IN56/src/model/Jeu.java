package model;

import model.base.BaseJeu;

/**
 * This is the object class that relates to the jeu table.
 * Any customizations belong here.
 */
public class Jeu extends BaseJeu {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Jeu () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Jeu (java.lang.Long _idJeu) {
		super(_idJeu);
	}

	/**
	 * Constructor for required fields
	 */
	public Jeu (
		java.lang.Long _idJeu,
		model.TypeJeu _idTypeJeu,
		java.lang.String _urlJeu,
		java.lang.String _titreJeu) {

		super (
			_idJeu,
			_idTypeJeu,
			_urlJeu,
			_titreJeu);
	}

/*[CONSTRUCTOR MARKER END]*/
}