package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the roleSeller database table.
 * 
 */
@Embeddable
public class RoleSellerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idRole;

	@Column(insertable=false, updatable=false)
	private int idSeller;

	public RoleSellerPK() {
	}
	public int getIdRole() {
		return this.idRole;
	}
	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}
	public int getIdSeller() {
		return this.idSeller;
	}
	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RoleSellerPK)) {
			return false;
		}
		RoleSellerPK castOther = (RoleSellerPK)other;
		return 
			(this.idRole == castOther.idRole)
			&& (this.idSeller == castOther.idSeller);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRole;
		hash = hash * prime + this.idSeller;
		
		return hash;
	}
}