package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the friend database table.
 * 
 */
@Entity
@NamedQuery(name="Friend.findAll", query="SELECT f FROM Friend f")
public class Friend implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idFriend;

	private String firstnameFriend;

	private int idRole;

	private String lastnameFriend;

	private String mailFriend;

	private String passFriend;

	private String phoneFriend;

	//bi-directional many-to-many association to Command
	@ManyToMany
	@JoinTable(
		name="friendCommand"
		, joinColumns={
			@JoinColumn(name="idFriend")
			}
		, inverseJoinColumns={
			@JoinColumn(name="nbCommand")
			}
		)
	private List<Command> commands;

	//bi-directional many-to-one association to FriendList
	@OneToMany(mappedBy="friend")
	private List<FriendList> friendLists;

	//bi-directional many-to-one association to RoleList
	@OneToMany(mappedBy="friend")
	private List<RoleList> roleLists;

	public Friend() {
	}

	public int getIdFriend() {
		return this.idFriend;
	}

	public void setIdFriend(int idFriend) {
		this.idFriend = idFriend;
	}

	public String getFirstnameFriend() {
		return this.firstnameFriend;
	}

	public void setFirstnameFriend(String firstnameFriend) {
		this.firstnameFriend = firstnameFriend;
	}

	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getLastnameFriend() {
		return this.lastnameFriend;
	}

	public void setLastnameFriend(String lastnameFriend) {
		this.lastnameFriend = lastnameFriend;
	}

	public String getMailFriend() {
		return this.mailFriend;
	}

	public void setMailFriend(String mailFriend) {
		this.mailFriend = mailFriend;
	}

	public String getPassFriend() {
		return this.passFriend;
	}

	public void setPassFriend(String passFriend) {
		this.passFriend = passFriend;
	}

	public String getPhoneFriend() {
		return this.phoneFriend;
	}

	public void setPhoneFriend(String phoneFriend) {
		this.phoneFriend = phoneFriend;
	}

	public List<Command> getCommands() {
		return this.commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

	public List<FriendList> getFriendLists() {
		return this.friendLists;
	}

	public void setFriendLists(List<FriendList> friendLists) {
		this.friendLists = friendLists;
	}

	public FriendList addFriendList(FriendList friendList) {
		getFriendLists().add(friendList);
		friendList.setFriend(this);

		return friendList;
	}

	public FriendList removeFriendList(FriendList friendList) {
		getFriendLists().remove(friendList);
		friendList.setFriend(null);

		return friendList;
	}

	public List<RoleList> getRoleLists() {
		return this.roleLists;
	}

	public void setRoleLists(List<RoleList> roleLists) {
		this.roleLists = roleLists;
	}

	public RoleList addRoleList(RoleList roleList) {
		getRoleLists().add(roleList);
		roleList.setFriend(this);

		return roleList;
	}

	public RoleList removeRoleList(RoleList roleList) {
		getRoleLists().remove(roleList);
		roleList.setFriend(null);

		return roleList;
	}

}