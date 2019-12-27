package com.example.exchange;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestParser {

    public static JSONObject getJSONObjectFromURL(String urlString)// throws IOException, JSONException
    {


        BufferedReader br =null;
        StringBuilder sb = null;
        URL url = null;

        HttpURLConnection urlConnection = null;
        try {


            url = new URL("https://api.exchangeratesapi.io/latest?base=" + urlString);
        }

        catch(java.net.MalformedURLException e)
        {

        }


        try {
            urlConnection = (HttpURLConnection) url.openConnection();
        }
        catch (java.io.IOException e)
        {

        }
        try {
            urlConnection.setRequestMethod("GET");
        } catch (java.net.ProtocolException e) {

        }


        urlConnection.setReadTimeout(10000 /* milliseconds */);
        urlConnection.setConnectTimeout(15000 /* milliseconds */);
        urlConnection.setDoOutput(true);

        try {
            urlConnection.connect();
        }

        catch ( java.io.IOException e)
        {

        }
        try {
             br = new BufferedReader(new InputStreamReader(url.openStream()));
             sb = new StringBuilder();
        }
        catch (java.io.IOException e)
        {

        }
        String line;
        try {
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }

            br.close();
        } catch (java.io.IOException e) {

        }

        String jsonString = sb.toString();


        try {


            return new JSONObject(jsonString);
        } catch (org.json.JSONException e) {
            return null;
        }


    }
}