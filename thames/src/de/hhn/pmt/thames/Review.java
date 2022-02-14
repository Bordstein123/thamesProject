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
@Table(name="`Review`")
@IdClass(ReviewPK.class)
public class Review implements Serializable {
	public Review() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Review))
			return false;
		Review review = (Review)aObj;
		if (getAuthor() == null) {
			if (review.getAuthor() != null)
				return false;
		}
		else if (!getAuthor().equals(review.getAuthor()))
			return false;
		if (getReviewIndex() != review.getReviewIndex())
			return false;
		if (getAbout() == null) {
			if (review.getAbout() != null)
				return false;
		}
		else if (!getAbout().equals(review.getAbout()))
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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_REVIEW_ABOUT) {
			this.about = (de.hhn.pmt.thames.POI) owner;
		}
		
		else if (key == ORMConstants.KEY_REVIEW_AUTHOR) {
			this.author = (de.hhn.pmt.thames.Tourist) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="`Content`", nullable=true, length=255)	
	private String content;
	
	@Column(name="`Rating`", nullable=false)	
	private float rating;
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.Tourist.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`thamesUserEmail`", referencedColumnName="`Email`", nullable=false) }, foreignKey=@ForeignKey(name="writes"))	
	protected de.hhn.pmt.thames.Tourist author;
	
	@Column(name="`thamesUserEmail`", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="DE_HHN_PMT_THAMES_REVIEW_AUTHORID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_PMT_THAMES_REVIEW_AUTHORID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="author"))	
	private String authorId;
	
	private void setAuthorId(String value) {
		this.authorId = value;
	}
	
	public String getAuthorId() {
		return authorId;
	}
	
	@Column(name="`ReviewIndex`", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_PMT_THAMES_REVIEW_REVIEWINDEX_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_PMT_THAMES_REVIEW_REVIEWINDEX_GENERATOR", strategy="native")	
	private int reviewIndex;
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=de.hhn.pmt.thames.POI.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="`POIName`", referencedColumnName="`Name`", nullable=false) }, foreignKey=@ForeignKey(name="rates"))	
	private de.hhn.pmt.thames.POI about;
	
	@Column(name="`POIName`", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="DE_HHN_PMT_THAMES_REVIEW_ABOUTID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_PMT_THAMES_REVIEW_ABOUTID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="about"))	
	private String aboutId;
	
	private void setAboutId(String value) {
		this.aboutId = value;
	}
	
	public String getAboutId() {
		return aboutId;
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setRating(float value) {
		this.rating = value;
	}
	
	public float getRating() {
		return rating;
	}
	
	public void setReviewIndex(int value) {
		this.reviewIndex = value;
	}
	
	public int getReviewIndex() {
		return reviewIndex;
	}
	
	public void setAbout(de.hhn.pmt.thames.POI value) {
		if (about != null) {
			about.rating.remove(this);
		}
		if (value != null) {
			value.rating.add(this);
		}
	}
	
	public de.hhn.pmt.thames.POI getAbout() {
		return about;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_About(de.hhn.pmt.thames.POI value) {
		this.about = value;
	}
	
	private de.hhn.pmt.thames.POI getORM_About() {
		return about;
	}
	
	public void setAuthor(de.hhn.pmt.thames.Tourist value) {
		if (author != null) {
			author.ratings.remove(this);
		}
		if (value != null) {
			value.ratings.add(this);
		}
	}
	
	public de.hhn.pmt.thames.Tourist getAuthor() {
		return author;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Author(de.hhn.pmt.thames.Tourist value) {
		this.author = value;
	}
	
	private de.hhn.pmt.thames.Tourist getORM_Author() {
		return author;
	}
	
	public String toString() {
		return String.valueOf(((getAuthor() == null) ? "" : String.valueOf(getAuthor().getORMID())) + " " + getReviewIndex() + " " + ((getAbout() == null) ? "" : String.valueOf(getAbout().getORMID())));
	}
	
}
