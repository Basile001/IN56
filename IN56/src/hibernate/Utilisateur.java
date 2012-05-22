package hibernate;

import hibernate.base.BaseUtilisateur;

/**
 * This is the object class that relates to the utilisateur table.
 * Any customizations belong here.
 */
public class Utilisateur extends BaseUtilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public Utilisateur () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Utilisateur (hibernate.UtilisateurPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Utilisateur (
		hibernate.UtilisateurPK _id,
		java.lang.String _pays,
		java.lang.String _ville,
		java.lang.String _prenomUtilisateur,
		java.lang.String _nomUtilisateur,
		java.lang.String _civilite) {

		super (
			_id,
			_pays,
			_ville,
			_prenomUtilisateur,
			_nomUtilisateur,
			_civilite);
	}

/*[CONSTRUCTOR MARKER END]*/
}