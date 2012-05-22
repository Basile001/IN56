package hibernate;

import hibernate.base.BaseContenir;

/**
 * This is the object class that relates to the contenir table.
 * Any customizations belong here.
 */
public class Contenir extends BaseContenir {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*[CONSTRUCTOR MARKER BEGIN]*/
	public Contenir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Contenir (
		hibernate.Faq _idFaq,
		hibernate.QuestionReponse _idQuestionReponse) {

		super (
			_idFaq,
			_idQuestionReponse);
	}

/*[CONSTRUCTOR MARKER END]*/
}