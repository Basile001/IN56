package model;

import model.base.BaseConsulte;

/**
 * This is the object class that relates to the consulte table.
 * Any customizations belong here.
 */
public class Consulte extends BaseConsulte {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Consulte () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Consulte (
		model.Utilisateur _login,
		model.Faq _idFaq) {

		super (
			_login,
			_idFaq);
	}

/*[CONSTRUCTOR MARKER END]*/
}