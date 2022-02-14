/**
 * Licensee: Carolin Niederhofer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteThamesNewData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.pmt.thames.ThamesNewPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.pmt.thames.Tourist ldehhnpmtthamesTourist = de.hhn.pmt.thames.TouristDAO.loadTouristByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.TouristDAO.delete(ldehhnpmtthamesTourist);
			de.hhn.pmt.thames.Lessor ldehhnpmtthamesLessor = de.hhn.pmt.thames.LessorDAO.loadLessorByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.LessorDAO.delete(ldehhnpmtthamesLessor);
			de.hhn.pmt.thames.HouseBoat ldehhnpmtthamesHouseBoat = de.hhn.pmt.thames.HouseBoatDAO.loadHouseBoatByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.HouseBoatDAO.delete(ldehhnpmtthamesHouseBoat);
			de.hhn.pmt.thames.Owner ldehhnpmtthamesOwner = de.hhn.pmt.thames.OwnerDAO.loadOwnerByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.OwnerDAO.delete(ldehhnpmtthamesOwner);
			de.hhn.pmt.thames.Pier ldehhnpmtthamesPier = de.hhn.pmt.thames.PierDAO.loadPierByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.PierDAO.delete(ldehhnpmtthamesPier);
			de.hhn.pmt.thames.Restaurant ldehhnpmtthamesRestaurant = de.hhn.pmt.thames.RestaurantDAO.loadRestaurantByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.RestaurantDAO.delete(ldehhnpmtthamesRestaurant);
			de.hhn.pmt.thames.GasStation ldehhnpmtthamesGasStation = de.hhn.pmt.thames.GasStationDAO.loadGasStationByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.GasStationDAO.delete(ldehhnpmtthamesGasStation);
			de.hhn.pmt.thames.Sights ldehhnpmtthamesSights = de.hhn.pmt.thames.SightsDAO.loadSightsByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.SightsDAO.delete(ldehhnpmtthamesSights);
			de.hhn.pmt.thames.Tour ldehhnpmtthamesTour = de.hhn.pmt.thames.TourDAO.loadTourByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.TourDAO.delete(ldehhnpmtthamesTour);
			de.hhn.pmt.thames.Berth ldehhnpmtthamesBerth = de.hhn.pmt.thames.BerthDAO.loadBerthByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.BerthDAO.delete(ldehhnpmtthamesBerth);
			de.hhn.pmt.thames.Review ldehhnpmtthamesReview = de.hhn.pmt.thames.ReviewDAO.loadReviewByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.ReviewDAO.delete(ldehhnpmtthamesReview);
			de.hhn.pmt.thames.Booking ldehhnpmtthamesBooking = de.hhn.pmt.thames.BookingDAO.loadBookingByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.BookingDAO.delete(ldehhnpmtthamesBooking);
			de.hhn.pmt.thames.Favourites ldehhnpmtthamesFavourites = de.hhn.pmt.thames.FavouritesDAO.loadFavouritesByQuery(null, null);
			// Delete the persistent object
			de.hhn.pmt.thames.FavouritesDAO.delete(ldehhnpmtthamesFavourites);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteThamesNewData deleteThamesNewData = new DeleteThamesNewData();
			try {
				deleteThamesNewData.deleteTestData();
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
