package de.hhn.pmt.thames.view.thameswebsite;

import de.hhn.pmt.thames.*;
import de.hhn.pmt.thames.Sights;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.stage.FileChooser;
import org.orm.PersistentException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Timestamp;

/**
 * @author Stephan Oberndörfer mrt.Nr. 179013
 */
public class AddPoiController {

    @FXML
    private TextField closeHrsField;

    @FXML
    private TextField closeMinField;

    @FXML
    private TextField entranceFeeField;

    @FXML
    private CheckBox hasVeganCheck;

    @FXML
    private CheckBox hasVeggieCheck;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField latField;

    @FXML
    private TextField longField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField openHrsField;

    @FXML
    private TextField openMinField;

    @FXML
    private Button poiButton;

    @FXML
    private ComboBox<?> priceRangeBox;

    @FXML
    private ChoiceBox<?> restBox;

    @FXML
    private ComboBox<?> typeBox;

    @FXML
    private Button uploadButton;

    @FXML
    private TextField urlField;

  @FXML
  Label feedbackLabel;

  boolean testFloat(String s){
    try{
      float f = Float.parseFloat(s);
      return true;
    }catch(NumberFormatException e){
      return false;
    }
  }
  boolean isEmpty(String s){
    if(s.equals("")){return false;}
    else{return true;}
  }

  boolean testInt(String s){
    try{
      int i = Integer.parseInt(s);
      return true;
    }catch(NumberFormatException e){
      return false;
    }
  }

  boolean inDatabase(String s){
    try{
      Pier[] testPier = PierDAO.listPierByQuery(null,null);
      for(Pier pier : testPier){
        if(pier.getName().equals(s)){return true;}}
      Sights[] testSights = SightsDAO.listSightsByQuery(null,null);
      for(Sights sight : testSights){
        if(sight.getName().equals(s)){return true;}}
      Restaurant[] testRestaurant = RestaurantDAO.listRestaurantByQuery(null,null);
      for(Restaurant restaurant : testRestaurant){
      if(restaurant.getName().equals(s)){return true;}}
      GasStation[] testGasStation = GasStationDAO.listGasStationByQuery(null,null);
      for(GasStation gasStation : testGasStation){
        if(gasStation.getName().equals(s)){return true;}
      }
    } catch(PersistentException e){
      System.out.println("connection failed");
    }
    return false;
  }

  boolean testValues(){
    if(!isEmpty(nameField.getText())){feedbackLabel.setText("saving POI failed: no Value in Name field"); return false;}
    if(!testInt(openHrsField.getText())){feedbackLabel.setText("saving POI failed: wrong value in opening hours hrs field"); return false;}
    if(!testInt(openMinField.getText())){feedbackLabel.setText("saving POI failed: wrong value in opening hours min field"); return false;}
    if(!testHrs(Integer.parseInt(openHrsField.getText()))){feedbackLabel.setText("saving POI failed: wrong value in opening hours hrs field"); return false;}
    if(!testMin(Integer.parseInt(openHrsField.getText()))){feedbackLabel.setText("saving POI failed: wrong value in opening hours min field"); return false;}
    if(!testInt(closeHrsField.getText())){feedbackLabel.setText("saving POI failed: wrong value in closing hours hrs field"); return false;}
    if(!testInt(closeMinField.getText())){feedbackLabel.setText("saving POI failed: wrong value in closing hours min field"); return false;}
    if(!testHrs(Integer.parseInt(closeHrsField.getText()))){feedbackLabel.setText("saving POI failed: wrong value in closing hours hrs field"); return false;}
    if(!testMin(Integer.parseInt(closeMinField.getText()))){feedbackLabel.setText("saving POI failed: wrong value in closing hours min field"); return false;}
    if(!testFloat(latField.getText())){feedbackLabel.setText("saving POI failed: wrong value in lat field"); return false;}
    if(!testFloat(longField.getText())){feedbackLabel.setText("saving POI failed: wrong value in long field"); return false;}
    if(inDatabase(nameField.getText())){feedbackLabel.setText("saving POI failed: name already exists"); return false;}
    return true;
  }

  boolean testHrs(int hrs){
    if(hrs>24||hrs<0){return false;}
    return true;
  }

  boolean testMin(int min){
    if(min>60||min<0){return false;}
    return true;
  }

  Timestamp toTime(int hrs, int min){
    long milliseconds = ((hrs+23)*60+min)*60*1000;
    Timestamp time = new Timestamp(milliseconds);
    return time;
  }
  @FXML
  void addPOIClick(MouseEvent event) {
    boolean isValid = false;
    if (typeBox.getSelectionModel().getSelectedItem().equals("Pier")) {
      if(testValues()){
        isValid = true;
      }
      if(isValid){
        Pier pier = PierDAO.createPier();
        pier.setName(nameField.getText());
        pier.setOpenHour(toTime(Integer.parseInt(openHrsField.getText()),Integer.parseInt(openMinField.getText())));
        pier.setCloseHour(toTime(Integer.parseInt(closeHrsField.getText()),Integer.parseInt(closeMinField.getText())));
        pier.setLat(Float.parseFloat(latField.getText()));
        pier.setLon(Float.parseFloat(longField.getText()));
        pier.setWebsite(urlField.getText());
        //pier.setImage(path);
        if(!restBox.getSelectionModel().getSelectedItem().toString().equals("None")){
        pier.setDaysOfRest(restBox.getSelectionModel().getSelectedItem().toString());}

        try {
          pier.setOwner(OwnerDAO.loadOwnerByORMID("mustermann@gmx.de"));
          PierDAO.save(pier);
          feedbackLabel.setText(pier.getName() + " was saved successfully");
          clearFields();
        } catch (PersistentException e) {
          System.out.println("Failed connection");
        }
      }
    }

    if(typeBox.getSelectionModel().getSelectedItem().equals("Sight")){
      if(testValues()){
        if(testFloat(entranceFeeField.getText())){
          isValid = true;
        }else{feedbackLabel.setText("saving POI failed: wrong value in entrance fee field");}
      }
      if(isValid){
        Sights sight = SightsDAO.createSights();
        sight.setName(nameField.getText());
        sight.setOpenHour(toTime(Integer.parseInt(openHrsField.getText()),Integer.parseInt(openMinField.getText())));
        sight.setCloseHour(toTime(Integer.parseInt(closeHrsField.getText()),Integer.parseInt(closeMinField.getText())));
        sight.setLat(Float.parseFloat(latField.getText()));
        sight.setLon(Float.parseFloat(longField.getText()));
        sight.setWebsite(urlField.getText());
        //sight.setImage(path);
        sight.setEntranceFee(Float.parseFloat(entranceFeeField.getText()));
        if(!restBox.getSelectionModel().getSelectedItem().toString().equals("None")){
        sight.setDaysOfRest(restBox.getSelectionModel().getSelectedItem().toString());}

        try {
          sight.setOwner(OwnerDAO.loadOwnerByORMID("mustermann@gmx.de"));
          SightsDAO.save(sight);
          feedbackLabel.setText(sight.getName() + " was saved successfully");
          clearFields();
        } catch (PersistentException e) {
          System.out.println("Failed persistent connection");
        }
      }
    }

    if(typeBox.getSelectionModel().getSelectedItem().equals("Restaurant")){
      if(testValues()){
        isValid = true;
      }
      if(isValid){
        Restaurant restaurant = RestaurantDAO.createRestaurant();
        restaurant.setName(nameField.getText());
        restaurant.setOpenHour(toTime(Integer.parseInt(openHrsField.getText()),Integer.parseInt(openMinField.getText())));
        restaurant.setCloseHour(toTime(Integer.parseInt(closeHrsField.getText()),Integer.parseInt(closeMinField.getText())));
        restaurant.setLat(Float.parseFloat(latField.getText()));
        restaurant.setLon(Float.parseFloat(longField.getText()));
        restaurant.setWebsite(urlField.getText());
        //restaurant.setImage(path);
        restaurant.setHasVeganMeals(hasVeganCheck.isSelected());
        restaurant.setHasVeggieMeals(hasVeggieCheck.isSelected());
        restaurant.setPriceRange(Integer.parseInt(priceRangeBox.getSelectionModel().getSelectedItem().toString()));
        if(!restBox.getSelectionModel().getSelectedItem().toString().equals("None")){
        restaurant.setDaysOfRest(restBox.getSelectionModel().getSelectedItem().toString());}

        try {
          restaurant.setOwner(OwnerDAO.loadOwnerByORMID("mustermann@gmx.de"));
          RestaurantDAO.save(restaurant);
          feedbackLabel.setText(restaurant.getName() + " was saved successfully");
          clearFields();
        } catch (PersistentException e) {
          System.out.println("Failed connection");
        }
      }
    }

    if(typeBox.getSelectionModel().getSelectedItem().equals("Gas Station")){
      if(testValues()){
        isValid = true;
      }
      if(isValid){
        GasStation gasStation = GasStationDAO.createGasStation();
        gasStation.setName(nameField.getText());
        gasStation.setOpenHour(toTime(Integer.parseInt(openHrsField.getText()),Integer.parseInt(openMinField.getText())));
        gasStation.setCloseHour(toTime(Integer.parseInt(closeHrsField.getText()),Integer.parseInt(closeMinField.getText())));
        gasStation.setLat(Float.parseFloat(latField.getText()));
        gasStation.setLon(Float.parseFloat(longField.getText()));
        gasStation.setWebsite(urlField.getText());
        //gasStation.setImage(path);
        if(!restBox.getSelectionModel().getSelectedItem().toString().equals("None")){
        gasStation.setDaysOfRest(restBox.getSelectionModel().getSelectedItem().toString());}

        try {
          gasStation.setOwner(OwnerDAO.loadOwnerByORMID("mustermann@gmx.de"));
          GasStationDAO.save(gasStation);
          feedbackLabel.setText(gasStation.getName() + " was saved successfully");
          clearFields();
        } catch (PersistentException e) {
          System.out.println("Failed connection");
        }
      }
    }
    path = null;
    imageView.setImage(null);
  }

  private String path = null;
    @FXML
    void uploadClick(MouseEvent event) throws FileNotFoundException {
      FileChooser fileChooser = new FileChooser();
      fileChooser.setTitle("Select a picture");
      fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
      fileChooser.getExtensionFilters().addAll(
          new FileChooser.ExtensionFilter("JPG", "*.jpg"),
          new FileChooser.ExtensionFilter("PNG", "*.png")
      );

      path = fileChooser.showOpenDialog(null).toURI().toString();
      Image image = new Image(path);
      imageView.setImage(image);
    }

    @FXML
    void initialize(){
      typeBox.getSelectionModel().selectedItemProperty().addListener((observableValues, oldValue, newValue) -> typeChanged(newValue.toString()));
      typeBox.getSelectionModel().select(0);
      priceRangeBox.getSelectionModel().select(0);
      restBox.getSelectionModel().select(0);
    }

    void typeChanged(String s){
      switch(s){
        case "Restaurant" :
          entranceFeeField.setDisable(true);
          hasVeggieCheck.setDisable(false);
          hasVeganCheck.setDisable(false);
          priceRangeBox.setDisable(false);
          break;
        case "Sight" :
          entranceFeeField.setDisable(false);
          hasVeggieCheck.setDisable(true);
          hasVeganCheck.setDisable(true);
          priceRangeBox.setDisable(true);
          break;
        default:
          entranceFeeField.setDisable(true);
          hasVeggieCheck.setDisable(true);
          hasVeganCheck.setDisable(true);
          priceRangeBox.setDisable(true);
          break;
      }
    }

    void clearFields(){
      nameField.setText("");
      latField.setText("");
      longField.setText("");
      urlField.setText("");
      openHrsField.setText("");
      openMinField.setText("");
      closeHrsField.setText("");
      closeMinField.setText("");
      entranceFeeField.setText("");
      hasVeganCheck.setSelected(false);
      hasVeggieCheck.setSelected(false);
      priceRangeBox.getSelectionModel().select(0);
    }

}
