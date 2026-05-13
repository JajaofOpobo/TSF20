package com.tsf.shell.p095e;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.Home;
import com.tsf.shell.p096f.p131f.C2932g;
/* renamed from: com.tsf.shell.e.d */
/* loaded from: classes.dex */
public class C2262d extends ViewGroup {

    /* renamed from: a */
    public static int f7376a;

    /* renamed from: b */
    public static int f7377b;

    /* renamed from: d */
    private static int f7378d;

    /* renamed from: e */
    private static int f7379e;

    /* renamed from: c */
    boolean f7380c;

    /* renamed from: f */
    private final Rect f7381f;

    /* renamed from: g */
    private final ContextMenu$ContextMenuInfoC2263a f7382g;

    /* renamed from: h */
    private C2932g f7383h;

    public C2262d(Context context, C2932g c2932g) {
        super(context);
        this.f7381f = new Rect();
        this.f7380c = true;
        this.f7382g = new ContextMenu$ContextMenuInfoC2263a();
        this.f7382g.f7389f = this;
        this.f7383h = c2932g;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Home.m6177b().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        f7376a = (int) (C0892a.f2569e * 3.0f);
        f7378d = (int) (C0892a.f2569e * 3.0f);
        f7377b = 0;
        f7379e = 0;
        setAlwaysDrawnWithCacheEnabled(false);
    }

    /* renamed from: a */
    public void m5995a() {
        this.f7380c = true;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C2255b) getChildAt(i)).m6010a();
        }
    }

    /* renamed from: a */
    public boolean m5993a(MotionEvent motionEvent) {
        C2255b c2255b;
        if (this.f7380c) {
            return false;
        }
        int childCount = getChildCount();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = 0; i < childCount; i++) {
            C2264b c2264b = (C2264b) ((C2255b) getChildAt(i)).getLayoutParams();
            if (x > c2264b.f7390a && x < c2264b.f7390a + c2255b.getWidth() && y > c2264b.f7391b) {
                if (y < c2255b.getHeight() + c2264b.f7391b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m5990b() {
        this.f7380c = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((C2255b) getChildAt(i)).m6006b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C2264b c2264b = (C2264b) childAt.getLayoutParams();
            int i6 = c2264b.f7390a;
            int i7 = c2264b.f7391b;
            childAt.layout(i6, i7, c2264b.f7393d + i6, c2264b.f7394e + i7);
        }
    }

    /* renamed from: a */
    public boolean m5994a(int i, View view) {
        int i2;
        int childCount = getChildCount();
        int i3 = C0892a.f2553D * C0892a.f2554E;
        int i4 = 0;
        int i5 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof C2255b) || childAt == view) {
                i2 = i5;
            } else {
                C2264b c2264b = (C2264b) childAt.getLayoutParams();
                i2 = (c2264b.f7394e * c2264b.f7393d) + i5;
            }
            i4++;
            i5 = i2;
        }
        return ((float) (i5 + i)) <= ((float) i3) * 1.2f;
    }

    public int getID() {
        return this.f7383h.m4181t();
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    /* renamed from: a */
    public void m5991a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ((C2264b) layoutParams).f7392c = true;
        super.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public void m5992a(View view) {
        super.addView(view, (C2264b) view.getLayoutParams());
    }

    /* renamed from: b */
    public void m5989b(View view) {
        view.setOnLongClickListener(null);
        removeView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (view != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            requestRectangleOnScreen(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7382g.f7389f = this;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: c */
    private boolean m5988c() {
        return this.f7383h.f9541g == 0.0f && !this.f7383h.m4216ad();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (m5988c() && C2269f.getMouseEnabled()) {
            int action = motionEvent.getAction();
            ContextMenu$ContextMenuInfoC2263a contextMenu$ContextMenuInfoC2263a = this.f7382g;
            if (action == 0) {
                Rect rect = this.f7381f;
                int x = ((int) motionEvent.getX()) + getScrollX();
                int y = ((int) motionEvent.getY()) + getScrollY();
                int childCount = getChildCount() - 1;
                while (true) {
                    if (childCount < 0) {
                        z = false;
                        break;
                    }
                    View childAt = getChildAt(childCount);
                    if (childAt.getVisibility() == 0 || childAt.getAnimation() != null) {
                        childAt.getHitRect(rect);
                        if (rect.contains(x, y) && (childAt instanceof C2255b)) {
                            C2264b c2264b = (C2264b) childAt.getLayoutParams();
                            contextMenu$ContextMenuInfoC2263a.f7384a = (C2255b) childAt;
                            contextMenu$ContextMenuInfoC2263a.f7385b = c2264b.f7390a;
                            contextMenu$ContextMenuInfoC2263a.f7386c = c2264b.f7391b;
                            contextMenu$ContextMenuInfoC2263a.f7387d = c2264b.f7393d;
                            contextMenu$ContextMenuInfoC2263a.f7388e = c2264b.f7394e;
                            break;
                        }
                    }
                    childCount--;
                }
                if (!z) {
                    contextMenu$ContextMenuInfoC2263a.f7385b = (int) motionEvent.getX();
                    contextMenu$ContextMenuInfoC2263a.f7386c = (int) motionEvent.getY();
                }
                setTag(contextMenu$ContextMenuInfoC2263a);
            } else if (action == 1) {
                contextMenu$ContextMenuInfoC2263a.f7384a = null;
                contextMenu$ContextMenuInfoC2263a.f7385b = 0;
                contextMenu$ContextMenuInfoC2263a.f7386c = 0;
                contextMenu$ContextMenuInfoC2263a.f7387d = 0;
                contextMenu$ContextMenuInfoC2263a.f7388e = 0;
                setTag(contextMenu$ContextMenuInfoC2263a);
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public ContextMenu$ContextMenuInfoC2263a getTag() {
        return this.f7382g;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("ScreenLayout cannot have UNSPECIFIED dimensions");
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C2264b c2264b = (C2264b) childAt.getLayoutParams();
            if (c2264b.f7392c) {
                childAt.setId(((getId() & 255) << 16) | ((c2264b.f7390a & 255) << 8) | (c2264b.f7391b & 255));
                c2264b.f7392c = false;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(c2264b.f7393d, 1073741824), View.MeasureSpec.makeMeasureSpec(c2264b.f7394e, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2264b;
    }

    /* renamed from: com.tsf.shell.e.d$b */
    /* loaded from: classes.dex */
    public static class C2264b extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f7390a;

        /* renamed from: b */
        public int f7391b;

        /* renamed from: c */
        boolean f7392c;

        /* renamed from: d */
        public int f7393d;

        /* renamed from: e */
        public int f7394e;

        public C2264b(int i, int i2, int i3, int i4) {
            super(-1, -1);
            this.f7390a = i;
            this.f7391b = i2;
            this.f7393d = i3;
            this.f7394e = i4;
        }
    }

    /* renamed from: com.tsf.shell.e.d$a */
    /* loaded from: classes.dex */
    public static final class ContextMenu$ContextMenuInfoC2263a implements ContextMenu.ContextMenuInfo {

        /* renamed from: a */
        public C2255b f7384a;

        /* renamed from: b */
        public int f7385b;

        /* renamed from: c */
        public int f7386c;

        /* renamed from: d */
        public int f7387d;

        /* renamed from: e */
        public int f7388e;

        /* renamed from: f */
        public C2262d f7389f;

        public String toString() {
            return "Cell[view=" + (this.f7384a == null ? "null" : this.f7384a.getClass()) + ", x=" + this.f7385b + ", y=" + this.f7386c + "]";
        }
    }
}
