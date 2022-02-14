package de.hhn.pmt.thames.view.thameswebsite;

import de.hhn.pmt.thames.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.orm.PersistentException;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.List;

/**
 * @author Carolin Niederhofer
 */

public class RegistrationController implements Initializable {
  @FXML
  TextField nameInput, mailInput, usernameInput;
  @FXML
  PasswordField passwordInput, passwordCheckInput;
  @FXML
  ComboBox<String> roleBox;
  @FXML
  CheckBox licence;
  @FXML
  Label nameFeedback, mailFeedback, usernameFeedback, passwordFeedback, roleFeedback, signUpFeedback;
  @FXML
  Hyperlink hyperlink;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    licence.setDisable(true);

    ObservableList<String> roles = FXCollections.observableArrayList();
    roles.add("Tourist");
    roles.add("Owner");
    roles.add("Lessor");
    roleBox.setItems(roles);

    hyperlink.setOnMouseClicked(e -> {
      if(Desktop.isDesktopSupported()) {
        try {
          Desktop.getDesktop().browse(new URI("https://www.gov.uk/owning-a-boat/safety-on-inland-waterways"));
        } catch (IOException e1) {
          e1.printStackTrace();
        } catch (URISyntaxException e1) {
          e1.printStackTrace();
        }
      }
    });

    roleBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> licence.setDisable(!newValue.equals("Tourist")));
  }

  public void checkInput() {
    nameFeedback.setText("");
    mailFeedback.setText("");
    usernameFeedback.setText("");
    passwordFeedback.setText("");
    roleFeedback.setText("");

    thamesUser newUser = null;

    if(roleBox.getSelectionModel().isEmpty()) {
      roleFeedback.setText("Please select a role");
      return;
    }

    if(roleBox.getSelectionModel().getSelectedItem().equals("Tourist")) {
      newUser = TouristDAO.createTourist();
    }
    else if(roleBox.getSelectionModel().getSelectedItem().equals("Owner")) {
      newUser = OwnerDAO.createOwner();
    }
    else if(roleBox.getSelectionModel().getSelectedItem().equals("Lessor")) {
      newUser = LessorDAO.createLessor();
    }
    assert newUser != null;

    if(nameInput.getText().isEmpty()) {
      nameFeedback.setText("Please enter a name");
      return;
    }
    newUser.setName(nameInput.getText());

    if(mailInput.getText().isEmpty() || !mailInput.getText().contains("@")) {
      mailFeedback.setText("Please enter a valid mail address");
      return;
    }

    if(usernameInput.getText().isEmpty()) {
      usernameFeedback.setText("Please enter a username");
      return;
    }

    try {
      List list = thamesUserDAO.queryThamesUser(String.format("Email = '%s'", mailInput.getText()), null);
      if(list.size() > 0) {
        mailFeedback.setText("This mail address is already assigned to another profile");
        return;
      }
    } catch (PersistentException e) {
      e.printStackTrace();
    }

    try {
      List list = thamesUserDAO.queryThamesUser(String.format("UserName = '%s'", usernameInput.getText()), null);

      if(list.size() > 0) {
        usernameFeedback.setText("This username is already assigned to another profile");
        return;
      }
    } catch (PersistentException e) {
      e.printStackTrace();
    }

    newUser.setUserName(usernameInput.getText());
    newUser.setEmail(mailInput.getText());

    if(passwordInput.getText().isEmpty() || passwordCheckInput.getText().isEmpty()) {
      passwordFeedback.setText("Please enter a password in both fields");
      return;
    }
    if(!passwordInput.getText().equals(passwordCheckInput.getText())) {
      passwordFeedback.setText("The entered passwords do not match");
      return;
    }
    newUser.setPassword(passwordInput.getText());

    if(newUser instanceof Tourist) {
      if(licence.isSelected()) {
        ((Tourist) newUser).setLicence(licence.getText());
      }
    }

    try {
      thamesUserDAO.save(newUser);
      signUpFeedback.setStyle("-fx-text-fill: green");
      signUpFeedback.setText("Registration was successful!");
    } catch (Exception e) {
      signUpFeedback.setStyle("-fx-text-fill: red");
      signUpFeedback.setText("Something went wrong...");
    }
  }
}
