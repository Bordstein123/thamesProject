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
@Table(name="`HouseBoat`")
public class HouseBoat implements Serializable {
	public HouseBoat() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof HouseBoat))
			return false;
		HouseBoat houseboat = (HouseBoat)aObj;
		if ((getWin() != null && !getWin().equals(houseboat.getWin())) || (getWin() == null && houseboat.getWin() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getWin() == null ? 0 : getWin().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HOUSEBOAT_BOOKINGS) {
			return ORM_bookings;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HOUSEBOAT_PROVIDER) {
			this.provider = (de.hhn.pmt.thames.Lessor) owner;
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
	
	@Column(name="`Model`", nullable=true, length=255)	
	private String model;
	
	@Column(name="`Name`", nullable=true, length=255)	
	private String name;
	
	@Column(name="`DimensionX`", nullable=false)	
	private float dimensionX;
	
	@Column(name="`DimensionY`", nullable=false)	
	private float dimensionY;
	
	@Column(name="`PricePerDay`", nullable=false)	
	private float pricePerDay;
	
	@Column(name="`Win`", nullable=false, length=255)	
	@Id	
	private String win;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Lessor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) }, foreignKey=@ForeignKey(name="rents out"))	
	protected de.hhn.pmt.thames.Lessor provider;
	
	@OneToMany(mappedBy="houseBoat", targetEntity=de.hhn.pmt.thames.Booking.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bookings = new java.util.HashSet();
	
	public void setModel(String value) {
		this.model = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDimensionX(float value) {
		this.dimensionX = value;
	}
	
	public float getDimensionX() {
		return dimensionX;
	}
	
	public void setDimensionY(float value) {
		this.dimensionY = value;
	}
	
	public float getDimensionY() {
		return dimensionY;
	}
	
	public void setPricePerDay(float value) {
		this.pricePerDay = value;
	}
	
	public float getPricePerDay() {
		return pricePerDay;
	}
	
	public void setWin(String value) {
		this.win = value;
	}
	
	public String getWin() {
		return win;
	}
	
	public String getORMID() {
		return getWin();
	}
	
	public void setProvider(de.hhn.pmt.thames.Lessor value) {
		if (provider != null) {
			provider.property.remove(this);
		}
		if (value != null) {
			value.property.add(this);
		}
	}
	
	public de.hhn.pmt.thames.Lessor getProvider() {
		return provider;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Provider(de.hhn.pmt.thames.Lessor value) {
		this.provider = value;
	}
	
	private de.hhn.pmt.thames.Lessor getORM_Provider() {
		return provider;
	}
	
	public de.hhn.pmt.thames.Tourist[] getTourists() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = bookings.getIterator();lIter.hasNext();) {
			lValues.add(((de.hhn.pmt.thames.Booking)lIter.next()).getTourist());
		}
		return (de.hhn.pmt.thames.Tourist[])lValues.toArray(new de.hhn.pmt.thames.Tourist[lValues.size()]);
	}
	
	public void removeTourist(de.hhn.pmt.thames.Tourist aTourist) {
		de.hhn.pmt.thames.Booking[] lBookings = bookings.toArray();
		for(int i = 0; i < lBookings.length; i++) {
			if(lBookings[i].getTourist().equals(aTourist)) {
				bookings.remove(lBookings[i]);
			}
		}
	}
	
	public void addTourist(de.hhn.pmt.thames.Booking aBooking, de.hhn.pmt.thames.Tourist aTourist) {
		aBooking.setTourist(aTourist);
		bookings.add(aBooking);
	}
	
	public de.hhn.pmt.thames.Booking getBookingByTourist(de.hhn.pmt.thames.Tourist aTourist) {
		de.hhn.pmt.thames.Booking[] lBookings = bookings.toArray();
		for(int i = 0; i < lBookings.length; i++) {
			if(lBookings[i].getTourist().equals(aTourist)) {
				return lBookings[i];
			}
		}
		return null;
	}
	
	private void setORM_Bookings(java.util.Set value) {
		this.ORM_bookings = value;
	}
	
	private java.util.Set getORM_Bookings() {
		return ORM_bookings;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.BookingSetCollection bookings = new de.hhn.pmt.thames.BookingSetCollection(this, _ormAdapter, ORMConstants.KEY_HOUSEBOAT_BOOKINGS, ORMConstants.KEY_BOOKING_HOUSEBOAT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getWin());
	}
	
}
