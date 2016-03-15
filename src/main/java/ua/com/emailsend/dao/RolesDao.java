package ua.com.emailsend.dao;

import ua.com.emailsend.domain.Roles;


public interface RolesDao extends GeneralDao<Roles, Integer> {

	Roles findByRoles(String roles);
	
	Roles findById(int id);
	
}
