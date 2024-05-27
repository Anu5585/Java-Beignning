package com.example.seconfx;

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
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


}