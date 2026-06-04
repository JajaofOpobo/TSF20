package com.censivn.C3DEngine.n;

import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes.dex */
public class Utils {
    public static native void CutAndUploadTexture(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6);

    public static native void FilmImage(Bitmap bitmap);

    public static native void GrayImage(Bitmap bitmap);

    public static native void UploadTexture(Bitmap bitmap, int i, int i2);

    public static native int cal(byte[] bArr);

    static {
        if (Build.VERSION.SDK_INT < 8) {
            System.loadLibrary("jnigraphics");
        }
        System.loadLibrary("C3DEngine");
    }
}
