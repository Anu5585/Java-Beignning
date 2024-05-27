module com.example.myfx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfx1 to javafx.fxml;
    exports com.example.myfx1;
}