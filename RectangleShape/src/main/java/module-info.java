module com.example.rectangleshape {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.rectangleshape to javafx.fxml;
    exports com.example.rectangleshape;
}