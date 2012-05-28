package model;

import model.base.BaseTypeJeu;

/**
 * This is the object class that relates to the type_jeu table.
 * Any customizations belong here.
 */
public class TypeJeu extends BaseTypeJeu {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public TypeJeu () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TypeJeu (java.lang.Long _idTypeJeu) {
		super(_idTypeJeu);
	}

	/**
	 * Constructor for required fields
	 */
	public TypeJeu (
		java.lang.Long _idTypeJeu,
		java.lang.String _libelleTypeJeu) {

		super (
			_idTypeJeu,
			_libelleTypeJeu);
	}

/*[CONSTRUCTOR MARKER END]*/
}