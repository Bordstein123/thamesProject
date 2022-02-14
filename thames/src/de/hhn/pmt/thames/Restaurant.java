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
@DiscriminatorValue("Restaurant")
public class Restaurant extends de.hhn.pmt.thames.POI implements Serializable {
	public Restaurant() {
	}
	
	@Column(name="`HasVeggieMeals`", nullable=true, length=1)	
	private boolean hasVeggieMeals;
	
	@Column(name="`HasVeganMeals`", nullable=true, length=1)	
	private boolean hasVeganMeals;
	
	@Column(name="`PriceRange`", nullable=true, length=10)	
	private int priceRange;
	
	public void setHasVeggieMeals(boolean value) {
		this.hasVeggieMeals = value;
	}
	
	public boolean getHasVeggieMeals() {
		return hasVeggieMeals;
	}
	
	public void setHasVeganMeals(boolean value) {
		this.hasVeganMeals = value;
	}
	
	public boolean getHasVeganMeals() {
		return hasVeganMeals;
	}
	
	public void setPriceRange(int value) {
		this.priceRange = value;
	}
	
	public int getPriceRange() {
		return priceRange;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
