package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 */
public class BaseRecevoirPK implements Serializable {

	private int hashCode = Integer.MIN_VALUE;

	private model.Utilisateur _login;
	private model.Newsletter _idNews;

	public BaseRecevoirPK () {}
	
	public BaseRecevoirPK (
		model.Utilisateur _login,
		model.Newsletter _idNews) {

		this.setLogin(_login);
		this.setIdNews(_idNews);
	}


	public model.Utilisateur getLogin () {
		return _login;
	}

	public void setLogin (model.Utilisateur _login) {
		hashCode = Integer.MIN_VALUE;
		this._login = _login;
	}

	public model.Newsletter getIdNews () {
		return _idNews;
	}

	public void setIdNews (model.Newsletter _idNews) {
		hashCode = Integer.MIN_VALUE;
		this._idNews = _idNews;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.RecevoirPK)) return false;
		else {
			model.RecevoirPK mObj = (model.RecevoirPK) obj;
			if (null != this.getLogin() && null != mObj.getLogin()) {
				if (!this.getLogin().equals(mObj.getLogin())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getIdNews() && null != mObj.getIdNews()) {
				if (!this.getIdNews().equals(mObj.getIdNews())) {
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
			if (null != this.getIdNews()) {
				sb.append(this.getIdNews().hashCode());
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