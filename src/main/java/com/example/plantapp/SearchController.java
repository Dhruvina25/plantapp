package com.example.plantapp;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SearchController {
    @FXML
    BorderPane root;
    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;
    @FXML
    private TextArea resultArea;
    private final Gson gson = new Gson();

    @FXML
    private void initialize() {
//        root.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        searchButton.setOnAction(event -> {
            String query = searchField.getText();
            if (!query.isEmpty()) {
                String apiUrl = "YOUR_API_URL_HERE" + query; // Replace with your API endpoint
                try {
                    String jsonResponse = sendGet(apiUrl);
                    // Parse JSON response
                    // Example:
                    // YourResponseClass response = gson.fromJson(jsonResponse, YourResponseClass.class);
                    resultArea.setText(jsonResponse);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private String sendGet(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            throw new IOException("GET request failed with response code: " + responseCode);
        }
    }
}
