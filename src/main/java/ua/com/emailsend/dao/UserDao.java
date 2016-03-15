package ua.com.emailsend.dao;

import ua.com.emailsend.domain.User;

public interface UserDao extends GeneralDao<User, Integer>{

	
	User findByEmailAndPassword(String email, String password);
	
	User findById(int id);
	
}
