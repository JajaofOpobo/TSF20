package com.tsf.shell.manager.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
class c extends View {
    private static PathEffect c;
    private Paint a;
    private Path b;
    private float d;
    private float e;
    private float f;

    private static void a(float f) {
        c = new ComposePathEffect(new PathDashPathEffect(b(), 12.0f, f, PathDashPathEffect.Style.ROTATE), new CornerPathEffect(10.0f));
    }

    public c(Context context) {
        super(context);
        this.a = new Paint(1);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(6.0f);
        this.b = a();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f = getHeight();
        this.e = getWidth();
        this.b.lineTo(this.e, 0.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        RectF rectF = new RectF();
        this.b.computeBounds(rectF, false);
        canvas.translate(0.0f, (this.f / 2.0f) - rectF.top);
        a(this.d);
        this.d -= 1.0f;
        invalidate();
        this.a.setPathEffect(c);
        Paint paint = this.a;
        i = a.e;
        paint.setColor(i);
        canvas.drawPath(this.b, this.a);
        canvas.translate(0.0f, 0.0f);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    private static Path a() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        return path;
    }

    private static Path b() {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, -4.0f);
        path.lineTo(8.0f, -4.0f);
        path.lineTo(12.0f, 0.0f);
        path.lineTo(8.0f, 4.0f);
        path.lineTo(0.0f, 4.0f);
        return path;
    }
}
