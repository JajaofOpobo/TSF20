package com.tsf.shell.util;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;

public class WallpaperHelper {

    public static final int REQUEST_PICK_IMAGE = 100;
    public static final int REQUEST_CROP_IMAGE = 101;

    public static Intent createPickIntent() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        return intent;
    }

    public static Intent createCropIntent(Uri imageUri) {
        Intent intent = new Intent("com.android.action.CROP");
        intent.setDataAndType(imageUri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 0);
        intent.putExtra("aspectY", 0);
        intent.putExtra("output", imageUri);
        intent.putExtra("return-data", false);
        return intent;
    }

    public static void setWallpaper(Context context, Uri imageUri) {
        try {
            WallpaperManager wm = WallpaperManager.getInstance(context);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                wm.setStream(context.getContentResolver().openInputStream(imageUri),
                        null, true, WallpaperManager.FLAG_SYSTEM);
            } else {
                wm.setStream(context.getContentResolver().openInputStream(imageUri));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openWallpaperSettings(Context context) {
        Intent intent = new Intent(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        context.startActivity(intent);
    }
}