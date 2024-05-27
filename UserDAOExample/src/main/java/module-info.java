module com.example.userdaoexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.userdaoexample to javafx.fxml;
    exports com.example.userdaoexample;
    exports com.example.userdaoexample.util;
    opens com.example.userdaoexample.util to javafx.fxml;
    exports com.example.userdaoexample.controller;
    opens com.example.userdaoexample.controller to javafx.fxml;
}