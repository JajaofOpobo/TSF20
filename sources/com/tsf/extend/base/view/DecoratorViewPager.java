package com.tsf.extend.base.view;

import android.content.Context;
import android.support.p002v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class DecoratorViewPager extends ViewPager {

    /* renamed from: a */
    private ViewGroup f4542a;

    /* renamed from: b */
    private GestureDetector f4543b;

    public DecoratorViewPager(Context context) {
        super(context);
        this.f4543b = new GestureDetector(context, new C1471a());
    }

    public DecoratorViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4543b = new GestureDetector(context, new C1471a());
    }

    public void setNestedpParent(ViewGroup viewGroup) {
        this.f4542a = viewGroup;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4543b.onTouchEvent(motionEvent) && this.f4542a != null) {
            this.f4542a.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.p002v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.p002v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: com.tsf.extend.base.view.DecoratorViewPager$a */
    /* loaded from: classes.dex */
    class C1471a extends GestureDetector.SimpleOnGestureListener {
        C1471a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f) > Math.abs(f2);
        }
    }
}
