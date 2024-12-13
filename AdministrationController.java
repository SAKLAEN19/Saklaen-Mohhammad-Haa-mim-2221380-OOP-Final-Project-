package com.example.administration_saklaenhaamim_2221380;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministrationController {

    // Button declarations
    @FXML
    private Button createUserButton;

    @FXML
    private Button editUserButton;

    @FXML
    private Button deleteUserButton;

    @FXML
    private Button feedbackAnalysisButton;

    @FXML
    private Button qualityChecklistButton;

    @FXML
    private Button searchUserButton;

    @FXML
    private Button updateServiceButton;

    @FXML
    private Button deleteServiceButton;

    private void openNewWindow(String fxmlFile, Button button) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(fxmlLoader.load());
            Stage currentStage = (Stage) button.getScene().getWindow();
            currentStage.setScene(scene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void handleCreateUserButton(ActionEvent event) {

        try {
            // Load CreateUser.fxml file
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateUser.fxml"));
            Scene createUserScene = new Scene(fxmlLoader.load());

            // Get the current stage and set the new scene
            Stage currentStage = (Stage) createUserButton.getScene().getWindow();
            currentStage.setScene(createUserScene);
            currentStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading CreateUser.fxml.");
        }
    }

    @Deprecated
    public void handleEditUserButton(ActionEvent event) {
        openNewWindow("EditUser.fxml", editUserButton);
    }

    @Deprecated
    public void handleDeleteUserButton(ActionEvent event) {
        openNewWindow("DeleteUser.fxml", deleteUserButton);
    }

    @Deprecated
    public void handleFeedbackAnalysisButton(ActionEvent event) {
        openNewWindow("FeedbackAnalysis.fxml", feedbackAnalysisButton);
    }

    @Deprecated
    public void handleQualityChecklistButton(ActionEvent event) {
        openNewWindow("QualityChecklist.fxml", qualityChecklistButton);
    }

    @Deprecated
    public void handleSearchUserButton(ActionEvent event) {
        openNewWindow("SearchUser.fxml", searchUserButton);
    }

    @Deprecated
    public void handleUpdateServiceButton(ActionEvent event) {
        openNewWindow("UpdateService.fxml", updateServiceButton);
    }

    @Deprecated
    public void handleDeleteServiceButton(ActionEvent event) {
        openNewWindow("DeleteService.fxml", deleteServiceButton);
    }
}
