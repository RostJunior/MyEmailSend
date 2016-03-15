package ua.com.emailsend.dao.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.emailsend.dao.RolesDao;
import ua.com.emailsend.domain.Roles;
;

@Repository
public class RolesDaoImpl extends GeneralDaoImpl<Roles, Integer> implements RolesDao{

	public RolesDaoImpl() {
		super(Roles.class);
	}
	
	@Transactional
	public Roles findByRoles(String roles) {
		
		return (Roles) em.createNamedQuery("Roles.getByRoles").setParameter("roles", roles).setMaxResults(1).getSingleResult();
	}
	
	@Transactional
	public Roles findById(int id) {
		
		return (Roles) em.createNamedQuery("Roles.getById").setParameter("idRoles", id).setMaxResults(1).getSingleResult();
	}

}
