module com.example.mylistenerbind {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mylistenerbind to javafx.fxml;
    exports com.example.mylistenerbind;
}