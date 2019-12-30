package com.example.exchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class ExchangeRate {


    public static double getRate(String StartCurrency, String EndCurrency) {
        String JsonCompleteRequest = null;
        try {
            JsonCompleteRequest = RequestParser.getJSONObjectFromURL(StartCurrency).getString("rates").toLowerCase().replace("try", "_try");
        } catch (JSONException e) {
            e.printStackTrace();
        }


        ObjectMapper mapper = new ObjectMapper();
        Rates c = null;
        try {
            c = mapper.readValue(JsonCompleteRequest.toString(), Rates.class);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Method method = c.getClass().getMethod("get" + (EndCurrency.substring(0, 1)).toUpperCase() + EndCurrency.substring(1, 3).toLowerCase());
            return (double) method.invoke(c);
        } catch (SecurityException e) {

        } catch (NoSuchMethodException e) {

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return 1;
    }

}


