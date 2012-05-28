package model;

import model.base.BaseFaq;

/**
 * This is the object class that relates to the faq table.
 * Any customizations belong here.
 */
public class Faq extends BaseFaq {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Faq () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Faq (java.lang.Long _idFaq) {
		super(_idFaq);
	}

	/**
	 * Constructor for required fields
	 */
	public Faq (
		java.lang.Long _idFaq,
		java.lang.String _titreFaq) {

		super (
			_idFaq,
			_titreFaq);
	}

/*[CONSTRUCTOR MARKER END]*/
}