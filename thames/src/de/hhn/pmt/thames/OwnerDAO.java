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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class OwnerDAO {
	public static Owner loadOwnerByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadOwnerByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner getOwnerByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getOwnerByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadOwnerByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner getOwnerByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getOwnerByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Owner) session.load(de.hhn.pmt.thames.Owner.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner getOwnerByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (Owner) session.get(de.hhn.pmt.thames.Owner.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Owner) session.load(de.hhn.pmt.thames.Owner.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner getOwnerByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Owner) session.get(de.hhn.pmt.thames.Owner.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOwner(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryOwner(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOwner(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryOwner(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner[] listOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner[] listOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOwner(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Owner as Owner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOwner(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Owner as Owner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Owner", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner[] listOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOwner(session, condition, orderBy);
			return (Owner[]) list.toArray(new Owner[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner[] listOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOwner(session, condition, orderBy, lockMode);
			return (Owner[]) list.toArray(new Owner[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner loadOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Owner[] owners = listOwnerByQuery(session, condition, orderBy);
		if (owners != null && owners.length > 0)
			return owners[0];
		else
			return null;
	}
	
	public static Owner loadOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Owner[] owners = listOwnerByQuery(session, condition, orderBy, lockMode);
		if (owners != null && owners.length > 0)
			return owners[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOwnerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateOwnerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOwnerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateOwnerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOwnerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Owner as Owner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOwnerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Owner as Owner");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Owner", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Owner createOwner() {
		return new de.hhn.pmt.thames.Owner();
	}
	
	public static boolean save(de.hhn.pmt.thames.Owner owner) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(owner);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.Owner owner) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(owner);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Owner owner)throws PersistentException {
		try {
			de.hhn.pmt.thames.POI[] lPropertys = owner.property.toArray();
			for(int i = 0; i < lPropertys.length; i++) {
				lPropertys[i].setOwner(null);
			}
			return delete(owner);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Owner owner, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.pmt.thames.POI[] lPropertys = owner.property.toArray();
			for(int i = 0; i < lPropertys.length; i++) {
				lPropertys[i].setOwner(null);
			}
			try {
				session.delete(owner);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.pmt.thames.Owner owner) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(owner);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.Owner owner) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(owner);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
