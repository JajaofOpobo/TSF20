package com.tsf.shell.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class TsfExclusiveWidgets {

    public static Bitmap renderMemo(Context context, int width, int height, String text) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xFFFFF9C4);
        canvas.drawRoundRect(0, 0, width, height, 12 * density, 12 * density, bg);

        Paint linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(0x33FFB300);
        linePaint.setStrokeWidth(1 * density);
        for (int y = (int) (40 * density); y < height; y += (int) (28 * density)) {
            canvas.drawLine(16 * density, y, width - 16 * density, y, linePaint);
        }

        Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xDE333333);
        textPaint.setTextSize(14 * density);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.NORMAL));
        textPaint.setAntiAlias(true);

        String content = (text != null && !text.isEmpty()) ? text : "Write your memo here...";
        String[] lines = content.split("\n");
        float y = 36 * density;
        for (int i = 0; i < Math.min(lines.length, 6); i++) {
            canvas.drawText(lines[i], 20 * density, y, textPaint);
            y += 28 * density;
        }
        return bmp;
    }

    public static Bitmap renderMusic(Context context, int width, int height, String song, String artist) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xFF263238);
        canvas.drawRoundRect(0, 0, width, height, 12 * density, 12 * density, bg);

        Paint accent = new Paint(Paint.ANTI_ALIAS_FLAG);
        accent.setColor(0xFF00E5FF);

        canvas.drawCircle(width / 2f, height * 0.35f, width * 0.18f, accent);
        Paint icon = new Paint(Paint.ANTI_ALIAS_FLAG);
        icon.setColor(0xFF263238);
        icon.setTextSize(width * 0.15f);
        icon.setTextAlign(Paint.Align.CENTER);
        icon.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("♪", width / 2f, height * 0.38f, icon);

        Paint titlePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        titlePaint.setColor(Color.WHITE);
        titlePaint.setTextSize(11 * density);
        titlePaint.setTextAlign(Paint.Align.CENTER);
        titlePaint.setTypeface(Typeface.DEFAULT_BOLD);

        String title = (song != null && !song.isEmpty()) ? song : "Now Playing";
        String sub = (artist != null && !artist.isEmpty()) ? artist : "Unknown Artist";

        if (title.length() > 18) title = title.substring(0, 15) + "...";
        canvas.drawText(title, width / 2f, height * 0.62f, titlePaint);

        Paint subPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        subPaint.setColor(0xAAFFFFFF);
        subPaint.setTextSize(8 * density);
        subPaint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(sub, width / 2f, height * 0.72f, subPaint);

        Paint barBg = new Paint(Paint.ANTI_ALIAS_FLAG);
        barBg.setColor(0x44FFFFFF);
        canvas.drawRoundRect(width * 0.15f, height * 0.78f, width * 0.85f, height * 0.80f, 2, 2, barBg);

        Paint barFg = new Paint(Paint.ANTI_ALIAS_FLAG);
        barFg.setColor(0xFF00E5FF);
        canvas.drawRoundRect(width * 0.15f, height * 0.78f, width * 0.55f, height * 0.80f, 2, 2, barFg);
        return bmp;
    }

    public static Bitmap renderGallery(Context context, int width, int height) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        int[] colors = {0xFFE57373, 0xFF64B5F6, 0xFF81C784, 0xFFFFB74D, 0xFFBA68C8, 0xFF4DB6AC};
        Random rnd = new Random();
        int mainColor = colors[new java.util.Random().nextInt(colors.length)];

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(mainColor);
        canvas.drawRoundRect(0, 0, width, height, 8 * density, 8 * density, bg);

        Paint icon = new Paint(Paint.ANTI_ALIAS_FLAG);
        icon.setColor(0x55FFFFFF);
        icon.setStrokeWidth(4 * density);
        icon.setStyle(Paint.Style.STROKE);

        float cx = width / 2f, cy = height * 0.4f;
        float s = width * 0.2f;
        canvas.drawRoundRect(cx - s, cy - s * 0.7f, cx + s, cy + s * 0.7f, 6 * density, 6 * density, icon);

        Path mountain = new Path();
        mountain.moveTo(cx - s, cy + s * 0.7f);
        mountain.lineTo(cx - s * 0.3f, cy - s * 0.2f);
        mountain.lineTo(cx + s * 0.3f, cy + s * 0.1f);
        mountain.lineTo(cx + s, cy - s * 0.4f);
        mountain.lineTo(cx + s, cy + s * 0.7f);
        mountain.close();
        canvas.drawPath(mountain, icon);

        Paint label = new Paint(Paint.ANTI_ALIAS_FLAG);
        label.setColor(0xDDFFFFFF);
        label.setTextSize(10 * density);
        label.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Gallery", width / 2f, height * 0.82f, label);
        return bmp;
    }

    public static Bitmap renderAirship(Context context, int width, int height) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint sky = new Paint(Paint.ANTI_ALIAS_FLAG);
        sky.setColor(0xFF87CEEB);
        canvas.drawRoundRect(0, 0, width, height, 8 * density, 8 * density, sky);

        Paint body = new Paint(Paint.ANTI_ALIAS_FLAG);
        body.setColor(0xFFE53935);

        float cx = width / 2f, cy = height * 0.45f;
        float rx = width * 0.3f, ry = height * 0.15f;
        canvas.drawOval(new RectF(cx - rx, cy - ry, cx + rx, cy + ry), body);

        Paint stripe = new Paint(Paint.ANTI_ALIAS_FLAG);
        stripe.setColor(0xFFFFF176);
        canvas.drawRect(cx - rx * 0.3f, cy - ry * 0.4f, cx + rx * 0.3f, cy + ry * 0.4f, stripe);

        Paint cabin = new Paint(Paint.ANTI_ALIAS_FLAG);
        cabin.setColor(0xFF795548);
        canvas.drawRect(cx - rx * 0.15f, cy + ry, cx + rx * 0.15f, cy + ry + height * 0.12f, cabin);

        Paint line = new Paint(Paint.ANTI_ALIAS_FLAG);
        line.setColor(0xCC795548);
        line.setStrokeWidth(1.5f * density);
        canvas.drawLine(cx - rx * 0.4f, cy + ry, cx - rx * 0.1f, cy + ry + height * 0.12f, line);
        canvas.drawLine(cx + rx * 0.4f, cy + ry, cx + rx * 0.1f, cy + ry + height * 0.12f, line);

        Paint label = new Paint(Paint.ANTI_ALIAS_FLAG);
        label.setColor(0xDD000000);
        label.setTextSize(9 * density);
        label.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Airship", width / 2f, height * 0.92f, label);
        return bmp;
    }

    public static Bitmap renderFloatingButton(Context context, int width, int height) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        canvas.drawColor(Color.TRANSPARENT, android.graphics.PorterDuff.Mode.CLEAR);

        Paint shadow = new Paint(Paint.ANTI_ALIAS_FLAG);
        shadow.setColor(0x33000000);
        canvas.drawCircle(width / 2f, height / 2f + 4 * density, width * 0.22f, shadow);

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setShader(new LinearGradient(0, 0, width, height,
                0xFFFF4081, 0xFFE040FB, Shader.TileMode.CLAMP));
        float radius = Math.min(width, height) * 0.2f;
        canvas.drawCircle(width / 2f, height / 2f, radius, bg);

        Paint plus = new Paint(Paint.ANTI_ALIAS_FLAG);
        plus.setColor(Color.WHITE);
        plus.setStrokeWidth(3 * density);
        plus.setStrokeCap(Paint.Cap.ROUND);
        float s = radius * 0.4f;
        canvas.drawLine(width / 2f - s, height / 2f, width / 2f + s, height / 2f, plus);
        canvas.drawLine(width / 2f, height / 2f - s, width / 2f, height / 2f + s, plus);
        return bmp;
    }

    public static Bitmap renderMessage(Context context, int width, int height, String sender, String preview) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xFFE8F5E9);
        canvas.drawRoundRect(0, 0, width, height, 12 * density, 12 * density, bg);

        Paint avatar = new Paint(Paint.ANTI_ALIAS_FLAG);
        avatar.setColor(0xFF66BB6A);
        canvas.drawCircle(24 * density, 24 * density, 14 * density, avatar);

        Paint namePt = new Paint(Paint.ANTI_ALIAS_FLAG);
        namePt.setColor(0xDE333333);
        namePt.setTextSize(11 * density);
        namePt.setTypeface(Typeface.DEFAULT_BOLD);

        String name = (sender != null && !sender.isEmpty()) ? sender : "Contact";
        if (name.length() > 12) name = name.substring(0, 10) + "...";
        canvas.drawText(name, 44 * density, 28 * density, namePt);

        Paint msgPt = new Paint(Paint.ANTI_ALIAS_FLAG);
        msgPt.setColor(0xAA333333);
        msgPt.setTextSize(9 * density);
        String msg = (preview != null && !preview.isEmpty()) ? preview : "No recent messages";
        if (msg.length() > 20) msg = msg.substring(0, 18) + "...";
        canvas.drawText(msg, 44 * density, 44 * density, msgPt);

        Paint badge = new Paint(Paint.ANTI_ALIAS_FLAG);
        badge.setColor(0xFFE53935);
        canvas.drawCircle(width - 20 * density, 16 * density, 8 * density, badge);

        Paint num = new Paint(Paint.ANTI_ALIAS_FLAG);
        num.setColor(Color.WHITE);
        num.setTextSize(7 * density);
        num.setTextAlign(Paint.Align.CENTER);
        num.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("3", width - 20 * density, 19 * density, num);
        return bmp;
    }

    public static Bitmap renderRecentlyUsed(Context context, int width, int height) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xFFF3E5F5);
        canvas.drawRoundRect(0, 0, width, height, 12 * density, 12 * density, bg);

        Paint header = new Paint(Paint.ANTI_ALIAS_FLAG);
        header.setColor(0xFF7B1FA2);
        header.setTextSize(10 * density);
        header.setTypeface(Typeface.DEFAULT_BOLD);
        header.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Recent", 12 * density, 22 * density, header);

        PackageManager pm = context.getPackageManager();
        List<String> apps = new ArrayList<>();
        Intent mainIntent = new Intent(Intent.ACTION_MAIN);
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        List<ResolveInfo> activities = pm.queryIntentActivities(mainIntent, 0);
        for (int i = 0; i < Math.min(activities.size(), 5); i++) {
            apps.add(activities.get(i).loadLabel(pm).toString());
        }

        Paint appPt = new Paint(Paint.ANTI_ALIAS_FLAG);
        appPt.setColor(0xDE333333);
        appPt.setTextSize(9 * density);

        float y = 42 * density;
        for (int i = 0; i < Math.min(apps.size(), 4); i++) {
            Paint dot = new Paint(Paint.ANTI_ALIAS_FLAG);
            dot.setColor(0xFF7B1FA2);
            canvas.drawCircle(18 * density, y - 4 * density, 3 * density, dot);

            String appName = apps.get(i);
            if (appName.length() > 16) appName = appName.substring(0, 14) + "...";
            canvas.drawText(appName, 28 * density, y, appPt);
            y += 18 * density;
        }
        return bmp;
    }

    public static Bitmap renderBattery(Context context, int width, int height, int level) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        canvas.drawColor(Color.TRANSPARENT, android.graphics.PorterDuff.Mode.CLEAR);

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xCC000000);
        canvas.drawRoundRect(0, 0, width, height, 6 * density, 6 * density, bg);

        float margin = 4 * density;
        float fillW = (width - 2 * margin) * Math.max(0.05f, level / 100f);
        int color = level > 20 ? (level > 60 ? 0xFF4CAF50 : 0xFFFFC107) : 0xFFE53935;
        Paint fill = new Paint(Paint.ANTI_ALIAS_FLAG);
        fill.setColor(color);
        canvas.drawRoundRect(margin, margin, margin + fillW, height - margin, 4 * density, 4 * density, fill);

        Paint tip = new Paint(Paint.ANTI_ALIAS_FLAG);
        tip.setColor(0xCC000000);
        canvas.drawRect(width, height * 0.3f, width + 4 * density, height * 0.7f, tip);

        Paint pct = new Paint(Paint.ANTI_ALIAS_FLAG);
        pct.setColor(Color.WHITE);
        pct.setTextSize(10 * density);
        pct.setTextAlign(Paint.Align.CENTER);
        pct.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText(level + "%", width / 2f, height * 0.68f, pct);
        return bmp;
    }

    public static Bitmap renderQuickContacts(Context context, int width, int height) {
        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmp);
        float density = context.getResources().getDisplayMetrics().density;

        Paint bg = new Paint(Paint.ANTI_ALIAS_FLAG);
        bg.setColor(0xFFE3F2FD);
        canvas.drawRoundRect(0, 0, width, height, 12 * density, 12 * density, bg);

        Paint header = new Paint(Paint.ANTI_ALIAS_FLAG);
        header.setColor(0xFF1565C0);
        header.setTextSize(10 * density);
        header.setTypeface(Typeface.DEFAULT_BOLD);
        header.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Contacts", 12 * density, 22 * density, header);

        int[] contactColors = {0xFFE53935, 0xFF1E88E5, 0xFF43A047, 0xFFFB8C00, 0xFF8E24AA};
        String[] initials = {"A", "B", "C", "D", "E"};

        float startX = width / 5f;
        for (int i = 0; i < 5; i++) {
            Paint circle = new Paint(Paint.ANTI_ALIAS_FLAG);
            circle.setColor(contactColors[i]);
            float cx = startX * (i + 0.5f);
            float cy = height * 0.55f;
            float r = width * 0.08f;
            canvas.drawCircle(cx, cy, r, circle);

            Paint init = new Paint(Paint.ANTI_ALIAS_FLAG);
            init.setColor(Color.WHITE);
            init.setTextSize(r * 1.1f);
            init.setTextAlign(Paint.Align.CENTER);
            init.setTypeface(Typeface.DEFAULT_BOLD);
            canvas.drawText(initials[i], cx, cy + r * 0.35f, init);
        }

        Paint sub = new Paint(Paint.ANTI_ALIAS_FLAG);
        sub.setColor(0xAA333333);
        sub.setTextSize(8 * density);
        sub.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("Tap to call", width / 2f, height * 0.88f, sub);
        return bmp;
    }
}
