package com.tsf.shell.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

public final class NotificationHelper {

    public static final String CHANNEL_LAUNCHER = "launcher_service";
    public static final String CHANNEL_THEMES = "theme_updates";
    public static final String CHANNEL_WIDGETS = "widget_alerts";

    private NotificationHelper() {}

    public static void createChannels(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return;
        NotificationManager nm = context.getSystemService(NotificationManager.class);
        if (nm == null) return;

        NotificationChannel launcher = new NotificationChannel(
                CHANNEL_LAUNCHER, "Launcher Service",
                NotificationManager.IMPORTANCE_LOW);
        launcher.setDescription("Background launcher service for gestures and widgets");
        launcher.setShowBadge(false);

        NotificationChannel themes = new NotificationChannel(
                CHANNEL_THEMES, "Theme Updates",
                NotificationManager.IMPORTANCE_DEFAULT);
        themes.setDescription("Notifications for theme-related events");

        NotificationChannel widgets = new NotificationChannel(
                CHANNEL_WIDGETS, "Widget Alerts",
                NotificationManager.IMPORTANCE_DEFAULT);
        widgets.setDescription("Alerts from TSF widgets");

        nm.createNotificationChannels(Arrays.asList(launcher, themes, widgets));
    }
}