ALTER TABLE `POI` DROP FOREIGN KEY `owns`;
ALTER TABLE `Favourites` DROP FOREIGN KEY `Favourites`;
ALTER TABLE `HouseBoat` DROP FOREIGN KEY `rents out`;
ALTER TABLE `Berth` DROP FOREIGN KEY `FKBerth965516`;
ALTER TABLE `Review` DROP FOREIGN KEY `rates`;
ALTER TABLE `Review` DROP FOREIGN KEY `writes`;
ALTER TABLE `Booking` DROP FOREIGN KEY `Booking`;
ALTER TABLE `Booking` DROP FOREIGN KEY `Booking2`;
ALTER TABLE `POI_fuels` DROP FOREIGN KEY `FKPOI_fuels332035`;
ALTER TABLE `Favourites` DROP FOREIGN KEY `Favourites2`;
ALTER TABLE `Tour_POI` DROP FOREIGN KEY `contains`;
ALTER TABLE `Tour_POI` DROP FOREIGN KEY `contains2`;
DROP TABLE IF EXISTS `HouseBoat`;
DROP TABLE IF EXISTS `POI`;
DROP TABLE IF EXISTS `Tour`;
DROP TABLE IF EXISTS `Berth`;
DROP TABLE IF EXISTS `thamesUser`;
DROP TABLE IF EXISTS `Review`;
DROP TABLE IF EXISTS `Booking`;
DROP TABLE IF EXISTS `POI_fuels`;
DROP TABLE IF EXISTS `Favourites`;
DROP TABLE IF EXISTS `Tour_POI`;
CREATE TABLE `HouseBoat` (
  `Model`           varchar(255), 
  `Name`            varchar(255), 
  `DimensionX`      float NOT NULL, 
  `DimensionY`      float NOT NULL, 
  `PricePerDay`     float NOT NULL, 
  `Win`             varchar(255) NOT NULL, 
  `thamesUserEmail` varchar(255) NOT NULL, 
  PRIMARY KEY (`Win`)) ENGINE=InnoDB;
CREATE TABLE `POI` (
  `Name`            varchar(255) NOT NULL, 
  `Lat`             double NOT NULL, 
  `Lon`             double NOT NULL, 
  `OpenHour`        timestamp NOT NULL, 
  `CloseHour`       timestamp NOT NULL, 
  `DaysOfRest`      varchar(255), 
  `Image`           blob, 
  `Website`         varchar(255), 
  `HasVeggieMeals`  tinyint(1), 
  `HasVeganMeals`   tinyint(1), 
  `PriceRange`      int(10), 
  `EntranceFee`     double, 
  `Discriminator`   varchar(255) NOT NULL, 
  `thamesUserEmail` varchar(255) NOT NULL, 
  PRIMARY KEY (`Name`)) ENGINE=InnoDB;
CREATE TABLE `Tour` (
  `Name`       varchar(255) NOT NULL, 
  `Length`     float NOT NULL, 
  `Duration`   float NOT NULL, 
  `Locks`      int(10) NOT NULL, 
  `NightStays` int(10) NOT NULL, 
  PRIMARY KEY (`Name`)) ENGINE=InnoDB;
CREATE TABLE `Berth` (
  `IsEmpty` tinyint(1) NOT NULL, 
  `Price`   float NOT NULL, 
  `SizeX`   float NOT NULL, 
  `SizeY`   float NOT NULL, 
  `BerthId` int(10) NOT NULL, 
  `POIName` varchar(255) NOT NULL, 
  PRIMARY KEY (`BerthId`)) ENGINE=InnoDB;
CREATE TABLE `thamesUser` (
  `Name`          varchar(255), 
  `Email`         varchar(255) NOT NULL, 
  `UserName`      varchar(255) UNIQUE, 
  `Password`      varchar(255), 
  `Discriminator` varchar(255) NOT NULL, 
  `Licence`       varchar(255), 
  PRIMARY KEY (`Email`)) ENGINE=InnoDB;
CREATE TABLE `Review` (
  `Content`         varchar(255), 
  `Rating`          float NOT NULL, 
  `thamesUserEmail` varchar(255) NOT NULL, 
  `ReviewIndex`     int(10) NOT NULL, 
  `POIName`         varchar(255) NOT NULL, 
  PRIMARY KEY (`thamesUserEmail`, 
  `ReviewIndex`, 
  `POIName`)) ENGINE=InnoDB;
CREATE TABLE `Booking` (
  `StartDate`       date, 
  `EndDate`         date, 
  `thamesUserEmail` varchar(255) NOT NULL, 
  `HouseBoatWin`    varchar(255) NOT NULL, 
  `BookingNumber`   int(10) NOT NULL AUTO_INCREMENT, 
  PRIMARY KEY (`BookingNumber`)) ENGINE=InnoDB;
CREATE TABLE `POI_fuels` (
  `POIIndex` int(11) NOT NULL, 
  `Fuels`    varchar(255), 
  `POIName`  varchar(255) NOT NULL, 
  PRIMARY KEY (`POIIndex`, 
  `POIName`)) ENGINE=InnoDB;
CREATE TABLE `Favourites` (
  `TourName`        varchar(255) NOT NULL, 
  `thamesUserEmail` varchar(255) NOT NULL, 
  `ID`              int(10) NOT NULL AUTO_INCREMENT, 
  PRIMARY KEY (`ID`)) ENGINE=InnoDB;
CREATE TABLE `Tour_POI` (
  `TourName` varchar(255) NOT NULL, 
  `POIName`  varchar(255) NOT NULL, 
  PRIMARY KEY (`TourName`, 
  `POIName`)) ENGINE=InnoDB;
ALTER TABLE `POI` ADD CONSTRAINT `owns` FOREIGN KEY (`thamesUserEmail`) REFERENCES `thamesUser` (`Email`);
ALTER TABLE `Favourites` ADD CONSTRAINT `Favourites` FOREIGN KEY (`thamesUserEmail`) REFERENCES `thamesUser` (`Email`);
ALTER TABLE `HouseBoat` ADD CONSTRAINT `rents out` FOREIGN KEY (`thamesUserEmail`) REFERENCES `thamesUser` (`Email`);
ALTER TABLE `Berth` ADD CONSTRAINT `FKBerth965516` FOREIGN KEY (`POIName`) REFERENCES `POI` (`Name`);
ALTER TABLE `Review` ADD CONSTRAINT `rates` FOREIGN KEY (`POIName`) REFERENCES `POI` (`Name`);
ALTER TABLE `Review` ADD CONSTRAINT `writes` FOREIGN KEY (`thamesUserEmail`) REFERENCES `thamesUser` (`Email`);
ALTER TABLE `Booking` ADD CONSTRAINT `Booking` FOREIGN KEY (`HouseBoatWin`) REFERENCES `HouseBoat` (`Win`);
ALTER TABLE `Booking` ADD CONSTRAINT `Booking2` FOREIGN KEY (`thamesUserEmail`) REFERENCES `thamesUser` (`Email`);
ALTER TABLE `POI_fuels` ADD CONSTRAINT `FKPOI_fuels332035` FOREIGN KEY (`POIName`) REFERENCES `POI` (`Name`);
ALTER TABLE `Favourites` ADD CONSTRAINT `Favourites2` FOREIGN KEY (`TourName`) REFERENCES `Tour` (`Name`);
ALTER TABLE `Tour_POI` ADD CONSTRAINT `contains` FOREIGN KEY (`TourName`) REFERENCES `Tour` (`Name`);
ALTER TABLE `Tour_POI` ADD CONSTRAINT `contains2` FOREIGN KEY (`POIName`) REFERENCES `POI` (`Name`);
INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Maria Müller', 'mmueller@gmail.com', 'mariechen007', 'lkfajdgadkf', 'tourist', null);
INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Max Mustermann', 'mustermann@gmx.de', 'mustermax123', 'musterpasswort', 'owner', null);
INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Timm Thaler', 'thalertim@t-online.de', 'boottim', '1234', 'organiser', null);
INSERT INTO `thamesUser`(`Name`, `Email`, `UserName`, `Password`, `Discriminator`, `Licence`) VALUES ('Maria Mustermann', 'mmustermann@gmx.de', 'mariamuster1', 'maria55', 'lessor', null);
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Fischstube Mustermann ', 51.407180, -0.402563, '2020-12-03 7:00', '2020-12-03 19.30', null, null, 'www.mustermann-fischstube.com', true, true, 1, null, 'Restaurant', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Anlegeplatz Themse', 51.200040, -0.389025, '2020-12-03 7:00', '2020-12-03 22.00', null, null, 'www.anlegestellde.uk', null, null, null, null, 'Pier', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('London Eye', 51.50331794844686, -0.11951591797837126, '2020-12-03 11:00', '2020-12-03 18:00', null, null, 'https://www.londoneye.com/plan-your-visit/before-you-visit/opening-hours/', null, null, null, 27, 'Sights', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Tower of London', 51.50816580095366, -0.07606731874712422, '2020-12-03 10:00', '2020-12-03 16:30', 'Monday', null, 'https://www.hrp.org.uk/tower-of-london/', null, null, null, 29.90, 'Sights', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Westminster Abbey', 51.499424958050305, -0.1269418991060573, '2020-12-03 9:30', '2020-12-03 15:30', null, null, 'https://www.westminster-abbey.org/', null, null, null, 24, 'Sights', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Pizza Express', 51.508193885903744, -0.09586263995702127, '2020-12-03 11:30', '2020-12-03 23:00', null, null, 'https://www.pizzaexpress.com/bankside', true, false, 2, null, 'Restaurant', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('The Narrow', 51.50980257182585, -0.03776796774874749, '2020-12-03 12:00', '2020-12-03 23:30', null, null, 'https://www.gordonramsayrestaurants.com/the-narrow/', true, false, 2, null, 'Restaurant', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Nando´s Greenwich - Cutty Sark', 51.48361196000324, -0.009471067059692076, '2020-12-03 11:30', '2020-12-03 22:00', null, null, 'https://www.nandos.co.uk/restaurants/greenwich-cutty-sark', true, false, 3, null, 'Restaurant', 'mustermann@gmx.de');
INSERT INTO `POI`(`Name`, `Lat`, `Lon`, `OpenHour`, `CloseHour`, `DaysOfRest`, `Image`, `Website`, `HasVeggieMeals`, `HasVeganMeals`, `PriceRange`, `EntranceFee`, `Discriminator`, `thamesUserEmail`) VALUES ('Palm Riverside', 51.46256144236221, -0.19974922285710206, '2020-12-03 11:00', '2020-12-03 0:00', null, null, 'https://palmriverside.co.uk/', false, false, 3, null, 'Restaurant', 'mustermann@gmx.de');
INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Beer Lover Tour', 128, 22, 3, 7);
INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Scenic Landscape Tour', 75, 17, 4, 3);
INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Majestic Tour', 114, 20, 2, 6);
INSERT INTO `Tour`(`Name`, `Length`, `Duration`, `Locks`, `NightStays`) VALUES ('The Family Adventure Tour', 67, 14, 0, 2);
INSERT INTO `Berth`(`IsEmpty`, `Price`, `SizeX`, `SizeY`, `BerthId`, `POIName`) VALUES (true, 22.50, 4.45, 6.5, 0, 'Anlegeplatz Themse');
INSERT INTO `HouseBoat`(`Model`, `Name`, `DimensionX`, `DimensionY`, `PricePerDay`, `Win`, `thamesUserEmail`) VALUES ('Olympia Superkreuzer', 'Maria', 14.95, 4.85, 220, '1', 'mmustermann@gmx.de');
INSERT INTO `Review`(`Content`, `Rating`, `thamesUserEmail`, `ReviewIndex`, `POIName`) VALUES ('Super essen, kann ich nur weiter empfehlen', 5, 'mmueller@gmail.com', 0, 'Fischstube Mustermann ');
INSERT INTO `Booking`(`StartDate`, `EndDate`, `thamesUserEmail`, `HouseBoatWin`, `BookingNumber`) VALUES ('2020-04-10', '2020-04-17', 'mmueller@gmail.com', '1', 1);
INSERT INTO `POI_fuels`(`POIIndex`, `Fuels`, `POIName`) VALUES (0, 'Diesel', 'Anlegeplatz Themse');
