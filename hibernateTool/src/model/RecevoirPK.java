package model;

import model.base.BaseRecevoirPK;

public class RecevoirPK extends BaseRecevoirPK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public RecevoirPK () {}
	
	public RecevoirPK (
		model.Utilisateur _login,
		model.Newsletter _idNews) {

		super (
		_login,
		_idNews);
	}
/*[CONSTRUCTOR MARKER END]*/
}