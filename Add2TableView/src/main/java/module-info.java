module com.example.add2tableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.add2tableview to javafx.fxml;
    exports com.example.add2tableview;
}