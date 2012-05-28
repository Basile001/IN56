package model.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the date_abonnement table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="date_abonnement"
 */
public abstract class BaseDateAbonnement  implements Serializable {

	public static String PROP_DATE_ABONNEMENT = "DateAbonnement";


	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.util.Date _dateAbonnement;

	// collections
	private java.util.Set _souscrireSet;


	// constructors
	public BaseDateAbonnement () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDateAbonnement (java.util.Date _dateAbonnement) {
		this.setDateAbonnement(_dateAbonnement);
		initialize();
	}

	protected void initialize () {}



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="vm"
     *  column="DATE_ABONNEMENT"
     */
	public java.util.Date getDateAbonnement () {
		return _dateAbonnement;
	}

	/**
	 * Set the unique identifier of this class
	 * @param _dateAbonnement the new ID
	 */
	public void setDateAbonnement (java.util.Date _dateAbonnement) {
		this._dateAbonnement = _dateAbonnement;
		this.hashCode = Integer.MIN_VALUE;
	}


	/**
	 * Return the value associated with the column: SouscrireSet
	 */
	public java.util.Set getSouscrireSet () {
		return this._souscrireSet;
	}

	/**
	 * Set the value related to the column: SouscrireSet
	 * @param _souscrireSet the SouscrireSet value
	 */
	public void setSouscrireSet (java.util.Set _souscrireSet) {
		this._souscrireSet = _souscrireSet;
	}
	
	public void addToSouscrireSet (Object obj) {
		if (null == this._souscrireSet) this._souscrireSet = new java.util.HashSet();
		this._souscrireSet.add(obj);
	}



	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof model.base.BaseDateAbonnement)) return false;
		else {
			model.base.BaseDateAbonnement mObj = (model.base.BaseDateAbonnement) obj;
			if (null == this.getDateAbonnement() || null == mObj.getDateAbonnement()) return false;
			else return (this.getDateAbonnement().equals(mObj.getDateAbonnement()));
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getDateAbonnement()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getDateAbonnement().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}