package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public interface EaSports { //set name here this methood is used to swap scenes
    public default void sceneSwap(ActionEvent event, String newScene) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(newScene +".fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), 1160, 500);
        stage.setScene(scene);
        stage.show();
    }


}

