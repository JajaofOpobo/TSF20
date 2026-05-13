package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;
/* loaded from: classes.dex */
public class e extends f {
    protected int a;
    protected int b;

    public e(Context context, int i, int i2) {
        super(context);
        a(i, i2);
    }

    public void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private Bitmap b(int i) {
        com.tsf.shell.plugin.themepicker.e.a("ImageResizer", "processBitmap - " + i);
        return a(this.d, i, this.a, this.b, f());
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.f
    protected Bitmap a(Object obj) {
        return b(Integer.parseInt(String.valueOf(obj)));
    }

    public static Bitmap a(Resources resources, int i, int i2, int i3, c cVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = a(options, i2, i3);
        if (h.c()) {
            a(options, cVar);
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i, int i2, c cVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        if (h.c()) {
            a(options, cVar);
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @TargetApi(11)
    private static void a(BitmapFactory.Options options, c cVar) {
        Bitmap a;
        options.inMutable = true;
        if (cVar != null && (a = cVar.a(options)) != null) {
            options.inBitmap = a;
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 > i2 && i7 / i5 > i) {
                i5 *= 2;
            }
            long j = (i3 * i4) / i5;
            while (j > i * i2 * 2) {
                j /= 2;
                i5 *= 2;
            }
        }
        return i5;
    }
}
