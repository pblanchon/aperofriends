package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the friendList database table.
 * 
 */
@Embeddable
public class FriendListPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idAF;

	@Column(insertable=false, updatable=false)
	private int idFriend;

	public FriendListPK() {
	}
	public int getIdAF() {
		return this.idAF;
	}
	public void setIdAF(int idAF) {
		this.idAF = idAF;
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
		if (!(other instanceof FriendListPK)) {
			return false;
		}
		FriendListPK castOther = (FriendListPK)other;
		return 
			(this.idAF == castOther.idAF)
			&& (this.idFriend == castOther.idFriend);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAF;
		hash = hash * prime + this.idFriend;
		
		return hash;
	}
}