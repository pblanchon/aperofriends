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

	private int idUSER;

	private String nomRole;

	//bi-directional many-to-one association to Friend
	@ManyToOne
	@JoinColumn(name="idFriend")
	private Friend friend;

	public RoleList() {
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public int getIdUSER() {
		return this.idUSER;
	}

	public void setIdUSER(int idUSER) {
		this.idUSER = idUSER;
	}

	public String getNomRole() {
		return this.nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public Friend getFriend() {
		return this.friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

}