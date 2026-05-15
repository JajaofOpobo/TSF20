package com.tsf.shell.manager.o.a;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a {
    private static TextPaint u;
    public Paint.Style h;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int s;
    public int t;
    public int a = 0;
    public int b = 0;
    public int c = 12;
    public int d = -1;
    public boolean f = false;
    public boolean g = true;
    public boolean i = false;
    public boolean j = false;
    public float k = 0.0f;
    public int q = -1475276527;
    public boolean r = false;
    public Typeface e = com.tsf.shell.manager.k.a.b();

    public void a(int i) {
        this.a = i;
    }

    public void b(int i) {
        this.b = i;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public void b(boolean z) {
        this.g = z;
    }

    public void c(int i) {
        this.l = i;
    }

    public void d(int i) {
        this.n = i;
    }

    public void e(int i) {
        this.p = i;
    }

    public void f(int i) {
        this.p = (int) (i * com.censivn.C3DEngine.b.b.a.c);
    }

    public void c(boolean z) {
        this.r = z;
    }

    public void a(float f) {
        this.c = (int) f;
    }

    public void b(float f) {
        this.j = true;
        this.k = com.censivn.C3DEngine.b.b.a.c * f;
    }

    public void g(int i) {
        this.q = i;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public void h(int i) {
        this.c = (int) (i * com.censivn.C3DEngine.b.b.a.c);
    }

    public void i(int i) {
        this.d = i;
    }

    public void a(String str) {
        int iMeasureText;
        TextPaint textPaintA = a();
        if (this.a != 0 && this.b != 0) {
            this.s = this.a;
            this.t = this.b;
            return;
        }
        if (this.r) {
            if (this.a == 0) {
                iMeasureText = this.p == 0 ? (int) (textPaintA.measureText(str, 0, str.length()) + 2.0f) : this.p;
            } else {
                iMeasureText = this.a;
            }
            this.s = iMeasureText;
            this.t = this.b == 0 ? new StaticLayout(str, textPaintA, this.s, this.f ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight() : this.b;
        } else {
            this.s = this.a == 0 ? (int) (textPaintA.measureText(str, 0, str.length()) + 2.0f) : this.a;
            this.t = this.b == 0 ? a(textPaintA) : this.b;
        }
        if (this.p != 0) {
            this.s = this.s > this.p ? this.p : this.s;
        }
    }

    public Bitmap b(String str) {
        TextPaint textPaintA = a();
        a(str);
        if (this.s == 0 || this.t == 0) {
            return null;
        }
        int i = (!this.r || this.p == 0) ? this.s : this.p;
        return c.a(str, i, this.r ? 0 : this.t, this.l, this.m, textPaintA, this.f, this.g, this.n, this.o, this.j, this.q, this.k);
    }

    private TextPaint a() {
        TextPaint textPaintA = a(this.c, this.d, this.e);
        if (this.h != null) {
            textPaintA.setStyle(this.h);
        }
        textPaintA.setFakeBoldText(this.i);
        return textPaintA;
    }

    public static int a(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return ((int) Math.ceil(fontMetrics.descent - fontMetrics.top)) + 2;
    }

    private static TextPaint a(float f, int i, Typeface typeface) {
        if (u == null) {
            u = new TextPaint();
        }
        u.reset();
        u.setColor(i);
        if (typeface != null) {
            u.setTypeface(typeface);
        }
        u.setTextSize(f);
        u.setAntiAlias(true);
        u.setTextAlign(Paint.Align.LEFT);
        return u;
    }
}
