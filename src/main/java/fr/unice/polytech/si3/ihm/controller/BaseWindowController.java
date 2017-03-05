package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by Pierre on 04/03/2017.
 */
public class BaseWindowController {

    @FXML
    private BorderPane rootContainer = new BorderPane();

    @FXML
    private ImageView homeViewImage = new ImageView();

    @FXML
    private Label homeViewLabel = new Label();

    @FXML
    private Menu topMenuProduct;

    @FXML
    private MenuItem productMenuView = new MenuItem();

    @FXML
    private MenuItem productStarterView = new MenuItem();

    @FXML
    private MenuItem productMealView = new MenuItem();

    @FXML
    private MenuItem productFinisherView = new MenuItem();

    @FXML
    private Label productView = new Label();

    @FXML
    private Label aboutView = new Label();

    @FXML
    private Label topMenuDiscounts = new Label();

    @FXML
    private Hyperlink contactView = new Hyperlink();

    @FXML
    private Hyperlink mentionsView = new Hyperlink();

    public BaseWindowController(){
    }

    @FXML
    void openDesserts(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/productsWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openEntrees(ActionEvent event) {

    }

    @FXML
    void openMenus(ActionEvent event) {

    }

    @FXML
    void openPlats(ActionEvent event) {

    }
}
