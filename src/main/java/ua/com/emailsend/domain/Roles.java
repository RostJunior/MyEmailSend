package ua.com.emailsend.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;



@Entity
@NamedQueries({
	@NamedQuery(name = "Roles.getByRoles", query = "select a from Roles a where a.roles=:roles"),
	@NamedQuery(name = "Roles.getById", query = "select a from Roles a where a.idRoles = :idRoles")		
	})
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRoles;
	
	@Column
	private String roles;
	
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "roles")
	private List<User> users;

	
	public Roles(){
		
	}


	public Roles(String roles) {
		
		this.roles = roles;
		
	}


	public int getIdRoles() {
		return idRoles;
	}


	public void setIdRoles(int idRoles) {
		this.idRoles = idRoles;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	@Override
	public String toString() {
		return "Roles [idRoles=" + idRoles + ", roles=" + roles + "]";
	}
	
	
	
}
