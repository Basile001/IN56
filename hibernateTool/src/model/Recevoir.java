package model;

import model.base.BaseRecevoir;

/**
 * This is the object class that relates to the recevoir table.
 * Any customizations belong here.
 */
public class Recevoir extends BaseRecevoir {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Recevoir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Recevoir (model.RecevoirPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Recevoir (
		model.RecevoirPK _id,
		java.util.Date _dateRecevoir) {

		super (
			_id,
			_dateRecevoir);
	}

/*[CONSTRUCTOR MARKER END]*/
}