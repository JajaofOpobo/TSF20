package com.tsf.shell.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
/* loaded from: classes.dex */
public class q {
    public static Bitmap a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Canvas canvas, Bitmap bitmap, float[] fArr, Paint paint) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        float[] fArr2 = {0.0f, 0.0f, width, 0.0f, width, height, 0.0f, height};
        Matrix matrix = new Matrix();
        matrix.setPolyToPoly(fArr2, 0, fArr, 0, fArr2.length >> 1);
        canvas.drawBitmap(bitmap, matrix, paint);
    }

    public static void a(Canvas canvas, Bitmap bitmap, int i, int i2) {
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(porterDuffXfermode);
        canvas.save();
        canvas.translate(i, i2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.restore();
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        if (width >= width2 || height >= height2) {
            Paint paint2 = new Paint();
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawRect(0.0f, 0.0f, i, height, paint2);
            canvas.drawRect(i + width2, 0.0f, width, height, paint2);
            canvas.drawRect(0.0f, 0.0f, width, i2, paint2);
            canvas.drawRect(0.0f, i2 + height2, width, height, paint2);
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() / bitmap.getHeight() == i / i2) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmap != createScaledBitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        } else if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float min = Math.min(i / width, i2 / height);
            canvas.translate((i - (width * min)) / 2.0f, (i2 - (height * min)) / 2.0f);
            canvas.scale(min, min);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap.recycle();
            return createBitmap;
        } else {
            return bitmap;
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        int i = 0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 0;
        while (true) {
            if (i2 >= width) {
                break;
            } else if (Color.alpha(bitmap.getPixel(i2, 0)) != 0) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        if (i != 0) {
            Bitmap createBitmap = Bitmap.createBitmap(width - (i * 2), height, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, -i, 0.0f, (Paint) null);
            bitmap.recycle();
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width / height == i / i2) {
            if (i == width && i2 == height) {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                bitmap.recycle();
                return copy;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmap != createScaledBitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        } else if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f3 = i / width2;
            float f4 = i2 / height2;
            boolean z = width2 < i && height2 < i2;
            float max = Math.max(f3, f4);
            float f5 = width2 * max;
            float f6 = max * height2;
            if (z) {
                f2 = (i - f5) / 2.0f;
                f = (i2 - f6) / 2.0f;
            } else {
                int i3 = f5 > ((float) (i * 2)) ? i * 2 : (int) f5;
                float f7 = (i3 - f5) / 2.0f;
                i = i3;
                f = (i2 - f6) / 2.0f;
                f2 = f7;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.translate(f2, f);
            canvas.scale(max, max);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap.recycle();
            return createBitmap;
        } else {
            return bitmap;
        }
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() >= i || bitmap.getHeight() >= i2) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float min = Math.min(i / width, i2 / height);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * min), (int) (height * min), true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
        return bitmap;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (createScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return createScaledBitmap;
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        return f(e(bitmap, i, i3), i2, i4);
    }

    public static Bitmap e(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i <= width && i >= 0 && i2 > width) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, i - 1, height);
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            createBitmap2.recycle();
            Bitmap d = d(Bitmap.createBitmap(bitmap, i, 0, 1, height), (i2 - width) + 1, height);
            canvas.drawBitmap(d, i - 1, 0.0f, (Paint) null);
            d.recycle();
            Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, i + 1, 0, (width - i) - 1, height);
            canvas.drawBitmap(createBitmap3, (i + i2) - width, 0.0f, (Paint) null);
            createBitmap3.recycle();
            bitmap.recycle();
            return createBitmap;
        }
        return bitmap;
    }

    public static Bitmap f(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i > height || i < 0 || i2 <= height) {
            bitmap.recycle();
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, i - 1);
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
        createBitmap2.recycle();
        Bitmap d = d(Bitmap.createBitmap(bitmap, 0, i, width, 1), width, (i2 - height) + 1);
        canvas.drawBitmap(d, 0.0f, i - 1, (Paint) null);
        d.recycle();
        Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, 0, i + 1, width, (height - i) - 1);
        canvas.drawBitmap(createBitmap3, 0.0f, (i + i2) - height, (Paint) null);
        createBitmap3.recycle();
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap a(float f, int i) {
        int i2 = (int) (f * 2.0f);
        float f2 = i2 / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i2 + 2, i2 + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(1.0f + f2, 1.0f + f2, f2, paint);
        return createBitmap;
    }

    public static Bitmap b(float f, int i) {
        int a = (int) com.censivn.C3DEngine.b.b.a.a(f * 2.0f);
        float f2 = a / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(a + 2, a + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(1.0f + f2, 1.0f + f2, f2, paint);
        return createBitmap;
    }

    public static void a(Canvas canvas, float f, float f2, float f3, int i) {
        float a = com.censivn.C3DEngine.b.b.a.a(f2);
        float a2 = com.censivn.C3DEngine.b.b.a.a(f3);
        float a3 = ((int) com.censivn.C3DEngine.b.b.a.a(f * 2.0f)) / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(a + a3, a2 + a3, a3, paint);
    }
}
