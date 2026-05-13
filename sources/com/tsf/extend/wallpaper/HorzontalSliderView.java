package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.tsf.extend.C1536f;
/* loaded from: classes.dex */
public class HorzontalSliderView extends LinearLayout {

    /* renamed from: a */
    private Drawable f6199a;

    /* renamed from: b */
    private int f6200b;

    /* renamed from: c */
    private int f6201c;

    /* renamed from: d */
    private int f6202d;

    /* renamed from: e */
    private int f6203e;

    /* renamed from: f */
    private int f6204f;

    /* renamed from: g */
    private InterfaceC1931a f6205g;

    /* renamed from: com.tsf.extend.wallpaper.HorzontalSliderView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1931a {
        /* renamed from: a */
        void mo6878a(float f, boolean z);
    }

    public HorzontalSliderView(Context context) {
        this(context, null);
    }

    public HorzontalSliderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6200b = -1;
        this.f6201c = -1;
        this.f6202d = -1;
        this.f6203e = -1;
        this.f6204f = -1;
        getContext().getResources();
        this.f6199a = getResources().getDrawable(C1536f.C1540d.wallpaper_slider_fg);
        Log.e("szaxqsqss", "width:" + this.f6199a.getIntrinsicWidth() + ",height:" + this.f6199a.getIntrinsicHeight());
        this.f6199a.setBounds(0, 0, 165, 180);
        if (this.f6199a == null) {
            throw new IllegalArgumentException("HorzontalSliderView() must have android:src attribute.");
        }
    }

    private int getCenter() {
        if (this.f6203e < 0) {
            this.f6201c = getPaddingLeft();
            this.f6202d = (getWidth() - this.f6199a.getIntrinsicWidth()) - getPaddingRight();
            this.f6203e = (this.f6202d + this.f6201c) / 2;
        }
        return this.f6203e;
    }

    private int getHalf() {
        return (this.f6202d - this.f6201c) / 2;
    }

    /* renamed from: a */
    private boolean m7020a(int i) {
        return this.f6200b <= i && i <= this.f6200b + this.f6199a.getIntrinsicWidth();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6200b < 0) {
            this.f6200b = getCenter();
        }
        int saveCount = canvas.getSaveCount();
        canvas.translate(this.f6200b, getPaddingTop());
        this.f6199a.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        switch (motionEvent.getAction()) {
            case 0:
                if (m7020a(x)) {
                    this.f6204f = x;
                    break;
                }
                break;
            case 1:
                if (this.f6204f >= 0) {
                    m7019a(0, true);
                    this.f6204f = -1;
                    break;
                }
                break;
            case 2:
                if (this.f6204f >= 0) {
                    m7019a(x - this.f6204f, false);
                    break;
                }
                break;
        }
        return true;
    }

    public void setSliderChangeListener(InterfaceC1931a interfaceC1931a) {
        this.f6205g = interfaceC1931a;
    }

    /* renamed from: a */
    private void m7019a(int i, boolean z) {
        int center = getCenter() + i;
        if (center < this.f6201c) {
            center = this.f6201c;
        }
        if (center > this.f6202d) {
            center = this.f6202d;
        }
        if (this.f6200b != center) {
            this.f6200b = center;
            invalidate();
            if (this.f6205g != null) {
                float half = (i * 1.0f) / getHalf();
                if (half > 1.0f) {
                    half = 1.0f;
                }
                if (half < -1.0f) {
                    half = -1.0f;
                }
                if (half >= -1.0f && half <= 1.0f) {
                    this.f6205g.mo6878a(half, z);
                }
            }
        }
    }
}
