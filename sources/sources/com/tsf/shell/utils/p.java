package com.tsf.shell.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class p {
    public static Bitmap a(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int i4 = i / 2;
        paint.setColor(i3);
        paint.setStrokeWidth(i2);
        canvas.drawCircle(i4, i4, ((i - i2) - 2) / 2, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f, float f2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(a(f, f2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(a(f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static ColorFilter a(float f, float f2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        if (f != 0.0f) {
            a(colorMatrix, f);
        }
        if (f2 != 0.0f) {
            b(colorMatrix, f2);
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static ColorFilter a(float f) {
        ColorMatrix colorMatrix = new ColorMatrix();
        b(colorMatrix, f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static void a(ColorMatrix colorMatrix, float f) {
        float fB = (b(f, 180.0f) / 180.0f) * 3.1415927f;
        if (fB != 0.0f) {
            float fCos = (float) Math.cos(fB);
            float fSin = (float) Math.sin(fB);
            colorMatrix.postConcat(new ColorMatrix(new float[]{((1.0f - 0.213f) * fCos) + 0.213f + ((-0.213f) * fSin), ((-0.715f) * fCos) + 0.715f + ((-0.715f) * fSin), ((-0.072f) * fCos) + 0.072f + ((1.0f - 0.072f) * fSin), 0.0f, 0.0f, ((-0.213f) * fCos) + 0.213f + (0.143f * fSin), ((1.0f - 0.715f) * fCos) + 0.715f + (0.14f * fSin), ((-0.072f) * fCos) + 0.072f + ((-0.283f) * fSin), 0.0f, 0.0f, ((-(1.0f - 0.213f)) * fSin) + ((-0.213f) * fCos) + 0.213f, (0.715f * fSin) + ((-0.715f) * fCos) + 0.715f, (fSin * 0.072f) + (fCos * (1.0f - 0.072f)) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
    }

    public static void b(ColorMatrix colorMatrix, float f) {
        float fB = b(f, 100.0f);
        if (fB != 0.0f) {
            float f2 = (fB > 0.0f ? (fB * 3.0f) / 100.0f : fB / 100.0f) + 1.0f;
            colorMatrix.postConcat(new ColorMatrix(new float[]{((1.0f - f2) * 0.3086f) + f2, (1.0f - f2) * 0.6094f, (1.0f - f2) * 0.082f, 0.0f, 0.0f, (1.0f - f2) * 0.3086f, ((1.0f - f2) * 0.6094f) + f2, (1.0f - f2) * 0.082f, 0.0f, 0.0f, 0.3086f * (1.0f - f2), 0.6094f * (1.0f - f2), f2 + ((1.0f - f2) * 0.082f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
    }

    protected static float b(float f, float f2) {
        return Math.min(f2, Math.max(-f2, f));
    }

    public static ColorFilter a(int i) {
        ColorMatrix colorMatrix = new ColorMatrix();
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        float f = iRed + iGreen + iBlue;
        float fMax = (((Math.max(iRed, Math.max(iGreen, iBlue)) + Math.min(iRed, Math.min(iGreen, iBlue))) / 2) / 255.0f) * 1.5f;
        float f2 = iRed / f;
        float f3 = iGreen / f;
        float f4 = iBlue / f;
        float f5 = 1.351f * fMax;
        float f6 = 1.203f * fMax;
        float f7 = fMax * 0.937f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f5 * f2, f6 * f2, f2 * f7, 0.0f, 0.0f, f5 * f3, f6 * f3, f3 * f7, 0.0f, 0.0f, f5 * f4, f6 * f4, f7 * f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        return new ColorMatrixColorFilter(colorMatrix);
    }
}
