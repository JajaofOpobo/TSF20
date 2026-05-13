package com.tsf.shell.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
/* renamed from: com.tsf.shell.utils.p */
/* loaded from: classes.dex */
public class C4180p {
    /* renamed from: a */
    public static Bitmap m652a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        int i4 = i / 2;
        paint.setColor(i3);
        paint.setStrokeWidth(i2);
        canvas.drawCircle(i4, i4, ((i - i2) - 2) / 2, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m650a(Bitmap bitmap, float f, float f2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(m654a(f, f2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m651a(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(m655a(f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    /* renamed from: a */
    public static ColorFilter m654a(float f, float f2) {
        ColorMatrix colorMatrix = new ColorMatrix();
        if (f != 0.0f) {
            m649a(colorMatrix, f);
        }
        if (f2 != 0.0f) {
            m647b(colorMatrix, f2);
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* renamed from: a */
    public static ColorFilter m655a(float f) {
        ColorMatrix colorMatrix = new ColorMatrix();
        m647b(colorMatrix, f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* renamed from: a */
    public static void m649a(ColorMatrix colorMatrix, float f) {
        float m648b = (m648b(f, 180.0f) / 180.0f) * 3.1415927f;
        if (m648b != 0.0f) {
            float cos = (float) Math.cos(m648b);
            float sin = (float) Math.sin(m648b);
            colorMatrix.postConcat(new ColorMatrix(new float[]{((1.0f - 0.213f) * cos) + 0.213f + ((-0.213f) * sin), ((-0.715f) * cos) + 0.715f + ((-0.715f) * sin), ((-0.072f) * cos) + 0.072f + ((1.0f - 0.072f) * sin), 0.0f, 0.0f, ((-0.213f) * cos) + 0.213f + (0.143f * sin), ((1.0f - 0.715f) * cos) + 0.715f + (0.14f * sin), ((-0.072f) * cos) + 0.072f + ((-0.283f) * sin), 0.0f, 0.0f, ((-(1.0f - 0.213f)) * sin) + ((-0.213f) * cos) + 0.213f, (0.715f * sin) + ((-0.715f) * cos) + 0.715f, (sin * 0.072f) + (cos * (1.0f - 0.072f)) + 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
    }

    /* renamed from: b */
    public static void m647b(ColorMatrix colorMatrix, float f) {
        float m648b = m648b(f, 100.0f);
        if (m648b != 0.0f) {
            float f2 = (m648b > 0.0f ? (m648b * 3.0f) / 100.0f : m648b / 100.0f) + 1.0f;
            colorMatrix.postConcat(new ColorMatrix(new float[]{((1.0f - f2) * 0.3086f) + f2, (1.0f - f2) * 0.6094f, (1.0f - f2) * 0.082f, 0.0f, 0.0f, (1.0f - f2) * 0.3086f, ((1.0f - f2) * 0.6094f) + f2, (1.0f - f2) * 0.082f, 0.0f, 0.0f, 0.3086f * (1.0f - f2), 0.6094f * (1.0f - f2), f2 + ((1.0f - f2) * 0.082f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        }
    }

    /* renamed from: b */
    protected static float m648b(float f, float f2) {
        return Math.min(f2, Math.max(-f2, f));
    }

    /* renamed from: a */
    public static ColorFilter m653a(int i) {
        ColorMatrix colorMatrix = new ColorMatrix();
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        float f = red + green + blue;
        float max = (((Math.max(red, Math.max(green, blue)) + Math.min(red, Math.min(green, blue))) / 2) / 255.0f) * 1.5f;
        float f2 = red / f;
        float f3 = green / f;
        float f4 = blue / f;
        float f5 = 1.351f * max;
        float f6 = 1.203f * max;
        float f7 = max * 0.937f;
        colorMatrix.postConcat(new ColorMatrix(new float[]{f5 * f2, f6 * f2, f2 * f7, 0.0f, 0.0f, f5 * f3, f6 * f3, f3 * f7, 0.0f, 0.0f, f5 * f4, f6 * f4, f7 * f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
        return new ColorMatrixColorFilter(colorMatrix);
    }
}
