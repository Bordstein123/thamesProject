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

public class HouseBoatDAO {
	public static HouseBoat loadHouseBoatByORMID(String win) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadHouseBoatByORMID(session, win);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat getHouseBoatByORMID(String win) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getHouseBoatByORMID(session, win);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByORMID(String win, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadHouseBoatByORMID(session, win, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat getHouseBoatByORMID(String win, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getHouseBoatByORMID(session, win, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByORMID(PersistentSession session, String win) throws PersistentException {
		try {
			return (HouseBoat) session.load(de.hhn.pmt.thames.HouseBoat.class, win);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat getHouseBoatByORMID(PersistentSession session, String win) throws PersistentException {
		try {
			return (HouseBoat) session.get(de.hhn.pmt.thames.HouseBoat.class, win);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByORMID(PersistentSession session, String win, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HouseBoat) session.load(de.hhn.pmt.thames.HouseBoat.class, win, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat getHouseBoatByORMID(PersistentSession session, String win, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HouseBoat) session.get(de.hhn.pmt.thames.HouseBoat.class, win, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouseBoat(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryHouseBoat(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouseBoat(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryHouseBoat(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat[] listHouseBoatByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listHouseBoatByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat[] listHouseBoatByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listHouseBoatByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHouseBoat(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.HouseBoat as HouseBoat");
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
	
	public static List queryHouseBoat(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.HouseBoat as HouseBoat");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HouseBoat", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat[] listHouseBoatByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHouseBoat(session, condition, orderBy);
			return (HouseBoat[]) list.toArray(new HouseBoat[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat[] listHouseBoatByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHouseBoat(session, condition, orderBy, lockMode);
			return (HouseBoat[]) list.toArray(new HouseBoat[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadHouseBoatByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadHouseBoatByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat loadHouseBoatByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		HouseBoat[] houseBoats = listHouseBoatByQuery(session, condition, orderBy);
		if (houseBoats != null && houseBoats.length > 0)
			return houseBoats[0];
		else
			return null;
	}
	
	public static HouseBoat loadHouseBoatByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		HouseBoat[] houseBoats = listHouseBoatByQuery(session, condition, orderBy, lockMode);
		if (houseBoats != null && houseBoats.length > 0)
			return houseBoats[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHouseBoatByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateHouseBoatByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHouseBoatByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateHouseBoatByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHouseBoatByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.HouseBoat as HouseBoat");
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
	
	public static java.util.Iterator iterateHouseBoatByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.HouseBoat as HouseBoat");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("HouseBoat", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static HouseBoat createHouseBoat() {
		return new de.hhn.pmt.thames.HouseBoat();
	}
	
	public static boolean save(de.hhn.pmt.thames.HouseBoat houseBoat) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(houseBoat);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.HouseBoat houseBoat) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(houseBoat);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.HouseBoat houseBoat)throws PersistentException {
		try {
			if (houseBoat.getProvider() != null) {
				houseBoat.getProvider().property.remove(houseBoat);
			}
			
			de.hhn.pmt.thames.Booking[] lBookingss = houseBoat.bookings.toArray();
			for(int i = 0; i < lBookingss.length; i++) {
				lBookingss[i].setHouseBoat(null);
			}
			return delete(houseBoat);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.HouseBoat houseBoat, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (houseBoat.getProvider() != null) {
				houseBoat.getProvider().property.remove(houseBoat);
			}
			
			de.hhn.pmt.thames.Booking[] lBookingss = houseBoat.bookings.toArray();
			for(int i = 0; i < lBookingss.length; i++) {
				lBookingss[i].setHouseBoat(null);
			}
			try {
				session.delete(houseBoat);
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
	
	public static boolean refresh(de.hhn.pmt.thames.HouseBoat houseBoat) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(houseBoat);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.HouseBoat houseBoat) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(houseBoat);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
