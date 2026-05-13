package com.tsf.shell.manager.p183o.p184a;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.p179k.C3518a;
/* renamed from: com.tsf.shell.manager.o.a.a */
/* loaded from: classes.dex */
public class C3561a {

    /* renamed from: u */
    private static TextPaint f11799u;

    /* renamed from: h */
    public Paint.Style f11807h;

    /* renamed from: l */
    public int f11811l;

    /* renamed from: m */
    public int f11812m;

    /* renamed from: n */
    public int f11813n;

    /* renamed from: o */
    public int f11814o;

    /* renamed from: p */
    public int f11815p;

    /* renamed from: s */
    public int f11818s;

    /* renamed from: t */
    public int f11819t;

    /* renamed from: a */
    public int f11800a = 0;

    /* renamed from: b */
    public int f11801b = 0;

    /* renamed from: c */
    public int f11802c = 12;

    /* renamed from: d */
    public int f11803d = -1;

    /* renamed from: f */
    public boolean f11805f = false;

    /* renamed from: g */
    public boolean f11806g = true;

    /* renamed from: i */
    public boolean f11808i = false;

    /* renamed from: j */
    public boolean f11809j = false;

    /* renamed from: k */
    public float f11810k = 0.0f;

    /* renamed from: q */
    public int f11816q = -1475276527;

    /* renamed from: r */
    public boolean f11817r = false;

    /* renamed from: e */
    public Typeface f11804e = C3518a.m2155b();

    /* renamed from: a */
    public void m2004a(int i) {
        this.f11800a = i;
    }

    /* renamed from: b */
    public void m1999b(int i) {
        this.f11801b = i;
    }

    /* renamed from: a */
    public void m2001a(boolean z) {
        this.f11805f = z;
    }

    /* renamed from: b */
    public void m1997b(boolean z) {
        this.f11806g = z;
    }

    /* renamed from: c */
    public void m1996c(int i) {
        this.f11811l = i;
    }

    /* renamed from: d */
    public void m1994d(int i) {
        this.f11813n = i;
    }

    /* renamed from: e */
    public void m1992e(int i) {
        this.f11815p = i;
    }

    /* renamed from: f */
    public void m1991f(int i) {
        this.f11815p = (int) (i * C0892a.f2567c);
    }

    /* renamed from: c */
    public void m1995c(boolean z) {
        this.f11817r = z;
    }

    /* renamed from: a */
    public void m2006a(float f) {
        this.f11802c = (int) f;
    }

    /* renamed from: b */
    public void m2000b(float f) {
        this.f11809j = true;
        this.f11810k = C0892a.f2567c * f;
    }

    /* renamed from: g */
    public void m1990g(int i) {
        this.f11816q = i;
    }

    /* renamed from: d */
    public void m1993d(boolean z) {
        this.f11808i = z;
    }

    /* renamed from: h */
    public void m1989h(int i) {
        this.f11802c = (int) (i * C0892a.f2567c);
    }

    /* renamed from: i */
    public void m1988i(int i) {
        this.f11803d = i;
    }

    /* renamed from: a */
    public void m2002a(String str) {
        int i;
        TextPaint m2007a = m2007a();
        if (this.f11800a != 0 && this.f11801b != 0) {
            this.f11818s = this.f11800a;
            this.f11819t = this.f11801b;
            return;
        }
        if (this.f11817r) {
            if (this.f11800a == 0) {
                i = this.f11815p == 0 ? (int) (m2007a.measureText(str, 0, str.length()) + 2.0f) : this.f11815p;
            } else {
                i = this.f11800a;
            }
            this.f11818s = i;
            this.f11819t = this.f11801b == 0 ? new StaticLayout(str, m2007a, this.f11818s, this.f11805f ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight() : this.f11801b;
        } else {
            this.f11818s = this.f11800a == 0 ? (int) (m2007a.measureText(str, 0, str.length()) + 2.0f) : this.f11800a;
            this.f11819t = this.f11801b == 0 ? m2003a(m2007a) : this.f11801b;
        }
        if (this.f11815p != 0) {
            this.f11818s = this.f11818s > this.f11815p ? this.f11815p : this.f11818s;
        }
    }

    /* renamed from: b */
    public Bitmap m1998b(String str) {
        int i;
        TextPaint m2007a = m2007a();
        m2002a(str);
        if (this.f11818s == 0 || this.f11819t == 0) {
            return null;
        }
        if (this.f11817r) {
            i = this.f11815p == 0 ? this.f11818s : this.f11815p;
        } else {
            i = this.f11818s;
        }
        return C3563c.m1980a(str, i, this.f11817r ? 0 : this.f11819t, this.f11811l, this.f11812m, m2007a, this.f11805f, this.f11806g, this.f11813n, this.f11814o, this.f11809j, this.f11816q, this.f11810k);
    }

    /* renamed from: a */
    private TextPaint m2007a() {
        TextPaint m2005a = m2005a(this.f11802c, this.f11803d, this.f11804e);
        if (this.f11807h != null) {
            m2005a.setStyle(this.f11807h);
        }
        m2005a.setFakeBoldText(this.f11808i);
        return m2005a;
    }

    /* renamed from: a */
    public static int m2003a(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
    }

    /* renamed from: a */
    private static TextPaint m2005a(float f, int i, Typeface typeface) {
        if (f11799u == null) {
            f11799u = new TextPaint();
        }
        f11799u.reset();
        f11799u.setColor(i);
        if (typeface != null) {
            f11799u.setTypeface(typeface);
        }
        f11799u.setTextSize(f);
        f11799u.setAntiAlias(true);
        f11799u.setTextAlign(Paint.Align.LEFT);
        return f11799u;
    }
}
