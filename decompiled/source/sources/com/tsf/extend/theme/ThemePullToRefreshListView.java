package com.tsf.extend.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView;
import com.tsf.extend.f;
/* loaded from: classes.dex */
public class ThemePullToRefreshListView extends PullToRefreshAndLoadMoreListView {
    private float d;
    private float e;
    private float f;
    private boolean g;

    public ThemePullToRefreshListView(Context context) {
        super(context, null);
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = false;
    }

    public ThemePullToRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = false;
        o();
    }

    private void o() {
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView
    protected ListView b(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 9) {
            return new PullToRefreshListView.b(context, attributeSet) { // from class: com.tsf.extend.theme.ThemePullToRefreshListView.1
                @Override // android.widget.AbsListView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return ThemePullToRefreshListView.this.a(super.onInterceptTouchEvent(motionEvent), motionEvent);
                }
            };
        }
        return new PullToRefreshListView.a(context, attributeSet) { // from class: com.tsf.extend.theme.ThemePullToRefreshListView.2
            @Override // android.widget.AbsListView, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return ThemePullToRefreshListView.this.a(super.onInterceptTouchEvent(motionEvent), motionEvent);
            }
        };
    }

    public boolean a(boolean z, MotionEvent motionEvent) {
        ViewPager viewPager = (ViewPager) findViewById(f.e.theme_preview_pager);
        if (viewPager != null) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.g = false;
                    this.e = motionEvent.getX();
                    this.f = motionEvent.getY();
                    return z;
                case 1:
                default:
                    return z;
                case 2:
                    if (!this.g && Math.abs(this.e - motionEvent.getX()) > this.d) {
                        this.g = true;
                    }
                    int[] iArr = new int[2];
                    viewPager.getLocationOnScreen(iArr);
                    if (this.f > viewPager.getHeight() + iArr[1] || !this.g) {
                        return z;
                    }
                    return false;
            }
        }
        return z;
    }
}
