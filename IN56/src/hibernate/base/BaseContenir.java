package hibernate.base;

import java.io.Serializable;


/**
 * This class has been automatically generated by Hibernate Synchronizer.
 * For more information or documentation, visit The Hibernate Synchronizer page
 * at http://www.binamics.com/hibernatesync or contact Joe Hudson at joe@binamics.com.
 *
 * This is an object that contains data related to the contenir table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="contenir"
 */
public abstract class BaseContenir  implements Serializable {



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private hibernate.Faq _idFaq;
	private hibernate.QuestionReponse _idQuestionReponse;


	// constructors
	public BaseContenir () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseContenir (
		hibernate.Faq _idFaq,
		hibernate.QuestionReponse _idQuestionReponse) {

		this.setIdFaq(_idFaq);
		this.setIdQuestionReponse(_idQuestionReponse);
		initialize();
	}

	protected void initialize () {}



	/**
     * @hibernate.property
     *  column=ID_FAQ
	 * not-null=true
	 */
	public hibernate.Faq getIdFaq () {
		return this._idFaq;
	}

	/**
	 * Set the value related to the column: ID_FAQ
	 * @param _idFaq the ID_FAQ value
	 */
	public void setIdFaq (hibernate.Faq _idFaq) {
		this._idFaq = _idFaq;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=ID_QUESTION_REPONSE
	 * not-null=true
	 */
	public hibernate.QuestionReponse getIdQuestionReponse () {
		return this._idQuestionReponse;
	}

	/**
	 * Set the value related to the column: ID_QUESTION_REPONSE
	 * @param _idQuestionReponse the ID_QUESTION_REPONSE value
	 */
	public void setIdQuestionReponse (hibernate.QuestionReponse _idQuestionReponse) {
		this._idQuestionReponse = _idQuestionReponse;
		this.hashCode = Integer.MIN_VALUE;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof hibernate.Contenir)) return false;
		else {
			hibernate.Contenir mObj = (hibernate.Contenir) obj;
			if (null != this.getIdFaq() && null != mObj.getIdFaq()) {
				if (!this.getIdFaq().equals(mObj.getIdFaq())) {
					return false;
				}
			}
			else {
				return false;
			}
			if (null != this.getIdQuestionReponse() && null != mObj.getIdQuestionReponse()) {
				if (!this.getIdQuestionReponse().equals(mObj.getIdQuestionReponse())) {
					return false;
				}
			}
			else {
				return false;
			}
			return true;
		}
	}


	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			StringBuffer sb = new StringBuffer();
			if (null != this.getIdFaq()) {
				sb.append(this.getIdFaq().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			if (null != this.getIdQuestionReponse()) {
				sb.append(this.getIdQuestionReponse().hashCode());
				sb.append(":");
			}
			else {
				return super.hashCode();
			}
			this.hashCode = sb.toString().hashCode();
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}

}