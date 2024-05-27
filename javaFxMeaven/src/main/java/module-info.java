module com.example.javafxmeaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmeaven to javafx.fxml;
    exports com.example.javafxmeaven;
}