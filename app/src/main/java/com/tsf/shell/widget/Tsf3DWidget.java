package com.tsf.shell.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class Tsf3DWidget {

    public static final int TYPE_CLOCK = 0;
    public static final int TYPE_WEATHER = 1;
    public static final int TYPE_DATE = 2;

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
        String date = java.text.DateFormat.getDateInstance().format(new java.util.Date());
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
}
