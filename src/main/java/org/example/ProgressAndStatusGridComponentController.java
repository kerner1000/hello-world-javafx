
package org.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgressAndStatusGridComponentController implements Initializable {

    @FXML
    ProgressBar progressBar;

    @FXML
    HBox progressStatusBox;

    @FXML
    Label progressLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }


}
