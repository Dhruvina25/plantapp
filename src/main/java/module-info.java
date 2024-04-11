module com.example.plantapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens com.example.plantapp to javafx.fxml;
    exports com.example.plantapp;
}