package com.tsf.shell.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;
/* renamed from: com.tsf.shell.utils.v */
/* loaded from: classes.dex */
public class C4186v {

    /* renamed from: a */
    private static int f13497a = 480;

    /* renamed from: b */
    private static int f13498b = 800;

    /* renamed from: c */
    private static int f13499c = 0;

    /* renamed from: d */
    private static String f13500d = "";

    /* renamed from: e */
    private static float f13501e = 1.0f;

    /* renamed from: f */
    private static int f13502f = Integer.MIN_VALUE;

    /* renamed from: a */
    public static File m617a(Context context) {
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
        } catch (NullPointerException e) {
            return null;
        }
    }
}
