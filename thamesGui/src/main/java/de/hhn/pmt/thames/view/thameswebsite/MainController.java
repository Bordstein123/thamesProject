package de.hhn.pmt.thames.view.thameswebsite;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
  @FXML
  TabPane tabPane;
  @FXML
  AnchorPane scene;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    scene = new AnchorPane();

    tabPane.getTabs().add(new Tab("Registration"));
    tabPane.getTabs().add(new Tab("Login"));
    tabPane.getTabs().add(new Tab("Tours"));
    tabPane.getTabs().add(new Tab("Map"));
    tabPane.getTabs().add(new Tab("Add POI"));

    tabPane.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
      loadFxml(newValue.getText());
      oldValue.setContent(null);
      newValue.setContent(scene);
    });

    loadFxml(tabPane.getSelectionModel().getSelectedItem().getText());
    tabPane.getSelectionModel().getSelectedItem().setContent(scene);
  }

  private void loadFxml(String selection) {
    scene.getChildren().clear();
    FXMLLoader loader = new FXMLLoader();
    try {
      switch (selection) {
        case "Registration":
          loader.setLocation(getClass().getResource("registration.fxml"));
          break;
        case "Login":
          loader.setLocation(getClass().getResource("logIn.fxml"));
          break;
        case "Tours":
          loader.setLocation(getClass().getResource("tourbooking.fxml"));
          break;
        case "Map":
          loader.setLocation(getClass().getResource("thamesMap.fxml"));
          break;
        case "Add POI":
          loader.setLocation(getClass().getResource("addPoi.fxml"));
          break;
        default:
          throw new IllegalStateException("Unexpected value: " + selection);
      }
      scene.getChildren().add(loader.load());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
