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
@Table(name="`POI`")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="`Discriminator`", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("POI")
public abstract class POI implements Serializable {
	public POI() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof POI))
			return false;
		POI poi = (POI)aObj;
		if ((getName() != null && !getName().equals(poi.getName())) || (getName() == null && poi.getName() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getName() == null ? 0 : getName().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_POI_STATION) {
			return ORM_station;
		}
		else if (key == ORMConstants.KEY_POI_RATING) {
			return ORM_rating;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_POI_OWNER) {
			this.owner = (de.hhn.pmt.thames.Owner) owner;
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
	
	@Column(name="`Lat`", nullable=false)	
	private double lat;
	
	@Column(name="`Lon`", nullable=false)	
	private double lon;
	
	@Column(name="`OpenHour`", nullable=false)	
	private java.sql.Timestamp openHour;
	
	@Column(name="`CloseHour`", nullable=false)	
	private java.sql.Timestamp closeHour;
	
	@Column(name="`DaysOfRest`", nullable=true, length=255)	
	private String daysOfRest;
	
	@Column(name="`Image`", nullable=true)	
	private java.sql.Blob image;
	
	@Column(name="`Website`", nullable=true, length=255)	
	private String website;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Owner.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) }, foreignKey=@ForeignKey(name="owns"))	
	protected de.hhn.pmt.thames.Owner owner;
	
	@ManyToMany(targetEntity=de.hhn.pmt.thames.Tour.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="`Tour_POI`", joinColumns={ @JoinColumn(name="`POIName`") }, inverseJoinColumns={ @JoinColumn(name="`TourName`") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_station = new java.util.HashSet();
	
	@OneToMany(mappedBy="about", targetEntity=de.hhn.pmt.thames.Review.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_rating = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getORMID() {
		return getName();
	}
	
	public void setLat(double value) {
		this.lat = value;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLon(double value) {
		this.lon = value;
	}
	
	public double getLon() {
		return lon;
	}
	
	public void setOpenHour(java.sql.Timestamp value) {
		this.openHour = value;
	}
	
	public java.sql.Timestamp getOpenHour() {
		return openHour;
	}
	
	public void setCloseHour(java.sql.Timestamp value) {
		this.closeHour = value;
	}
	
	public java.sql.Timestamp getCloseHour() {
		return closeHour;
	}
	
	public void setImage(java.sql.Blob value) {
		this.image = value;
	}
	
	public java.sql.Blob getImage() {
		return image;
	}
	
	public void setWebsite(String value) {
		this.website = value;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setDaysOfRest(String value) {
		this.daysOfRest = value;
	}
	
	public String getDaysOfRest() {
		return daysOfRest;
	}
	
	public void setOwner(de.hhn.pmt.thames.Owner value) {
		if (owner != null) {
			owner.property.remove(this);
		}
		if (value != null) {
			value.property.add(this);
		}
	}
	
	public de.hhn.pmt.thames.Owner getOwner() {
		return owner;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Owner(de.hhn.pmt.thames.Owner value) {
		this.owner = value;
	}
	
	private de.hhn.pmt.thames.Owner getORM_Owner() {
		return owner;
	}
	
	private void setORM_Station(java.util.Set value) {
		this.ORM_station = value;
	}
	
	private java.util.Set getORM_Station() {
		return ORM_station;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.TourSetCollection station = new de.hhn.pmt.thames.TourSetCollection(this, _ormAdapter, ORMConstants.KEY_POI_STATION, ORMConstants.KEY_TOUR_TOUR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Rating(java.util.Set value) {
		this.ORM_rating = value;
	}
	
	private java.util.Set getORM_Rating() {
		return ORM_rating;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.ReviewSetCollection rating = new de.hhn.pmt.thames.ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_POI_RATING, ORMConstants.KEY_REVIEW_ABOUT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getName());
	}
	
}
