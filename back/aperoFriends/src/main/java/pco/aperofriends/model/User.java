package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER database table.
 * 
 */
@Entity
//@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUser;

	private String firstnameUser;

	private int idRole;

	private String lastnameUser;

	private String mailUser;

	private String passUser;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstnameUser() {
		return firstnameUser;
	}

	public void setFirstnameUser(String firstnameUser) {
		this.firstnameUser = firstnameUser;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getLastnameUser() {
		return lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getPassUser() {
		return passUser;
	}

	public void setPassUser(String passUser) {
		this.passUser = passUser;
	}
	
	public User() {
		
	}

	public User(int idUser, String firstnameUser, int idRole, String lastnameUser, String mailUser, String passUser) {
		super();
		this.idUser = idUser;
		this.firstnameUser = firstnameUser;
		this.idRole = idRole;
		this.lastnameUser = lastnameUser;
		this.mailUser = mailUser;
		this.passUser = passUser;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstnameUser=" + firstnameUser + ", idRole=" + idRole + ", lastnameUser="
				+ lastnameUser + ", mailUser=" + mailUser + ", passUser=" + passUser + "]";
	}

	
}