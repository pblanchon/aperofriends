package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUSER;

	private String firstnameUser;

	private int idRole;

	private String lastnameUser;

	private String mailUser;

	private String passUser;

	public User() {
	}

	public int getIdUSER() {
		return this.idUSER;
	}

	public void setIdUSER(int idUSER) {
		this.idUSER = idUSER;
	}

	public String getFirstnameUser() {
		return this.firstnameUser;
	}

	public void setFirstnameUser(String firstnameUser) {
		this.firstnameUser = firstnameUser;
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getLastnameUser() {
		return this.lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public String getMailUser() {
		return this.mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getPassUser() {
		return this.passUser;
	}

	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}

}