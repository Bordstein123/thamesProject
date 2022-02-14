package de.hhn.pmt.thames.view.thameswebsite;

import de.hhn.pmt.thames.Tour;
import de.hhn.pmt.thames.TourDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.orm.PersistentException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * @author Neha Srikanth
 */

public class TourBookingController implements Initializable {

  @FXML
  ImageView historicTourImage, familyTourImage, landscapeTourImage, pubTourImage;
  @FXML
  Button detailsPub, detailsHistory, detailsFamily, detailsLandscape;
  @FXML
  Label titel1, titel2, titel3, titel4;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    historicTourImage.setImage(new Image("https://www.ferien-auf-dem-wasser.de/wp-content/uploads/2020/04/thames-hausboot-600x400.jpg"));
    familyTourImage.setImage(new Image("https://www.maritimefun.com/wp-content/uploads/2019/01/SSfinal-0091v2.jpg"));
    landscapeTourImage.setImage(new Image("https://www.dorchestercollection.com/wp-content/uploads/shutterstock_795165388-904x700.jpg"));
    pubTourImage.setImage(new Image("https://i0.wp.com/jetsettingfools.com/wp-content/uploads/2017/01/London-England-River-Thames.jpg?w=733&h=486&ssl=1"));

    detailsPub.setOnMouseClicked(dp -> detailsDialog("The Beer Lover Tour"));
    detailsHistory.setOnMouseClicked(dh -> detailsDialog("The Majestic Tour"));
    detailsFamily.setOnMouseClicked(df -> detailsDialog("The Family Adventure Tour"));
    detailsLandscape.setOnMouseClicked(dn -> detailsDialog("The Scenic Landscape Tour"));

    try {
      titel1.setText(TourDAO.getTourByORMID("The Beer Lover Tour").getName());
    } catch (PersistentException e) {
      e.printStackTrace();
    }

    try {
      titel2.setText(TourDAO.getTourByORMID("The Scenic Landscape Tour").getName());
    } catch (PersistentException e) {
      e.printStackTrace();
    }

    try {
      titel3.setText(TourDAO.getTourByORMID("The Majestic Tour").getName());
    } catch (PersistentException e) {
      e.printStackTrace();
    }

    try {
      titel4.setText(TourDAO.getTourByORMID("The Family Adventure Tour").getName());
    } catch (PersistentException e) {
      e.printStackTrace();
    }

  }


  public void addToFavsDialog() {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Adding to favourites");
    alert.setHeaderText("SUCCESS");
    alert.setContentText("This tour was added to your favourites");

    alert.showAndWait();
  }

  public void detailsDialog(String name) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    ButtonType showMap = new ButtonType("Show on map", ButtonBar.ButtonData.APPLY);
    alert.getButtonTypes().setAll(ButtonType.OK, showMap);
    alert.setHeaderText(String.format("More details for %s below", name));
    try {
      Tour tour = TourDAO.getTourByORMID(name);
      String details = String.format("Length: %s km\nDuration: %s h\nLocks: %s\nNight stays: %s", tour.getLength(), tour.getDuration(), tour.getLocks(), tour.getNightStays());
      alert.setContentText(details);
      Optional<ButtonType> result = alert.showAndWait();
      if(result.get() == showMap) showMap();
    } catch (PersistentException e) {
      e.printStackTrace();
    }
  }

  private void showMap() {
    ImageView graphic = new ImageView(new Image("https://www.leboat.de/sites/default/files/styles/lbt_compress_only/public/16thames-lb-map2_eng.png?itok=_vW7TFGb"));
    graphic.setFitHeight(322);
    graphic.setFitWidth(706);
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Map");
    alert.setHeaderText(null);
    alert.getDialogPane().setContent(graphic);
    alert.showAndWait();
  }
}
