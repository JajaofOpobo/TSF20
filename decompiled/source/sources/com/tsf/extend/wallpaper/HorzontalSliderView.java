package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class HorzontalSliderView extends LinearLayout {
    private Drawable a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private a g;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f, boolean z);
    }

    public HorzontalSliderView(Context context) {
        this(context, null);
    }

    public HorzontalSliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        getContext().getResources();
        this.a = getResources().getDrawable(f.d.wallpaper_slider_fg);
        Log.e("szaxqsqss", "width:" + this.a.getIntrinsicWidth() + ",height:" + this.a.getIntrinsicHeight());
        this.a.setBounds(0, 0, 165, 180);
        if (this.a == null) {
            throw new IllegalArgumentException("HorzontalSliderView() must have android:src attribute.");
        }
    }

    private int getCenter() {
        if (this.e < 0) {
            this.c = getPaddingLeft();
            this.d = (getWidth() - this.a.getIntrinsicWidth()) - getPaddingRight();
            this.e = (this.d + this.c) / 2;
        }
        return this.e;
    }

    private int getHalf() {
        return (this.d - this.c) / 2;
    }

    private boolean a(int i) {
        return this.b <= i && i <= this.b + this.a.getIntrinsicWidth();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b < 0) {
            this.b = getCenter();
        }
        int saveCount = canvas.getSaveCount();
        canvas.translate(this.b, getPaddingTop());
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        switch (motionEvent.getAction()) {
            case 0:
                if (a(x)) {
                    this.f = x;
                    break;
                }
                break;
            case 1:
                if (this.f >= 0) {
                    a(0, true);
                    this.f = -1;
                    break;
                }
                break;
            case 2:
                if (this.f >= 0) {
                    a(x - this.f, false);
                    break;
                }
                break;
        }
        return true;
    }

    public void setSliderChangeListener(a aVar) {
        this.g = aVar;
    }

    private void a(int i, boolean z) {
        int center = getCenter() + i;
        if (center < this.c) {
            center = this.c;
        }
        if (center > this.d) {
            center = this.d;
        }
        if (this.b != center) {
            this.b = center;
            invalidate();
            if (this.g != null) {
                float half = (i * 1.0f) / getHalf();
                if (half > 1.0f) {
                    half = 1.0f;
                }
                if (half < -1.0f) {
                    half = -1.0f;
                }
                if (half >= -1.0f && half <= 1.0f) {
                    this.g.a(half, z);
                }
            }
        }
    }
}
