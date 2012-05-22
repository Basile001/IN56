package hibernate;

import hibernate.base.BaseJouePK;

public class JouePK extends BaseJouePK {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public JouePK () {}
	
	public JouePK (
		hibernate.Utilisateur _login,
		hibernate.Jeu _idJeu) {

		super (
		_login,
		_idJeu);
	}
/*[CONSTRUCTOR MARKER END]*/
}