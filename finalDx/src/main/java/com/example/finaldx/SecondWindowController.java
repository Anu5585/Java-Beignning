package com.example.finaldx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindowController {
    private HelloApplication main;

    @FXML
    private Label lblTitle;

    @FXML
    void secondButtonClicked(ActionEvent event) {
        System.out.println("second button clicked");
    }

    public void setMain(HelloApplication main) {
        this.main=main;
    }
}
