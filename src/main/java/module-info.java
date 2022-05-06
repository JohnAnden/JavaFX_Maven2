module com.example.javafx_maven2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_maven2 to javafx.fxml;
    exports com.example.javafx_maven2;
}