package hibernate;

import hibernate.base.BaseJoue;

/**
 * This is the object class that relates to the joue table.
 * Any customizations belong here.
 */
public class Joue extends BaseJoue {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public Joue () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Joue (hibernate.JouePK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Joue (
		hibernate.JouePK _id,
		java.util.Date _dureeJouer) {

		super (
			_id,
			_dureeJouer);
	}

/*[CONSTRUCTOR MARKER END]*/
}