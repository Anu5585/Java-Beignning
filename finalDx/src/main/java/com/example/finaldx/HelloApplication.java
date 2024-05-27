package com.example.finaldx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
    firstWindow();
       //secondWindow();
    }
    private void firstWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("firstWindowview.fxml"));
        VBox root = fxmlLoader.load();
        HelloController controller = fxmlLoader.getController();
        controller.setMain(this);
        Scene scene = new Scene(root, 320, 240);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void secondWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("secondWindowView.fxml"));
        AnchorPane root = fxmlLoader.load();
        SecondWindowController controller = fxmlLoader.getController();
        controller.setMain(this);
        Scene scene = new Scene(root, 320, 240);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}