package de.hhn.pmt.thames.view.thameswebsite;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
    primaryStage.initStyle(StageStyle.DECORATED);

    primaryStage.setScene(new Scene(root, 1200, 700));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}


