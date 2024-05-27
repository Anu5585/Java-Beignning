module com.example.mydropshadow {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mydropshadow to javafx.fxml;
    exports com.example.mydropshadow;
}