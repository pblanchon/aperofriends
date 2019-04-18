package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the typeItem database table.
 * 
 */
@Entity
@NamedQuery(name="TypeItem.findAll", query="SELECT t FROM TypeItem t")
public class TypeItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTypeItem;

	private String nameTypeItem;

	public TypeItem() {
	}

	public int getIdTypeItem() {
		return this.idTypeItem;
	}

	public void setIdTypeItem(int idTypeItem) {
		this.idTypeItem = idTypeItem;
	}

	public String getNameTypeItem() {
		return this.nameTypeItem;
	}

	public void setNameTypeItem(String nameTypeItem) {
		this.nameTypeItem = nameTypeItem;
	}

}