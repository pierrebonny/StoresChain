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
