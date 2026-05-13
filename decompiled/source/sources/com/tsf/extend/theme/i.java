package com.tsf.extend.theme;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class i extends Drawable {
    private int a;
    private int b;
    private Paint d;
    private RectF e;
    private RectF f;
    private float g = 0.0f;
    private Paint c = new Paint();

    public i(int i) {
        this.a = i;
        this.b = a(i, 0.9f);
        this.c.setColor(this.a);
        this.d = new Paint();
        this.d.setColor(this.b);
        this.e = new RectF();
        this.f = new RectF();
    }

    public void a(float f) {
        this.g = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        canvas.drawRoundRect(this.f, this.g, this.g, this.d);
        this.e.set(bounds.left, bounds.top, bounds.right, bounds.bottom - this.g);
        canvas.drawRoundRect(this.e, this.g, this.g, this.c);
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

    public static int a(int i, float f) {
        return Color.argb(Color.alpha(i), Math.max((int) (Color.red(i) * f), 0), Math.max((int) (Color.green(i) * f), 0), Math.max((int) (Color.blue(i) * f), 0));
    }
}
