package com.tsf.shell;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
/* renamed from: com.tsf.shell.i */
/* loaded from: classes.dex */
public class C3358i extends View {

    /* renamed from: a */
    private Paint f11076a;

    /* renamed from: b */
    private Path f11077b;

    /* renamed from: c */
    private float f11078c;

    /* renamed from: d */
    private int f11079d;

    /* renamed from: e */
    private int f11080e;

    /* renamed from: f */
    private float f11081f;

    /* renamed from: g */
    private float f11082g;

    public C3358i(Context context, int i) {
        super(context);
        this.f11076a = new Paint(1);
        this.f11076a.setStyle(Paint.Style.STROKE);
        this.f11077b = new Path();
        this.f11080e = i;
    }

    /* renamed from: a */
    public void m2777a(int i) {
        this.f11080e = i;
        this.f11076a.setColor(i);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f11076a.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{10.0f, 5.0f, 5.0f, 5.0f}, this.f11078c), new CornerPathEffect(80.0f)));
        this.f11076a.setColor(this.f11080e);
        canvas.drawPath(this.f11077b, this.f11076a);
        invalidate();
    }

    /* renamed from: a */
    public void m2778a(float f, float f2) {
        this.f11076a.setStrokeWidth(4.0f * C0892a.f2566b);
        this.f11077b.reset();
        this.f11077b.moveTo(f, f2);
        this.f11081f = f;
        this.f11082g = f2;
        invalidate();
    }

    /* renamed from: b */
    public void m2776b(float f, float f2) {
        float abs = Math.abs(f - this.f11081f);
        float abs2 = Math.abs(f2 - this.f11082g);
        if (abs >= 13.0f || abs2 >= 13.0f) {
            this.f11077b.quadTo(this.f11081f, this.f11082g, (this.f11081f + f) / 2.0f, (this.f11082g + f2) / 2.0f);
            this.f11081f = f;
            this.f11082g = f2;
            this.f11079d++;
        }
    }

    public int getPointCount() {
        return this.f11079d;
    }

    /* renamed from: a */
    public void m2779a() {
        this.f11077b.lineTo(this.f11081f, this.f11082g);
        this.f11077b.reset();
        this.f11079d = 0;
    }
}
