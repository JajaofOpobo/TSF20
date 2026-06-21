package com.tsf.shell.manager.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes.dex */
class b extends View {
    public static float a;
    private float b;
    private float c;
    private float d;

    public b(Context context) {
        super(context);
        this.d = (com.censivn.C3DEngine.b.b.a.e * 10.0f) + 10.0f;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = getHeight();
        this.b = getWidth();
        a = this.b - (40.0f * com.censivn.C3DEngine.b.b.a.e);
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        float f = this.d;
        float f2 = this.c / 2.0f;
        float f3 = com.censivn.C3DEngine.b.b.a.b * 10.0f;
        paint = a.b;
        canvas.drawCircle(f, f2, f3, paint);
        float f4 = a;
        float f5 = this.c / 2.0f;
        float f6 = com.censivn.C3DEngine.b.b.a.b * 10.0f;
        paint2 = a.b;
        canvas.drawCircle(f4, f5, f6, paint2);
    }
}
