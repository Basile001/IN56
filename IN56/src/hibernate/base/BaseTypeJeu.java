package hibernate.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the type_jeu table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="type_jeu"
 */
public abstract class BaseTypeJeu  implements Serializable {

	public static String PROP_LIBELLE_TYPE_JEU = "LibelleTypeJeu";
	public static String PROP_ID_TYPE_JEU = "IdTypeJeu";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long _idTypeJeu;

	// fields
	private java.lang.String _libelleTypeJeu;

	// collections
	private java.util.Set _jeuSet;


	// constructors
	public BaseTypeJeu () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTypeJeu (java.lang.Long _idTypeJeu) {
		this.setIdTypeJeu(_idTypeJeu);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTypeJeu (
		java.lang.Long _idTypeJeu,
		java.lang.String _libelleTypeJeu) {

		this.setIdTypeJeu(_idTypeJeu);
		this.setLibelleTypeJeu(_libelleTypeJeu);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="vm"
     *  column="ID_TYPE_JEU"
     */
	public java.lang.Long getIdTypeJeu () {
		return _idTypeJeu;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _idTypeJeu the new ID
	 */
	public void setIdTypeJeu (java.lang.Long _idTypeJeu) {
		this._idTypeJeu = _idTypeJeu;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: LIBELLE_TYPE_JEU
	 */
	public java.lang.String getLibelleTypeJeu () {
		return _libelleTypeJeu;
	}

	/**
	 * Set the value related to the column: LIBELLE_TYPE_JEU
	 * @param _libelleTypeJeu the LIBELLE_TYPE_JEU value
	 */
	public void setLibelleTypeJeu (java.lang.String _libelleTypeJeu) {
		this._libelleTypeJeu = _libelleTypeJeu;
	}


	/**
	 * Return the value associated with the column: JeuSet
	 */
	public java.util.Set getJeuSet () {
		return this._jeuSet;
	}

	/**
	 * Set the value related to the column: JeuSet
	 * @param _jeuSet the JeuSet value
	 */
	public void setJeuSet (java.util.Set _jeuSet) {
		this._jeuSet = _jeuSet;
	}
	
	public void addToJeuSet (Object obj) {
		if (null == this._jeuSet) this._jeuSet = new java.util.HashSet();
		this._jeuSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.base.BaseTypeJeu)) return false;
		else {
			hibernate.base.BaseTypeJeu mObj = (hibernate.base.BaseTypeJeu) obj;
			if (null == this.getIdTypeJeu() || null == mObj.getIdTypeJeu()) return false;
			else return (this.getIdTypeJeu().equals(mObj.getIdTypeJeu()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getIdTypeJeu()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getIdTypeJeu().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}