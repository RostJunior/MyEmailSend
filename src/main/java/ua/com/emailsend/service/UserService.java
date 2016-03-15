package ua.com.emailsend.service;

import java.util.List;

import ua.com.emailsend.domain.User;

public interface UserService {
	
	void createUser(String nameUser, String emailUser, String passwordUser,
			long telephoneUser);
	
	List<User> getAllUsers();
	
	User findById(int id);
	
	User findByEmailAndPassword(String email, String password);
	
	void deleteUser(int id);
	
	void updateUser(int id, String nameUser, String emailUser, String passwordUser,
			long telephoneUser);

}
