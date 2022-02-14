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
@Table(name="`Favourites`")
public class Favourites implements Serializable {
	public Favourites() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FAVOURITES_TOURIST) {
			this.tourist = (de.hhn.pmt.thames.Tourist) owner;
		}
		
		else if (key == ORMConstants.KEY_FAVOURITES_TOUR) {
			this.tour = (de.hhn.pmt.thames.Tour) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@OneToOne(targetEntity=de.hhn.pmt.thames.Tour.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="`TourName`", referencedColumnName="`Name`", nullable=false) })	
	private de.hhn.pmt.thames.Tour tour;
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Tourist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) })	
	private de.hhn.pmt.thames.Tourist tourist;
	
	@Column(name="`ID`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_PMT_THAMES_FAVOURITES_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_PMT_THAMES_FAVOURITES_ID_GENERATOR", strategy="native")	
	private int ID;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTourist(de.hhn.pmt.thames.Tourist value) {
		if (tourist != null) {
			tourist.favouritess.remove(this);
		}
		if (value != null) {
			value.favouritess.add(this);
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
	
	public void setTour(de.hhn.pmt.thames.Tour value) {
		if (this.tour != value) {
			de.hhn.pmt.thames.Tour ltour = this.tour;
			this.tour = value;
			if (value != null) {
				tour.setFavourites(this);
			}
			if (ltour != null && ltour.getFavourites() == this) {
				ltour.setFavourites(null);
			}
		}
	}
	
	public de.hhn.pmt.thames.Tour getTour() {
		return tour;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
