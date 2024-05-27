module com.example.jdbcmeaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jdbcmeaven to javafx.fxml;
    exports com.example.jdbcmeaven;
}