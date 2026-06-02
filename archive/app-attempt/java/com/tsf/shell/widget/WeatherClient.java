package com.tsf.shell.widget;

import android.os.Handler;
import android.os.Looper;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WeatherClient {

    private static final String API_URL = "https://wttr.in/%s?format=j1&lang=en";
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static String lastLocation = "";

    public static class WeatherResult {
        public final String temperature;
        public final String condition;
        public final String iconCode;

        WeatherResult(String temperature, String condition, String iconCode) {
            this.temperature = temperature;
            this.condition = condition;
            this.iconCode = iconCode;
        }
    }

    public interface WeatherCallback {
        void onResult(WeatherResult result);
        void onError(String error);
    }

    public static void fetchWeather(String location, WeatherCallback callback) {
        lastLocation = location;
        executor.execute(() -> {
            try {
                String urlStr = String.format(API_URL, location.isEmpty() ? "auto:ip" : location);
                URL url = new URL(urlStr);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(8000);
                conn.setReadTimeout(8000);

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                reader.close();

                WeatherResult result = parseWeatherJson(sb.toString());
                if (result != null) {
                    mainHandler.post(() -> callback.onResult(result));
                } else {
                    mainHandler.post(() -> callback.onError("Parse failed"));
                }
            } catch (Exception e) {
                mainHandler.post(() -> callback.onError(e.getMessage()));
            }
        });
    }

    private static WeatherResult parseWeatherJson(String json) {
        try {
            JSONObject root = new JSONObject(json);
            JSONArray currentConditions = root.getJSONArray("current_condition");
            if (currentConditions.length() == 0) return null;

            JSONObject current = currentConditions.getJSONObject(0);
            String temp = current.optString("temp_C", "--") + "°C";
            String condition = current.optJSONArray("lang_en")
                    .optJSONObject(0)
                    .optString("value", "");
            String iconCode = current.optString("weatherCode", "");

            return new WeatherResult(temp, condition, iconCode);
        } catch (Exception e) {
            return null;
        }
    }
}
