module com.example.myanchorpane {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myanchorpane to javafx.fxml;
    exports com.example.myanchorpane;
}