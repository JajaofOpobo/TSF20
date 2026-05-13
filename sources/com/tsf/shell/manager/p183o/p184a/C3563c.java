package com.tsf.shell.manager.p183o.p184a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.manager.p179k.C3518a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.o.a.c */
/* loaded from: classes.dex */
public class C3563c {

    /* renamed from: a */
    public static C3562b f11828a;

    /* renamed from: b */
    public static int f11829b = 0;

    /* renamed from: c */
    private static ArrayList<C3562b> f11830c;

    /* renamed from: d */
    private static TextPaint f11831d;

    /* renamed from: com.tsf.shell.manager.o.a.c$a */
    /* loaded from: classes.dex */
    public static class C3564a {

        /* renamed from: a */
        public boolean f11832a = false;

        /* renamed from: b */
        public int f11833b = -1475276527;

        /* renamed from: c */
        public boolean f11834c = false;

        /* renamed from: d */
        public boolean f11835d = false;

        /* renamed from: e */
        public float f11836e = 0.0f;

        /* renamed from: f */
        public float f11837f = 0.0f;

        /* renamed from: g */
        public int f11838g = 30;
    }

    /* renamed from: a */
    public static void m1983a() {
        C3562b.f11820a = C0853a.m10856d().getResources().getDimensionPixelSize(C1306b.C1309c.shortcut_text_size);
        f11830c = new ArrayList<>();
        f11830c.add(new C3565d(-1, new C3564a()));
        C3564a c3564a = new C3564a();
        C3562b c3562b = new C3562b(0, c3564a);
        c3564a.f11838g = C3562b.f11820a;
        c3564a.f11834c = true;
        c3564a.f11835d = false;
        f11830c.add(c3562b);
        C3564a c3564a2 = new C3564a();
        C3562b c3562b2 = new C3562b(1, c3564a2);
        c3564a2.f11838g = C3562b.f11820a;
        c3564a2.f11834c = true;
        c3564a2.f11835d = true;
        f11830c.add(c3562b2);
        C3564a c3564a3 = new C3564a();
        C3562b c3562b3 = new C3562b(2, c3564a3);
        c3564a3.f11838g = C3562b.f11820a;
        c3564a3.f11832a = true;
        f11830c.add(c3562b3);
        C3564a c3564a4 = new C3564a();
        C3562b c3562b4 = new C3562b(3, c3564a4);
        c3564a4.f11838g = C3562b.f11820a;
        c3564a4.f11832a = true;
        c3564a4.f11835d = true;
        f11830c.add(c3562b4);
        f11830c.add(m1981a(-5293790, false));
        f11830c.add(m1981a(-1616875, false));
        f11830c.add(m1981a(-1209320, false));
        f11830c.add(m1981a(-16749648, false));
        f11830c.add(m1981a(-5544624, false));
        f11830c.add(m1981a(-10586556, false));
        f11830c.add(m1981a(-12361639, false));
        f11830c.add(m1981a(-15300748, false));
        f11830c.add(m1981a(-11830901, false));
        f11830c.add(m1981a(-9271680, false));
        f11830c.add(m1981a(-8213196, false));
        f11830c.add(m1981a(-11055295, false));
        f11830c.add(m1981a(-2210181, false));
        f11830c.add(m1981a(-10403741, false));
        f11830c.add(m1981a(-2201238, false));
        Iterator<C3562b> it = f11830c.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().f11823c = i;
            i++;
        }
        f11828a = m1977b(C3430e.m2461h(0));
        C3566b.f11839a.f11771ab = f11828a;
        C3566b.f11841c.f11771ab = f11830c.get(1);
    }

    /* renamed from: a */
    private static C3562b m1981a(int i, boolean z) {
        C3564a c3564a = new C3564a();
        C3562b c3562b = new C3562b(f11830c.size(), c3564a);
        c3564a.f11838g = C3562b.f11820a;
        c3564a.f11832a = true;
        c3564a.f11833b = i;
        c3564a.f11835d = z;
        return c3562b;
    }

    /* renamed from: a */
    public static void m1982a(int i) {
        C3562b m1977b = m1977b(i);
        if (m1977b != f11828a) {
            f11828a = m1977b;
            C3566b.f11839a.f11771ab = f11828a;
            C3430e.m2465g(i);
            Home.m6177b().m6186a(VEasing.Back.easeIn);
        }
    }

    /* renamed from: b */
    public static C3562b m1977b(int i) {
        Iterator<C3562b> it = f11830c.iterator();
        while (it.hasNext()) {
            C3562b next = it.next();
            if (next.f11822b == i) {
                return next;
            }
        }
        return f11830c.get(1);
    }

    /* renamed from: b */
    public static int m1978b() {
        return f11830c.size();
    }

    /* renamed from: c */
    public static C3562b m1976c(int i) {
        return f11830c.get(i);
    }

    /* renamed from: a */
    public static Bitmap m1979a(String str, int i, C3560a c3560a, C3564a c3564a) {
        if (f11831d == null) {
            f11831d = new TextPaint();
            f11831d.setColor(-1118482);
            f11831d.setAntiAlias(true);
            f11831d.setTextAlign(Paint.Align.LEFT);
            if (C3518a.m2155b() != null) {
                f11831d.setTypeface(C3518a.m2155b());
            }
        }
        f11831d.setFakeBoldText(c3564a.f11835d);
        if (c3564a.f11834c) {
            f11831d.setShadowLayer(3.0f * C0892a.f2567c, 2.0f * C0892a.f2567c, 2.0f * C0892a.f2567c, -587202560);
        } else {
            f11831d.setShadowLayer(0.0f, 0.0f, 0.0f, -16777216);
        }
        f11831d.setTextSize(c3560a.m2020a(i));
        return m1980a(str, c3560a.f11752J, c3560a.f11753K, 0, 0, f11831d, true, true, 0, 0, c3564a.f11832a, c3564a.f11833b, c3560a.f11745C);
    }

    /* renamed from: a */
    public static Bitmap m1980a(String str, int i, int i2, int i3, int i4, TextPaint textPaint, boolean z, boolean z2, int i5, int i6, boolean z3, int i7, float f) {
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
            while (i9 < length) {
                String str4 = str2.substring(0, i9 + 1) + "...";
                if (textPaint.measureText(str4, 0, str4.length()) > i8) {
                    break;
                }
                i9++;
                str3 = str4;
            }
            str2 = str3;
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
