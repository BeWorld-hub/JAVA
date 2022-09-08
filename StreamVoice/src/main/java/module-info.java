module com.streamvoice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.streamvoice to javafx.fxml;
    exports com.streamvoice;
}