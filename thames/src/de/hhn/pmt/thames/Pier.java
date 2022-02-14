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
@DiscriminatorValue("Pier")
public class Pier extends de.hhn.pmt.thames.POI implements Serializable {
	public Pier() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PIER_BERTHS) {
			return ORM_berths;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="pier", orphanRemoval=true, targetEntity=de.hhn.pmt.thames.Berth.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.ALL})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_berths = new java.util.HashSet();
	
	private void setORM_Berths(java.util.Set value) {
		this.ORM_berths = value;
	}
	
	private java.util.Set getORM_Berths() {
		return ORM_berths;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.BerthSetCollection berths = new de.hhn.pmt.thames.BerthSetCollection(this, _ormAdapter, ORMConstants.KEY_PIER_BERTHS, ORMConstants.KEY_BERTH_PIER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
