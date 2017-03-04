package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by Pierre on 03/03/2017.
 */
public class HomeController {

    public HomeController(){
    }

    /**
     * Shows the home overview inside the root layout.
     */
    public void showHomeOverview(BorderPane rootLayout) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/homeView.fxml"));
            BorderPane personOverview = (BorderPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void changePicture(MouseEvent event,BorderPane rootlayout) {
       FXMLLoader loader1 = new FXMLLoader();
       loader1.setLocation(MainApp.class.getResource("/fxml/homeView.fxml"));
        try {
            BorderPane overview = (BorderPane) loader1.load();
            rootlayout.getCenter().setOnMouseClicked(new ImageView("images/deal.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
