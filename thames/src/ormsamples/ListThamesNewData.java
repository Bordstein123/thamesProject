/**
 * Licensee: Carolin Niederhofer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListThamesNewData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Tourist...");
		de.hhn.pmt.thames.Tourist[] dehhnpmtthamesTourists = de.hhn.pmt.thames.TouristDAO.listTouristByQuery(null, null);
		int length = Math.min(dehhnpmtthamesTourists.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesTourists[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lessor...");
		de.hhn.pmt.thames.Lessor[] dehhnpmtthamesLessors = de.hhn.pmt.thames.LessorDAO.listLessorByQuery(null, null);
		length = Math.min(dehhnpmtthamesLessors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesLessors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing HouseBoat...");
		de.hhn.pmt.thames.HouseBoat[] dehhnpmtthamesHouseBoats = de.hhn.pmt.thames.HouseBoatDAO.listHouseBoatByQuery(null, null);
		length = Math.min(dehhnpmtthamesHouseBoats.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesHouseBoats[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Owner...");
		de.hhn.pmt.thames.Owner[] dehhnpmtthamesOwners = de.hhn.pmt.thames.OwnerDAO.listOwnerByQuery(null, null);
		length = Math.min(dehhnpmtthamesOwners.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesOwners[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Pier...");
		de.hhn.pmt.thames.Pier[] dehhnpmtthamesPiers = de.hhn.pmt.thames.PierDAO.listPierByQuery(null, null);
		length = Math.min(dehhnpmtthamesPiers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesPiers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Restaurant...");
		de.hhn.pmt.thames.Restaurant[] dehhnpmtthamesRestaurants = de.hhn.pmt.thames.RestaurantDAO.listRestaurantByQuery(null, null);
		length = Math.min(dehhnpmtthamesRestaurants.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesRestaurants[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing GasStation...");
		de.hhn.pmt.thames.GasStation[] dehhnpmtthamesGasStations = de.hhn.pmt.thames.GasStationDAO.listGasStationByQuery(null, null);
		length = Math.min(dehhnpmtthamesGasStations.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesGasStations[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Sights...");
		de.hhn.pmt.thames.Sights[] dehhnpmtthamesSightses = de.hhn.pmt.thames.SightsDAO.listSightsByQuery(null, null);
		length = Math.min(dehhnpmtthamesSightses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesSightses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tour...");
		de.hhn.pmt.thames.Tour[] dehhnpmtthamesTours = de.hhn.pmt.thames.TourDAO.listTourByQuery(null, null);
		length = Math.min(dehhnpmtthamesTours.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesTours[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Berth...");
		de.hhn.pmt.thames.Berth[] dehhnpmtthamesBerths = de.hhn.pmt.thames.BerthDAO.listBerthByQuery(null, null);
		length = Math.min(dehhnpmtthamesBerths.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesBerths[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Review...");
		de.hhn.pmt.thames.Review[] dehhnpmtthamesReviews = de.hhn.pmt.thames.ReviewDAO.listReviewByQuery(null, null);
		length = Math.min(dehhnpmtthamesReviews.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesReviews[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Booking...");
		de.hhn.pmt.thames.Booking[] dehhnpmtthamesBookings = de.hhn.pmt.thames.BookingDAO.listBookingByQuery(null, null);
		length = Math.min(dehhnpmtthamesBookings.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesBookings[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Favourites...");
		de.hhn.pmt.thames.Favourites[] dehhnpmtthamesFavouriteses = de.hhn.pmt.thames.FavouritesDAO.listFavouritesByQuery(null, null);
		length = Math.min(dehhnpmtthamesFavouriteses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnpmtthamesFavouriteses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListThamesNewData listThamesNewData = new ListThamesNewData();
			try {
				listThamesNewData.listTestData();
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
