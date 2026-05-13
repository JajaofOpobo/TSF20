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
import com.tsf.extend.base.p080j.C1426e;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1431j;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.tsf.extend.wallpaper.x */
/* loaded from: classes.dex */
public class C2146x {

    /* renamed from: a */
    public static boolean f7063a = false;

    /* renamed from: b */
    private Context f7064b;

    /* renamed from: f */
    private Rect f7068f;

    /* renamed from: g */
    private int f7069g;

    /* renamed from: h */
    private int f7070h;

    /* renamed from: i */
    private int f7071i;

    /* renamed from: j */
    private int f7072j;

    /* renamed from: k */
    private Rect f7073k;

    /* renamed from: l */
    private int f7074l;

    /* renamed from: m */
    private int f7075m;

    /* renamed from: n */
    private int f7076n;

    /* renamed from: o */
    private int f7077o;

    /* renamed from: p */
    private Uri f7078p;

    /* renamed from: q */
    private int f7079q;

    /* renamed from: r */
    private int f7080r;

    /* renamed from: s */
    private int f7081s;

    /* renamed from: c */
    private final int f7065c = 53;

    /* renamed from: d */
    private final float f7066d = 1.0f;

    /* renamed from: e */
    private final int f7067e = 270;

    /* renamed from: t */
    private boolean f7082t = true;

    public C2146x(Context context) {
        m6236a(context);
    }

    /* renamed from: a */
    private void m6236a(Context context) {
        this.f7064b = context;
        float m8660a = C1430i.m8660a();
        int m8652a = C1431j.m8652a(context);
        int m8649b = C1431j.m8649b(context);
        this.f7070h = m8649b - ((int) (270.0f * m8660a));
        this.f7069g = (this.f7070h * m8652a) / m8649b;
        this.f7071i = (m8652a - this.f7069g) / 2;
        this.f7072j = (int) (m8660a * 53.0f);
        this.f7068f = new Rect(this.f7071i, this.f7072j, this.f7069g + this.f7071i, this.f7070h + this.f7072j);
        this.f7076n = (int) (1.0f * m8660a);
        this.f7074l = m8652a - (this.f7076n * 2);
        this.f7075m = (this.f7074l * m8649b) / (m8652a * 2);
        this.f7077o = ((int) (m8660a * 53.0f)) + ((this.f7070h - this.f7075m) / 2);
        this.f7073k = new Rect(this.f7076n, this.f7077o, this.f7074l + this.f7076n, this.f7075m + this.f7077o);
        if (f7063a) {
            Log.d("ClipWallpaper", "screenWidth:" + m8652a + " screenHeight:" + m8649b);
            Log.d("ClipWallpaper", "single leftMargin:" + this.f7071i + " topMargin:" + this.f7072j + "single Rect:" + this.f7068f);
            Log.d("ClipWallpaper", "double leftMargin:" + this.f7076n + " topMargin:" + this.f7077o + "double Rect:" + this.f7073k);
        }
    }

    /* renamed from: a */
    public int m6237a() {
        return this.f7082t ? this.f7071i : this.f7076n;
    }

    /* renamed from: b */
    public int m6232b() {
        return this.f7082t ? this.f7072j : this.f7077o;
    }

    /* renamed from: c */
    public Rect m6230c() {
        return this.f7082t ? this.f7068f : this.f7073k;
    }

    /* renamed from: a */
    public Rect m6233a(boolean z) {
        return z ? this.f7068f : this.f7073k;
    }

    /* renamed from: a */
    public Bitmap m6234a(Uri uri) {
        InputStream inputStream;
        int i;
        int i2;
        int m8675a = C1426e.m8675a(this.f7064b, uri);
        boolean z = (m8675a == 0 || (m8675a / 90) % 2 == 0) ? false : true;
        if (f7063a) {
            Log.d("ClipWallpaper", "choosed wallpaper：rotateDegree:" + m8675a + " changeWH:" + z);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            inputStream = this.f7064b.getContentResolver().openInputStream(uri);
        } catch (Exception e) {
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.decodeStream(inputStream, null, options);
        try {
            inputStream.close();
        } catch (IOException e2) {
        }
        int i3 = z ? options.outHeight : options.outWidth;
        int i4 = z ? options.outWidth : options.outHeight;
        if (f7063a) {
            Log.d("ClipWallpaper", "choosed wallpaper,after rotate：W:" + i3 + " H:" + i4);
        }
        if (i3 / i4 > C1431j.m8652a(this.f7064b) / C1431j.m8649b(this.f7064b)) {
            i2 = this.f7070h;
            i = (i3 * i2) / i4;
        } else {
            i = this.f7069g;
            i2 = (i4 * i) / i3;
        }
        int m8669a = C1426e.m8669a(options, i, i2);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = m8669a;
        options2.inJustDecodeBounds = false;
        InputStream openInputStream = this.f7064b.getContentResolver().openInputStream(uri);
        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options2);
        try {
            openInputStream.close();
        } catch (IOException e3) {
        }
        if (decodeStream == null) {
            return null;
        }
        Bitmap m8673a = C1426e.m8673a(decodeStream, i, i2, m8675a);
        if (f7063a) {
            Log.d("ClipWallpaper", "after rotate for display：W:" + i + " H:" + i2);
        }
        if (m8673a != null) {
            this.f7078p = uri;
            this.f7079q = m8675a;
            this.f7080r = i3;
            this.f7081s = i4;
        }
        return m8673a;
    }

    /* renamed from: a */
    public Bitmap m6235a(RectF rectF, boolean z) {
        InputStream inputStream;
        InputStream openInputStream;
        Bitmap bitmap;
        if (f7063a) {
            Log.d("ClipWallpaper", "start create wallpaper, singleWallpaper:" + this.f7082t + " original in display Rect:" + rectF + " preview:" + z);
        }
        int i = this.f7079q;
        boolean z2 = (i == 0 || (i / 90) % 2 == 0) ? false : true;
        int m8652a = (this.f7082t || z) ? C1431j.m8652a(this.f7064b) : C1431j.m8652a(this.f7064b) * 2;
        int m8649b = C1431j.m8649b(this.f7064b);
        int i2 = (int) ((rectF.bottom - rectF.top) / m8649b);
        if (i2 == 0) {
            i2 = 1;
        }
        RectF rectF2 = new RectF(rectF);
        if (z && !this.f7082t) {
            rectF2.right = rectF2.left + ((rectF2.right - rectF2.left) / 2.0f);
        }
        if (z2) {
            rectF2.set(rectF2.top, this.f7080r - rectF2.right, rectF2.bottom, this.f7080r - rectF2.left);
        }
        if (f7063a) {
            Log.d("ClipWallpaper", "before rotate,in display srcRect:" + rectF2 + " sampleSize:" + i2);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        InputStream openInputStream2 = this.f7064b.getContentResolver().openInputStream(this.f7078p);
        try {
            bitmap = BitmapFactory.decodeStream(openInputStream2, null, options);
        } catch (OutOfMemoryError e) {
            if (openInputStream2 != null) {
                try {
                    openInputStream2.close();
                } catch (Exception e2) {
                }
            }
            int i3 = i2 * 2;
            options.inSampleSize = i3;
            try {
                openInputStream = this.f7064b.getContentResolver().openInputStream(this.f7078p);
            } catch (Throwable th) {
                th = th;
                inputStream = openInputStream2;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    try {
                        openInputStream.close();
                        i2 = i3;
                        bitmap = decodeStream;
                    } catch (Exception e3) {
                        i2 = i3;
                        bitmap = decodeStream;
                    }
                } else {
                    i2 = i3;
                    bitmap = decodeStream;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = openInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        }
        if (bitmap == null) {
            return null;
        }
        if (i2 > 1) {
            rectF2.left /= i2;
            rectF2.top /= i2;
            rectF2.right /= i2;
            rectF2.bottom /= i2;
        }
        if (f7063a) {
            Log.d("ClipWallpaper", "before rotate,in display,after scaled from file: tmpSrcRect:" + rectF2 + " real sampleSize:" + i2);
            Log.d("ClipWallpaper", "no rotate,scaled bitmap from file, W:" + bitmap.getWidth() + " H:" + bitmap.getHeight());
        }
        Bitmap createBitmap = Bitmap.createBitmap(m8652a, m8649b, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        switch (i) {
            case -270:
            case 90:
                canvas.rotate(i);
                canvas.translate(0.0f, -m8652a);
                break;
            case -180:
            case 180:
                canvas.rotate(i);
                canvas.translate(-m8652a, -m8649b);
                break;
            case -90:
            case 270:
                canvas.rotate(i);
                canvas.translate(-m8649b, 0.0f);
                break;
        }
        int i4 = z2 ? m8649b : m8652a;
        if (!z2) {
            m8652a = m8649b;
        }
        Rect rect = new Rect(0, 0, i4, m8652a);
        if (f7063a) {
            Log.d("ClipWallpaper", "output rect:" + rect);
        }
        Rect rect2 = new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, rect2, rect, paint);
        if (createBitmap != bitmap && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: d */
    public int m6229d() {
        return this.f7082t ? this.f7069g : this.f7074l;
    }

    /* renamed from: e */
    public int m6228e() {
        return this.f7082t ? this.f7070h : this.f7075m;
    }

    /* renamed from: f */
    public int m6227f() {
        return this.f7080r;
    }

    /* renamed from: b */
    public void m6231b(boolean z) {
        this.f7082t = z;
    }

    /* renamed from: g */
    public boolean m6226g() {
        return this.f7082t;
    }
}
