package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the addressFriends database table.
 * 
 */
@Embeddable
public class AddressFriendPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idAF;

	@Column(insertable=false, updatable=false)
	private int idAddress;

	public AddressFriendPK() {
	}
	public int getIdAF() {
		return this.idAF;
	}
	public void setIdAF(int idAF) {
		this.idAF = idAF;
	}
	public int getIdAddress() {
		return this.idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AddressFriendPK)) {
			return false;
		}
		AddressFriendPK castOther = (AddressFriendPK)other;
		return 
			(this.idAF == castOther.idAF)
			&& (this.idAddress == castOther.idAddress);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAF;
		hash = hash * prime + this.idAddress;
		
		return hash;
	}
}