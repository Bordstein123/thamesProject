/**
 * Licensee: Carolin Niederhofer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateThamesNewData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.pmt.thames.ThamesNewPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.pmt.thames.Tourist ldehhnpmtthamesTourist = de.hhn.pmt.thames.TouristDAO.loadTouristByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.TouristDAO.save(ldehhnpmtthamesTourist);
			de.hhn.pmt.thames.Lessor ldehhnpmtthamesLessor = de.hhn.pmt.thames.LessorDAO.loadLessorByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.LessorDAO.save(ldehhnpmtthamesLessor);
			de.hhn.pmt.thames.HouseBoat ldehhnpmtthamesHouseBoat = de.hhn.pmt.thames.HouseBoatDAO.loadHouseBoatByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.HouseBoatDAO.save(ldehhnpmtthamesHouseBoat);
			de.hhn.pmt.thames.Owner ldehhnpmtthamesOwner = de.hhn.pmt.thames.OwnerDAO.loadOwnerByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.OwnerDAO.save(ldehhnpmtthamesOwner);
			de.hhn.pmt.thames.Pier ldehhnpmtthamesPier = de.hhn.pmt.thames.PierDAO.loadPierByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.PierDAO.save(ldehhnpmtthamesPier);
			de.hhn.pmt.thames.Restaurant ldehhnpmtthamesRestaurant = de.hhn.pmt.thames.RestaurantDAO.loadRestaurantByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.RestaurantDAO.save(ldehhnpmtthamesRestaurant);
			de.hhn.pmt.thames.GasStation ldehhnpmtthamesGasStation = de.hhn.pmt.thames.GasStationDAO.loadGasStationByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.GasStationDAO.save(ldehhnpmtthamesGasStation);
			de.hhn.pmt.thames.Sights ldehhnpmtthamesSights = de.hhn.pmt.thames.SightsDAO.loadSightsByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.SightsDAO.save(ldehhnpmtthamesSights);
			de.hhn.pmt.thames.Tour ldehhnpmtthamesTour = de.hhn.pmt.thames.TourDAO.loadTourByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.TourDAO.save(ldehhnpmtthamesTour);
			de.hhn.pmt.thames.Berth ldehhnpmtthamesBerth = de.hhn.pmt.thames.BerthDAO.loadBerthByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.BerthDAO.save(ldehhnpmtthamesBerth);
			de.hhn.pmt.thames.Review ldehhnpmtthamesReview = de.hhn.pmt.thames.ReviewDAO.loadReviewByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.ReviewDAO.save(ldehhnpmtthamesReview);
			de.hhn.pmt.thames.Booking ldehhnpmtthamesBooking = de.hhn.pmt.thames.BookingDAO.loadBookingByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.BookingDAO.save(ldehhnpmtthamesBooking);
			de.hhn.pmt.thames.Favourites ldehhnpmtthamesFavourites = de.hhn.pmt.thames.FavouritesDAO.loadFavouritesByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.pmt.thames.FavouritesDAO.save(ldehhnpmtthamesFavourites);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateThamesNewData retrieveAndUpdateThamesNewData = new RetrieveAndUpdateThamesNewData();
			try {
				retrieveAndUpdateThamesNewData.retrieveAndUpdateTestData();
			}
			finally {
				de.hhn.pmt.thames.ThamesNewPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
