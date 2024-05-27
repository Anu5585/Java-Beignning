module com.example.simplegui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplegui to javafx.fxml;
    exports com.example.simplegui;
}