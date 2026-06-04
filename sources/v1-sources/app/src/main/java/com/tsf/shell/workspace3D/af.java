package com.tsf.shell.workspace3D;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;

/* loaded from: classes.dex */
final class af extends View {
    private float a;
    private float b;
    private int c;
    private TranslateAnimation d;
    private int e;
    private View f;

    public af(Context context) {
        super(context);
        this.c = (int) ((com.censivn.C3DEngine.a.d * 10.0f) + 10.0f);
        this.f = this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        int i;
        AlertDialog alertDialog;
        Paint paint2;
        int i2;
        Paint paint3;
        Paint paint4;
        int i3;
        int rawX = (int) motionEvent.getRawX();
        switch (motionEvent.getAction()) {
            case 0:
                this.a = motionEvent.getX();
                break;
            case 1:
                if (this.e < ((int) (ad.a - this.c))) {
                    paint = z.c;
                    i = z.e;
                    paint.setColor(i);
                    this.d = new TranslateAnimation(0.0f, -this.e, 0.0f, 0.0f);
                    ag agVar = new ag(this);
                    int i4 = (int) ((this.e / (ad.a - this.c)) * 500.0f);
                    this.d.setAnimationListener(agVar);
                    this.d.setDuration(i4);
                    this.d.setFillAfter(true);
                    setAnimation(this.d);
                    this.d.start();
                    break;
                } else {
                    alertDialog = z.f;
                    alertDialog.dismiss();
                    paint2 = z.c;
                    i2 = z.e;
                    paint2.setColor(i2);
                    z.d();
                    break;
                }
            case 2:
                int i5 = (int) ((rawX - this.a) - 60.0f);
                if (i5 >= 0) {
                    if (i5 > ad.a - this.c) {
                        i5 = ((int) ad.a) - this.c;
                        paint3 = z.c;
                        paint3.setColor(-6039296);
                        this.e = i5;
                        a(i5);
                        break;
                    }
                } else {
                    i5 = 0;
                }
                paint4 = z.c;
                i3 = z.e;
                paint4.setColor(i3);
                this.e = i5;
                a(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        layout(i, 0, getWidth() + i, getHeight());
        postInvalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.b = getHeight();
        postInvalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Paint paint;
        float f = this.c;
        float f2 = this.b / 2.0f;
        float f3 = 23.0f * com.censivn.C3DEngine.a.b;
        paint = z.c;
        canvas.drawCircle(f, f2, f3, paint);
    }
}
