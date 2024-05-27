module com.example.mybindbidirectional {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mybindbidirectional to javafx.fxml;
    exports com.example.mybindbidirectional;
}