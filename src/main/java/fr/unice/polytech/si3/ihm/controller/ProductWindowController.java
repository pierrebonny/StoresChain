package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pierre on 03/03/2017.
 */
public class ProductWindowController {

    @FXML
    private Label labelGrid1 = new Label();

    @FXML
    private ImageView imageGrid1 = new ImageView();

    @FXML
    private ImageView imageGrid = new ImageView();

    @FXML
    private Label labelGrid = new Label();

    @FXML
    private ImageView imageGrid3 = new ImageView();

    @FXML
    private Label labelGrid2 = new Label();

    @FXML
    private ImageView imageGrid4 = new ImageView();

    @FXML
    private Label labelGrid4 = new Label();

    @FXML
    private Label labelGrid3 = new Label();

    @FXML
    private ImageView imageGrid2 = new ImageView();

    @FXML
    private ImageView imageGrid5 = new ImageView();

    @FXML
    private Label labelGrid5 = new Label();

    @FXML
    private ImageView imageGrid6 = new ImageView();

    @FXML
    private Label labelGrid6 = new Label();

    @FXML
    private ImageView imageGrid7 = new ImageView();

    @FXML
    private Label labelGrid7 = new Label();

    @FXML
    private ImageView imageGrid8 = new ImageView();

    @FXML
    private Label labelGrid8 = new Label();

    public ProductWindowController(){
    }

    /**
     * Shows the home overview inside the root layout.
     */
    public void showProductOverview(BorderPane rootLayout) {
        try {
            // Load overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/productsWindow.fxml"));
            BorderPane overview = (BorderPane) loader.load();

            // Set overview into the center of root layout.
            rootLayout.setCenter(overview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void openBoissons(ActionEvent event) {
        setAllComponants("/images/boisson.png","Boisson X : Y€");
    }

    @FXML
    void openBonPlans(ActionEvent event) {
        setAllComponants("/images/label-2016248_1280.png","Bon Plan X");
    }

    @FXML
    void openDesserts(ActionEvent event) {
        setAllComponants("/images/popsicle-154321_1280.png","Dessert X : Y€");
    }

    @FXML
    void openEntrees(ActionEvent event) {
        setAllComponants("/images/entrée.png","Entrée X : Y€");
    }

    @FXML
    void openMenus(ActionEvent event) {
        setAllComponants("/images/fast-food.png","Menu X : Y€");
    }

    @FXML
    void openPlats(ActionEvent event) {
        setAllComponants("/images/fast-food.png","Plat X : Y€");
    }

    public void setAllComponants(String imageUrl,String text){
        imageGrid.setImage(new Image(imageUrl));
        labelGrid.setText(text);
        imageGrid1.setImage(new Image(imageUrl));
        labelGrid1.setText(text);
        imageGrid2.setImage(new Image(imageUrl));
        labelGrid2.setText(text);
        imageGrid3.setImage(new Image(imageUrl));
        labelGrid3.setText(text);
        imageGrid4.setImage(new Image(imageUrl));
        labelGrid4.setText(text);
        imageGrid5.setImage(new Image(imageUrl));
        labelGrid5.setText(text);
        imageGrid6.setImage(new Image(imageUrl));
        labelGrid6.setText(text);
        imageGrid7.setImage(new Image(imageUrl));
        labelGrid7.setText(text);
        imageGrid8.setImage(new Image(imageUrl));
        labelGrid8.setText(text);
    }

}
