package com.tsf.extend.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ListView;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.support.ViewPager;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView;
/* loaded from: classes.dex */
public class ThemePullToRefreshListView extends PullToRefreshAndLoadMoreListView {

    /* renamed from: d */
    private float f5240d;

    /* renamed from: e */
    private float f5241e;

    /* renamed from: f */
    private float f5242f;

    /* renamed from: g */
    private boolean f5243g;

    public ThemePullToRefreshListView(Context context) {
        super(context, null);
        this.f5241e = 0.0f;
        this.f5242f = 0.0f;
        this.f5243g = false;
    }

    public ThemePullToRefreshListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5241e = 0.0f;
        this.f5242f = 0.0f;
        this.f5243g = false;
        m7981o();
    }

    /* renamed from: o */
    private void m7981o() {
        this.f5240d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshListView
    /* renamed from: b */
    protected ListView mo7982b(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 9) {
            return new PullToRefreshListView.C1504b(context, attributeSet) { // from class: com.tsf.extend.theme.ThemePullToRefreshListView.1
                @Override // android.widget.AbsListView, android.view.ViewGroup
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return ThemePullToRefreshListView.this.m7983a(super.onInterceptTouchEvent(motionEvent), motionEvent);
                }
            };
        }
        return new PullToRefreshListView.C1503a(context, attributeSet) { // from class: com.tsf.extend.theme.ThemePullToRefreshListView.2
            @Override // android.widget.AbsListView, android.view.ViewGroup
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return ThemePullToRefreshListView.this.m7983a(super.onInterceptTouchEvent(motionEvent), motionEvent);
            }
        };
    }

    /* renamed from: a */
    public boolean m7983a(boolean z, MotionEvent motionEvent) {
        ViewPager viewPager = (ViewPager) findViewById(C1536f.C1541e.theme_preview_pager);
        if (viewPager != null) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f5243g = false;
                    this.f5241e = motionEvent.getX();
                    this.f5242f = motionEvent.getY();
                    return z;
                case 1:
                default:
                    return z;
                case 2:
                    if (!this.f5243g && Math.abs(this.f5241e - motionEvent.getX()) > this.f5240d) {
                        this.f5243g = true;
                    }
                    int[] iArr = new int[2];
                    viewPager.getLocationOnScreen(iArr);
                    if (this.f5242f > viewPager.getHeight() + iArr[1] || !this.f5243g) {
                        return z;
                    }
                    return false;
            }
        }
        return z;
    }
}
