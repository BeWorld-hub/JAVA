package com.streamvoice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import scripts.streamvoice.Scripts;

public class MainApplication extends Application {
    Scripts scripts = new Scripts();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader;

        if (scripts.isConnection()) {
            fxmlLoader = new FXMLLoader(getClass().getResource("StartScene.fxml"));
        }
        else {
            fxmlLoader = new FXMLLoader(getClass().getResource("ConnectionErrorScene.fxml"));

        }


        Scene scene = new Scene(fxmlLoader.load(), 1000, 500);
        stage.setTitle("Stream Voice");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}