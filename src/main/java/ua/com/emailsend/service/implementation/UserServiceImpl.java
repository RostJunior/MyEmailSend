package ua.com.emailsend.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.emailsend.dao.RolesDao;
import ua.com.emailsend.dao.UserDao;
import ua.com.emailsend.domain.Roles;
import ua.com.emailsend.domain.User;
import ua.com.emailsend.service.UserService;


@Service("userservice")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Autowired
	private RolesDao dao2;
	
	public UserDao getUserDao() {
		return dao;
	}

	public void setUserDao(UserDao dao) {
		this.dao = dao;
	}
	
	
	public void createUser(String nameUser, String emailUser,
			String passwordUser, long telephoneUser) {
		Roles roles = dao2.findById(1);
			
		dao.create(new User(nameUser, emailUser, passwordUser, telephoneUser, roles));
		
	}

	public List<User> getAllUsers() {
		
		return dao.getAll();
	}

	public User findById(int id) {
		
		return dao.findById(id);
	}

	public User findByEmailAndPassword(String email, String password) {
		
		return dao.findByEmailAndPassword(email, password);
	}

	public void deleteUser(int id) {
		
		dao.delete(dao.findById(id));
		
	}

	public void updateUser(int id, String nameUser, String emailUser,
			String passwordUser, long telephoneUser) {
		
		User user = dao.findById(id);
		user.setNameUser(nameUser);
		user.setEmailUser(emailUser);
		user.setPasswordUser(passwordUser);
		user.setTelephoneUser(telephoneUser);
		
		dao.edit(user);
	}

}
