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
@Table(name="`Tour`")
public class Tour implements Serializable {
	public Tour() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Tour))
			return false;
		Tour tour = (Tour)aObj;
		if ((getName() != null && !getName().equals(tour.getName())) || (getName() == null && tour.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TOUR_TOUR) {
			return ORM_tour;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TOUR_FAVOURITES) {
			this.favourites = (de.hhn.pmt.thames.Favourites) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`Name`", nullable=false, length=255)	
	@Id	
	private String name;
	
	@Column(name="`Length`", nullable=false)	
	private float length;
	
	@Column(name="`Duration`", nullable=false)	
	private float duration;
	
	@Column(name="`Locks`", nullable=false, length=10)	
	private int locks;
	
	@Column(name="`NightStays`", nullable=false, length=10)	
	private int nightStays;
	
	@OneToOne(mappedBy="tour", targetEntity=de.hhn.pmt.thames.Favourites.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.pmt.thames.Favourites favourites;
	
	@ManyToMany(mappedBy="ORM_station", targetEntity=de.hhn.pmt.thames.POI.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tour = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setLength(float value) {
		this.length = value;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setDuration(float value) {
		this.duration = value;
	}
	
	public float getDuration() {
		return duration;
	}
	
	public void setLocks(int value) {
		this.locks = value;
	}
	
	public int getLocks() {
		return locks;
	}
	
	public void setNightStays(int value) {
		this.nightStays = value;
	}
	
	public int getNightStays() {
		return nightStays;
	}
	
	public de.hhn.pmt.thames.Tourist getTourist() {
		if(favourites != null) {
			return favourites.getTourist();
		}
		else {
			return null;
		}
	}
	
	public void removeTourist() {
		if(favourites!= null) {
			favourites.setTourist(null);
			this.setFavourites(null);
		}
	}
	
	public void addTourist(de.hhn.pmt.thames.Favourites aFavourites, de.hhn.pmt.thames.Tourist aTourist) {
		this.setFavourites(aFavourites);
		aFavourites.setTourist(aTourist);
	}
	
	public void setFavourites(de.hhn.pmt.thames.Favourites value) {
		if (this.favourites != value) {
			de.hhn.pmt.thames.Favourites lfavourites = this.favourites;
			this.favourites = value;
			if (value != null) {
				favourites.setTour(this);
			}
			if (lfavourites != null && lfavourites.getTour() == this) {
				lfavourites.setTour(null);
			}
		}
	}
	
	public de.hhn.pmt.thames.Favourites getFavourites() {
		return favourites;
	}
	
	private void setORM_Tour(java.util.Set value) {
		this.ORM_tour = value;
	}
	
	private java.util.Set getORM_Tour() {
		return ORM_tour;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.POISetCollection tour = new de.hhn.pmt.thames.POISetCollection(this, _ormAdapter, ORMConstants.KEY_TOUR_TOUR, ORMConstants.KEY_POI_STATION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
