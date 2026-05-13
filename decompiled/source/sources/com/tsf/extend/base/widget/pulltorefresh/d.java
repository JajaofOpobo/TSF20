package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public class d extends Drawable {
    Paint a;
    SweepGradient b;
    float c;
    private int d;
    private int e;
    private int[] f;

    public d(Context context, int i) {
        this.d = 3;
        this.e = 1;
        this.f = new int[]{5526612, 5526612, -11250604};
        this.e = i;
        a(context);
    }

    public d(Context context, int i, int i2) {
        this.d = 3;
        this.e = 1;
        this.f = new int[]{5526612, 5526612, -11250604};
        this.e = i;
        this.d = i2;
        a(context);
    }

    private void a(Context context) {
        this.c = context.getResources().getDisplayMetrics().density;
        this.a = new Paint();
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.d * this.c);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        super.onLevelChange(i);
        invalidateSelf();
        return true;
    }

    public void a(int[] iArr) {
        this.f = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.b == null) {
            this.b = new SweepGradient(getBounds().centerX(), getBounds().centerY(), this.f, new float[]{0.0f, 0.2f, 1.0f});
            this.a.setShader(this.b);
        }
        canvas.save();
        canvas.rotate(((this.e * getLevel()) * 360.0f) / 10000.0f, getBounds().centerX(), getBounds().centerY());
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), (getBounds().width() / 2) - (this.d * this.c), this.a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
