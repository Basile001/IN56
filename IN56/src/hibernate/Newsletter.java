package hibernate;

import hibernate.base.BaseNewsletter;

/**
 * This is the object class that relates to the newsletter table.
 * Any customizations belong here.
 */
public class Newsletter extends BaseNewsletter {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*[CONSTRUCTOR MARKER BEGIN]*/
	public Newsletter () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Newsletter (java.lang.Long _idNews) {
		super(_idNews);
	}

	/**
	 * Constructor for required fields
	 */
	public Newsletter (
		java.lang.Long _idNews,
		java.lang.String _contenuNews) {

		super (
			_idNews,
			_contenuNews);
	}

/*[CONSTRUCTOR MARKER END]*/
}