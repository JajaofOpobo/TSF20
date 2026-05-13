package com.tsf.extend.base.view;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tsf.extend.C1536f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PageIndicatorCompat extends LinearLayout {

    /* renamed from: a */
    private LayoutInflater f4545a;

    /* renamed from: b */
    private int[] f4546b;

    /* renamed from: c */
    private int f4547c;

    /* renamed from: d */
    private boolean f4548d;

    /* renamed from: e */
    private ArrayList<PageIndicatorMarkerCompat> f4549e;

    /* renamed from: f */
    private int f4550f;

    /* renamed from: com.tsf.extend.base.view.PageIndicatorCompat$a */
    /* loaded from: classes.dex */
    public static class C1472a {

        /* renamed from: a */
        int f4551a;

        /* renamed from: b */
        int f4552b;

        public C1472a() {
            this.f4551a = C1536f.C1540d.ic_pageindicator_current_inverse;
            this.f4552b = C1536f.C1540d.ic_pageindicator_default_inverse;
        }

        public C1472a(int i, int i2) {
            this.f4551a = i;
            this.f4552b = i2;
        }
    }

    public PageIndicatorCompat(Context context) {
        this(context, null);
    }

    public PageIndicatorCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4546b = new int[2];
        this.f4548d = false;
        this.f4549e = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1536f.C1545i.PageIndicator, -1, 0);
        this.f4547c = obtainStyledAttributes.getInteger(C1536f.C1545i.PageIndicator_windowSize, 15);
        this.f4546b[0] = 0;
        this.f4546b[1] = 0;
        this.f4545a = LayoutInflater.from(context);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 11) {
            getLayoutTransition().setDuration(175L);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private void m8493a() {
        if (Build.VERSION.SDK_INT >= 16) {
            LayoutTransition layoutTransition = getLayoutTransition();
            layoutTransition.enableTransitionType(2);
            layoutTransition.enableTransitionType(3);
            layoutTransition.enableTransitionType(0);
            layoutTransition.enableTransitionType(1);
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    private void m8489b() {
        if (Build.VERSION.SDK_INT >= 16) {
            LayoutTransition layoutTransition = getLayoutTransition();
            layoutTransition.disableTransitionType(2);
            layoutTransition.disableTransitionType(3);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
        }
    }

    /* renamed from: a */
    void m8490a(int i, boolean z, boolean z2) {
        int min = Math.min(this.f4549e.size(), this.f4547c);
        float f = min / 2.0f;
        int min2 = Math.min(this.f4549e.size(), Math.max(0, i - (min / 2)) + this.f4547c);
        int min3 = min2 - Math.min(this.f4549e.size(), min);
        int i2 = ((min2 - min3) / 2) + min3;
        if (min3 == 0) {
        }
        if (min2 == this.f4549e.size()) {
        }
        boolean z3 = (this.f4546b[0] == min3 && this.f4546b[1] == min2) ? false : true;
        if (!z) {
            m8489b();
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View view = (PageIndicatorMarkerCompat) getChildAt(childCount);
            int indexOf = this.f4549e.indexOf(view);
            if (indexOf < min3 || indexOf >= min2) {
                removeView(view);
            }
        }
        for (int i3 = 0; i3 < this.f4549e.size(); i3++) {
            PageIndicatorMarkerCompat pageIndicatorMarkerCompat = this.f4549e.get(i3);
            if (min3 <= i3 && i3 < min2) {
                if (indexOfChild(pageIndicatorMarkerCompat) < 0) {
                    addView(pageIndicatorMarkerCompat, i3 - min3);
                }
                if (i3 == i) {
                    pageIndicatorMarkerCompat.m8487a(!z2 || z3);
                } else {
                    pageIndicatorMarkerCompat.m8486b(!z2 || z3);
                }
            } else {
                pageIndicatorMarkerCompat.m8486b(true);
            }
        }
        if (!z) {
            m8493a();
        }
        this.f4546b[0] = min3;
        this.f4546b[1] = min2;
    }

    /* renamed from: a */
    public void m8492a(int i, C1472a c1472a, boolean z) {
        int max = Math.max(0, Math.min(i, this.f4549e.size()));
        PageIndicatorMarkerCompat pageIndicatorMarkerCompat = (PageIndicatorMarkerCompat) this.f4545a.inflate(C1536f.C1542f.page_indicator_marker_compat, (ViewGroup) this, false);
        pageIndicatorMarkerCompat.m8488a(c1472a.f4551a, c1472a.f4552b);
        this.f4549e.add(max, pageIndicatorMarkerCompat);
        m8490a(this.f4550f, z, true);
    }

    public void setActiveMarker(int i) {
        m8491a(i, true);
    }

    /* renamed from: a */
    public void m8491a(int i, boolean z) {
        if (this.f4550f != i) {
            this.f4550f = i;
            m8490a(i, false, z);
        }
    }

    public void setIgnoreBrightness(boolean z) {
        this.f4548d = z;
    }
}
