package finalexam.task5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class CommunicationManager {

    // Method to send POST request
    public String sendPostRequest(String endpoint, Map<String, String> headers, String payload) {
        HttpURLConnection connection = null;
        try {
            // Create URL object
            URL url = new URL(endpoint);
            connection = (HttpURLConnection) url.openConnection();
            // Configure connection for POST
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            // Set headers
            for (Map.Entry<String, String> header : headers.entrySet()) {
                connection.setRequestProperty(header.getKey(), header.getValue());
            }

            // Log request details
            System.out.println("Request URL: " + endpoint);
            System.out.println("Request Headers: " + headers);
            System.out.println("Request Payload: " + payload);

            // Write payload
            try (OutputStream os = connection.getOutputStream();
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"))) {
                writer.write(payload);
                writer.flush();
            }

            // Get response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response
            StringBuilder response = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(responseCode >= 200 && responseCode < 300 ?
                            connection.getInputStream() : connection.getErrorStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }
            System.out.println("Response: " + response.toString());
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    // Example main method to demonstrate usage
    public static void main(String[] args) {
        CommunicationManager cm = new CommunicationManager();
        String endpoint = "https://jsonplaceholder.typicode.com/posts"; // Example endpoint for testing
        String payload = "{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}";
        Map<String, String> headers = Map.of("Content-Type", "application/json");

        String response = cm.sendPostRequest(endpoint, headers, payload);
        System.out.println("Final Response: " + response);
    }
}
