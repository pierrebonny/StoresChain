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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    private List<Label> labels = new ArrayList<>();
    private List<ImageView> images = new ArrayList<>();

    public ProductWindowController(){
        labels.add(0,labelGrid);
        labels.add(1,labelGrid1);
        labels.add(2,labelGrid2);
        labels.add(3,labelGrid3);
        labels.add(4,labelGrid4);
        labels.add(5,labelGrid5);
        labels.add(6,labelGrid6);
        labels.add(7,labelGrid7);
        labels.add(8,labelGrid8);
        images.add(0,imageGrid);
        images.add(1,imageGrid1);
        images.add(2,imageGrid2);
        images.add(3,imageGrid3);
        images.add(4,imageGrid4);
        images.add(5,imageGrid5);
        images.add(6,imageGrid6);
        images.add(7,imageGrid7);
        images.add(8,imageGrid8);
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
        setAllComponants("/images/label-2016248_1280.png","Bon Plan X : Y€");
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

    @FXML
    void bas(MouseEvent event) {
        //TODO
    }

    @FXML
    void haut(MouseEvent event) {
        //TODO
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
