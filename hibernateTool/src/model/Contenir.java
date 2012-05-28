package model;

import model.base.BaseContenir;

/**
 * This is the object class that relates to the contenir table.
 * Any customizations belong here.
 */
public class Contenir extends BaseContenir {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Contenir () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Contenir (
		model.Faq _idFaq,
		model.QuestionReponse _idQuestionReponse) {

		super (
			_idFaq,
			_idQuestionReponse);
	}

/*[CONSTRUCTOR MARKER END]*/
}