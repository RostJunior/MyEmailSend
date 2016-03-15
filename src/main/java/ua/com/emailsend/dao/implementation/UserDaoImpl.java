package ua.com.emailsend.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.emailsend.dao.UserDao;
import ua.com.emailsend.domain.User;

@Repository
public class UserDaoImpl extends GeneralDaoImpl<User, Integer> implements UserDao {

	public UserDaoImpl() {
		super(User.class);
		
	}
	
	@Transactional
	public User findById(int id) {
		
		return (User) em.createNamedQuery("User.getById").setParameter("id", id)
				.setMaxResults(1).getSingleResult();
	}
	
	@Transactional
	public User findByEmailAndPassword(String email, String password) {
		
		return (User) em.createNamedQuery("User.getByEmailAndPassword").setParameter("emailUser", email).
				setParameter("passwordUser", password).setMaxResults(1).getSingleResult();
	}


	
}
