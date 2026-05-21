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
import com.tsf.extend.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PageIndicatorCompat extends LinearLayout {
    private LayoutInflater a;
    private int[] b;
    private int c;
    private boolean d;
    private ArrayList<PageIndicatorMarkerCompat> e;
    private int f;

    public static class a {
        int a;
        int b;

        public a() {
            this.a = f.d.ic_pageindicator_current_inverse;
            this.b = f.d.ic_pageindicator_default_inverse;
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public PageIndicatorCompat(Context context) {
        this(context, null);
    }

    public PageIndicatorCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[2];
        this.d = false;
        this.e = new ArrayList<>();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.i.PageIndicator, -1, 0);
        this.c = typedArrayObtainStyledAttributes.getInteger(f.i.PageIndicator_windowSize, 15);
        this.b[0] = 0;
        this.b[1] = 0;
        this.a = LayoutInflater.from(context);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 11) {
            getLayoutTransition().setDuration(175L);
        }
    }

    @TargetApi(16)
    private void a() {
        if (Build.VERSION.SDK_INT >= 16) {
            LayoutTransition layoutTransition = getLayoutTransition();
            layoutTransition.enableTransitionType(2);
            layoutTransition.enableTransitionType(3);
            layoutTransition.enableTransitionType(0);
            layoutTransition.enableTransitionType(1);
        }
    }

    @TargetApi(16)
    private void b() {
        if (Build.VERSION.SDK_INT >= 16) {
            LayoutTransition layoutTransition = getLayoutTransition();
            layoutTransition.disableTransitionType(2);
            layoutTransition.disableTransitionType(3);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(1);
        }
    }

    void a(int i, boolean z, boolean z2) {
        int iMin = Math.min(this.e.size(), this.c);
        float f = iMin / 2.0f;
        int iMin2 = Math.min(this.e.size(), Math.max(0, i - (iMin / 2)) + this.c);
        int iMin3 = iMin2 - Math.min(this.e.size(), iMin);
        int i2 = ((iMin2 - iMin3) / 2) + iMin3;
        if (iMin3 == 0) {
        }
        if (iMin2 == this.e.size()) {
        }
        boolean z3 = (this.b[0] == iMin3 && this.b[1] == iMin2) ? false : true;
        if (!z) {
            b();
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View view = (PageIndicatorMarkerCompat) getChildAt(childCount);
            int iIndexOf = this.e.indexOf(view);
            if (iIndexOf < iMin3 || iIndexOf >= iMin2) {
                removeView(view);
            }
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            PageIndicatorMarkerCompat pageIndicatorMarkerCompat = this.e.get(i3);
            if (iMin3 <= i3 && i3 < iMin2) {
                if (indexOfChild(pageIndicatorMarkerCompat) < 0) {
                    addView(pageIndicatorMarkerCompat, i3 - iMin3);
                }
                if (i3 == i) {
                    pageIndicatorMarkerCompat.a(!z2 || z3);
                } else {
                    pageIndicatorMarkerCompat.b(!z2 || z3);
                }
            } else {
                pageIndicatorMarkerCompat.b(true);
            }
        }
        if (!z) {
            a();
        }
        this.b[0] = iMin3;
        this.b[1] = iMin2;
    }

    public void a(int i, a aVar, boolean z) {
        int iMax = Math.max(0, Math.min(i, this.e.size()));
        PageIndicatorMarkerCompat pageIndicatorMarkerCompat = (PageIndicatorMarkerCompat) this.a.inflate(f.C0052f.page_indicator_marker_compat, (ViewGroup) this, false);
        pageIndicatorMarkerCompat.a(aVar.a, aVar.b);
        this.e.add(iMax, pageIndicatorMarkerCompat);
        a(this.f, z, true);
    }

    public void setActiveMarker(int i) {
        a(i, true);
    }

    public void a(int i, boolean z) {
        if (this.f != i) {
            this.f = i;
            a(i, false, z);
        }
    }

    public void setIgnoreBrightness(boolean z) {
        this.d = z;
    }
}
