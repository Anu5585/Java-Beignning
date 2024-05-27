module org.example.bmibinding6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.bmibinding6 to javafx.fxml;
    exports org.example.bmibinding6;
}