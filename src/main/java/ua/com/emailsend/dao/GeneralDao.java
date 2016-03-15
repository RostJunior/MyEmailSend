package ua.com.emailsend.dao;

import java.util.List;

public interface GeneralDao<C, N extends Number> {
	
	void create(C entity);
	
	List<C> getAll();
	
	void delete(C entity);
	
	void edit(C entity);

}
