package com.tsf.shell.ui.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

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
        try {
            View root = activity.getWindow().getDecorView().getRootView();
            Bitmap bitmap = Bitmap.createBitmap(root.getWidth(), root.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            root.draw(canvas);

            String fileName = "Screenshot_" + System.currentTimeMillis() + ".png";
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                ContentValues values = new ContentValues();
                values.put(MediaStore.Images.Media.DISPLAY_NAME, fileName);
                values.put(MediaStore.Images.Media.MIME_TYPE, "image/png");
                values.put(MediaStore.Images.Media.RELATIVE_PATH, Environment.DIRECTORY_PICTURES);
                Uri uri = activity.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
                if (uri != null) {
                    OutputStream out = activity.getContentResolver().openOutputStream(uri);
                    if (out != null) {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                        out.close();
                    }
                }
            } else {
                File dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                dir.mkdirs();
                File file = new File(dir, fileName);
                FileOutputStream out = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
                out.close();
            }
            bitmap.recycle();
            android.widget.Toast.makeText(activity,
                    "Screenshot saved to Pictures", android.widget.Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            android.widget.Toast.makeText(activity,
                    "Screenshot failed: " + e.getMessage(), android.widget.Toast.LENGTH_LONG).show();
        }
    }
}
