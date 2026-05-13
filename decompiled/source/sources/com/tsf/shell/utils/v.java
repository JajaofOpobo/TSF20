package com.tsf.shell.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
/* loaded from: classes.dex */
public class v {
    private static int a = 480;
    private static int b = 800;
    private static int c = 0;
    private static String d = "";
    private static float e = 1.0f;
    private static int f = Integer.MIN_VALUE;

    public static File a(Context context) {
        File file;
        try {
            if (Build.VERSION.SDK_INT > 7) {
                file = context.getExternalFilesDir(null);
            } else {
                file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + context.getPackageName() + "/files");
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            return file;
        } catch (NullPointerException e2) {
            return null;
        }
    }
}
