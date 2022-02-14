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
@DiscriminatorValue("Tourist")
public class Tourist extends de.hhn.pmt.thames.thamesUser implements Serializable {
	public Tourist() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TOURIST_RATINGS) {
			return ORM_ratings;
		}
		else if (key == ORMConstants.KEY_TOURIST_BOOKINGS) {
			return ORM_bookings;
		}
		else if (key == ORMConstants.KEY_TOURIST_FAVOURITESS) {
			return ORM_favouritess;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="`Licence`", nullable=true, length=255)	
	private String licence;
	
	@OneToMany(mappedBy="author", targetEntity=de.hhn.pmt.thames.Review.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ratings = new java.util.HashSet();
	
	@OneToMany(mappedBy="tourist", targetEntity=de.hhn.pmt.thames.Booking.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bookings = new java.util.HashSet();
	
	@OneToMany(mappedBy="tourist", targetEntity=de.hhn.pmt.thames.Favourites.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_favouritess = new java.util.HashSet();
	
	public void setLicence(String value) {
		this.licence = value;
	}
	
	public String getLicence() {
		return licence;
	}
	
	private void setORM_Ratings(java.util.Set value) {
		this.ORM_ratings = value;
	}
	
	private java.util.Set getORM_Ratings() {
		return ORM_ratings;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.ReviewSetCollection ratings = new de.hhn.pmt.thames.ReviewSetCollection(this, _ormAdapter, ORMConstants.KEY_TOURIST_RATINGS, ORMConstants.KEY_REVIEW_AUTHOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public de.hhn.pmt.thames.HouseBoat[] getHouseBoats() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = bookings.getIterator();lIter.hasNext();) {
			lValues.add(((de.hhn.pmt.thames.Booking)lIter.next()).getHouseBoat());
		}
		return (de.hhn.pmt.thames.HouseBoat[])lValues.toArray(new de.hhn.pmt.thames.HouseBoat[lValues.size()]);
	}
	
	public void removeHouseBoat(de.hhn.pmt.thames.HouseBoat aHouseBoat) {
		de.hhn.pmt.thames.Booking[] lBookings = bookings.toArray();
		for(int i = 0; i < lBookings.length; i++) {
			if(lBookings[i].getHouseBoat().equals(aHouseBoat)) {
				bookings.remove(lBookings[i]);
			}
		}
	}
	
	public void addHouseBoat(de.hhn.pmt.thames.Booking aBooking, de.hhn.pmt.thames.HouseBoat aHouseBoat) {
		aBooking.setHouseBoat(aHouseBoat);
		bookings.add(aBooking);
	}
	
	public de.hhn.pmt.thames.Booking getBookingByHouseBoat(de.hhn.pmt.thames.HouseBoat aHouseBoat) {
		de.hhn.pmt.thames.Booking[] lBookings = bookings.toArray();
		for(int i = 0; i < lBookings.length; i++) {
			if(lBookings[i].getHouseBoat().equals(aHouseBoat)) {
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
	public final de.hhn.pmt.thames.BookingSetCollection bookings = new de.hhn.pmt.thames.BookingSetCollection(this, _ormAdapter, ORMConstants.KEY_TOURIST_BOOKINGS, ORMConstants.KEY_BOOKING_TOURIST, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public de.hhn.pmt.thames.Tour[] getTours() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = favouritess.getIterator();lIter.hasNext();) {
			lValues.add(((de.hhn.pmt.thames.Favourites)lIter.next()).getTour());
		}
		return (de.hhn.pmt.thames.Tour[])lValues.toArray(new de.hhn.pmt.thames.Tour[lValues.size()]);
	}
	
	public void removeTour(de.hhn.pmt.thames.Tour aTour) {
		de.hhn.pmt.thames.Favourites[] lFavouritess = favouritess.toArray();
		for(int i = 0; i < lFavouritess.length; i++) {
			if(lFavouritess[i].getTour().equals(aTour)) {
				favouritess.remove(lFavouritess[i]);
			}
		}
	}
	
	public void addTour(de.hhn.pmt.thames.Favourites aFavourites, de.hhn.pmt.thames.Tour aTour) {
		aFavourites.setTour(aTour);
		favouritess.add(aFavourites);
	}
	
	public de.hhn.pmt.thames.Favourites getFavouritesByTour(de.hhn.pmt.thames.Tour aTour) {
		de.hhn.pmt.thames.Favourites[] lFavouritess = favouritess.toArray();
		for(int i = 0; i < lFavouritess.length; i++) {
			if(lFavouritess[i].getTour().equals(aTour)) {
				return lFavouritess[i];
			}
		}
		return null;
	}
	
	private void setORM_Favouritess(java.util.Set value) {
		this.ORM_favouritess = value;
	}
	
	private java.util.Set getORM_Favouritess() {
		return ORM_favouritess;
	}
	
	@Transient	
	public final de.hhn.pmt.thames.FavouritesSetCollection favouritess = new de.hhn.pmt.thames.FavouritesSetCollection(this, _ormAdapter, ORMConstants.KEY_TOURIST_FAVOURITESS, ORMConstants.KEY_FAVOURITES_TOURIST, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
