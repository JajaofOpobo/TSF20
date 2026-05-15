package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class x {
    public static boolean a = false;
    private Context b;
    private Rect f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Rect k;
    private int l;
    private int m;
    private int n;
    private int o;
    private Uri p;
    private int q;
    private int r;
    private int s;
    private final int c = 53;
    private final float d = 1.0f;
    private final int e = 270;
    private boolean t = true;

    public x(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.b = context;
        float fA = com.tsf.extend.base.j.i.a();
        int iA = com.tsf.extend.base.j.j.a(context);
        int iB = com.tsf.extend.base.j.j.b(context);
        this.h = iB - ((int) (270.0f * fA));
        this.g = (this.h * iA) / iB;
        this.i = (iA - this.g) / 2;
        this.j = (int) (fA * 53.0f);
        this.f = new Rect(this.i, this.j, this.g + this.i, this.h + this.j);
        this.n = (int) (1.0f * fA);
        this.l = iA - (this.n * 2);
        this.m = (this.l * iB) / (iA * 2);
        this.o = ((int) (fA * 53.0f)) + ((this.h - this.m) / 2);
        this.k = new Rect(this.n, this.o, this.l + this.n, this.m + this.o);
        if (a) {
            Log.d("ClipWallpaper", "screenWidth:" + iA + " screenHeight:" + iB);
            Log.d("ClipWallpaper", "single leftMargin:" + this.i + " topMargin:" + this.j + "single Rect:" + this.f);
            Log.d("ClipWallpaper", "double leftMargin:" + this.n + " topMargin:" + this.o + "double Rect:" + this.k);
        }
    }

    public int a() {
        return this.t ? this.i : this.n;
    }

    public int b() {
        return this.t ? this.j : this.o;
    }

    public Rect c() {
        return this.t ? this.f : this.k;
    }

    public Rect a(boolean z) {
        return z ? this.f : this.k;
    }

    public Bitmap a(Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        int i;
        int i2;
        int iA = com.tsf.extend.base.j.e.a(this.b, uri);
        boolean z = (iA == 0 || (iA / 90) % 2 == 0) ? false : true;
        if (a) {
            Log.d("ClipWallpaper", "choosed wallpaper：rotateDegree:" + iA + " changeWH:" + z);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            inputStreamOpenInputStream = this.b.getContentResolver().openInputStream(uri);
        } catch (Exception e) {
            inputStreamOpenInputStream = null;
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
        try {
            inputStreamOpenInputStream.close();
        } catch (IOException e2) {
        }
        int i3 = z ? options.outHeight : options.outWidth;
        int i4 = z ? options.outWidth : options.outHeight;
        if (a) {
            Log.d("ClipWallpaper", "choosed wallpaper,after rotate：W:" + i3 + " H:" + i4);
        }
        if (i3 / i4 > com.tsf.extend.base.j.j.a(this.b) / com.tsf.extend.base.j.j.b(this.b)) {
            i2 = this.h;
            i = (i3 * i2) / i4;
        } else {
            i = this.g;
            i2 = (i4 * i) / i3;
        }
        int iA2 = com.tsf.extend.base.j.e.a(options, i, i2);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = iA2;
        options2.inJustDecodeBounds = false;
        InputStream inputStreamOpenInputStream2 = this.b.getContentResolver().openInputStream(uri);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
        try {
            inputStreamOpenInputStream2.close();
        } catch (IOException e3) {
        }
        if (bitmapDecodeStream == null) {
            return null;
        }
        Bitmap bitmapA = com.tsf.extend.base.j.e.a(bitmapDecodeStream, i, i2, iA);
        if (a) {
            Log.d("ClipWallpaper", "after rotate for display：W:" + i + " H:" + i2);
        }
        if (bitmapA != null) {
            this.p = uri;
            this.q = iA;
            this.r = i3;
            this.s = i4;
        }
        return bitmapA;
    }

    public Bitmap a(RectF rectF, boolean z) throws Throwable {
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        Bitmap bitmapDecodeStream;
        if (a) {
            Log.d("ClipWallpaper", "start create wallpaper, singleWallpaper:" + this.t + " original in display Rect:" + rectF + " preview:" + z);
        }
        int i = this.q;
        boolean z2 = (i == 0 || (i / 90) % 2 == 0) ? false : true;
        int iA = (this.t || z) ? com.tsf.extend.base.j.j.a(this.b) : com.tsf.extend.base.j.j.a(this.b) * 2;
        int iB = com.tsf.extend.base.j.j.b(this.b);
        int i2 = (int) ((rectF.bottom - rectF.top) / iB);
        if (i2 == 0) {
            i2 = 1;
        }
        RectF rectF2 = new RectF(rectF);
        if (z && !this.t) {
            rectF2.right = rectF2.left + ((rectF2.right - rectF2.left) / 2.0f);
        }
        if (z2) {
            rectF2.set(rectF2.top, this.r - rectF2.right, rectF2.bottom, this.r - rectF2.left);
        }
        if (a) {
            Log.d("ClipWallpaper", "before rotate,in display srcRect:" + rectF2 + " sampleSize:" + i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        InputStream inputStreamOpenInputStream2 = this.b.getContentResolver().openInputStream(this.p);
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
        } catch (OutOfMemoryError e) {
            if (inputStreamOpenInputStream2 != null) {
                try {
                    inputStreamOpenInputStream2.close();
                } catch (Exception e2) {
                }
            }
            int i3 = i2 * 2;
            options.inSampleSize = i3;
            try {
                inputStreamOpenInputStream = this.b.getContentResolver().openInputStream(this.p);
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream2;
            }
            try {
                Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                        i2 = i3;
                        bitmapDecodeStream = bitmapDecodeStream2;
                    } catch (Exception e3) {
                        i2 = i3;
                        bitmapDecodeStream = bitmapDecodeStream2;
                    }
                } else {
                    i2 = i3;
                    bitmapDecodeStream = bitmapDecodeStream2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        }
        if (bitmapDecodeStream == null) {
            return null;
        }
        if (i2 > 1) {
            rectF2.left /= i2;
            rectF2.top /= i2;
            rectF2.right /= i2;
            rectF2.bottom /= i2;
        }
        if (a) {
            Log.d("ClipWallpaper", "before rotate,in display,after scaled from file: tmpSrcRect:" + rectF2 + " real sampleSize:" + i2);
            Log.d("ClipWallpaper", "no rotate,scaled bitmap from file, W:" + bitmapDecodeStream.getWidth() + " H:" + bitmapDecodeStream.getHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA, iB, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        switch (i) {
            case -270:
            case 90:
                canvas.rotate(i);
                canvas.translate(0.0f, -iA);
                break;
            case -180:
            case 180:
                canvas.rotate(i);
                canvas.translate(-iA, -iB);
                break;
            case -90:
            case 270:
                canvas.rotate(i);
                canvas.translate(-iB, 0.0f);
                break;
        }
        int i4 = z2 ? iB : iA;
        if (!z2) {
            iA = iB;
        }
        Rect rect = new Rect(0, 0, i4, iA);
        if (a) {
            Log.d("ClipWallpaper", "output rect:" + rect);
        }
        Rect rect2 = new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmapDecodeStream, rect2, rect, paint);
        if (bitmapCreateBitmap != bitmapDecodeStream && !bitmapDecodeStream.isRecycled()) {
            bitmapDecodeStream.recycle();
        }
        return bitmapCreateBitmap;
    }

    public int d() {
        return this.t ? this.g : this.l;
    }

    public int e() {
        return this.t ? this.h : this.m;
    }

    public int f() {
        return this.r;
    }

    public void b(boolean z) {
        this.t = z;
    }

    public boolean g() {
        return this.t;
    }
}
