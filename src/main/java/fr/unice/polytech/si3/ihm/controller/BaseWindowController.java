package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
        loader.setLocation(MainApp.class.getResource("/fxml/dessertWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openEntrees(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/entréesWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openMenus(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/productMenuWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openPlats(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/productPlatsWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openBonPlans(Event event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/bonPlansWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openBoissons(Event event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/boissonWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void goToWelcomeWindow(MouseEvent mouseEvent) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/homeView.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openJoinUs(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/candidatureWindow.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openMap(Event event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/map.fxml"));
        try {
            BorderPane overview = (BorderPane) loader.load();
            rootContainer.setCenter(overview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
