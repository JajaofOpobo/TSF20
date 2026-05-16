package com.tsf.shell.badge;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.HashMap;
import java.util.Map;

public class BadgeManager {

    private static BadgeManager instance;
    private final Map<String, Integer> badgeCounts = new HashMap<>();
    private final SharedPreferences prefs;

    private BadgeManager(Context context) {
        prefs = context.getSharedPreferences("badges", Context.MODE_PRIVATE);
        loadBadges();
    }

    public static synchronized BadgeManager getInstance(Context context) {
        if (instance == null) {
            instance = new BadgeManager(context.getApplicationContext());
        }
        return instance;
    }

    public void setBadge(String packageName, int count) {
        badgeCounts.put(packageName, Math.max(0, count));
        prefs.edit().putInt(packageName, Math.max(0, count)).apply();
    }

    public int getBadge(String packageName) {
        Integer count = badgeCounts.get(packageName);
        return count != null ? count : 0;
    }

    public void clearBadge(String packageName) {
        badgeCounts.remove(packageName);
        prefs.edit().remove(packageName).apply();
    }

    public boolean hasBadge(String packageName) {
        return getBadge(packageName) > 0;
    }

    public void drawBadge(Canvas canvas, float cx, float cy, float size, String packageName) {
        int count = getBadge(packageName);
        if (count <= 0) return;

        Paint badgePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        badgePaint.setColor(0xFFFF4444);

        Paint textPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textPaint.setColor(0xFFFFFFFF);
        textPaint.setTextSize(size * 0.5f);
        textPaint.setTextAlign(Paint.Align.CENTER);

        float badgeSize = size * 0.35f;
        float bx = cx + size / 2f - badgeSize / 2f;
        float by = cy - size / 2f + badgeSize / 2f;

        canvas.drawCircle(bx, by, badgeSize / 2f, badgePaint);

        String text = count > 99 ? "99+" : String.valueOf(count);
        canvas.drawText(text, bx, by + textPaint.getTextSize() / 3f, textPaint);
    }

    private void loadBadges() {
        Map<String, ?> all = prefs.getAll();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getValue() instanceof Integer) {
                badgeCounts.put(entry.getKey(), (Integer) entry.getValue());
            }
        }
    }
}
