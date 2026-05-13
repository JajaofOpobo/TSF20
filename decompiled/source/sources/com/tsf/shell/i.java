package com.tsf.shell;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
/* loaded from: classes.dex */
public class i extends View {
    private Paint a;
    private Path b;
    private float c;
    private int d;
    private int e;
    private float f;
    private float g;

    public i(Context context, int i) {
        super(context);
        this.a = new Paint(1);
        this.a.setStyle(Paint.Style.STROKE);
        this.b = new Path();
        this.e = i;
    }

    public void a(int i) {
        this.e = i;
        this.a.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.a.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{10.0f, 5.0f, 5.0f, 5.0f}, this.c), new CornerPathEffect(80.0f)));
        this.a.setColor(this.e);
        canvas.drawPath(this.b, this.a);
        invalidate();
    }

    public void a(float f, float f2) {
        this.a.setStrokeWidth(4.0f * com.censivn.C3DEngine.b.b.a.b);
        this.b.reset();
        this.b.moveTo(f, f2);
        this.f = f;
        this.g = f2;
        invalidate();
    }

    public void b(float f, float f2) {
        float abs = Math.abs(f - this.f);
        float abs2 = Math.abs(f2 - this.g);
        if (abs >= 13.0f || abs2 >= 13.0f) {
            this.b.quadTo(this.f, this.g, (this.f + f) / 2.0f, (this.g + f2) / 2.0f);
            this.f = f;
            this.g = f2;
            this.d++;
        }
    }

    public int getPointCount() {
        return this.d;
    }

    public void a() {
        this.b.lineTo(this.f, this.g);
        this.b.reset();
        this.d = 0;
    }
}
