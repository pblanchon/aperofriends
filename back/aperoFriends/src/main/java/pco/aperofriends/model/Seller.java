package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the seller database table.
 * 
 */
@Entity
@NamedQuery(name="Seller.findAll", query="SELECT s FROM Seller s")
public class Seller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSeller;

	private String mailSeller;

	private String nameSeller;

	private String passSeller;

	private String phoneSeller;

	//bi-directional many-to-many association to Address
	@ManyToMany
	@JoinTable(
		name="addressSeller"
		, joinColumns={
			@JoinColumn(name="idSeller")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idAddress")
			}
		)
	private List<Address> addresses;

	//bi-directional many-to-many association to Item
	@ManyToMany
	@JoinTable(
		name="manageitem"
		, joinColumns={
			@JoinColumn(name="idSeller")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idItem")
			}
		)
	private List<Item> items;

	//bi-directional many-to-one association to RoleSeller
	@OneToMany(mappedBy="seller")
	private List<RoleSeller> roleSellers;

	public Seller() {
	}

	public int getIdSeller() {
		return this.idSeller;
	}

	public void setIdSeller(int idSeller) {
		this.idSeller = idSeller;
	}

	public String getMailSeller() {
		return this.mailSeller;
	}

	public void setMailSeller(String mailSeller) {
		this.mailSeller = mailSeller;
	}

	public String getNameSeller() {
		return this.nameSeller;
	}

	public void setNameSeller(String nameSeller) {
		this.nameSeller = nameSeller;
	}

	public String getPassSeller() {
		return this.passSeller;
	}

	public void setPassSeller(String passSeller) {
		this.passSeller = passSeller;
	}

	public String getPhoneSeller() {
		return this.phoneSeller;
	}

	public void setPhoneSeller(String phoneSeller) {
		this.phoneSeller = phoneSeller;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<RoleSeller> getRoleSellers() {
		return this.roleSellers;
	}

	public void setRoleSellers(List<RoleSeller> roleSellers) {
		this.roleSellers = roleSellers;
	}

	public RoleSeller addRoleSeller(RoleSeller roleSeller) {
		getRoleSellers().add(roleSeller);
		roleSeller.setSeller(this);

		return roleSeller;
	}

	public RoleSeller removeRoleSeller(RoleSeller roleSeller) {
		getRoleSellers().remove(roleSeller);
		roleSeller.setSeller(null);

		return roleSeller;
	}

}