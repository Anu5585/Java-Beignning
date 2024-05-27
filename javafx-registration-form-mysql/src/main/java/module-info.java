module com.example.javafxregistrationformmysql {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxregistrationformmysql to javafx.fxml;
    exports com.example.javafxregistrationformmysql;
}