package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.extend.base.support.ViewPager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TabViewPager extends ViewPager {
    private long a;
    private PointF b;
    private PointF c;
    private boolean d;
    private ViewConfiguration e;
    private a f;
    private boolean g;

    public interface a {
        void a(View view);
    }

    public TabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new PointF();
        this.c = new PointF();
        this.d = false;
        this.g = true;
        this.e = ViewConfiguration.get(context);
    }

    @Override // com.tsf.extend.base.support.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.g) {
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.a = System.currentTimeMillis();
                this.b.set(motionEvent.getX(), motionEvent.getY());
                this.d = true;
                break;
            case 1:
                if (this.d) {
                    if (System.currentTimeMillis() - this.a > ViewConfiguration.getLongPressTimeout()) {
                        this.d = false;
                    } else {
                        this.d = false;
                        g();
                    }
                }
                break;
            case 2:
                if (this.d) {
                    this.c.set(motionEvent.getX(), motionEvent.getY());
                    if (a(this.b, this.c) > this.e.getScaledTouchSlop()) {
                        this.d = false;
                    }
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    private void g() {
        if (this.f != null) {
            this.f.a(this);
        }
    }

    private static float a(PointF pointF, PointF pointF2) {
        if (pointF == null || pointF2 == null) {
            return 0.0f;
        }
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public void setOnTabListener(a aVar) {
        this.f = aVar;
    }

    public void setCanDrage(boolean z) {
        this.g = z;
    }
}
