/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Carolin Niederhofer(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.pmt.thames;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="`Berth`")
public class Berth implements Serializable {
	public Berth() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Berth))
			return false;
		Berth berth = (Berth)aObj;
		if (getBerthId() != berth.getBerthId())
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getBerthId();
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BERTH_PIER) {
			this.pier = (de.hhn.pmt.thames.Pier) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`IsEmpty`", nullable=false, length=1)	
	private boolean isEmpty;
	
	@Column(name="`Price`", nullable=false)	
	private float price;
	
	@Column(name="`SizeX`", nullable=false)	
	private float sizeX;
	
	@Column(name="`SizeY`", nullable=false)	
	private float sizeY;
	
	@Column(name="`BerthId`", nullable=false, length=10)	
	@Id	
	private int berthId;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Pier.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`POIName`", referencedColumnName="`Name`", nullable=false) }, foreignKey=@ForeignKey(name="FKBerth965516"))	
	protected de.hhn.pmt.thames.Pier pier;
	
	public void setSizeX(float value) {
		this.sizeX = value;
	}
	
	public float getSizeX() {
		return sizeX;
	}
	
	public void setSizeY(float value) {
		this.sizeY = value;
	}
	
	public float getSizeY() {
		return sizeY;
	}
	
	public void setIsEmpty(boolean value) {
		this.isEmpty = value;
	}
	
	public boolean getIsEmpty() {
		return isEmpty;
	}
	
	public void setPrice(float value) {
		this.price = value;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setBerthId(int value) {
		this.berthId = value;
	}
	
	public int getBerthId() {
		return berthId;
	}
	
	public int getORMID() {
		return getBerthId();
	}
	
	public void setPier(de.hhn.pmt.thames.Pier value) {
		if (pier != null) {
			pier.berths.remove(this);
		}
		if (value != null) {
			value.berths.add(this);
		}
	}
	
	public de.hhn.pmt.thames.Pier getPier() {
		return pier;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pier(de.hhn.pmt.thames.Pier value) {
		this.pier = value;
	}
	
	private de.hhn.pmt.thames.Pier getORM_Pier() {
		return pier;
	}
	
	public String toString() {
		return String.valueOf(getBerthId());
	}
	
}
