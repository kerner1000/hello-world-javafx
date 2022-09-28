package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    public Label helloWorldLabel;
    public TextField inputYourName;
    public Button buttonGo;
    @SuppressWarnings("unused")
    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorldLabel.setText("Hello " + inputYourName.getText().trim() + "!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonGo.disableProperty().bind(inputYourName.textProperty().isEmpty());
    }
}
