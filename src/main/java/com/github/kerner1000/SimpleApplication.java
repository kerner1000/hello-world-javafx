package com.github.kerner1000;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SimpleApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(buildScene());
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(200);
        primaryStage.show();
    }

    private static Scene buildScene() {
        Label helloWorldLabel = new Label("Hello world!");
        helloWorldLabel.setAlignment(Pos.CENTER);
        Scene primaryScene = new Scene(helloWorldLabel);
        return primaryScene;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
