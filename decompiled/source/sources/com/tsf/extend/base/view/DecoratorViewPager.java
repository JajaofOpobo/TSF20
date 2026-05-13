package com.tsf.extend.base.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class DecoratorViewPager extends ViewPager {
    private ViewGroup a;
    private GestureDetector b;

    public DecoratorViewPager(Context context) {
        super(context);
        this.b = new GestureDetector(context, new a());
    }

    public DecoratorViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new GestureDetector(context, new a());
    }

    public void setNestedpParent(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b.onTouchEvent(motionEvent) && this.a != null) {
            this.a.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* loaded from: classes.dex */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f) > Math.abs(f2);
        }
    }
}
