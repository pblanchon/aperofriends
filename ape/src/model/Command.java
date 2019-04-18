package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the command database table.
 * 
 */
@Entity
@NamedQuery(name="Command.findAll", query="SELECT c FROM Command c")
public class Command implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int nbCommand;

	@Temporal(TemporalType.DATE)
	private Date dateCommand;

	private int totalCommand;

	//bi-directional many-to-one association to Bucket
	@OneToMany(mappedBy="command")
	private List<Bucket> buckets;

	//bi-directional many-to-many association to Friend
	@ManyToMany(mappedBy="commands")
	private List<Friend> friends;

	public Command() {
	}

	public int getNbCommand() {
		return this.nbCommand;
	}

	public void setNbCommand(int nbCommand) {
		this.nbCommand = nbCommand;
	}

	public Date getDateCommand() {
		return this.dateCommand;
	}

	public void setDateCommand(Date dateCommand) {
		this.dateCommand = dateCommand;
	}

	public int getTotalCommand() {
		return this.totalCommand;
	}

	public void setTotalCommand(int totalCommand) {
		this.totalCommand = totalCommand;
	}

	public List<Bucket> getBuckets() {
		return this.buckets;
	}

	public void setBuckets(List<Bucket> buckets) {
		this.buckets = buckets;
	}

	public Bucket addBucket(Bucket bucket) {
		getBuckets().add(bucket);
		bucket.setCommand(this);

		return bucket;
	}

	public Bucket removeBucket(Bucket bucket) {
		getBuckets().remove(bucket);
		bucket.setCommand(null);

		return bucket;
	}

	public List<Friend> getFriends() {
		return this.friends;
	}

	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}

}