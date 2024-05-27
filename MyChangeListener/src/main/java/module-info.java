module com.example.mychangelistener {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mychangelistener to javafx.fxml;
    exports com.example.mychangelistener;
}