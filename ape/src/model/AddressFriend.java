package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the addressFriends database table.
 * 
 */
@Entity
@Table(name="addressFriends")
@NamedQuery(name="AddressFriend.findAll", query="SELECT a FROM AddressFriend a")
public class AddressFriend implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AddressFriendPK id;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="idAddress")
	private Address address;

	public AddressFriend() {
	}

	public AddressFriendPK getId() {
		return this.id;
	}

	public void setId(AddressFriendPK id) {
		this.id = id;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}