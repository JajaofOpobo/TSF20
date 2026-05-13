package com.tsf.extend.theme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tsf.extend.base.support.ViewPager;
/* loaded from: classes.dex */
public class ThemeDetailViewPager extends ViewPager {

    /* renamed from: a */
    private ViewGroup f5183a;

    /* renamed from: b */
    private GestureDetector f5184b;

    public ThemeDetailViewPager(Context context) {
        super(context);
        this.f5184b = new GestureDetector(context, new C1623a());
    }

    public ThemeDetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5184b = new GestureDetector(context, new C1623a());
    }

    public void setNestedParent(ViewGroup viewGroup) {
        this.f5183a = viewGroup;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f5184b.onTouchEvent(motionEvent) && this.f5183a != null) {
            this.f5183a.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tsf.extend.base.support.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.tsf.extend.base.support.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.tsf.extend.theme.ThemeDetailViewPager$a */
    /* loaded from: classes.dex */
    class C1623a extends GestureDetector.SimpleOnGestureListener {
        C1623a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f) >= Math.abs(f2);
        }
    }
}
