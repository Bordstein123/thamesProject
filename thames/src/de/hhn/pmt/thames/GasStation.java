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
@DiscriminatorValue("GasStation")
public class GasStation extends de.hhn.pmt.thames.POI implements Serializable {
	public GasStation() {
	}
	
	@ElementCollection	
	@CollectionTable(name="POI_fuels", joinColumns={ @JoinColumn(name="POIName") })	
	@org.hibernate.annotations.IndexColumn(name="POIIndex")	
	@Column(name="`Fuels`", nullable=true, length=255)	
	private String[] fuels;
	
	public void setFuels(String[] value) {
		this.fuels = value;
	}
	
	public String[] getFuels() {
		return fuels;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
