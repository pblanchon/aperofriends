package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bucket database table.
 * 
 */
@Entity
@NamedQuery(name="Bucket.findAll", query="SELECT b FROM Bucket b")
public class Bucket implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BucketPK id;

	private int totalItem;

	//bi-directional many-to-one association to Command
	@ManyToOne
	@JoinColumn(name="nbCommand")
	private Command command;

	//bi-directional many-to-one association to Item
	@ManyToOne
	@JoinColumn(name="idItem")
	private Item item;

	public Bucket() {
	}

	public BucketPK getId() {
		return this.id;
	}

	public void setId(BucketPK id) {
		this.id = id;
	}

	public int getTotalItem() {
		return this.totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public Command getCommand() {
		return this.command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}