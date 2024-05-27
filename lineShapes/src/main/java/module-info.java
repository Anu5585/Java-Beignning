module com.example.lineshapes {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lineshapes to javafx.fxml;
    exports com.example.lineshapes;
}