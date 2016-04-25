package br.com.vorticeit.sunshine.parsers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vorticepc on 24-Apr-16.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
        throws JSONException{

        JSONObject jsonObject = new JSONObject(weatherJsonStr);
        JSONArray jsonArray = jsonObject.getJSONArray("list");

        double maxTemp = jsonArray.getJSONObject(dayIndex).getJSONObject("temp").getDouble("nax");

        return maxTemp;
    }
}
