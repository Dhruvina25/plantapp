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
            Scene scene = new Scene(root);
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());       //(3)
            primaryStage.setScene(scene);
            primaryStage.setTitle("Plant Information App");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// old
//        Panel panel = new Panel("Plant Application");
//        panel.getStyleClass().add("panel-primary");                            //(2)
//        BorderPane content = new BorderPane();
//        content.setPadding(new Insets(20));
//        TextField textField = new TextField("Enter plant to search...");
//        textField.getStyleClass().setAll("lbl-info","h3","p-3");
//        Button button = new Button("Get Plant Info");
//        button.getStyleClass().setAll("btn","btn-primary","m-3");                     //(2)
//        content.setTop(textField);
//        content.setRight(button);
//        panel.setBody(content);
//        Scene scene = new Scene(panel);
