package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by Pierre on 03/03/2017.
 */
public class HomeController {

    @FXML
    private BorderPane rootContainer;

    @FXML
    private ImageView carouselImage;

    @FXML
    private ImageView previousImage;

    @FXML
    private ImageView nextImage;

    public HomeController() {
        rootContainer = new BorderPane();
        nextImage = new ImageView();
        previousImage = new ImageView();
        carouselImage = new ImageView();
    }

    /**
     * Shows the home overview inside the root layout.
     */
    public void showHomeOverview(BorderPane rootLayout) {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/homeView.fxml"));
            BorderPane overview = (BorderPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(overview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void changePicture(MouseEvent event) {
        carouselImage.setImage(new Image("/images/boisson.png"));
    }
}
