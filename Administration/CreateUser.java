package com.example.administration_saklaenhaamim_2221380;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateUser extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CreateUser.class.getResource("CreateUser.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 700, 550); // Set width and height as required

            primaryStage.setTitle("Create a User");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading CreateUser.fxml: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
