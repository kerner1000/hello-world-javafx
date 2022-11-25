package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Tab1Controller implements Initializable {

    @FXML
    Button button1;

    Service1 service1 = new Service1();

    // How to get a reference, that is already initialized?
    @FXML
    ProgressAndStatusGridComponentController progressAndStatusGridComponentController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button1.disableProperty().bind(service1.runningProperty());
    }

    public void handleButtonClick(ActionEvent actionEvent) {
        service1.cancel();
        service1.reset();

//        progressAndStatusGridComponentController.progressBar.progressProperty().bind(service1.progressProperty());
//        progressAndStatusGridComponentController.progressLabel.textProperty().bind(service1.messageProperty());

        service1.start();
    }
}
