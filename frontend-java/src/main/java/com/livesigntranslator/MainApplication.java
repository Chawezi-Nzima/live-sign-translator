package com.livesigntranslator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Live Sign Translator");

        Scene scene = new Scene(label, 800, 600);

        stage.setTitle("Live Sign Translator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
