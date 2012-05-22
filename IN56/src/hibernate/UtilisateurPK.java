package hibernate;

import hibernate.base.BaseUtilisateurPK;

public class UtilisateurPK extends BaseUtilisateurPK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public UtilisateurPK () {}
	
	public UtilisateurPK (
		java.lang.String _login,
		java.lang.String _email) {

		super (
		_login,
		_email);
	}
/*[CONSTRUCTOR MARKER END]*/
}