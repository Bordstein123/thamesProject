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

public class thamesUserDAO {
	public static thamesUser loadThamesUserByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadThamesUserByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser getThamesUserByORMID(String email) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getThamesUserByORMID(session, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadThamesUserByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser getThamesUserByORMID(String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getThamesUserByORMID(session, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (thamesUser) session.load(de.hhn.pmt.thames.thamesUser.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser getThamesUserByORMID(PersistentSession session, String email) throws PersistentException {
		try {
			return (thamesUser) session.get(de.hhn.pmt.thames.thamesUser.class, email);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (thamesUser) session.load(de.hhn.pmt.thames.thamesUser.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser getThamesUserByORMID(PersistentSession session, String email, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (thamesUser) session.get(de.hhn.pmt.thames.thamesUser.class, email, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryThamesUser(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryThamesUser(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryThamesUser(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryThamesUser(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser[] listThamesUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listThamesUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser[] listThamesUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listThamesUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryThamesUser(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.thamesUser as thamesUser");
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
	
	public static List queryThamesUser(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.thamesUser as thamesUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("thamesUser", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser[] listThamesUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryThamesUser(session, condition, orderBy);
			return (thamesUser[]) list.toArray(new thamesUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser[] listThamesUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryThamesUser(session, condition, orderBy, lockMode);
			return (thamesUser[]) list.toArray(new thamesUser[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadThamesUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadThamesUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static thamesUser loadThamesUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		thamesUser[] thamesUsers = listThamesUserByQuery(session, condition, orderBy);
		if (thamesUsers != null && thamesUsers.length > 0)
			return thamesUsers[0];
		else
			return null;
	}
	
	public static thamesUser loadThamesUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		thamesUser[] thamesUsers = listThamesUserByQuery(session, condition, orderBy, lockMode);
		if (thamesUsers != null && thamesUsers.length > 0)
			return thamesUsers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateThamesUserByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateThamesUserByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateThamesUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateThamesUserByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateThamesUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.thamesUser as thamesUser");
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
	
	public static java.util.Iterator iterateThamesUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.thamesUser as thamesUser");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("thamesUser", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(de.hhn.pmt.thames.thamesUser lthamesUser) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(lthamesUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.thamesUser lthamesUser) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(lthamesUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.pmt.thames.thamesUser lthamesUser) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(lthamesUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.thamesUser lthamesUser) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(lthamesUser);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
