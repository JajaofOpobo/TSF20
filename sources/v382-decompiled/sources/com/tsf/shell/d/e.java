package com.tsf.shell.d;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.Home;

/* loaded from: classes.dex */
public class e extends ViewGroup {
    public static int a;
    public static int b;
    private static int d;
    private static int e;
    boolean c;
    private final Rect f;
    private final f g;
    private com.tsf.shell.e.f.g h;

    public e(Context context, com.tsf.shell.e.f.g gVar) {
        super(context);
        this.f = new Rect();
        this.c = true;
        this.g = new f();
        this.g.f = this;
        this.h = gVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Home.b().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        a = (int) (com.censivn.C3DEngine.b.b.a.e * 3.0f);
        d = (int) (com.censivn.C3DEngine.b.b.a.e * 3.0f);
        b = 0;
        e = 0;
        setAlwaysDrawnWithCacheEnabled(false);
    }

    public void a() {
        this.c = true;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((b) getChildAt(i)).a();
        }
    }

    public boolean a(MotionEvent motionEvent) {
        if (this.c) {
            return false;
        }
        int childCount = getChildCount();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = 0; i < childCount; i++) {
            g gVar = (g) ((b) getChildAt(i)).getLayoutParams();
            if (x > gVar.a && x < gVar.a + r0.getWidth() && y > gVar.b) {
                if (y < r0.getHeight() + gVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        this.c = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((b) getChildAt(i)).b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            g gVar = (g) childAt.getLayoutParams();
            int i6 = gVar.a;
            int i7 = gVar.b;
            childAt.layout(i6, i7, gVar.d + i6, gVar.e + i7);
        }
    }

    public boolean a(int i, View view) {
        int i2;
        int childCount = getChildCount();
        int i3 = com.censivn.C3DEngine.b.b.a.D * com.censivn.C3DEngine.b.b.a.E;
        int i4 = 0;
        int i5 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof b) || childAt == view) {
                i2 = i5;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                i2 = (gVar.e * gVar.d) + i5;
            }
            i4++;
            i5 = i2;
        }
        return ((float) (i5 + i)) <= ((float) i3) * 1.2f;
    }

    public int getID() {
        return this.h.t();
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    public void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ((g) layoutParams).c = true;
        super.addView(view, i, layoutParams);
    }

    public void a(View view) {
        super.addView(view, (g) view.getLayoutParams());
    }

    public void b(View view) {
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
        this.g.f = this;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    private boolean c() {
        return this.h.g == 0.0f && !this.h.ad();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (!c() || !i.getMouseEnabled()) {
            return true;
        }
        int action = motionEvent.getAction();
        f fVar = this.g;
        if (action == 0) {
            Rect rect = this.f;
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
                    if (rect.contains(x, y) && (childAt instanceof b)) {
                        g gVar = (g) childAt.getLayoutParams();
                        fVar.a = (b) childAt;
                        fVar.b = gVar.a;
                        fVar.c = gVar.b;
                        fVar.d = gVar.d;
                        fVar.e = gVar.e;
                        break;
                    }
                }
                childCount--;
            }
            if (!z) {
                fVar.b = (int) motionEvent.getX();
                fVar.c = (int) motionEvent.getY();
            }
            setTag(fVar);
        } else if (action == 1) {
            fVar.a = null;
            fVar.b = 0;
            fVar.c = 0;
            fVar.d = 0;
            fVar.e = 0;
            setTag(fVar);
        }
        return false;
    }

    @Override // android.view.View
    public f getTag() {
        return this.g;
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
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.c) {
                childAt.setId(((getId() & 255) << 16) | ((gVar.a & 255) << 8) | (gVar.b & 255));
                gVar.c = false;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(gVar.d, 1073741824), View.MeasureSpec.makeMeasureSpec(gVar.e, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }
}
