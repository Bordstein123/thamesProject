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

public class ReviewDAO {
	public static Review loadReviewByORMID(de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadReviewByORMID(session, author, reviewIndex, about);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review getReviewByORMID(de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getReviewByORMID(session, author, reviewIndex, about);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByORMID(de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadReviewByORMID(session, author, reviewIndex, about, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review getReviewByORMID(de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return getReviewByORMID(session, author, reviewIndex, about, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByORMID(PersistentSession session, de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about) throws PersistentException {
		try {
			ReviewPK review = new de.hhn.pmt.thames.ReviewPK();
			review.setAuthor(author);
			review.setReviewIndex(reviewIndex);
			review.setAbout(about);
			
			return (Review) session.load(de.hhn.pmt.thames.Review.class, review);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review getReviewByORMID(PersistentSession session, de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about) throws PersistentException {
		try {
			ReviewPK review = new de.hhn.pmt.thames.ReviewPK();
			review.setAuthor(author);
			review.setReviewIndex(reviewIndex);
			review.setAbout(about);
			
			return (Review) session.get(de.hhn.pmt.thames.Review.class, review);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByORMID(PersistentSession session, de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			ReviewPK review = new de.hhn.pmt.thames.ReviewPK();
			review.setAuthor(author);
			review.setReviewIndex(reviewIndex);
			review.setAbout(about);
			
			return (Review) session.load(de.hhn.pmt.thames.Review.class, review, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review getReviewByORMID(PersistentSession session, de.hhn.pmt.thames.Tourist author, int reviewIndex, de.hhn.pmt.thames.POI about, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			ReviewPK review = new de.hhn.pmt.thames.ReviewPK();
			review.setAuthor(author);
			review.setReviewIndex(reviewIndex);
			review.setAbout(about);
			
			return (Review) session.get(de.hhn.pmt.thames.Review.class, review, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReview(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryReview(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReview(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return queryReview(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review[] listReviewByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listReviewByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review[] listReviewByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return listReviewByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReview(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Review as Review");
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
	
	public static List queryReview(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Review as Review");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Review", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review[] listReviewByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReview(session, condition, orderBy);
			return (Review[]) list.toArray(new Review[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review[] listReviewByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReview(session, condition, orderBy, lockMode);
			return (Review[]) list.toArray(new Review[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadReviewByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return loadReviewByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review loadReviewByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Review[] reviews = listReviewByQuery(session, condition, orderBy);
		if (reviews != null && reviews.length > 0)
			return reviews[0];
		else
			return null;
	}
	
	public static Review loadReviewByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Review[] reviews = listReviewByQuery(session, condition, orderBy, lockMode);
		if (reviews != null && reviews.length > 0)
			return reviews[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReviewByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateReviewByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReviewByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ThamesNewPersistentManager.instance().getSession();
			return iterateReviewByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReviewByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Review as Review");
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
	
	public static java.util.Iterator iterateReviewByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.pmt.thames.Review as Review");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Review", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Review createReview() {
		return new de.hhn.pmt.thames.Review();
	}
	
	public static boolean save(de.hhn.pmt.thames.Review review) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().saveObject(review);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.pmt.thames.Review review) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().deleteObject(review);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Review review)throws PersistentException {
		try {
			de.hhn.pmt.thames.Tourist author = review.getAuthor();
			if (review.getAuthor() != null) {
				review.getAuthor().ratings.remove(review);
			}
			review.setORM_Author(author);
			
			de.hhn.pmt.thames.POI about = review.getAbout();
			if (review.getAbout() != null) {
				review.getAbout().rating.remove(review);
			}
			review.setORM_About(about);
			
			return delete(review);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.pmt.thames.Review review, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.pmt.thames.Tourist author = review.getAuthor();
			if (review.getAuthor() != null) {
				review.getAuthor().ratings.remove(review);
			}
			review.setORM_Author(author);
			
			de.hhn.pmt.thames.POI about = review.getAbout();
			if (review.getAbout() != null) {
				review.getAbout().rating.remove(review);
			}
			review.setORM_About(about);
			
			try {
				session.delete(review);
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
	
	public static boolean refresh(de.hhn.pmt.thames.Review review) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().refresh(review);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.pmt.thames.Review review) throws PersistentException {
		try {
			ThamesNewPersistentManager.instance().getSession().evict(review);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
