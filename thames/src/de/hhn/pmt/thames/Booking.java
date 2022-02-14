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
@Table(name="`Booking`")
public class Booking implements Serializable {
	public Booking() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BOOKING_TOURIST) {
			this.tourist = (de.hhn.pmt.thames.Tourist) owner;
		}
		
		else if (key == ORMConstants.KEY_BOOKING_HOUSEBOAT) {
			this.houseBoat = (de.hhn.pmt.thames.HouseBoat) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`StartDate`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date startDate;
	
	@Column(name="`EndDate`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date endDate;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Tourist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) })	
	private de.hhn.pmt.thames.Tourist tourist;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.HouseBoat.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="`HouseBoatWin`", referencedColumnName="`Win`", nullable=false) })	
	private de.hhn.pmt.thames.HouseBoat houseBoat;
	
	@Column(name="`BookingNumber`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_PMT_THAMES_BOOKING_BOOKINGNUMBER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_PMT_THAMES_BOOKING_BOOKINGNUMBER_GENERATOR", strategy="native")	
	private int bookingNumber;
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setEndDate(java.util.Date value) {
		this.endDate = value;
	}
	
	public java.util.Date getEndDate() {
		return endDate;
	}
	
	private void setBookingNumber(int value) {
		this.bookingNumber = value;
	}
	
	public int getBookingNumber() {
		return bookingNumber;
	}
	
	public int getORMID() {
		return getBookingNumber();
	}
	
	public void setTourist(de.hhn.pmt.thames.Tourist value) {
		if (tourist != null) {
			tourist.bookings.remove(this);
		}
		if (value != null) {
			value.bookings.add(this);
		}
	}
	
	public de.hhn.pmt.thames.Tourist getTourist() {
		return tourist;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tourist(de.hhn.pmt.thames.Tourist value) {
		this.tourist = value;
	}
	
	private de.hhn.pmt.thames.Tourist getORM_Tourist() {
		return tourist;
	}
	
	public void setHouseBoat(de.hhn.pmt.thames.HouseBoat value) {
		if (houseBoat != null) {
			houseBoat.bookings.remove(this);
		}
		if (value != null) {
			value.bookings.add(this);
		}
	}
	
	public de.hhn.pmt.thames.HouseBoat getHouseBoat() {
		return houseBoat;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_HouseBoat(de.hhn.pmt.thames.HouseBoat value) {
		this.houseBoat = value;
	}
	
	private de.hhn.pmt.thames.HouseBoat getORM_HouseBoat() {
		return houseBoat;
	}
	
	public String toString() {
		return String.valueOf(getBookingNumber());
	}
	
}
