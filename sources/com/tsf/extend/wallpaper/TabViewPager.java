package com.tsf.extend.wallpaper;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tsf.extend.base.support.ViewPager;
/* loaded from: classes.dex */
public class TabViewPager extends ViewPager {

    /* renamed from: a */
    private long f6285a;

    /* renamed from: b */
    private PointF f6286b;

    /* renamed from: c */
    private PointF f6287c;

    /* renamed from: d */
    private boolean f6288d;

    /* renamed from: e */
    private ViewConfiguration f6289e;

    /* renamed from: f */
    private InterfaceC1959a f6290f;

    /* renamed from: g */
    private boolean f6291g;

    /* renamed from: com.tsf.extend.wallpaper.TabViewPager$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1959a {
        /* renamed from: a */
        void mo6874a(View view);
    }

    public TabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6286b = new PointF();
        this.f6287c = new PointF();
        this.f6288d = false;
        this.f6291g = true;
        this.f6289e = ViewConfiguration.get(context);
    }

    @Override // com.tsf.extend.base.support.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6291g) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f6285a = System.currentTimeMillis();
                    this.f6286b.set(motionEvent.getX(), motionEvent.getY());
                    this.f6288d = true;
                    break;
                case 1:
                    if (this.f6288d) {
                        if (System.currentTimeMillis() - this.f6285a > ViewConfiguration.getLongPressTimeout()) {
                            this.f6288d = false;
                            break;
                        } else {
                            this.f6288d = false;
                            m6925g();
                            break;
                        }
                    }
                    break;
                case 2:
                    if (this.f6288d) {
                        this.f6287c.set(motionEvent.getX(), motionEvent.getY());
                        if (m6926a(this.f6286b, this.f6287c) > this.f6289e.getScaledTouchSlop()) {
                            this.f6288d = false;
                            break;
                        }
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: g */
    private void m6925g() {
        if (this.f6290f != null) {
            this.f6290f.mo6874a(this);
        }
    }

    /* renamed from: a */
    private static float m6926a(PointF pointF, PointF pointF2) {
        if (pointF == null || pointF2 == null) {
            return 0.0f;
        }
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public void setOnTabListener(InterfaceC1959a interfaceC1959a) {
        this.f6290f = interfaceC1959a;
    }

    public void setCanDrage(boolean z) {
        this.f6291g = z;
    }
}
