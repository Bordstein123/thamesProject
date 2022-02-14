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
@DiscriminatorValue("Sights")
public class Sights extends de.hhn.pmt.thames.POI implements Serializable {
	public Sights() {
	}
	
	@Column(name="`EntranceFee`", nullable=true)	
	private double entranceFee;
	
	public void setEntranceFee(double value) {
		this.entranceFee = value;
	}
	
	public double getEntranceFee() {
		return entranceFee;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
