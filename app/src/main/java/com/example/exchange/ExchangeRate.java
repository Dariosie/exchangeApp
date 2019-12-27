package com.example.exchange;
import org.json.JSONException;
import org.json.JSONObject;


public class ExchangeRate
{


    public static double getRate(String StartCurrency, String EndCurrency)
    {
        JSONObject JsonCompleteRequest = null;
        JsonCompleteRequest = RequestParser.getJSONObjectFromURL(StartCurrency);
        String rateInString ="";


        try
            {
                 Object allRates = JsonCompleteRequest.get("rates");

                 rateInString = allRates.toString().substring(allRates.toString().lastIndexOf(EndCurrency)+5 ,allRates.toString().lastIndexOf(EndCurrency)+11);
            }

        catch (JSONException e)
        {}
   return Double.parseDouble(rateInString) ;}
}
