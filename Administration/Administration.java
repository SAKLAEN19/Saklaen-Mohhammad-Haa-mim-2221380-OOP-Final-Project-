package com.example.administration_saklaenhaamim_2221380;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Administration extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the Administration.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(Administration.class.getResource("Administration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 620); // Adjust dimensions as necessary

            // Set the stage properties
            primaryStage.setTitle("Administration Dashboard");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading Administration.fxml: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(); // Launch the JavaFX application
    }
}
