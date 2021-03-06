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
@Table(name="`thamesUser`")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="`Discriminator`", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("thamesUser")
public abstract class thamesUser implements Serializable {
	public thamesUser() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof thamesUser))
			return false;
		thamesUser thamesuser = (thamesUser)aObj;
		if ((getEmail() != null && !getEmail().equals(thamesuser.getEmail())) || (getEmail() == null && thamesuser.getEmail() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getEmail() == null ? 0 : getEmail().hashCode());
		return hashcode;
	}
	
	@Column(name="`Name`", nullable=true, length=255)	
	private String name;
	
	@Column(name="`Email`", nullable=false, length=255)	
	@Id	
	private String email;
	
	@Column(name="`UserName`", nullable=true, unique=true, length=255)	
	private String userName;
	
	@Column(name="`Password`", nullable=true, length=255)	
	private String password;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getORMID() {
		return getEmail();
	}
	
	public void setUserName(String value) {
		this.userName = value;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String toString() {
		return String.valueOf(getEmail());
	}
	
}
