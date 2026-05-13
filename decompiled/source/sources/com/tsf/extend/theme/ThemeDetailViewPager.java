package com.tsf.extend.theme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.tsf.extend.base.support.ViewPager;
/* loaded from: classes.dex */
public class ThemeDetailViewPager extends ViewPager {
    private ViewGroup a;
    private GestureDetector b;

    public ThemeDetailViewPager(Context context) {
        super(context);
        this.b = new GestureDetector(context, new a());
    }

    public ThemeDetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new GestureDetector(context, new a());
    }

    public void setNestedParent(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.b.onTouchEvent(motionEvent) && this.a != null) {
            this.a.requestDisallowInterceptTouchEvent(true);
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

    /* loaded from: classes.dex */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f) >= Math.abs(f2);
        }
    }
}
