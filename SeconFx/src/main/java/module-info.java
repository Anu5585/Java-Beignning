module com.example.seconfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seconfx to javafx.fxml;
    exports com.example.seconfx;
}