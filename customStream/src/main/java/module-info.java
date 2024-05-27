module com.example.customstream {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customstream to javafx.fxml;
    exports com.example.customstream;
}