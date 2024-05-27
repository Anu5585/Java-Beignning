module com.example.finaldx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finaldx to javafx.fxml;
    exports com.example.finaldx;
}