module com.example.myshadow {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myshadow to javafx.fxml;
    exports com.example.myshadow;
}