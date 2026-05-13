package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.l;
import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.t;
/* loaded from: classes.dex */
public class i extends com.android.volley.l<Bitmap> {
    private static final Object f = new Object();
    private final n.b<Bitmap> a;
    private final Bitmap.Config b;
    private final int c;
    private final int d;
    private ImageView.ScaleType e;

    public i(String str, n.b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, n.a aVar) {
        super(0, str, aVar);
        a((p) new com.android.volley.d(1000, 2, 2.0f));
        this.a = bVar;
        this.b = config;
        this.c = i;
        this.d = i2;
        this.e = scaleType;
    }

    @Deprecated
    public i(String str, n.b<Bitmap> bVar, int i, int i2, Bitmap.Config config, n.a aVar) {
        this(str, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }

    @Override // com.android.volley.l
    public l.a s() {
        return l.a.LOW;
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) ((i2 / i4) * i3);
        } else {
            if (i2 != 0) {
                double d = i4 / i3;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    if (i * d < i2) {
                        return (int) (i2 / d);
                    }
                    return i;
                } else if (i * d > i2) {
                    return (int) (i2 / d);
                } else {
                    return i;
                }
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public com.android.volley.n<Bitmap> a(com.android.volley.i iVar) {
        com.android.volley.n<Bitmap> a;
        synchronized (f) {
            try {
                a = b(iVar);
            } catch (OutOfMemoryError e) {
                t.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(iVar.b.length), d());
                a = com.android.volley.n.a(new com.android.volley.k(e));
            }
        }
        return a;
    }

    private com.android.volley.n<Bitmap> b(com.android.volley.i iVar) {
        Bitmap bitmap;
        byte[] bArr = iVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.c == 0 && this.d == 0) {
            options.inPreferredConfig = this.b;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int a = a(this.c, this.d, i, i2, this.e);
            int a2 = a(this.d, this.c, i2, i, this.e);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i, i2, a, a2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray == null || (decodeByteArray.getWidth() <= a && decodeByteArray.getHeight() <= a2)) {
                bitmap = decodeByteArray;
            } else {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, a, a2, true);
                decodeByteArray.recycle();
            }
        }
        if (bitmap == null) {
            return com.android.volley.n.a(new com.android.volley.k(iVar));
        }
        return com.android.volley.n.a(bitmap, e.a(iVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.l
    public void a(Bitmap bitmap) {
        this.a.a(bitmap);
    }

    static int a(int i, int i2, int i3, int i4) {
        float f2 = 1.0f;
        while (f2 * 2.0f <= Math.min(i / i3, i2 / i4)) {
            f2 *= 2.0f;
        }
        return (int) f2;
    }
}
