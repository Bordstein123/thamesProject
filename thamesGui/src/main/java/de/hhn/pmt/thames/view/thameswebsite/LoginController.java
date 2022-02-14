package de.hhn.pmt.thames.view.thameswebsite;

import de.hhn.pmt.thames.TouristDAO;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import de.hhn.pmt.thames.thamesUserDAO;
import de.hhn.pmt.thames.OwnerDAO;
import de.hhn.pmt.thames.LessorDAO;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.orm.PersistentException;

/**
 * @author Pascal Knie
 */

public class LoginController implements Initializable {
  //Beispieldaten :
  //Email mmueller@gmail.com
  //Passwort lkfajdgadkf

  @FXML
  Label outputLabel;
  @FXML
  TextField emailField;
  @FXML
  PasswordField passwordField;
  @FXML
  Button validate,forgot,registerButton;
  @FXML
  AnchorPane anchorPane;

  String inputEmail;
  String inputPassword;

  String sessiontoken;

  public void initialize(URL location, ResourceBundle resources) {

    outputLabel.setText("");

    forgot.setOnMouseClicked(vl-> {
      try {
        forgotPassword();
      } catch (PersistentException e) {
        e.printStackTrace();
      }
    });

    validate.setOnMouseClicked(vl-> {
      try {
        check();
      } catch (PersistentException e) {
        e.printStackTrace();
      }
    });

    registerButton.setOnMouseClicked(vl -> {

    });

  }

  private void check() throws PersistentException {
    inputEmail = emailField.getText();
    inputPassword = passwordField.getText();
    outputLabel.setText("Searching for Data...");

    TouristDAO.queryTourist(String.format("Email = '%s' ",inputEmail),null);
    LessorDAO.queryLessor(String.format("Email = '%s' ",inputEmail),null);
    OwnerDAO.queryOwner(String.format("Email = '%s' ",inputEmail),null);

    try{
    int userCount = thamesUserDAO.queryThamesUser(String.format("Email = '%s' And password = '%s'",inputEmail,inputPassword),null).size();
    if(userCount == 0){ //  User not in Databank
      outputLabel.setText("No email found or wrong password");
      return;
    }
    outputLabel.setText("Login successful");
    emailField.setDisable(true);
    passwordField.setDisable(true);
    validate.setDisable(true);
    forgot.setDisable(true);
    registerButton.setDisable(true);
    sessiontoken = thamesUserDAO.getThamesUserByORMID(inputEmail).getORMID();
    changeStage();

    } catch(PersistentException | IOException e){
      e.printStackTrace();
    }
  }

  private void changeStage() throws IOException {
    AnchorPane root = new AnchorPane();
    Label sessionLabel = new Label();
    sessionLabel.setText("Session Token: "+sessiontoken );


    root.getChildren().add(sessionLabel);
    Stage primaryStage = new Stage();
    primaryStage.initStyle(StageStyle.DECORATED);

    primaryStage.setScene(new Scene(root,300,150));
    primaryStage.show();
  }

  public void forgotPassword()throws PersistentException{
    inputEmail = emailField.getText();

    TouristDAO.queryTourist(String.format("Email = '%s' ",inputEmail),null);
    LessorDAO.queryLessor(String.format("Email = '%s' ",inputEmail),null);
    OwnerDAO.queryOwner(String.format("Email = '%s' ",inputEmail),null);

    outputLabel.setText("Searching for Data...");

    try{
      int userCount = thamesUserDAO.queryThamesUser(String.format("Email = '%s' ",inputEmail),null).size();
      if(userCount == 0){ //  User not in Databank
        outputLabel.setText("No email found or wrong password");
        return;
      }
      outputLabel.setText("Password (" + thamesUserDAO.getThamesUserByORMID(inputEmail).getPassword()+") was sent to your email");
    } catch(PersistentException e){
      e.printStackTrace();
    }
  }

  public String getSessiontoken() {
    return sessiontoken;
  }
}
