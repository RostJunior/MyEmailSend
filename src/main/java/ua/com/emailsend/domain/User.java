package ua.com.emailsend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
	@NamedQuery(name = "User.getByName", query = "select a from User a where a.nameUser=:nameUser"),
	@NamedQuery(name = "User.getByEmailAndPassword", query = "select a from User a where a.emailUser = :emailUser"
			+ " and a.passwordUser = :passwordUser"),
	@NamedQuery(name = "User.getById", query = "select a from User a where a.idUser = :idUser")		
	})
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	
	@Column
	private String nameUser;
	
	@Column
	private String emailUser;
	
	@Column
	private String passwordUser;
	
	@Column
	private long telephoneUser;
	
	@ManyToOne
	private Roles roles;

	public User() {
		
	}

	public User(String nameUser, String emailUser, String passwordUser,
			long telephoneUser, Roles roles) {
		
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
		this.telephoneUser = telephoneUser;
		this.roles = roles;
	}
	
	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	
	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public long getTelephoneUser() {
		return telephoneUser;
	}

	public void setTelephoneUser(long telephoneUser) {
		this.telephoneUser = telephoneUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser
				+ ", emailUser=" + emailUser + ", passwordUser=" + passwordUser
				+ ", telephoneUser=" + telephoneUser + "]";
	}
	
	
	
	
	
}
