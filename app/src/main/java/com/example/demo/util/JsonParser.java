package com.example.demo.util;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonParser {
    public static String parseTextValue(String jsonString) {
        try {
            // Parse the JSON string
            JSONObject jsonObject = new JSONObject(jsonString);

            // Extract the value of the "text" field
            return jsonObject.getString("text");
        } catch (JSONException e) {
            // Handle JSON parsing exceptions
            e.printStackTrace();
            return null; // Or throw an exception or handle accordingly based on your requirements
        }
    }

}
