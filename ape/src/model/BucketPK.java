package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bucket database table.
 * 
 */
@Embeddable
public class BucketPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int nbCommand;

	@Column(insertable=false, updatable=false)
	private int idItem;

	public BucketPK() {
	}
	public int getNbCommand() {
		return this.nbCommand;
	}
	public void setNbCommand(int nbCommand) {
		this.nbCommand = nbCommand;
	}
	public int getIdItem() {
		return this.idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BucketPK)) {
			return false;
		}
		BucketPK castOther = (BucketPK)other;
		return 
			(this.nbCommand == castOther.nbCommand)
			&& (this.idItem == castOther.idItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.nbCommand;
		hash = hash * prime + this.idItem;
		
		return hash;
	}
}