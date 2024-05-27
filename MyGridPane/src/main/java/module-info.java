module com.example.mygridpane {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mygridpane to javafx.fxml;
    exports com.example.mygridpane;
}