module com.authentication {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.authentication to javafx.fxml;
    exports com.authentication;
}
