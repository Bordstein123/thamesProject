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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Lessor")
public class Lessor extends de.hhn.pmt.thames.thamesUser implements Serializable {
	public Lessor() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_LESSOR_PROPERTY) {
			return ORM_property;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="provider", targetEntity=de.hhn.pmt.thames.HouseBoat.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_property = new java.util.HashSet();
	
	private void setORM_Property(java.util.Set value) {
		this.ORM_property = value;
	}
	
	private java.util.Set getORM_Property() {
		return ORM_property;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.HouseBoatSetCollection property = new de.hhn.pmt.thames.HouseBoatSetCollection(this, _ormAdapter, ORMConstants.KEY_LESSOR_PROPERTY, ORMConstants.KEY_HOUSEBOAT_PROVIDER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
