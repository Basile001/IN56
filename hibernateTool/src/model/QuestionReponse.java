package model;

import model.base.BaseQuestionReponse;

/**
 * This is the object class that relates to the question_reponse table.
 * Any customizations belong here.
 */
public class QuestionReponse extends BaseQuestionReponse {

/*[CONSTRUCTOR MARKER BEGIN]*/
	public QuestionReponse () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public QuestionReponse (java.lang.Long _idQuestionReponse) {
		super(_idQuestionReponse);
	}

	/**
	 * Constructor for required fields
	 */
	public QuestionReponse (
		java.lang.Long _idQuestionReponse,
		java.lang.String _reponse,
		java.lang.String _question) {

		super (
			_idQuestionReponse,
			_reponse,
			_question);
	}

/*[CONSTRUCTOR MARKER END]*/
}