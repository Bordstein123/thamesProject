/**
 * Licensee: Carolin Niederhofer(Hochschule Heilbronn)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateThamesNewData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = de.hhn.pmt.thames.ThamesNewPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Maria Müller', 'mmueller@gmail.com', 'mariechen007', 'lkfajdgadkf', 'tourist', null)");
					statement.executeUpdate("INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Max Mustermann', 'mustermann@gmx.de', 'mustermax123', 'musterpasswort', 'owner', null)");
					statement.executeUpdate("INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Timm Thaler', 'thalertim@t-online.de', 'boottim', '1234', 'organiser', null)");
					statement.executeUpdate("INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Maria Mustermann', 'mmustermann@gmx.de', 'mariamuster1', 'maria55', 'lessor', null)");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Fischstube Mustermann ', 51.407180, -0.402563, '2020-12-03 7:00', '2020-12-03 19.30', null, null, 'www.mustermann-fischstube.com', true, true, 1, null, 'Restaurant', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Anlegeplatz Themse', 51.200040, -0.389025, '2020-12-03 7:00', '2020-12-03 22.00', null, null, 'www.anlegestellde.uk', null, null, null, null, 'Pier', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('London Eye', 51.50331794844686, -0.11951591797837126, '2020-12-03 11:00', '2020-12-03 18:00', null, null, 'https://www.londoneye.com/plan-your-visit/before-you-visit/opening-hours/', null, null, null, 27, 'Sights', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Tower of London', 51.50816580095366, -0.07606731874712422, '2020-12-03 10:00', '2020-12-03 16:30', 'Monday', null, 'https://www.hrp.org.uk/tower-of-london/', null, null, null, 29.90, 'Sights', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Westminster Abbey', 51.499424958050305, -0.1269418991060573, '2020-12-03 9:30', '2020-12-03 15:30', null, null, 'https://www.westminster-abbey.org/', null, null, null, 24, 'Sights', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Pizza Express', 51.508193885903744, -0.09586263995702127, '2020-12-03 11:30', '2020-12-03 23:00', null, null, 'https://www.pizzaexpress.com/bankside', true, false, 2, null, 'Restaurant', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('The Narrow', 51.50980257182585, -0.03776796774874749, '2020-12-03 12:00', '2020-12-03 23:30', null, null, 'https://www.gordonramsayrestaurants.com/the-narrow/', true, false, 2, null, 'Restaurant', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Nando´s Greenwich - Cutty Sark', 51.48361196000324, -0.009471067059692076, '2020-12-03 11:30', '2020-12-03 22:00', null, null, 'https://www.nandos.co.uk/restaurants/greenwich-cutty-sark', true, false, 3, null, 'Restaurant', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Palm Riverside', 51.46256144236221, -0.19974922285710206, '2020-12-03 11:00', '2020-12-03 0:00', null, null, 'https://palmriverside.co.uk/', false, false, 3, null, 'Restaurant', 'mustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Beer Lover Tour', 128, 22, 3, 7)");
					statement.executeUpdate("INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Scenic Landscape Tour', 75, 17, 4, 3)");
					statement.executeUpdate("INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Majestic Tour', 114, 20, 2, 6)");
					statement.executeUpdate("INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Family Adventure Tour', 67, 14, 0, 2)");
					statement.executeUpdate("INSERT INTO `Berth`(`IsEmpty`, `Price`, `SizeX`, `SizeY`, `BerthId`, `POIName`) VALUES (true, 22.50, 4.45, 6.5, 0, 'Anlegeplatz Themse')");
					statement.executeUpdate("INSERT INTO `HouseBoat`(`Model`, `Name`, `DimensionX`, `DimensionY`, `PricePerDay`, `Win`, `thamesUserEmail`) VALUES ('Olympia Superkreuzer', 'Maria', 14.95, 4.85, 220, '1', 'mmustermann@gmx.de')");
					statement.executeUpdate("INSERT INTO `Review`(`Content`, `Rating`, `thamesUserEmail`, `ReviewIndex`, `POIName`) VALUES ('Super essen, kann ich nur weiter empfehlen', 5, 'mmueller@gmail.com', 0, 'Fischstube Mustermann ')");
					statement.executeUpdate("INSERT INTO `Booking`(`StartDate`, `EndDate`, `thamesUserEmail`, `HouseBoatWin`, `BookingNumber`) VALUES ('2020-04-10', '2020-04-17', 'mmueller@gmail.com', '1', 1)");
					statement.executeUpdate("INSERT INTO `POI_fuels`(`POIIndex`, `Fuels`, `POIName`) VALUES (0, 'Diesel', 'Anlegeplatz Themse')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = de.hhn.pmt.thames.ThamesNewPersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.pmt.thames.Tourist ldehhnpmtthamesTourist = de.hhn.pmt.thames.TouristDAO.createTourist();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : favouritess, bookings, ratings
			de.hhn.pmt.thames.TouristDAO.save(ldehhnpmtthamesTourist);
			de.hhn.pmt.thames.Lessor ldehhnpmtthamesLessor = de.hhn.pmt.thames.LessorDAO.createLessor();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : property
			de.hhn.pmt.thames.LessorDAO.save(ldehhnpmtthamesLessor);
			de.hhn.pmt.thames.HouseBoat ldehhnpmtthamesHouseBoat = de.hhn.pmt.thames.HouseBoatDAO.createHouseBoat();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : bookings, provider, win, pricePerDay, dimensionY, dimensionX
			de.hhn.pmt.thames.HouseBoatDAO.save(ldehhnpmtthamesHouseBoat);
			de.hhn.pmt.thames.Owner ldehhnpmtthamesOwner = de.hhn.pmt.thames.OwnerDAO.createOwner();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : property
			de.hhn.pmt.thames.OwnerDAO.save(ldehhnpmtthamesOwner);
			de.hhn.pmt.thames.Pier ldehhnpmtthamesPier = de.hhn.pmt.thames.PierDAO.createPier();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : berths
			de.hhn.pmt.thames.PierDAO.save(ldehhnpmtthamesPier);
			de.hhn.pmt.thames.Restaurant ldehhnpmtthamesRestaurant = de.hhn.pmt.thames.RestaurantDAO.createRestaurant();
			// Initialize the properties of the persistent object here
			de.hhn.pmt.thames.RestaurantDAO.save(ldehhnpmtthamesRestaurant);
			de.hhn.pmt.thames.GasStation ldehhnpmtthamesGasStation = de.hhn.pmt.thames.GasStationDAO.createGasStation();
			// Initialize the properties of the persistent object here
			de.hhn.pmt.thames.GasStationDAO.save(ldehhnpmtthamesGasStation);
			de.hhn.pmt.thames.Sights ldehhnpmtthamesSights = de.hhn.pmt.thames.SightsDAO.createSights();
			// Initialize the properties of the persistent object here
			de.hhn.pmt.thames.SightsDAO.save(ldehhnpmtthamesSights);
			de.hhn.pmt.thames.Tour ldehhnpmtthamesTour = de.hhn.pmt.thames.TourDAO.createTour();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tour, favourites, nightStays, locks, duration, length, name
			de.hhn.pmt.thames.TourDAO.save(ldehhnpmtthamesTour);
			de.hhn.pmt.thames.Berth ldehhnpmtthamesBerth = de.hhn.pmt.thames.BerthDAO.createBerth();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pier, berthId, sizeY, sizeX, price, isEmpty
			de.hhn.pmt.thames.BerthDAO.save(ldehhnpmtthamesBerth);
			de.hhn.pmt.thames.Review ldehhnpmtthamesReview = de.hhn.pmt.thames.ReviewDAO.createReview();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : rating
			de.hhn.pmt.thames.ReviewDAO.save(ldehhnpmtthamesReview);
			de.hhn.pmt.thames.Booking ldehhnpmtthamesBooking = de.hhn.pmt.thames.BookingDAO.createBooking();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : houseBoat, tourist
			de.hhn.pmt.thames.BookingDAO.save(ldehhnpmtthamesBooking);
			de.hhn.pmt.thames.Favourites ldehhnpmtthamesFavourites = de.hhn.pmt.thames.FavouritesDAO.createFavourites();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tourist, tour
			de.hhn.pmt.thames.FavouritesDAO.save(ldehhnpmtthamesFavourites);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateThamesNewData createThamesNewData = new CreateThamesNewData();
			try {
				createThamesNewData.createTestData();
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
