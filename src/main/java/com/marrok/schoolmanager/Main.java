package com.marrok.schoolmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("views/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("SchoolPro");
        stage.setScene(scene);
        stage.show();
    }




    public static void main(String[] args) {
        launch();
    }
}