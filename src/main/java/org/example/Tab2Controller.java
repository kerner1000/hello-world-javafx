package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Tab2Controller implements Initializable {

    @FXML
    Button button2;

    Service2 service2 = new Service2();

    // How to get a reference, that is already initialized?
    @FXML
    ProgressAndStatusGridComponentController progressAndStatusGridComponentController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button2.disableProperty().bind(service2.runningProperty());
    }

    public void handleButtonClick(ActionEvent actionEvent) {
        service2.cancel();
        service2.reset();

//        progressAndStatusGridComponentController.progressBar.progressProperty().bind(service2.progressProperty());
//        progressAndStatusGridComponentController.progressLabel.textProperty().bind(service2.messageProperty());

        service2.start();
    }
}
