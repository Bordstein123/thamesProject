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
@Embeddable
public class ReviewPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof ReviewPK))
			return false;
		ReviewPK reviewpk = (ReviewPK)aObj;
		if (getAuthor() == null) {
			if (reviewpk.getAuthor() != null)
				return false;
		}
		else if (!getAuthor().equals(reviewpk.getAuthor()))
			return false;
		if (getReviewIndex() != reviewpk.getReviewIndex())
			return false;
		if (getAbout() == null) {
			if (reviewpk.getAbout() != null)
				return false;
		}
		else if (!getAbout().equals(reviewpk.getAbout()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		if (getAuthor() != null) {
			hashcode = hashcode + (getAuthor().getORMID() == null ? 0 : getAuthor().getORMID().hashCode());
		}
		hashcode = hashcode + (int) getReviewIndex();
		if (getAbout() != null) {
			hashcode = hashcode + (getAbout().getORMID() == null ? 0 : getAbout().getORMID().hashCode());
		}
		return hashcode;
	}
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Tourist.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) }, foreignKey=@ForeignKey(name="writes"))	
	protected de.hhn.pmt.thames.Tourist author;
	
	public void setAuthor(de.hhn.pmt.thames.Tourist value)  {
		this.author =  value;
	}
	
	public de.hhn.pmt.thames.Tourist getAuthor()  {
		return this.author;
	}
	
	@Column(name="`ReviewIndex`", nullable=false, length=10)	
	private int reviewIndex;
	
	public void setReviewIndex(int value)  {
		this.reviewIndex =  value;
	}
	
	public int getReviewIndex()  {
		return this.reviewIndex;
	}
	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.POI.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`POIName`", referencedColumnName="`Name`", nullable=false) }, foreignKey=@ForeignKey(name="rates"))	
	private de.hhn.pmt.thames.POI about;
	
	public void setAbout(de.hhn.pmt.thames.POI value)  {
		this.about =  value;
	}
	
	public de.hhn.pmt.thames.POI getAbout()  {
		return this.about;
	}
	
}
