package hibernate;

import hibernate.base.BaseRecevoir;

/**
 * This is the object class that relates to the recevoir table.
 * Any customizations belong here.
 */
public class Recevoir extends BaseRecevoir {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public Recevoir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Recevoir (hibernate.RecevoirPK _id) {
		super(_id);
	}

	/**
	 * Constructor for required fields
	 */
	public Recevoir (
		hibernate.RecevoirPK _id,
		java.util.Date _dateRecevoir) {

		super (
			_id,
			_dateRecevoir);
	}

/*[CONSTRUCTOR MARKER END]*/
}