module com.javafx3d {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.javafx3d to javafx.fxml;
    exports com.javafx3d;
}
