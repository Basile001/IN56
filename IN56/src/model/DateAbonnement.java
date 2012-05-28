package model;

import model.base.BaseDateAbonnement;

/**
 * This is the object class that relates to the date_abonnement table.
 * Any customizations belong here.
 */
public class DateAbonnement extends BaseDateAbonnement {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public DateAbonnement () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public DateAbonnement (java.util.Date _dateAbonnement) {
		super(_dateAbonnement);
	}

/*[CONSTRUCTOR MARKER END]*/
}