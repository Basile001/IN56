package model;

import model.base.BaseJouePK;

public class JouePK extends BaseJouePK {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public JouePK () {}
	
	public JouePK (
		model.Utilisateur _login,
		model.Jeu _idJeu) {

		super (
		_login,
		_idJeu);
	}
/*[CONSTRUCTOR MARKER END]*/
}