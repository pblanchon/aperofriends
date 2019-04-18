package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accountFriends database table.
 * 
 */
@Entity
@Table(name="accountFriends")
@NamedQuery(name="AccountFriend.findAll", query="SELECT a FROM AccountFriend a")
public class AccountFriend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAF;

	private String addressAccount;

	private String nameAccount;

	public AccountFriend() {
	}

	public int getIdAF() {
		return this.idAF;
	}

	public void setIdAF(int idAF) {
		this.idAF = idAF;
	}

	public String getAddressAccount() {
		return this.addressAccount;
	}

	public void setAddressAccount(String addressAccount) {
		this.addressAccount = addressAccount;
	}

	public String getNameAccount() {
		return this.nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

}