package com.tsf.extend.theme;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* renamed from: com.tsf.extend.theme.i */
/* loaded from: classes.dex */
public class C1845i extends Drawable {

    /* renamed from: a */
    private int f5904a;

    /* renamed from: b */
    private int f5905b;

    /* renamed from: d */
    private Paint f5907d;

    /* renamed from: e */
    private RectF f5908e;

    /* renamed from: f */
    private RectF f5909f;

    /* renamed from: g */
    private float f5910g = 0.0f;

    /* renamed from: c */
    private Paint f5906c = new Paint();

    public C1845i(int i) {
        this.f5904a = i;
        this.f5905b = m7338a(i, 0.9f);
        this.f5906c.setColor(this.f5904a);
        this.f5907d = new Paint();
        this.f5907d.setColor(this.f5905b);
        this.f5908e = new RectF();
        this.f5909f = new RectF();
    }

    /* renamed from: a */
    public void m7339a(float f) {
        this.f5910g = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f5909f.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(this.f5909f, this.f5910g, this.f5910g, this.f5907d);
        this.f5908e.set(bounds.left, bounds.top, bounds.right, bounds.bottom - this.f5910g);
        canvas.drawRoundRect(this.f5908e, this.f5910g, this.f5910g, this.f5906c);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    /* renamed from: a */
    public static int m7338a(int i, float f) {
        return Color.argb(Color.alpha(i), Math.max((int) (Color.red(i) * f), 0), Math.max((int) (Color.green(i) * f), 0), Math.max((int) (Color.blue(i) * f), 0));
    }
}
