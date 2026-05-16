package com.tsf.shell.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;

public class WeatherIconMapper {

    public static Bitmap getIconForCode(Context context, String weatherCode) {
        int iconId = mapCodeToAccuWeatherId(weatherCode);
        int resId = context.getResources().getIdentifier(
                "ic_accuweather_tablet_" + iconId, "raw", context.getPackageName());
        if (resId == 0) {
            resId = context.getResources().getIdentifier("unknown", "raw", context.getPackageName());
        }
        try (InputStream is = context.getResources().openRawResource(resId)) {
            return BitmapFactory.decodeStream(is);
        } catch (Exception e) {
            return null;
        }
    }

    private static int mapCodeToAccuWeatherId(String wwoCode) {
        if (wwoCode == null || wwoCode.isEmpty()) return -1;
        try {
            int code = Integer.parseInt(wwoCode);
            switch (code) {
                case 113: return 32;  // Sunny
                case 116: return 34;  // Partly Cloudy
                case 119: return 35;  // Cloudy
                case 122: return 35;  // Overcast
                case 143: return 31;  // Mist
                case 176: return 12;  // Patchy rain nearby
                case 179: return 16;  // Patchy snow nearby
                case 182: return 5;   // Patchy sleet nearby
                case 185: return 8;   // Patchy freezing drizzle nearby
                case 200: return 15;  // Thundery outbreaks
                case 227: return 16;  // Blowing snow
                case 230: return 16;  // Blizzard
                case 248: return 31;  // Fog
                case 260: return 31;  // Freezing fog
                case 263: return 12;  // Patchy light drizzle
                case 266: return 12;  // Light drizzle
                case 281: return 8;   // Freezing drizzle
                case 284: return 8;   // Heavy freezing drizzle
                case 293: return 12;  // Patchy light rain
                case 296: return 13;  // Light rain
                case 299: return 13;  // Moderate rain at times
                case 302: return 14;  // Heavy rain
                case 305: return 14;  // Heavy rain at times
                case 308: return 14;  // Very heavy rain
                case 311: return 5;   // Light rain with snow
                case 314: return 5;   // Moderate/heavy rain with snow
                case 317: return 5;   // Light sleet
                case 320: return 5;   // Moderate/heavy sleet
                case 323: return 16;  // Patchy light snow
                case 326: return 16;  // Light snow
                case 329: return 17;  // Patchy moderate snow
                case 332: return 17;  // Moderate snow
                case 335: return 17;  // Patchy heavy snow
                case 338: return 17;  // Heavy snow
                case 350: return 8;   // Ice pellets
                case 353: return 12;  // Light rain shower
                case 356: return 14;  // Moderate/heavy rain shower
                case 359: return 14;  // Torrential rain shower
                case 362: return 5;   // Light sleet showers
                case 365: return 5;   // Moderate/heavy sleet showers
                case 368: return 16;  // Light snow showers
                case 371: return 17;  // Moderate/heavy snow showers
                case 374: return 8;   // Light ice pellets showers
                case 377: return 8;   // Moderate/heavy ice pellets showers
                case 386: return 15;  // Patchy light rain with thunder
                case 389: return 15;  // Moderate/heavy rain with thunder
                case 392: return 15;  // Patchy light snow with thunder
                case 395: return 15;  // Moderate/heavy snow with thunder
                default: return -1;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
