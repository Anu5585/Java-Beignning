module com.example.myjavafxbean {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myjavafxbean to javafx.fxml;
    exports com.example.myjavafxbean;
}