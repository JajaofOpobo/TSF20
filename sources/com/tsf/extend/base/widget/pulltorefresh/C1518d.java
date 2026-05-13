package com.tsf.extend.base.widget.pulltorefresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.d */
/* loaded from: classes.dex */
public class C1518d extends Drawable {

    /* renamed from: a */
    Paint f4773a;

    /* renamed from: b */
    SweepGradient f4774b;

    /* renamed from: c */
    float f4775c;

    /* renamed from: d */
    private int f4776d;

    /* renamed from: e */
    private int f4777e;

    /* renamed from: f */
    private int[] f4778f;

    public C1518d(Context context, int i) {
        this.f4776d = 3;
        this.f4777e = 1;
        this.f4778f = new int[]{5526612, 5526612, -11250604};
        this.f4777e = i;
        m8341a(context);
    }

    public C1518d(Context context, int i, int i2) {
        this.f4776d = 3;
        this.f4777e = 1;
        this.f4778f = new int[]{5526612, 5526612, -11250604};
        this.f4777e = i;
        this.f4776d = i2;
        m8341a(context);
    }

    /* renamed from: a */
    private void m8341a(Context context) {
        this.f4775c = context.getResources().getDisplayMetrics().density;
        this.f4773a = new Paint();
        this.f4773a.setAntiAlias(true);
        this.f4773a.setStyle(Paint.Style.STROKE);
        this.f4773a.setStrokeWidth(this.f4776d * this.f4775c);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        super.onLevelChange(i);
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    public void m8340a(int[] iArr) {
        this.f4778f = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4774b == null) {
            this.f4774b = new SweepGradient(getBounds().centerX(), getBounds().centerY(), this.f4778f, new float[]{0.0f, 0.2f, 1.0f});
            this.f4773a.setShader(this.f4774b);
        }
        canvas.save();
        canvas.rotate(((this.f4777e * getLevel()) * 360.0f) / 10000.0f, getBounds().centerX(), getBounds().centerY());
        canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), (getBounds().width() / 2) - (this.f4776d * this.f4775c), this.f4773a);
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
