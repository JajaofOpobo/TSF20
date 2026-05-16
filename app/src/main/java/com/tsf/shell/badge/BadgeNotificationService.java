package com.tsf.shell.badge;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.SparseIntArray;

public class BadgeNotificationService extends NotificationListenerService {

    private static BadgeManager badgeManager;

    @Override
    public void onCreate() {
        super.onCreate();
        badgeManager = BadgeManager.getInstance(this);
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        updateBadge(sbn.getPackageName());
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        updateBadge(sbn.getPackageName());
    }

    private void updateBadge(String packageName) {
        if (badgeManager == null) return;
        int count = 0;
        try {
            StatusBarNotification[] active = getActiveNotifications();
            if (active != null) {
                for (StatusBarNotification n : active) {
                    if (n.getPackageName().equals(packageName)
                            && (n.getNotification().flags & android.app.Notification.FLAG_ONGOING_EVENT) == 0) {
                        count++;
                    }
                }
            }
        } catch (Exception ignored) {}
        badgeManager.setBadge(packageName, count);
    }

    public static boolean isEnabled(Context context) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR2) return false;
        String enabledListeners = android.provider.Settings.Secure.getString(
                context.getContentResolver(),
                "enabled_notification_listeners");
        return enabledListeners != null && enabledListeners.contains(context.getPackageName());
    }
}
