// Example JavaFX skeleton code
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class PlantApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Plant Information App");

        // UI components
        TextField plantNameInput = new TextField();
        Label plantInfoLabel = new Label();

        Button getInfoButton = new Button("Get Plant Info");
        getInfoButton.setOnAction(e -> {
            String plantName = plantNameInput.getText();
            //  Make API call to Trefle API with the plantName
            // Parse the JSON response and update plantInfoLabel
            // Example: plantInfoLabel.setText("Common Name: ...");
        });

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(plantNameInput, getInfoButton, plantInfoLabel);
        Scene scene = new Scene(root, 400, 200);

        // Apply CSS styling
        scene.getStylesheets().add("styles.css"); //

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

