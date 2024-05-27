module com.example.myjavafxbean2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myjavafxbean2 to javafx.fxml;
    exports com.example.myjavafxbean2;
}