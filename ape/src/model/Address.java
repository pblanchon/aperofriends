package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAddress;

	private String address;

	//bi-directional many-to-one association to AddressFriend
	@OneToMany(mappedBy="address")
	private List<AddressFriend> addressFriends;

	//bi-directional many-to-many association to Seller
	@ManyToMany(mappedBy="addresses")
	private List<Seller> sellers;

	public Address() {
	}

	public int getIdAddress() {
		return this.idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<AddressFriend> getAddressFriends() {
		return this.addressFriends;
	}

	public void setAddressFriends(List<AddressFriend> addressFriends) {
		this.addressFriends = addressFriends;
	}

	public AddressFriend addAddressFriend(AddressFriend addressFriend) {
		getAddressFriends().add(addressFriend);
		addressFriend.setAddress(this);

		return addressFriend;
	}

	public AddressFriend removeAddressFriend(AddressFriend addressFriend) {
		getAddressFriends().remove(addressFriend);
		addressFriend.setAddress(null);

		return addressFriend;
	}

	public List<Seller> getSellers() {
		return this.sellers;
	}

	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}

}