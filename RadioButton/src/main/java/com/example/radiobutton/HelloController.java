package com.example.radiobutton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML

    private Label lblCheckBoxSelected;

    @FXML
    protected void onCheckBoxSelected(ActionEvent event) {
        RadioButton source = (RadioButton) event.getSource();

    }


}