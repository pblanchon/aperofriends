package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the roleFriend database table.
 * 
 */
@Entity
@NamedQuery(name="RoleFriend.findAll", query="SELECT r FROM RoleFriend r")
public class RoleFriend implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RoleFriendPK id;

	//bi-directional many-to-one association to Friend
	@ManyToOne
	@JoinColumn(name="idFriend")
	private Friend friend;

	public RoleFriend() {
	}

	public RoleFriendPK getId() {
		return this.id;
	}

	public void setId(RoleFriendPK id) {
		this.id = id;
	}

	public Friend getFriend() {
		return this.friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

}