package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROLE database table.
 * 
 */
@Entity
//@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrole;

	private int iduser;

	private String nomrole;

	public int getIdrole() {
		return this.idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public int getIduser() {
		return this.iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getNomrole() {
		return this.nomrole;
	}

	public void setNomrole(String nomrole) {
		this.nomrole = nomrole;
	}

	@Override
	public String toString() {
		return "Role [idrole=" + idrole + ", iduser=" + iduser + ", nomrole=" + nomrole + "]";
	}
	
	public Role() {
	}
	
	public Role(int idrole, int iduser, String nomrole) {
		super();
		this.idrole = idrole;
		this.iduser = iduser;
		this.nomrole = nomrole;
	}
	
}