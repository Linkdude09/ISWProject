module com.example.iswproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.iswproject to javafx.fxml;
    exports com.example.iswproject;
}