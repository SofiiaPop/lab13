package ua.edu.ucu.apps.Task3;

import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {
    private static final String API_KEY = "";
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=ucu.edu.ua");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        @SuppressWarnings("resource")
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        JSONObject jsonObject = new JSONObject(text);
        System.out.println(jsonObject);
    }
    public static String getCompanyInfo(String companyName) {
        try {
            URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + companyName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", API_KEY);
            connection.connect();
            
            @SuppressWarnings("resource")
            String response = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
            JSONObject jsonObject = new JSONObject(response);
            return jsonObject.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to retrieve PDL data";
        }
    }
}
