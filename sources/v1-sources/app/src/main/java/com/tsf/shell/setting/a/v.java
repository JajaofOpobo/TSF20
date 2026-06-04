package com.tsf.shell.setting.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {
    public static int a;
    private static ArrayList b;
    private static Paint c;
    private static Paint d;

    public static void a() {
        a = com.tsf.shell.a.t.s();
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        arrayList.add(0);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
    }

    public static int b() {
        return b.size();
    }

    public static int a(int i) {
        return ((Integer) b.get(i)).intValue();
    }

    public static Bitmap a(String str) {
        return a(str, a);
    }

    public static Bitmap a(String str, int i) {
        switch (i) {
            case 0:
                return a(str, 22, true, false, null, -2);
            case 1:
                return a(str, 22, true, false, com.tsf.shell.workspace3D.i.a.a, 0);
            case 2:
                return a(str, 24, false, true, null, -4);
            case 3:
                return a(str, 24, false, true, com.tsf.shell.workspace3D.i.a.a, -4);
            case 4:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            default:
                return null;
        }
    }

    private static Bitmap a(String str, int i, boolean z, boolean z2, Typeface typeface, int i2) {
        if (c == null) {
            Paint paint = new Paint();
            c = paint;
            paint.setColor(-1);
            c.setAntiAlias(true);
            c.setTextAlign(Paint.Align.LEFT);
        }
        c.setTypeface(typeface);
        if (z2) {
            c.setShadowLayer(1.0f, 1.0f, 1.0f, -16777216);
        } else {
            c.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
        }
        c.setTextSize(ap.a(i));
        return a(str, ap.C - 2, ap.D, c, true, true, i2, z, ap.F);
    }

    public static Bitmap b(String str, int i) {
        if (d == null) {
            d = new Paint();
        }
        d.setColor(-1);
        d.setTypeface(com.tsf.shell.workspace3D.i.a.a);
        d.setTextSize(i);
        d.setAntiAlias(true);
        d.setTextAlign(Paint.Align.LEFT);
        d.setStrokeCap(Paint.Cap.ROUND);
        d.setStyle(Paint.Style.FILL_AND_STROKE);
        Rect rect = new Rect();
        d.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(((int) d.measureText(str, 0, str.length())) + 1, rect.height(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str, 2.0f, rect.height(), d);
        return createBitmap;
    }

    public static Bitmap a(String str, int i, int i2, Paint paint, boolean z, boolean z2, int i3) {
        return a(str, i, i2, paint, z, z2, i3, false, 0.0f);
    }

    private static Bitmap a(String str, int i, int i2, Paint paint, boolean z, boolean z2, int i3, boolean z3, float f) {
        int i4;
        if (str == null) {
            str = " ";
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z3) {
            RectF rectF = new RectF(new Rect(0, 0, i, i2));
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(-1476395008);
            canvas.drawRoundRect(rectF, f, f, paint2);
            i4 = i - 20;
        } else {
            i4 = i;
        }
        String str2 = "";
        if (paint.measureText(str, 0, str.length()) > i4) {
            int length = str.length();
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    String str3 = String.valueOf(str.substring(0, i5 + 1)) + "...";
                    if (paint.measureText(str3, 0, str3.length()) > i4) {
                        str = str2;
                        break;
                    }
                    i5++;
                    str2 = str3;
                } else {
                    str = str2;
                    break;
                }
            }
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = fontMetrics.bottom - fontMetrics.top;
        float f3 = fontMetrics.bottom;
        if (z2) {
            f2 = ((i2 - ((i2 - f2) / 2.0f)) - fontMetrics.bottom) + 1.0f;
        }
        if (z) {
            paint.setTextAlign(Paint.Align.CENTER);
            canvas.drawText(str, (i / 2) + 0, f2 + i3, paint);
        } else {
            canvas.drawText(str, 0.0f, f2 + i3, paint);
        }
        return createBitmap;
    }
}
