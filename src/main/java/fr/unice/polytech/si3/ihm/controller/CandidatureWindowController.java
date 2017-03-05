package fr.unice.polytech.si3.ihm.controller;

import fr.unice.polytech.si3.ihm.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

/**
 * Created by Pierre on 05/03/2017.
 */
public class CandidatureWindowController {

    @FXML
    public BorderPane rootContainer = new BorderPane();
    private ObservableList<String> studiesOptions =
            FXCollections.observableArrayList(
                    "Under Bac",
                    "Bac",
                    "Bac+2",
                    "Bac+3",
                    "Bac+5",
                    "Bac+7"
            );

    private ObservableList<String> positionOptions =
            FXCollections.observableArrayList(
                    "Waiter",
                    "Cook",
                    "Order Picker",
                    "Franchise Director",
                    "Cleaning Guy"
            );

    private ObservableList<String> mobilityOptions =
            FXCollections.observableArrayList(
                    "my department",
                    "my region",
                    "France",
                    "no matter"
            );

    @FXML
    private ComboBox<String> studiesComboBox = new ComboBox<>();

    @FXML
    private ComboBox<String> positionComboBox = new ComboBox<>();

    @FXML
    private ComboBox<String> mobilityComboBox = new ComboBox<>();

    @FXML
    private Button submitButton = new Button();

    public CandidatureWindowController(){

    }

    public void start(){
        mobilityComboBox.setItems(mobilityOptions);
        studiesComboBox.setItems(studiesOptions);
        positionComboBox.setItems(positionOptions);
    }

    @FXML
    void thankYou(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/fxml/thankYouWindow.fxml"));
        try {
            AnchorPane overview = (AnchorPane) loader.load();
            rootContainer.setCenter(overview);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
