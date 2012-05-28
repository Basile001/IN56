package model;

import model.base.BaseJoue;

/**
 * This is the object class that relates to the joue table.
 * Any customizations belong here.
 */
public class Joue extends BaseJoue {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Joue () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Joue (model.JouePK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Joue (
		model.JouePK _id,
		java.util.Date _dureeJouer) {

		super (
			_id,
			_dureeJouer);
	}

/*[CONSTRUCTOR MARKER END]*/
}