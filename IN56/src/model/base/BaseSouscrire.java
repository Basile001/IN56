package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the souscrire table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="souscrire"
 */
public abstract class BaseSouscrire  implements Serializable {



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private model.DateAbonnement _dateAbonnement;
	private model.Utilisateur _login;
	private model.Abonnement _idAbonnement;


	// constructors
	public BaseSouscrire () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSouscrire (
		model.DateAbonnement _dateAbonnement,
		model.Utilisateur _login,
		model.Abonnement _idAbonnement) {

		this.setDateAbonnement(_dateAbonnement);
		this.setLogin(_login);
		this.setIdAbonnement(_idAbonnement);
		initialize();
	}

	protected void initialize () {}



	/**
     * @hibernate.property
     *  column=DATE_ABONNEMENT
	 * not-null=true
	 */
	public model.DateAbonnement getDateAbonnement () {
		return this._dateAbonnement;
	}

	/**
	 * Set the value related to the column: DATE_ABONNEMENT
	 * @param _dateAbonnement the DATE_ABONNEMENT value
	 */
	public void setDateAbonnement (model.DateAbonnement _dateAbonnement) {
		this._dateAbonnement = _dateAbonnement;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=EMAIL
	 * not-null=true
	 */
	public model.Utilisateur getLogin () {
		return this._login;
	}

	/**
	 * Set the value related to the column: EMAIL
	 * @param _login the EMAIL value
	 */
	public void setLogin (model.Utilisateur _login) {
		this._login = _login;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=ID_ABONNEMENT
	 * not-null=true
	 */
	public model.Abonnement getIdAbonnement () {
		return this._idAbonnement;
	}

	/**
	 * Set the value related to the column: ID_ABONNEMENT
	 * @param _idAbonnement the ID_ABONNEMENT value
	 */
	public void setIdAbonnement (model.Abonnement _idAbonnement) {
		this._idAbonnement = _idAbonnement;
		this.hashCode = Integer.MIN_VALUE;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.Souscrire)) return false;
		else {
			model.Souscrire mObj = (model.Souscrire) obj;
			if (null != this.getDateAbonnement() && null != mObj.getDateAbonnement()) {
				if (!this.getDateAbonnement().equals(mObj.getDateAbonnement())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getLogin() && null != mObj.getLogin()) {
				if (!this.getLogin().equals(mObj.getLogin())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getIdAbonnement() && null != mObj.getIdAbonnement()) {
				if (!this.getIdAbonnement().equals(mObj.getIdAbonnement())) {
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
			if (null != this.getDateAbonnement()) {
				sb.append(this.getDateAbonnement().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getLogin()) {
				sb.append(this.getLogin().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getIdAbonnement()) {
				sb.append(this.getIdAbonnement().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}