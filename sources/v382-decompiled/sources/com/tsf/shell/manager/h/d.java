package com.tsf.shell.manager.h;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes.dex */
class d extends View {
    final /* synthetic */ a a;
    private float b;
    private float c;
    private int d;
    private TranslateAnimation e;
    private int f;
    private View g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, Context context) {
        super(context);
        this.a = aVar;
        this.d = (int) ((com.censivn.C3DEngine.b.b.a.e * 10.0f) + 10.0f);
        this.g = this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        int i;
        AlertDialog alertDialog;
        Paint paint2;
        int i2;
        Paint paint3;
        int i3;
        Paint paint4;
        Paint paint5;
        int i4;
        int i5 = 0;
        int rawX = (int) motionEvent.getRawX();
        switch (motionEvent.getAction()) {
            case 0:
                this.b = motionEvent.getX();
                break;
            case 1:
                if (this.f < ((int) (b.a - this.d))) {
                    paint = this.a.c;
                    i = a.e;
                    paint.setColor(i);
                    this.e = new TranslateAnimation(0.0f, -this.f, 0.0f, 0.0f);
                    Animation.AnimationListener animationListener = new Animation.AnimationListener() { // from class: com.tsf.shell.manager.h.d.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            d.this.g.clearAnimation();
                            d.this.a(0);
                        }
                    };
                    int i6 = (int) ((this.f / (b.a - this.d)) * 500.0f);
                    this.e.setAnimationListener(animationListener);
                    this.e.setDuration(i6);
                    this.e.setFillAfter(true);
                    setAnimation(this.e);
                    this.e.start();
                    break;
                } else {
                    alertDialog = this.a.f;
                    alertDialog.dismiss();
                    paint2 = this.a.c;
                    i2 = a.e;
                    paint2.setColor(i2);
                    this.a.a(false);
                    break;
                }
            case 2:
                int i7 = (int) ((rawX - this.b) - 60.0f);
                if (i7 < 0) {
                    paint5 = this.a.c;
                    i4 = a.e;
                    paint5.setColor(i4);
                } else if (i7 <= b.a - this.d) {
                    paint3 = this.a.c;
                    i3 = a.e;
                    paint3.setColor(i3);
                    i5 = i7;
                } else {
                    i5 = ((int) b.a) - this.d;
                    paint4 = this.a.c;
                    paint4.setColor(-6039296);
                }
                this.f = i5;
                a(i5);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        layout(i, 0, getWidth() + i, getHeight());
        postInvalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = getHeight();
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        float f = this.d;
        float f2 = this.c / 2.0f;
        float f3 = 23.0f * com.censivn.C3DEngine.b.b.a.b;
        paint = this.a.c;
        canvas.drawCircle(f, f2, f3, paint);
    }
}
