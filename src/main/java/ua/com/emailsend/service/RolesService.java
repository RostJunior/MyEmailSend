package ua.com.emailsend.service;

import java.util.List;

import ua.com.emailsend.domain.Roles;

public interface RolesService {
	
	void insertRoles(String roles);
	
	List<Roles> getAllroles();
	
	Roles findRoles(String roles);
	
	Roles findById(int id);
	
	void deleteRoles(int id);
	
	void updateRoles(int idRoles, String roles);

}
