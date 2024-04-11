package com.example.plantapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;
import java.io.IOException;

public class PlantApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("search-view.fxml"));
            BorderPane root = loader.load();
//            root.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Plant Information App");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
