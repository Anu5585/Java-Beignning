module com.example.myinvalidationlistener {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myinvalidationlistener to javafx.fxml;
    exports com.example.myinvalidationlistener;
}