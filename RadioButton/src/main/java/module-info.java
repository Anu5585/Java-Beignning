module com.example.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.radiobutton to javafx.fxml;
    exports com.example.radiobutton;
    exports jb;
    opens jb to javafx.fxml;

}