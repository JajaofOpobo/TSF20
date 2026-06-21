package com.tsf.shell.manager.o.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    public static b a;
    public static int b = 0;
    private static ArrayList c;
    private static TextPaint d;

    public static void a() {
        b.a = com.censivn.C3DEngine.a.d().getResources().getDimensionPixelSize(R.dimen.shortcut_text_size);
        c = new ArrayList();
        c.add(new e(-1, new d()));
        d dVar = new d();
        b bVar = new b(0, dVar);
        dVar.g = b.a;
        dVar.c = true;
        dVar.d = false;
        c.add(bVar);
        d dVar2 = new d();
        b bVar2 = new b(1, dVar2);
        dVar2.g = b.a;
        dVar2.c = true;
        dVar2.d = true;
        c.add(bVar2);
        d dVar3 = new d();
        b bVar3 = new b(2, dVar3);
        dVar3.g = b.a;
        dVar3.a = true;
        c.add(bVar3);
        d dVar4 = new d();
        b bVar4 = new b(3, dVar4);
        dVar4.g = b.a;
        dVar4.a = true;
        dVar4.d = true;
        c.add(bVar4);
        c.add(a(-5293790, false));
        c.add(a(-1616875, false));
        c.add(a(-1209320, false));
        c.add(a(-16749648, false));
        c.add(a(-5544624, false));
        c.add(a(-10586556, false));
        c.add(a(-12361639, false));
        c.add(a(-15300748, false));
        c.add(a(-11830901, false));
        c.add(a(-9271680, false));
        c.add(a(-8213196, false));
        c.add(a(-11055295, false));
        c.add(a(-2210181, false));
        c.add(a(-10403741, false));
        c.add(a(-2201238, false));
        Iterator it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((b) it.next()).c = i;
            i++;
        }
        a = b(g.h(0));
        com.tsf.shell.manager.o.b.a.ab = a;
        com.tsf.shell.manager.o.b.c.ab = (b) c.get(1);
    }

    private static b a(int i, boolean z) {
        d dVar = new d();
        b bVar = new b(c.size(), dVar);
        dVar.g = b.a;
        dVar.a = true;
        dVar.b = i;
        dVar.d = z;
        return bVar;
    }

    public static void a(int i) {
        b b2 = b(i);
        if (b2 != a) {
            a = b2;
            com.tsf.shell.manager.o.b.a.ab = a;
            g.g(i);
            Home.b().a(VEasing.Back.easeIn);
        }
    }

    public static b b(int i) {
        Iterator it = c.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b == i) {
                return bVar;
            }
        }
        return (b) c.get(1);
    }

    public static int b() {
        return c.size();
    }

    public static b c(int i) {
        return (b) c.get(i);
    }

    public static Bitmap a(String str, int i, com.tsf.shell.manager.o.a aVar, d dVar) {
        if (d == null) {
            d = new TextPaint();
            d.setColor(-1118482);
            d.setAntiAlias(true);
            d.setTextAlign(Paint.Align.LEFT);
            if (com.tsf.shell.manager.k.a.b() != null) {
                d.setTypeface(com.tsf.shell.manager.k.a.b());
            }
        }
        d.setFakeBoldText(dVar.d);
        if (dVar.c) {
            d.setShadowLayer(3.0f * com.censivn.C3DEngine.b.b.a.c, 2.0f * com.censivn.C3DEngine.b.b.a.c, 2.0f * com.censivn.C3DEngine.b.b.a.c, -587202560);
        } else {
            d.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
        }
        d.setTextSize(aVar.a(i));
        return a(str, aVar.J, aVar.K, 0, 0, d, true, true, 0, 0, dVar.a, dVar.b, aVar.C);
    }

    public static Bitmap a(String str, int i, int i2, int i3, int i4, TextPaint textPaint, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, float f) {
        int i8;
        float f2;
        String str2 = str == null ? " " : str;
        StaticLayout staticLayout = null;
        boolean z4 = false;
        if (i2 == 0) {
            StaticLayout staticLayout2 = new StaticLayout(str2, textPaint, i + i3, z ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            i2 = staticLayout2.getHeight();
            staticLayout = staticLayout2;
            z4 = true;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i + i3, i2 + i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z3) {
            RectF rectF = new RectF(new Rect(0, 0, i, i2));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(i7);
            canvas.drawRoundRect(rectF, f, f, paint);
            i8 = (int) (i - (2.0f * f));
        } else {
            i8 = i;
        }
        float measureText = textPaint.measureText(str2, 0, str2.length());
        if (!z4 && measureText > i8) {
            int length = str2.length();
            String str3 = "";
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    str2 = str3;
                    break;
                }
                String str4 = String.valueOf(str2.substring(0, i9 + 1)) + "...";
                if (textPaint.measureText(str4, 0, str4.length()) > i8) {
                    str2 = str3;
                    break;
                }
                i9++;
                str3 = str4;
            }
        }
        if (z4) {
            if (z2) {
                f2 = ((i2 - staticLayout.getHeight()) / 2.0f) + i6;
            } else {
                f2 = i6;
            }
            canvas.translate(0.0f, f2);
            staticLayout.draw(canvas);
        } else {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f3 = fontMetrics.bottom - fontMetrics.top;
            if (z2) {
                f3 = ((i2 - ((i2 - f3) / 2.0f)) - fontMetrics.bottom) - 1.0f;
            }
            if (z) {
                textPaint.setTextAlign(Paint.Align.CENTER);
                canvas.drawText(str2, (i / 2) + i5, f3 + i6, textPaint);
            } else {
                canvas.drawText(str2, i5, f3 + i6, textPaint);
            }
        }
        return createBitmap;
    }
}
