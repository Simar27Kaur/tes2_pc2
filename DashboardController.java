package com.example.test2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {


    public Label Test;

    public void Logoutclick(ActionEvent actionEvent) {

        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("Login");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) Test.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void userclick(ActionEvent actionEvent) {

        try {
            Parent secondScene = FXMLLoader.load(getClass().getResource("User.fxml"));

            Stage secondStage = new Stage();
            secondStage.setTitle("User");
            secondStage.setScene(new Scene(secondScene));
            Stage firstSceneStage = (Stage) Test.getScene().getWindow();
            firstSceneStage.close();


            secondStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}