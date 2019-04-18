package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the roleSeller database table.
 * 
 */
@Entity
@NamedQuery(name="RoleSeller.findAll", query="SELECT r FROM RoleSeller r")
public class RoleSeller implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleSellerPK id;

	//bi-directional many-to-one association to Seller
	@ManyToOne
	@JoinColumn(name="idSeller")
	private Seller seller;

	public RoleSeller() {
	}

	public RoleSellerPK getId() {
		return this.id;
	}

	public void setId(RoleSellerPK id) {
		this.id = id;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

}