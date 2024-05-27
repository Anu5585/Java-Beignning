package com.example.firstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    HelloApplication main;

    public void setMain(HelloApplication main) {
        this.main = main;
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClickK() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}