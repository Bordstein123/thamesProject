package de.hhn.pmt.thames.view.thameswebsite;

import de.hhn.pmt.thames.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import org.orm.PersistentException;

import java.awt.*;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.TimeZone;

public class ThamesMapController implements Initializable {


  private double latitude = 0;
  private double longitude = 0;

  POI currentActivePOI = null;

  @FXML
  private Button book, openStreet;

  @FXML
  private Label closeHourClock, closeHourLabel, dayOfRestLabel, dayOfRestValue, homepageLabel, entranceFeeLabel;

  @FXML
  private Label entranceFeeValue, priceRangeLabel, priceRangeValue, veggieMealsLabel, veganMealLabel;

  @FXML
  private Label homepageValue, latLabel, latValue, longitudeLabel, longitudeValue;

  @FXML
  private RadioButton londonEye, towerOfLondon, westminsterAbbey, palmRiverside, pizzaExpress, theNarrow, nandosGreenwich;

  @FXML
  private Label openHourClock, openHourLabel, poiName;

  @FXML
  private ImageView thamesMap;

  @FXML
  private javafx.scene.control.CheckBox veggieChk, veganChk;

  @FXML
  void showInOpenStreetMap(MouseEvent event) {
      String webPage = "https://www.openstreetmap.org/#map=18/" + latitude + "/" + longitude;
      openWebpage(webPage);
  }

  @FXML
  void showTowerOfLondon(MouseEvent event) {
    updateLabel("Tower of London");
  }

  @FXML
  void showPalmRiverside(MouseEvent event) {
    updateLabel("Palm Riverside");
  }

  @FXML
  void showWestminsterAbbey(MouseEvent event) {
    updateLabel("Westminster Abbey");
  }

  @FXML
  void showPizzaExpress(MouseEvent event) {
    updateLabel("Pizza Express");
  }

  @FXML
  void showTheNarrow(MouseEvent event) {
    updateLabel("The Narrow");
  }

  @FXML
  void showNando(MouseEvent event) {
    updateLabel("Nando´s Greenwich - Cutty Sark");
  }

  @FXML
  void showLondonEye(MouseEvent event) {
    updateLabel("London Eye");
  }

  @FXML
  void openHomepage(MouseEvent event){

    String webPage = currentActivePOI.getWebsite();
    openWebpage(webPage);
  }

  private void setVisiblityOfAllLabels(boolean state){
    closeHourClock.setVisible(state);
    closeHourLabel.setVisible(state);
    openHourClock.setVisible(state);
    openHourLabel.setVisible(state);
    dayOfRestLabel.setVisible(state);
    dayOfRestValue.setVisible(state);
    homepageLabel.setVisible(state);
    homepageValue.setVisible(state);
    poiName.setVisible(state);
    book.setVisible(state);
    entranceFeeLabel.setVisible(state);
    entranceFeeValue.setVisible(state);
    priceRangeLabel.setVisible(state);
    priceRangeValue.setVisible(state);
    veganMealLabel.setVisible(state);
    veggieMealsLabel.setVisible(state);
    latValue.setVisible(state);
    latLabel.setVisible(state);
    longitudeValue.setVisible(state);
    longitudeLabel.setVisible(state);
    openStreet.setVisible(state);
  }

  private void setCheckBoxVisibility(boolean state){
    veggieChk.setVisible(state);
    veganChk.setVisible(state);
  }

  private void setLabelVisibilitySight(){
    closeHourClock.setVisible(true);
    closeHourLabel.setVisible(true);
    openHourClock.setVisible(true);
    openHourLabel.setVisible(true);
    dayOfRestLabel.setVisible(true);
    dayOfRestValue.setVisible(true);
    homepageLabel.setVisible(true);
    homepageValue.setVisible(true);
    poiName.setVisible(true);
    book.setVisible(true);
    entranceFeeLabel.setVisible(true);
    entranceFeeValue.setVisible(true);
    priceRangeLabel.setVisible(false);
    priceRangeValue.setVisible(false);
    veganMealLabel.setVisible(false);
    veggieMealsLabel.setVisible(false);
    veggieChk.setVisible(false);
    veganChk.setVisible(false);
    latValue.setVisible(true);
    latLabel.setVisible(true);
    longitudeValue.setVisible(true);
    longitudeLabel.setVisible(true);
    openStreet.setVisible(true);
  }

  private void setLabelVisibilityRestaurant(){
    closeHourClock.setVisible(true);
    closeHourLabel.setVisible(true);
    openHourClock.setVisible(true);
    openHourLabel.setVisible(true);
    dayOfRestLabel.setVisible(true);
    dayOfRestValue.setVisible(true);
    homepageLabel.setVisible(true);
    homepageValue.setVisible(true);
    poiName.setVisible(true);
    book.setVisible(true);
    entranceFeeLabel.setVisible(false);
    entranceFeeValue.setVisible(false);
    priceRangeLabel.setVisible(true);
    priceRangeValue.setVisible(true);
    veganMealLabel.setVisible(true);
    veggieMealsLabel.setVisible(true);
    veggieChk.setVisible(true);
    veganChk.setVisible(true);
    latValue.setVisible(true);
    latLabel.setVisible(true);
    longitudeValue.setVisible(true);
    longitudeLabel.setVisible(true);
    openStreet.setVisible(true);
  }

  private void updateLabel(String name){
    POI poi = getPOIByName(name);
    currentActivePOI = poi;
    DecimalFormat df = new DecimalFormat("0.00");
    
    SimpleDateFormat sdf = new SimpleDateFormat("h:mm a");
    sdf.setTimeZone(TimeZone.getDefault());
    Timestamp openHour = poi.getOpenHour();
    Timestamp closeHour = poi.getCloseHour();

    String openHourFormatted = sdf.format(new Date(openHour.getTime()));
    String closeHourFormatted = sdf.format(new Date(closeHour.getTime()));

    poiName.setText(poi.getName());

    openHourClock.setText(openHourFormatted);
    closeHourClock.setText(closeHourFormatted);

    homepageValue.setText(poi.getWebsite());

    String restDays = poi.getDaysOfRest() == null ? "none" : poi.getDaysOfRest();

    dayOfRestValue.setText(restDays);

    latitude = poi.getLat();
    longitude = poi.getLon();

    DecimalFormat df2 = new DecimalFormat("#.######");
    String lat = df2.format(latitude);

    latValue.setText(ParseLatitude(latitude));
    longitudeValue.setText(ParseLongitude(longitude));


    if(poi instanceof Sights){
      setLabelVisibilitySight();
      String entranceFee = df.format(((Sights) poi).getEntranceFee()) + " £";
      entranceFeeValue.setText(entranceFee);
    }
    else if(poi instanceof Restaurant){
      setLabelVisibilityRestaurant();
      String priceRange = String.valueOf(((Restaurant) poi).getPriceRange());
      priceRangeValue.setText(priceRange);
      veggieChk.setSelected(((Restaurant) poi).getHasVeggieMeals());
      veganChk.setSelected(((Restaurant) poi).getHasVeganMeals());

    }
    else if(poi instanceof Pier){
      System.out.println("PIER");
    }
  }

  /**
   * Override the function to allow only POI to  be shown, which are in the DB.
   */
  @Override
  public void initialize(URL location, ResourceBundle resources) {

    //Check if POI are aviable
    //POI
    POI poiLondonEye = getPOIByName("London Eye");
    POI poiTowerOfLondon = getPOIByName("Tower of London");
    POI poiWestminsterAbbey = getPOIByName("Westminster Abbey");
    POI poiPizzaExpress = getPOIByName("Pizza Express");
    POI poiTheNarrow = getPOIByName("The Narrow");
    POI poiNandosGreenwhich = getPOIByName("Nando´s Greenwich - Cutty Sark");
    POI poiPalmRiverside = getPOIByName("Palm Riverside");

    londonEye.setVisible(poiLondonEye != null);
    towerOfLondon.setVisible(poiTowerOfLondon != null);
    westminsterAbbey.setVisible(poiWestminsterAbbey != null);
    pizzaExpress.setVisible(poiPizzaExpress != null);
    theNarrow.setVisible(poiTheNarrow != null);
    nandosGreenwich.setVisible(poiNandosGreenwhich != null);
    palmRiverside.setVisible(poiPalmRiverside != null);

    //First List all aviable POIs...

    setVisiblityOfAllLabels(false);
    setCheckBoxVisibility(false);
  }

  private static void openWebpage(String urlString) {
    try {
      Desktop.getDesktop().browse(new URL(urlString).toURI());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static POI getPOIByName(String name){
    POI poi = null;
    try{
      poi = POIDAO.getPOIByORMID(name);
    }
    catch (org.orm.PersistentException exception){

    }
    return poi;
  }

  private static String ParseLatitude(double value)
  {
    var direction = value < 0 ? "S" : "N";
    return ParseLatitudeOrLongitude(value, direction);
  }

  private static String ParseLongitude(double value)
  {
    var direction = value < 0 ? "W" : "E";
    return ParseLatitudeOrLongitude(value, direction);
  }


  private static String ParseLatitudeOrLongitude(double value, String direction)
  {
    value = Math.abs(value);

    var degrees = value > 0 ? Math.floor(value) : Math.ceil(value);//Math.Truncate(value);

    value = (value - degrees) * 60;       //not Value = (Value - degrees) / 60;

    var minutes = value > 0 ? Math.floor(value) : Math.ceil(value);

    var seconds = (value - minutes) * 60; //not Value = (Value - degrees) / 60;

    String deg = String.valueOf(degrees).substring(0,degrees >= 10 ? 2 : 1);
    String min = String.valueOf(minutes).substring(0,minutes >= 10 ? 2 : 1);
    String sec = String.valueOf(seconds).substring(0,5);

    return deg + "° " + min + "' " + sec + "\" " + direction;
  }

}
