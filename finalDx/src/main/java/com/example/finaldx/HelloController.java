package com.example.finaldx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    private HelloApplication main;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtName;

    public void setMain(HelloApplication main) {
        this.main = main;
    }

    @FXML
    protected void onHelloButtonClick() throws IOException {
       // welcomeText.setText("Welcome "+txtName.getText());
        main.secondWindow();
    }
}