module com.example.dobproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dobproject to javafx.fxml;
    exports com.example.dobproject;
}