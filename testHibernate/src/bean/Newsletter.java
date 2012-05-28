package bean;

import java.util.HashSet;
import java.util.Set;

public class Newsletter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idNews;
	private String contenuNews;
	private Set<Recevoir> recevoirs = new HashSet<Recevoir>(0);

	public Newsletter() {
	}

	public Newsletter(long idNews, String contenuNews) {
		this.idNews = idNews;
		this.contenuNews = contenuNews;
	}

	public Newsletter(long idNews, String contenuNews, Set<Recevoir> recevoirs) {
		this.idNews = idNews;
		this.contenuNews = contenuNews;
		this.recevoirs = recevoirs;
	}

	public long getIdNews() {
		return this.idNews;
	}

	public void setIdNews(long idNews) {
		this.idNews = idNews;
	}

	public String getContenuNews() {
		return this.contenuNews;
	}

	public void setContenuNews(String contenuNews) {
		this.contenuNews = contenuNews;
	}

	public Set<Recevoir> getRecevoirs() {
		return this.recevoirs;
	}

	public void setRecevoirs(Set<Recevoir> recevoirs) {
		this.recevoirs = recevoirs;
	}

}
