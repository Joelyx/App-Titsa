module com.example.tresvistas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.tresvistas.controller to javafx.fxml;
    exports com.example.tresvistas;
}