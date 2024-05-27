package com.example.dobproject;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 320, 240);
        TextField idDOB = (TextField) root.lookup("#idDOB");
        Button button = (Button) root.lookup("#button");
        Label welcomeText = (Label) root.lookup("#welcomeText");
        welcomeText.textProperty().bind(idDOB.textProperty());

        button.setOnAction(event -> {
            String dateString = idDOB.getText();
            LocalDate date = convertToDate(dateString);
            LocalDate currentDate = LocalDate.now();
            if (date != null) {
                System.out.println("Converted Date: " + date);
                Period period = Period.between(date, currentDate);


                showAlert(Alert.AlertType.INFORMATION, "\"Age Calculator\"",
                        "Age: " + period.getYears() + " years, "
                                + period.getMonths() + " months, and "
                                + period.getDays() + " days.");
            } else {
                System.out.println("Invalid date format. Please enter in yyyy-MM-dd format.");
            }
        });


        stage.setTitle("   ");
        stage.setScene(scene);
        stage.show();


    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private LocalDate convertToDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            return null; // Return null if parsing fails
        }
    }


    public static void main(String[] args) {
        launch();
    }
}