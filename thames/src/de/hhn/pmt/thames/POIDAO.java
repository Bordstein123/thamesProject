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

public class POIDAO {
	public static POI loadPOIByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadPOIByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI getPOIByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getPOIByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadPOIByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI getPOIByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getPOIByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (POI) session.load(de.hhn.pmt.thames.POI.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI getPOIByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (POI) session.get(de.hhn.pmt.thames.POI.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (POI) session.load(de.hhn.pmt.thames.POI.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI getPOIByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (POI) session.get(de.hhn.pmt.thames.POI.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPOI(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryPOI(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPOI(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryPOI(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI[] listPOIByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listPOIByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI[] listPOIByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listPOIByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPOI(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.POI as POI");
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
	
	public static List queryPOI(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.POI as POI");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("POI", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI[] listPOIByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPOI(session, condition, orderBy);
			return (POI[]) list.toArray(new POI[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI[] listPOIByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPOI(session, condition, orderBy, lockMode);
			return (POI[]) list.toArray(new POI[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadPOIByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadPOIByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static POI loadPOIByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		POI[] pOIs = listPOIByQuery(session, condition, orderBy);
		if (pOIs != null && pOIs.length > 0)
			return pOIs[0];
		else
			return null;
	}
	
	public static POI loadPOIByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		POI[] pOIs = listPOIByQuery(session, condition, orderBy, lockMode);
		if (pOIs != null && pOIs.length > 0)
			return pOIs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePOIByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iteratePOIByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePOIByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iteratePOIByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePOIByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.POI as POI");
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
	
	public static java.util.Iterator iteratePOIByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.POI as POI");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("POI", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(de.hhn.pmt.thames.POI pOI) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(pOI);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.POI pOI) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(pOI);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.POI pOI)throws PersistentException {
		if (pOI instanceof de.hhn.pmt.thames.Pier) {
			return de.hhn.pmt.thames.PierDAO.deleteAndDissociate((de.hhn.pmt.thames.Pier) pOI);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.Restaurant) {
			return de.hhn.pmt.thames.RestaurantDAO.deleteAndDissociate((de.hhn.pmt.thames.Restaurant) pOI);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.GasStation) {
			return de.hhn.pmt.thames.GasStationDAO.deleteAndDissociate((de.hhn.pmt.thames.GasStation) pOI);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.Sights) {
			return de.hhn.pmt.thames.SightsDAO.deleteAndDissociate((de.hhn.pmt.thames.Sights) pOI);
		}
		
		try {
			if (pOI.getOwner() != null) {
				pOI.getOwner().property.remove(pOI);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = pOI.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(pOI);
			}
			de.hhn.pmt.thames.Review[] lRatings = pOI.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			return delete(pOI);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.POI pOI, org.orm.PersistentSession session)throws PersistentException {
		if (pOI instanceof de.hhn.pmt.thames.Pier) {
			return de.hhn.pmt.thames.PierDAO.deleteAndDissociate((de.hhn.pmt.thames.Pier) pOI, session);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.Restaurant) {
			return de.hhn.pmt.thames.RestaurantDAO.deleteAndDissociate((de.hhn.pmt.thames.Restaurant) pOI, session);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.GasStation) {
			return de.hhn.pmt.thames.GasStationDAO.deleteAndDissociate((de.hhn.pmt.thames.GasStation) pOI, session);
		}
		
		if (pOI instanceof de.hhn.pmt.thames.Sights) {
			return de.hhn.pmt.thames.SightsDAO.deleteAndDissociate((de.hhn.pmt.thames.Sights) pOI, session);
		}
		
		try {
			if (pOI.getOwner() != null) {
				pOI.getOwner().property.remove(pOI);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = pOI.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(pOI);
			}
			de.hhn.pmt.thames.Review[] lRatings = pOI.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			try {
				session.delete(pOI);
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
	
	public static boolean refresh(de.hhn.pmt.thames.POI pOI) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(pOI);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.POI pOI) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(pOI);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
