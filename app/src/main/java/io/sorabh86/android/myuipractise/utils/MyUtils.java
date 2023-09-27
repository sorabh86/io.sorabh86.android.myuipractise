package io.sorabh86.android.myuipractise.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Author: sorabh86 <sorabh86.github.io> 26-09-2023
 */
public class MyUtils {

    public static String fetchHttp(String uri) {
        try {
            URL url = new URL(uri);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();

            if(responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in  = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                return response.toString();
            } else {
                return "Error(R): "+responseCode;
            }

        } catch (Exception e) {
//            return e.toString();
            return "Error(E): "+ e.getMessage();
        }
    }
}
