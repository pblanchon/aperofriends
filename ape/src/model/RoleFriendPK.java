package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the roleFriend database table.
 * 
 */
@Embeddable
public class RoleFriendPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idRole;

	@Column(insertable=false, updatable=false)
	private int idFriend;

	public RoleFriendPK() {
	}
	public int getIdRole() {
		return this.idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getIdFriend() {
		return this.idFriend;
	}
	public void setIdFriend(int idFriend) {
		this.idFriend = idFriend;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleFriendPK)) {
			return false;
		}
		RoleFriendPK castOther = (RoleFriendPK)other;
		return 
			(this.idRole == castOther.idRole)
			&& (this.idFriend == castOther.idFriend);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRole;
		hash = hash * prime + this.idFriend;
		
		return hash;
	}
}