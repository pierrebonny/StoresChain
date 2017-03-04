package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by Pierre on 03/03/2017.
 */
public class ProductWindowController {

    public ProductWindowController(){

    }
    /**
     * Shows the home overview inside the root layout.
     */
    public void showProductOverview(BorderPane rootLayout,String url) {
        try {
            // Load overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(url));
            BorderPane overview = (BorderPane) loader.load();

            // Set overview into the center of root layout.
            rootLayout.setCenter(overview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openBoissons(MouseEvent event,BorderPane rootLayout) {
        showProductOverview(rootLayout,"boissonWindow.fxml");
    }

    @FXML
    void openBonPlans(MouseEvent event) {

    }

    @FXML
    void openDesserts(MouseEvent event) {

    }

    @FXML
    void openEntrees(MouseEvent event) {

    }

    @FXML
    void openMenus(MouseEvent event) {

    }

    @FXML
    void openPlats(MouseEvent event) {

    }

}
