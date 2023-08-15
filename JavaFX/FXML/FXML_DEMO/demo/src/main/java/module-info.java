module com.fxml.basic {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fxml.basic to javafx.fxml;
    exports com.fxml.basic;
}
