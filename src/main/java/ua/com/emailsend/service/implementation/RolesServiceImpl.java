package ua.com.emailsend.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.emailsend.dao.RolesDao;
import ua.com.emailsend.domain.Roles;
import ua.com.emailsend.service.RolesService;

@Service("roleservice")
public class RolesServiceImpl implements RolesService{
	
	@Autowired
	private RolesDao dao;
	
	

	public RolesDao getDao() {
		return dao;
	}

	public void setDao(RolesDao dao) {
		this.dao = dao;
	}

	public void insertRoles(String roles) {
		
		Roles role = new Roles(roles);
		
		dao.create(role);
		
	}

	public List<Roles> getAllroles() {
		
		return dao.getAll();
	}

	public Roles findRoles(String roles) {
		
		return dao.findByRoles(roles);
	}

	public Roles findById(int id) {
		
		return dao.findById(id);
	}

	public void deleteRoles(int id) {
		dao.delete(dao.findById(id));
		
	}

	public void updateRoles(int idRoles, String roles) {

		Roles role = dao.findById(idRoles);
		role.setRoles(roles);
		
		dao.edit(role);
		
	}
	
	

}
