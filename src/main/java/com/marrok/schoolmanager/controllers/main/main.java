package com.marrok.schoolmanager.controllers.main;

import com.marrok.schoolmanager.Main;
import com.marrok.schoolmanager.util.GeneralUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class main {

    public void goDashboard(ActionEvent actionEvent) {
        loadScene("views/dashboard.fxml",actionEvent);
    }

    private void loadScene(String resourcePath, ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(main.class.getClass().getResource(resourcePath));
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.setCursor(Cursor.HAND);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, "Error loading scene: " + resourcePath, ex);
            GeneralUtil.showAlert(Alert.AlertType.ERROR,"Error", "Could not load the requested scene. Please try again later.");

        }
    }
}