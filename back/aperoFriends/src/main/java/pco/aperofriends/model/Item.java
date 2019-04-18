package pco.aperofriends.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the item database table.
 * 
 */
@Entity
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idItem;

	private int idTypeItem;

	private String nameItem;

	private int priceItem;

	private int stock;

	//bi-directional many-to-one association to Bucket
	@OneToMany(mappedBy="item")
	private List<Bucket> buckets;

	//bi-directional many-to-many association to Seller
	@ManyToMany(mappedBy="items")
	private List<Seller> sellers;

	public Item() {
	}

	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getIdTypeItem() {
		return this.idTypeItem;
	}

	public void setIdTypeItem(int idTypeItem) {
		this.idTypeItem = idTypeItem;
	}

	public String getNameItem() {
		return this.nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public int getPriceItem() {
		return this.priceItem;
	}

	public void setPriceItem(int priceItem) {
		this.priceItem = priceItem;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public List<Bucket> getBuckets() {
		return this.buckets;
	}

	public void setBuckets(List<Bucket> buckets) {
		this.buckets = buckets;
	}

	public Bucket addBucket(Bucket bucket) {
		getBuckets().add(bucket);
		bucket.setItem(this);

		return bucket;
	}

	public Bucket removeBucket(Bucket bucket) {
		getBuckets().remove(bucket);
		bucket.setItem(null);

		return bucket;
	}

	public List<Seller> getSellers() {
		return this.sellers;
	}

	public void setSellers(List<Seller> sellers) {
		this.sellers = sellers;
	}

}