package com.tsf.shell.widget.alarm;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.core.VObject3d;

/* loaded from: classes.dex */
public class ah {
    private static int a = 150;

    public static void a(VObject3d[] vObject3dArr, int i, Bitmap bitmap, int i2, int i3, int i4) {
        int length = vObject3dArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            new ai(vObject3dArr[i5], i5, length, bitmap, i, i2, i3, i4);
        }
    }
}
