package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the friendList database table.
 * 
 */
@Entity
@NamedQuery(name="FriendList.findAll", query="SELECT f FROM FriendList f")
public class FriendList implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FriendListPK id;

	//bi-directional many-to-one association to Friend
	@ManyToOne
	@JoinColumn(name="idFriend")
	private Friend friend;

	public FriendList() {
	}

	public FriendListPK getId() {
		return this.id;
	}

	public void setId(FriendListPK id) {
		this.id = id;
	}

	public Friend getFriend() {
		return this.friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

}