package com.tsf.shell.workspace3D.g.d;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes.dex */
public final class p {
    public long a;
    public String b;
    public Intent c;
    public String d;
    public Bitmap e;

    public final boolean a(long j, String str, String str2, byte[] bArr) {
        this.a = j;
        this.d = str2;
        try {
            this.c = Intent.parseUri(str2, 0);
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, 60, 60, true);
                this.e = createScaledBitmap.copy(Bitmap.Config.ARGB_8888, false);
                decodeByteArray.recycle();
                createScaledBitmap.recycle();
                this.b = str;
                return true;
            } catch (Exception e) {
                return false;
            }
        } catch (Exception e2) {
            return false;
        }
    }
}
