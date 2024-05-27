module com.example.mystackpane {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mystackpane to javafx.fxml;
    exports com.example.mystackpane;
}