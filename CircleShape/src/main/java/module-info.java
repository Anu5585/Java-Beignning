module com.example.circleshape {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.circleshape to javafx.fxml;
    exports com.example.circleshape;
}