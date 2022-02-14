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

public class SightsDAO {
	public static Sights loadSightsByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadSightsByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights getSightsByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getSightsByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadSightsByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights getSightsByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getSightsByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Sights) session.load(de.hhn.pmt.thames.Sights.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights getSightsByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (Sights) session.get(de.hhn.pmt.thames.Sights.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sights) session.load(de.hhn.pmt.thames.Sights.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights getSightsByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Sights) session.get(de.hhn.pmt.thames.Sights.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySights(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return querySights(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySights(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return querySights(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights[] listSightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listSightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights[] listSightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listSightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySights(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Sights as Sights");
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
	
	public static List querySights(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Sights as Sights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sights", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights[] listSightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySights(session, condition, orderBy);
			return (Sights[]) list.toArray(new Sights[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights[] listSightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySights(session, condition, orderBy, lockMode);
			return (Sights[]) list.toArray(new Sights[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadSightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadSightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights loadSightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Sights[] sightses = listSightsByQuery(session, condition, orderBy);
		if (sightses != null && sightses.length > 0)
			return sightses[0];
		else
			return null;
	}
	
	public static Sights loadSightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Sights[] sightses = listSightsByQuery(session, condition, orderBy, lockMode);
		if (sightses != null && sightses.length > 0)
			return sightses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSightsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateSightsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSightsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateSightsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSightsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Sights as Sights");
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
	
	public static java.util.Iterator iterateSightsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Sights as Sights");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Sights", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Sights createSights() {
		return new de.hhn.pmt.thames.Sights();
	}
	
	public static boolean save(de.hhn.pmt.thames.Sights sights) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(sights);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.Sights sights) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(sights);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Sights sights)throws PersistentException {
		try {
			if (sights.getOwner() != null) {
				sights.getOwner().property.remove(sights);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = sights.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(sights);
			}
			de.hhn.pmt.thames.Review[] lRatings = sights.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			return delete(sights);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Sights sights, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (sights.getOwner() != null) {
				sights.getOwner().property.remove(sights);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = sights.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(sights);
			}
			de.hhn.pmt.thames.Review[] lRatings = sights.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			try {
				session.delete(sights);
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
	
	public static boolean refresh(de.hhn.pmt.thames.Sights sights) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(sights);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.Sights sights) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(sights);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
