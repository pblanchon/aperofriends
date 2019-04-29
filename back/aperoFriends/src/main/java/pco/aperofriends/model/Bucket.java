package pco.aperofriends.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the BUCKET database table.
 * 
 */
@Entity
//@NamedQuery(name="Bucket.findAll", query="SELECT b FROM Bucket b")
public class Bucket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBucket;

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "idFriend")
	private Friend buyer;
	
	@ManyToMany
	@JoinTable(name = "bucket_items", joinColumns = @JoinColumn(name = "idBucket"), inverseJoinColumns = @JoinColumn(name="idItem"))
	private Set<Item> items = new HashSet<Item>();

	public int getIdBucket() {
		return idBucket;
	}

	public void setIdBucket(int idBucket) {
		this.idBucket = idBucket;
	}

	public Friend getBuyer() {
		return buyer;
	}

	public void setBuyer(Friend buyer) {
		this.buyer = buyer;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Bucket [idBucket=" + idBucket + ", buyer=" + buyer + ", items=" + items + "]";
	}


}