package hibernate;

import hibernate.base.BaseRecevoirPK;

public class RecevoirPK extends BaseRecevoirPK {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public RecevoirPK () {}
	
	public RecevoirPK (
		hibernate.Utilisateur _login,
		hibernate.Newsletter _idNews) {

		super (
		_login,
		_idNews);
	}
/*[CONSTRUCTOR MARKER END]*/
}