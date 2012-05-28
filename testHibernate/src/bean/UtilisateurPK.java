package bean;

public class UtilisateurPK implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String login;

	public UtilisateurPK() {
	}

	public UtilisateurPK(String email, String login) {
		this.email = email;
		this.login = login;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UtilisateurPK))
			return false;
		UtilisateurPK castOther = (UtilisateurPK) other;

		return ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
				&& castOther.getEmail() != null && this.getEmail().equals(
				castOther.getEmail())))
				&& ((this.getLogin() == castOther.getLogin()) || (this
						.getLogin() != null && castOther.getLogin() != null && this
						.getLogin().equals(castOther.getLogin())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getLogin() == null ? 0 : this.getLogin().hashCode());
		return result;
	}

}
