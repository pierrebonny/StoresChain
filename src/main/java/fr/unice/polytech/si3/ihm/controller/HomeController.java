package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

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

    private int count = 0;

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
            // Load overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/homeView.fxml"));
            BorderPane overview = (BorderPane) loader.load();
            // Set overview into the center of root layout.
            rootLayout.setCenter(overview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void carrousel(){
        int i = 0;
        if(i==0){
            carouselImage.setImage(new Image("/images/burger_friends.jpg"));
            i++;
        }
        else{
            carouselImage.setImage(new Image("/images/presentation_burger.jpg"));
            i--;
        }
    }

    @FXML
    void changePictureLeft(MouseEvent event) {
        carouselImage.setImage(new Image("/images/presentation_burger.jpg"));
    }

    @FXML
    void changePictureRight(MouseEvent event) {
        carouselImage.setImage(new Image("/images/burger_friends.jpg"));
    }
}
