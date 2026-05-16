package com.tsf.shell.ui.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class PowerMenuDialog {

    public static void show(Activity activity) {
        String[] items = {"Lock Screen", "Restart", "Power Off", "Screenshot", "Cancel"};
        new AlertDialog.Builder(activity)
                .setTitle("Power Menu")
                .setItems(items, (dialog, which) -> {
                    switch (which) {
                        case 0: lockScreen(activity); break;
                        case 1: shutdown(activity, true); break;
                        case 2: shutdown(activity, false); break;
                        case 3: takeScreenshot(activity); break;
                    }
                })
                .show();
    }

    private static void lockScreen(Activity activity) {
        DevicePolicyManager dpm = (DevicePolicyManager)
                activity.getSystemService(Context.DEVICE_POLICY_SERVICE);
        ComponentName admin = new ComponentName(activity, "com.tsf.shell.DeviceAdminReceiver");
        if (dpm != null && dpm.isAdminActive(admin)) {
            dpm.lockNow();
        } else {
            try {
                Class<?> kmClass = Class.forName("android.app.KeyguardManager");
                Object km = activity.getSystemService(Context.KEYGUARD_SERVICE);
                if (km != null) {
                    kmClass.getMethod("lock", Context.class).invoke(km, activity);
                }
            } catch (Exception e) {
                android.widget.Toast.makeText(activity,
                        "Lock requires Device Admin permission", android.widget.Toast.LENGTH_SHORT).show();
            }
        }
    }

    private static void shutdown(Activity activity, boolean restart) {
        try {
            Intent intent = new Intent(restart
                    ? "android.intent.action.REBOOT"
                    : "android.intent.action.ACTION_REQUEST_SHUTDOWN");
            intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
            activity.startActivity(intent);
        } catch (Exception e) {
            try {
                Process proc = Runtime.getRuntime().exec(restart
                        ? new String[]{"su", "-c", "reboot"}
                        : new String[]{"su", "-c", "reboot -p"});
                proc.waitFor();
            } catch (Exception e2) {
                android.widget.Toast.makeText(activity,
                        restart ? "Restart requires root or system permission"
                                : "Power off requires root or system permission",
                        android.widget.Toast.LENGTH_SHORT).show();
            }
        }
    }

    private static void takeScreenshot(Activity activity) {
        android.widget.Toast.makeText(activity,
                "Screenshot requires screen capture permission", android.widget.Toast.LENGTH_LONG).show();
    }
}
