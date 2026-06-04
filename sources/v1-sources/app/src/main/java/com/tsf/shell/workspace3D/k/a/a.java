package com.tsf.shell.workspace3D.k.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends View {
    private Paint a;
    private Path b;
    private float c;
    private int d;
    private float e;
    private float f;

    public a(Context context) {
        super(context);
        this.a = new Paint(1);
        this.a.setStyle(Paint.Style.STROKE);
        this.b = new Path();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        this.a.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{10.0f, 5.0f, 5.0f, 5.0f}, this.c), new CornerPathEffect(80.0f)));
        this.a.setColor(-65536);
        canvas.drawPath(this.b, this.a);
        invalidate();
    }

    public final void a(float f, float f2) {
        this.a.setStrokeWidth(4.0f * com.censivn.C3DEngine.a.b);
        this.b.reset();
        this.b.moveTo(f, f2);
        this.e = f;
        this.f = f2;
        invalidate();
    }

    public final void b(float f, float f2) {
        float abs = Math.abs(f - this.e);
        float abs2 = Math.abs(f2 - this.f);
        if (abs >= 13.0f || abs2 >= 13.0f) {
            this.b.quadTo(this.e, this.f, (this.e + f) / 2.0f, (this.f + f2) / 2.0f);
            this.e = f;
            this.f = f2;
            this.d++;
        }
    }

    public final int a() {
        return this.d;
    }

    public final void b() {
        this.b.lineTo(this.e, this.f);
        this.b.reset();
        this.d = 0;
    }
}
