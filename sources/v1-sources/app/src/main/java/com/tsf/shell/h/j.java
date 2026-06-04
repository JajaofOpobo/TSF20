package com.tsf.shell.h;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public final class j extends ViewGroup {
    public static int a = 0;
    public static int b = 0;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    boolean g;
    private final Rect n;
    private final k o;
    private com.tsf.shell.workspace3D.h.a p;

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ Object getTag() {
        return this.o;
    }

    public j(Context context, com.tsf.shell.workspace3D.h.a aVar) {
        super(context);
        this.n = new Rect();
        this.g = true;
        this.o = new k();
        this.o.f = this;
        this.p = aVar;
        if (a == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Home.d().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            a = (int) (80.0f * com.censivn.C3DEngine.a.d);
            b = (int) (100.0f * com.censivn.C3DEngine.a.d);
            c = (int) (com.censivn.C3DEngine.a.d * 3.0f);
            h = (int) (com.censivn.C3DEngine.a.d * 3.0f);
            d = 0;
            i = 0;
            j = (int) ((i2 - i) / a);
            k = (int) (((i3 - c) - h) / b);
            e = j;
            f = k;
        }
        setAlwaysDrawnWithCacheEnabled(false);
    }

    public final void a() {
        this.g = true;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((d) getChildAt(i2)).a();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.g) {
            return false;
        }
        int childCount = getChildCount();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i2 = 0; i2 < childCount; i2++) {
            l lVar = (l) ((d) getChildAt(i2)).getLayoutParams();
            if (x > lVar.a && x < lVar.a + r0.getWidth() && y > lVar.b) {
                if (y < r0.getHeight() + lVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        this.g = false;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((d) getChildAt(i2)).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            l lVar = (l) childAt.getLayoutParams();
            int i7 = lVar.a;
            int i8 = lVar.b;
            childAt.layout(i7, i8, lVar.d + i7, lVar.e + i8);
        }
    }

    public final boolean a(int i2, View view) {
        int i3;
        int childCount = getChildCount();
        int i4 = com.censivn.C3DEngine.a.j * com.censivn.C3DEngine.a.k;
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (!(childAt instanceof d) || childAt == view) {
                i3 = i6;
            } else {
                l lVar = (l) childAt.getLayoutParams();
                i3 = (lVar.e * lVar.d) + i6;
            }
            i5++;
            i6 = i3;
        }
        return ((float) (i6 + i2)) <= ((float) i4) * 1.2f;
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).cancelLongPress();
        }
    }

    public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        ((l) layoutParams).c = true;
        super.addView(view, i2, layoutParams);
    }

    public final void a(View view) {
        super.addView(view, (l) view.getLayoutParams());
    }

    public final void b(View view) {
        view.setOnLongClickListener(null);
        removeView(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (view != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            requestRectangleOnScreen(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o.f = this;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (!(this.p.D == 0.0f && !this.p.bf()) || !r.b()) {
            return true;
        }
        int action = motionEvent.getAction();
        k kVar = this.o;
        if (action == 0) {
            Rect rect = this.n;
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
                    if (rect.contains(x, y) && (childAt instanceof d)) {
                        l lVar = (l) childAt.getLayoutParams();
                        kVar.a = (d) childAt;
                        kVar.b = lVar.a;
                        kVar.c = lVar.b;
                        kVar.d = lVar.d;
                        kVar.e = lVar.e;
                        break;
                    }
                }
                childCount--;
            }
            if (!z) {
                kVar.b = (int) motionEvent.getX();
                kVar.c = (int) motionEvent.getY();
            }
            setTag(kVar);
        } else if (action == 1) {
            kVar.a = null;
            kVar.b = 0;
            kVar.c = 0;
            kVar.d = 0;
            kVar.e = 0;
            setTag(kVar);
        }
        return false;
    }

    public final k c() {
        return this.o;
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 0 || mode2 == 0) {
            throw new RuntimeException("ScreenLayout cannot have UNSPECIFIED dimensions");
        }
        int i4 = j - 1;
        m = (((size2 - c) - h) - (b * k)) / (k - 1);
        int i5 = ((size - d) - i) - (a * j);
        if (i4 > 0) {
            l = i5 / i4;
        } else {
            l = 0;
        }
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            l lVar = (l) childAt.getLayoutParams();
            if (lVar.c) {
                childAt.setId(((getId() & 255) << 16) | ((lVar.a & 255) << 8) | (lVar.b & 255));
                lVar.c = false;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(lVar.d, 1073741824), View.MeasureSpec.makeMeasureSpec(lVar.e, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }

    public static int[] a(int i2, int i3) {
        return new int[]{((a + i2) / a) * a, ((a + i3) / a) * b};
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }
}
