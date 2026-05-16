package com.tsf.shell.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Tsf3DWidget {

    public static final int TYPE_CLOCK = 0;
    public static final int TYPE_WEATHER = 1;
    public static final int TYPE_DATE = 2;

    public interface UpdateListener {
        void onUpdated(Bitmap bitmap);
    }

    public static Bitmap renderClock(int width, int height, int hour, int minute) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(0xFFFFFFFF);
        paint.setTextSize(height * 0.4f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.DEFAULT_BOLD);

        String time = String.format("%02d:%02d", hour, minute);
        canvas.drawText(time, width / 2f, height * 0.5f, paint);

        paint.setTextSize(height * 0.12f);
        paint.setTypeface(Typeface.DEFAULT);
        String date = DateFormat.getDateInstance().format(new Date());
        canvas.drawText(date, width / 2f, height * 0.7f, paint);
        return bmp;
    }

    public static Bitmap renderWeather(int width, int height, String temp, String condition) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(0xFFFFFFFF);
        paint.setTextSize(height * 0.35f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.DEFAULT_BOLD);

        canvas.drawText(temp, width / 2f, height * 0.45f, paint);

        paint.setTextSize(height * 0.12f);
        paint.setTypeface(Typeface.DEFAULT);
        if (condition != null) {
            canvas.drawText(condition, width / 2f, height * 0.65f, paint);
        }
        return bmp;
    }

    public static void startClockUpdates(Context context, int width, int height, UpdateListener listener) {
        IntentFilter filter = new IntentFilter(Intent.ACTION_TIME_TICK);
        filter.addAction(Intent.ACTION_TIME_CHANGED);
        filter.addAction(Intent.ACTION_TIMEZONE_CHANGED);
        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context ctx, Intent intent) {
                java.util.Calendar cal = java.util.Calendar.getInstance();
                Bitmap bmp = renderClock(width, height,
                        cal.get(java.util.Calendar.HOUR_OF_DAY),
                        cal.get(java.util.Calendar.MINUTE));
                if (listener != null) listener.onUpdated(bmp);
            }
        };
        context.registerReceiver(receiver, filter);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        Bitmap bmp = renderClock(width, height,
                cal.get(java.util.Calendar.HOUR_OF_DAY),
                cal.get(java.util.Calendar.MINUTE));
        if (listener != null) listener.onUpdated(bmp);
    }

    public static void startWeatherUpdates(int width, int height, String location, UpdateListener listener) {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        Runnable fetchTask = () -> {
            WeatherClient.fetchWeather(location, new WeatherClient.WeatherCallback() {
                @Override
                public void onResult(WeatherClient.WeatherResult result) {
                    if (listener != null) {
                        Bitmap bmp = renderWeather(width, height, result.temperature, result.condition);
                        listener.onUpdated(bmp);
                    }
                }

                @Override
                public void onError(String error) {
                    if (listener != null) {
                        Bitmap bmp = renderWeather(width, height, "--°C", "error");
                        listener.onUpdated(bmp);
                    }
                }
            });
        };
        fetchTask.run();
        scheduler.scheduleAtFixedRate(fetchTask, 30, 30, TimeUnit.MINUTES);
    }
}