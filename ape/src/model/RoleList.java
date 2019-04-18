package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the roleList database table.
 * 
 */
@Entity
@NamedQuery(name="RoleList.findAll", query="SELECT r FROM RoleList r")
public class RoleList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRole;

	private String nomRole;

	public RoleList() {
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return this.nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

}