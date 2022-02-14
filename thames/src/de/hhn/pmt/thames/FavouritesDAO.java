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

public class FavouritesDAO {
	public static Favourites loadFavouritesByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadFavouritesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites getFavouritesByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getFavouritesByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadFavouritesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites getFavouritesByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getFavouritesByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Favourites) session.load(de.hhn.pmt.thames.Favourites.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites getFavouritesByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Favourites) session.get(de.hhn.pmt.thames.Favourites.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Favourites) session.load(de.hhn.pmt.thames.Favourites.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites getFavouritesByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Favourites) session.get(de.hhn.pmt.thames.Favourites.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFavourites(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryFavourites(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFavourites(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryFavourites(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites[] listFavouritesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listFavouritesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites[] listFavouritesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listFavouritesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFavourites(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Favourites as Favourites");
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
	
	public static List queryFavourites(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Favourites as Favourites");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Favourites", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites[] listFavouritesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFavourites(session, condition, orderBy);
			return (Favourites[]) list.toArray(new Favourites[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites[] listFavouritesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFavourites(session, condition, orderBy, lockMode);
			return (Favourites[]) list.toArray(new Favourites[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadFavouritesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadFavouritesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites loadFavouritesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Favourites[] favouriteses = listFavouritesByQuery(session, condition, orderBy);
		if (favouriteses != null && favouriteses.length > 0)
			return favouriteses[0];
		else
			return null;
	}
	
	public static Favourites loadFavouritesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Favourites[] favouriteses = listFavouritesByQuery(session, condition, orderBy, lockMode);
		if (favouriteses != null && favouriteses.length > 0)
			return favouriteses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFavouritesByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateFavouritesByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFavouritesByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateFavouritesByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFavouritesByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Favourites as Favourites");
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
	
	public static java.util.Iterator iterateFavouritesByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Favourites as Favourites");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Favourites", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Favourites createFavourites() {
		return new de.hhn.pmt.thames.Favourites();
	}
	
	public static boolean save(de.hhn.pmt.thames.Favourites favourites) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(favourites);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.Favourites favourites) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(favourites);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Favourites favourites)throws PersistentException {
		try {
			if (favourites.getTour() != null) {
				favourites.getTour().setFavourites(null);
			}
			
			if (favourites.getTourist() != null) {
				favourites.getTourist().favouritess.remove(favourites);
			}
			
			return delete(favourites);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Favourites favourites, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (favourites.getTour() != null) {
				favourites.getTour().setFavourites(null);
			}
			
			if (favourites.getTourist() != null) {
				favourites.getTourist().favouritess.remove(favourites);
			}
			
			try {
				session.delete(favourites);
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
	
	public static boolean refresh(de.hhn.pmt.thames.Favourites favourites) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(favourites);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.Favourites favourites) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(favourites);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
