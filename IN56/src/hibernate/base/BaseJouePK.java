package hibernate.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 */
public class BaseJouePK implements Serializable {

	private int hashCode = Integer.MIN_VALUE;

	private hibernate.Utilisateur _login;
	private hibernate.Jeu _idJeu;

	public BaseJouePK () {}
	
	public BaseJouePK (
		hibernate.Utilisateur _login,
		hibernate.Jeu _idJeu) {

		this.setLogin(_login);
		this.setIdJeu(_idJeu);
	}


	public hibernate.Utilisateur getLogin () {
		return _login;
	}

	public void setLogin (hibernate.Utilisateur _login) {
		hashCode = Integer.MIN_VALUE;
		this._login = _login;
	}

	public hibernate.Jeu getIdJeu () {
		return _idJeu;
	}

	public void setIdJeu (hibernate.Jeu _idJeu) {
		hashCode = Integer.MIN_VALUE;
		this._idJeu = _idJeu;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.JouePK)) return false;
		else {
			hibernate.JouePK mObj = (hibernate.JouePK) obj;
			if (null != this.getLogin() && null != mObj.getLogin()) {
				if (!this.getLogin().equals(mObj.getLogin())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getIdJeu() && null != mObj.getIdJeu()) {
				if (!this.getIdJeu().equals(mObj.getIdJeu())) {
					return false;
				}
			}
			else {
				return false;
			}
			return true;
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			StringBuffer sb = new StringBuffer();
			if (null != this.getLogin()) {
				sb.append(this.getLogin().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getIdJeu()) {
				sb.append(this.getIdJeu().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}

}