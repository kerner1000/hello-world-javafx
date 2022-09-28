package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    public Label helloWorldLabel;
    public TextField inputYourName;
    public Button buttonGo;
    public AnotherComponentController anotherComponentController;
    public HBox anotherComponent;

    @SuppressWarnings("unused")
    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorldLabel.setText("Hello " + inputYourName.getText().trim() + "!");
        anotherComponentController.anotherComponentLabel.setText("Hello " + inputYourName.getText().trim() + " from another component!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttonGo.disableProperty().bind(inputYourName.textProperty().isEmpty());
    }
}
