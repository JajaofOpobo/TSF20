package com.tsf.shell.plugin.themepicker.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tsf.shell.plugin.themepicker.C3851e;
import java.io.FileDescriptor;
/* renamed from: com.tsf.shell.plugin.themepicker.utils.e */
/* loaded from: classes.dex */
public class C3951e extends AbstractC3952f {

    /* renamed from: a */
    protected int f12949a;

    /* renamed from: b */
    protected int f12950b;

    public C3951e(Context context, int i, int i2) {
        super(context);
        m1050a(i, i2);
    }

    /* renamed from: a */
    public void m1050a(int i, int i2) {
        this.f12949a = i;
        this.f12950b = i2;
    }

    /* renamed from: b */
    private Bitmap m1045b(int i) {
        C3851e.m1318a("ImageResizer", "processBitmap - " + i);
        return m1049a(this.f12954d, i, this.f12949a, this.f12950b, m1027f());
    }

    @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3952f
    /* renamed from: a */
    protected Bitmap mo998a(Object obj) {
        return m1045b(Integer.parseInt(String.valueOf(obj)));
    }

    /* renamed from: a */
    public static Bitmap m1049a(Resources resources, int i, int i2, int i3, C3946c c3946c) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = m1048a(options, i2, i3);
        if (C3957h.m1007c()) {
            m1047a(options, c3946c);
        }
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    /* renamed from: a */
    public static Bitmap m1046a(FileDescriptor fileDescriptor, int i, int i2, C3946c c3946c) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = m1048a(options, i, i2);
        options.inJustDecodeBounds = false;
        if (C3957h.m1007c()) {
            m1047a(options, c3946c);
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m1047a(BitmapFactory.Options options, C3946c c3946c) {
        Bitmap m1081a;
        options.inMutable = true;
        if (c3946c != null && (m1081a = c3946c.m1081a(options)) != null) {
            options.inBitmap = m1081a;
        }
    }

    /* renamed from: a */
    public static int m1048a(BitmapFactory.Options options, int i, int i2) {
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
