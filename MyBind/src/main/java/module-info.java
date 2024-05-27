module com.example.mybind {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mybind to javafx.fxml;
    exports com.example.mybind;
}