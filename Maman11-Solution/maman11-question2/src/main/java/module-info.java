module com.example.maman11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maman11 to javafx.fxml;
    exports com.example.maman11;
}