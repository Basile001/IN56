package dao;

import java.util.Set;

import bean.Newsletter;



public interface NewsletterDAOInterface {

	public Set<Newsletter> getNewsletterList();
	public Newsletter getById(long id);
	public Newsletter create(Newsletter newsletter);
	public void update(Newsletter newsletter);
	public void delete(Newsletter newsletter);
}
