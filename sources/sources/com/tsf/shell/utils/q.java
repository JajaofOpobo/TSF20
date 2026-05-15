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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmap != bitmapCreateScaledBitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        }
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float fMin = Math.min(i / width, i2 / height);
            canvas.translate((i - (width * fMin)) / 2.0f, (i2 - (height * fMin)) / 2.0f);
            canvas.scale(fMin, fMin);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap) {
        int i = 0;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = 0;
        while (true) {
            if (i2 >= width) {
                break;
            }
            if (Color.alpha(bitmap.getPixel(i2, 0)) != 0) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i != 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width - (i * 2), height, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, -i, 0.0f, (Paint) null);
            bitmap.recycle();
            return bitmapCreateBitmap;
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
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                bitmap.recycle();
                return bitmapCopy;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmap != bitmapCreateScaledBitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        }
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f3 = i / width2;
            float f4 = i2 / height2;
            boolean z = width2 < i && height2 < i2;
            float fMax = Math.max(f3, f4);
            float f5 = width2 * fMax;
            float f6 = fMax * height2;
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
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.translate(f2, f);
            canvas.scale(fMax, fMax);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        return bitmap;
    }

    public static Bitmap c(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() >= i || bitmap.getHeight() >= i2) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float fMin = Math.min(i / width, i2 / height);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * fMin), (int) (height * fMin), true);
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        }
        return bitmap;
    }

    public static Bitmap d(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
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
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, i - 1, height);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
            bitmapCreateBitmap2.recycle();
            Bitmap bitmapD = d(Bitmap.createBitmap(bitmap, i, 0, 1, height), (i2 - width) + 1, height);
            canvas.drawBitmap(bitmapD, i - 1, 0.0f, (Paint) null);
            bitmapD.recycle();
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, i + 1, 0, (width - i) - 1, height);
            canvas.drawBitmap(bitmapCreateBitmap3, (i + i2) - width, 0.0f, (Paint) null);
            bitmapCreateBitmap3.recycle();
            bitmap.recycle();
            return bitmapCreateBitmap;
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
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, i - 1);
        canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
        bitmapCreateBitmap2.recycle();
        Bitmap bitmapD = d(Bitmap.createBitmap(bitmap, 0, i, width, 1), width, (i2 - height) + 1);
        canvas.drawBitmap(bitmapD, 0.0f, i - 1, (Paint) null);
        bitmapD.recycle();
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, 0, i + 1, width, (height - i) - 1);
        canvas.drawBitmap(bitmapCreateBitmap3, 0.0f, (i + i2) - height, (Paint) null);
        bitmapCreateBitmap3.recycle();
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap a(float f, int i) {
        int i2 = (int) (f * 2.0f);
        float f2 = i2 / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2 + 2, i2 + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(1.0f + f2, 1.0f + f2, f2, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap b(float f, int i) {
        int iA = (int) com.censivn.C3DEngine.b.b.a.a(f * 2.0f);
        float f2 = iA / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA + 2, iA + 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(1.0f + f2, 1.0f + f2, f2, paint);
        return bitmapCreateBitmap;
    }

    public static void a(Canvas canvas, float f, float f2, float f3, int i) {
        float fA = com.censivn.C3DEngine.b.b.a.a(f2);
        float fA2 = com.censivn.C3DEngine.b.b.a.a(f3);
        float fA3 = ((int) com.censivn.C3DEngine.b.b.a.a(f * 2.0f)) / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(fA + fA3, fA2 + fA3, fA3, paint);
    }
}
