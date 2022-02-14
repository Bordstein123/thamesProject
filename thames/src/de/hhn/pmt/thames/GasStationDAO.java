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

public class GasStationDAO {
	public static GasStation loadGasStationByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadGasStationByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation getGasStationByORMID(String name) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getGasStationByORMID(session, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadGasStationByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation getGasStationByORMID(String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getGasStationByORMID(session, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (GasStation) session.load(de.hhn.pmt.thames.GasStation.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation getGasStationByORMID(PersistentSession session, String name) throws PersistentException {
		try {
			return (GasStation) session.get(de.hhn.pmt.thames.GasStation.class, name);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (GasStation) session.load(de.hhn.pmt.thames.GasStation.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation getGasStationByORMID(PersistentSession session, String name, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (GasStation) session.get(de.hhn.pmt.thames.GasStation.class, name, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGasStation(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryGasStation(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGasStation(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryGasStation(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation[] listGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation[] listGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGasStation(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.GasStation as GasStation");
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
	
	public static List queryGasStation(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.GasStation as GasStation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("GasStation", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation[] listGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGasStation(session, condition, orderBy);
			return (GasStation[]) list.toArray(new GasStation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation[] listGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGasStation(session, condition, orderBy, lockMode);
			return (GasStation[]) list.toArray(new GasStation[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation loadGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		GasStation[] gasStations = listGasStationByQuery(session, condition, orderBy);
		if (gasStations != null && gasStations.length > 0)
			return gasStations[0];
		else
			return null;
	}
	
	public static GasStation loadGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		GasStation[] gasStations = listGasStationByQuery(session, condition, orderBy, lockMode);
		if (gasStations != null && gasStations.length > 0)
			return gasStations[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGasStationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateGasStationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGasStationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateGasStationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGasStationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.GasStation as GasStation");
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
	
	public static java.util.Iterator iterateGasStationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.GasStation as GasStation");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("GasStation", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static GasStation createGasStation() {
		return new de.hhn.pmt.thames.GasStation();
	}
	
	public static boolean save(de.hhn.pmt.thames.GasStation gasStation) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(gasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.GasStation gasStation) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(gasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.GasStation gasStation)throws PersistentException {
		try {
			if (gasStation.getOwner() != null) {
				gasStation.getOwner().property.remove(gasStation);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = gasStation.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(gasStation);
			}
			de.hhn.pmt.thames.Review[] lRatings = gasStation.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			return delete(gasStation);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.GasStation gasStation, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (gasStation.getOwner() != null) {
				gasStation.getOwner().property.remove(gasStation);
			}
			
			de.hhn.pmt.thames.Tour[] lStations = gasStation.station.toArray();
			for(int i = 0; i < lStations.length; i++) {
				lStations[i].tour.remove(gasStation);
			}
			de.hhn.pmt.thames.Review[] lRatings = gasStation.rating.toArray();
			for(int i = 0; i < lRatings.length; i++) {
				lRatings[i].setAbout(null);
			}
			try {
				session.delete(gasStation);
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
	
	public static boolean refresh(de.hhn.pmt.thames.GasStation gasStation) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(gasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.GasStation gasStation) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(gasStation);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
