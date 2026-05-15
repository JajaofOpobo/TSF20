package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ai;
import android.support.v4.view.bb;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ListPopupWindow {
    private static Method a;
    private static Method c;
    private final c A;
    private Runnable B;
    private final Handler C;
    private Rect D;
    private boolean E;
    private int F;
    int b;
    private Context d;
    private PopupWindow e;
    private ListAdapter f;
    private a g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private View q;
    private int r;
    private DataSetObserver s;
    private View t;
    private Drawable u;
    private AdapterView.OnItemClickListener v;
    private AdapterView.OnItemSelectedListener w;
    private final g x;
    private final f y;
    private final e z;

    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e3) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, a.C0012a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0012a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        AnonymousClass1 anonymousClass1 = null;
        this.h = -2;
        this.i = -2;
        this.l = 1002;
        this.n = 0;
        this.o = false;
        this.p = false;
        this.b = Integer.MAX_VALUE;
        this.r = 0;
        this.x = new g(this, anonymousClass1);
        this.y = new f(this, anonymousClass1);
        this.z = new e(this, anonymousClass1);
        this.A = new c(this, anonymousClass1);
        this.D = new Rect();
        this.d = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.ListPopupWindow, i, i2);
        this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.k != 0) {
            this.m = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.e = new AppCompatPopupWindow(context, attributeSet, i);
        this.e.setInputMethodMode(1);
        this.F = android.support.v4.c.d.a(this.d.getResources().getConfiguration().locale);
    }

    public void a(ListAdapter listAdapter) {
        if (this.s == null) {
            this.s = new d(this, null);
        } else if (this.f != null) {
            this.f.unregisterDataSetObserver(this.s);
        }
        this.f = listAdapter;
        if (this.f != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        if (this.g != null) {
            this.g.setAdapter(this.f);
        }
    }

    public void a(int i) {
        this.r = i;
    }

    public void a(boolean z) {
        this.E = z;
        this.e.setFocusable(z);
    }

    public Drawable d() {
        return this.e.getBackground();
    }

    public void a(Drawable drawable) {
        this.e.setBackgroundDrawable(drawable);
    }

    public View e() {
        return this.t;
    }

    public void a(View view) {
        this.t = view;
    }

    public int f() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public int g() {
        if (this.m) {
            return this.k;
        }
        return 0;
    }

    public void c(int i) {
        this.k = i;
        this.m = true;
    }

    public void d(int i) {
        this.n = i;
    }

    public int h() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public void f(int i) {
        Drawable background = this.e.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            this.i = this.D.left + this.D.right + i;
        } else {
            e(i);
        }
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.v = onItemClickListener;
    }

    public void c() {
        int width;
        int width2;
        int i;
        boolean z = false;
        int iB = b();
        boolean zL = l();
        android.support.v4.widget.s.a(this.e, this.l);
        if (this.e.isShowing()) {
            if (this.i == -1) {
                width2 = -1;
            } else if (this.i == -2) {
                width2 = e().getWidth();
            } else {
                width2 = this.i;
            }
            if (this.h == -1) {
                if (!zL) {
                    iB = -1;
                }
                if (zL) {
                    this.e.setWidth(this.i == -1 ? -1 : 0);
                    this.e.setHeight(0);
                    i = iB;
                } else {
                    this.e.setWidth(this.i == -1 ? -1 : 0);
                    this.e.setHeight(-1);
                    i = iB;
                }
            } else {
                i = this.h == -2 ? iB : this.h;
            }
            PopupWindow popupWindow = this.e;
            if (!this.p && !this.o) {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            PopupWindow popupWindow2 = this.e;
            View viewE = e();
            int i2 = this.j;
            int i3 = this.k;
            if (width2 < 0) {
                width2 = -1;
            }
            popupWindow2.update(viewE, i2, i3, width2, i >= 0 ? i : -1);
            return;
        }
        if (this.i == -1) {
            width = -1;
        } else if (this.i == -2) {
            width = e().getWidth();
        } else {
            width = this.i;
        }
        if (this.h == -1) {
            iB = -1;
        } else if (this.h != -2) {
            iB = this.h;
        }
        this.e.setWidth(width);
        this.e.setHeight(iB);
        b(true);
        this.e.setOutsideTouchable((this.p || this.o) ? false : true);
        this.e.setTouchInterceptor(this.y);
        android.support.v4.widget.s.a(this.e, e(), this.j, this.k, this.n);
        this.g.setSelection(-1);
        if (!this.E || this.g.isInTouchMode()) {
            j();
        }
        if (!this.E) {
            this.C.post(this.A);
        }
    }

    public void i() {
        this.e.dismiss();
        a();
        this.e.setContentView(null);
        this.g = null;
        this.C.removeCallbacks(this.x);
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.e.setOnDismissListener(onDismissListener);
    }

    private void a() {
        if (this.q != null) {
            ViewParent parent = this.q.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.q);
            }
        }
    }

    public void g(int i) {
        this.e.setInputMethodMode(i);
    }

    public void h(int i) {
        a aVar = this.g;
        if (!k() || aVar == null) {
            return;
        }
        aVar.g = false;
        aVar.setSelection(i);
        if (Build.VERSION.SDK_INT >= 11 && aVar.getChoiceMode() != 0) {
            aVar.setItemChecked(i, true);
        }
    }

    public void j() {
        a aVar = this.g;
        if (aVar == null) {
            return;
        }
        aVar.g = true;
        aVar.requestLayout();
    }

    public boolean k() {
        return this.e.isShowing();
    }

    public boolean l() {
        return this.e.getInputMethodMode() == 2;
    }

    public ListView m() {
        return this.g;
    }

    /* JADX INFO: renamed from: android.support.v7.widget.ListPopupWindow$1, reason: invalid class name */
    class AnonymousClass1 extends b {
        final /* synthetic */ ListPopupWindow a;

        @Override // android.support.v7.widget.ListPopupWindow.b
        public ListPopupWindow a() {
            return this.a;
        }
    }

    private int b() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int measuredHeight2;
        int i2;
        int i3;
        if (this.g == null) {
            Context context = this.d;
            this.B = new Runnable() { // from class: android.support.v7.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View viewE = ListPopupWindow.this.e();
                    if (viewE != null && viewE.getWindowToken() != null) {
                        ListPopupWindow.this.c();
                    }
                }
            };
            this.g = new a(context, !this.E);
            if (this.u != null) {
                this.g.setSelector(this.u);
            }
            this.g.setAdapter(this.f);
            this.g.setOnItemClickListener(this.v);
            this.g.setFocusable(true);
            this.g.setFocusableInTouchMode(true);
            this.g.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view2, int i4, long j) {
                    a aVar;
                    if (i4 == -1 || (aVar = ListPopupWindow.this.g) == null) {
                        return;
                    }
                    aVar.g = false;
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.g.setOnScrollListener(this.z);
            if (this.w != null) {
                this.g.setOnItemSelectedListener(this.w);
            }
            a aVar = this.g;
            View view2 = this.q;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.r) {
                    case 0:
                        linearLayout.addView(view2);
                        linearLayout.addView(aVar, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(aVar, layoutParams);
                        linearLayout.addView(view2);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.r);
                        break;
                }
                if (this.i >= 0) {
                    i3 = this.i;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i3, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight2 = layoutParams2.bottomMargin + view2.getMeasuredHeight() + layoutParams2.topMargin;
                view = linearLayout;
            } else {
                view = aVar;
                measuredHeight2 = 0;
            }
            this.e.setContentView(view);
            measuredHeight = measuredHeight2;
        } else {
            View view3 = this.q;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + view3.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.e.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            int i4 = this.D.top + this.D.bottom;
            if (this.m) {
                i = i4;
            } else {
                this.k = -this.D.top;
                i = i4;
            }
        } else {
            this.D.setEmpty();
            i = 0;
        }
        int iA = a(e(), this.k, this.e.getInputMethodMode() == 2);
        if (this.o || this.h == -1) {
            return iA + i;
        }
        switch (this.i) {
            case -2:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), Integer.MIN_VALUE);
                break;
            case ItemInfo.NO_ID /* -1 */:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), 1073741824);
                break;
            default:
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
                break;
        }
        int iA2 = this.g.a(iMakeMeasureSpec, 0, -1, iA - measuredHeight, -1);
        if (iA2 > 0) {
            measuredHeight += i;
        }
        return iA2 + measuredHeight;
    }

    public static abstract class b implements View.OnTouchListener {
        private final float a;
        private final View d;
        private Runnable e;
        private Runnable f;
        private boolean g;
        private boolean h;
        private int i;
        private final int[] j = new int[2];
        private final int b = ViewConfiguration.getTapTimeout();
        private final int c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;

        public abstract ListPopupWindow a();

        public b(View view) {
            this.d = view;
            this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean zB;
            boolean z = this.g;
            if (z) {
                if (this.h) {
                    zB = b(motionEvent);
                } else {
                    zB = b(motionEvent) || !c();
                }
            } else {
                boolean z2 = a(motionEvent) && b();
                if (z2) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.d.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                zB = z2;
            }
            this.g = zB;
            return zB || z;
        }

        protected boolean b() {
            ListPopupWindow listPopupWindowA = a();
            if (listPopupWindowA != null && !listPopupWindowA.k()) {
                listPopupWindowA.c();
                return true;
            }
            return true;
        }

        protected boolean c() {
            ListPopupWindow listPopupWindowA = a();
            if (listPopupWindowA != null && listPopupWindowA.k()) {
                listPopupWindowA.i();
                return true;
            }
            return true;
        }

        private boolean a(MotionEvent motionEvent) {
            AnonymousClass1 anonymousClass1 = null;
            View view = this.d;
            if (!view.isEnabled()) {
                return false;
            }
            switch (android.support.v4.view.t.a(motionEvent)) {
                case 0:
                    this.i = motionEvent.getPointerId(0);
                    this.h = false;
                    if (this.e == null) {
                        this.e = new a(this, anonymousClass1);
                    }
                    view.postDelayed(this.e, this.b);
                    if (this.f == null) {
                        this.f = new RunnableC0015b(this, anonymousClass1);
                    }
                    view.postDelayed(this.f, this.c);
                    break;
                case 1:
                case 3:
                    d();
                    break;
                case 2:
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.i);
                    if (iFindPointerIndex >= 0 && !a(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.a)) {
                        d();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        break;
                    }
                    break;
            }
            return false;
        }

        private void d() {
            if (this.f != null) {
                this.d.removeCallbacks(this.f);
            }
            if (this.e != null) {
                this.d.removeCallbacks(this.e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e() {
            d();
            View view = this.d;
            if (view.isEnabled() && !view.isLongClickable() && b()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                this.g = true;
                this.h = true;
            }
        }

        private boolean b(MotionEvent motionEvent) {
            a aVar;
            View view = this.d;
            ListPopupWindow listPopupWindowA = a();
            if (listPopupWindowA == null || !listPopupWindowA.k() || (aVar = listPopupWindowA.g) == null || !aVar.isShown()) {
                return false;
            }
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            b(view, motionEventObtainNoHistory);
            a(aVar, motionEventObtainNoHistory);
            boolean zA = aVar.a(motionEventObtainNoHistory, this.i);
            motionEventObtainNoHistory.recycle();
            int iA = android.support.v4.view.t.a(motionEvent);
            return zA && (iA != 1 && iA != 3);
        }

        private static boolean a(View view, float f, float f2, float f3) {
            return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
        }

        private boolean a(View view, MotionEvent motionEvent) {
            view.getLocationOnScreen(this.j);
            motionEvent.offsetLocation(-r0[0], -r0[1]);
            return true;
        }

        private boolean b(View view, MotionEvent motionEvent) {
            view.getLocationOnScreen(this.j);
            motionEvent.offsetLocation(r0[0], r0[1]);
            return true;
        }

        private class a implements Runnable {
            private a() {
            }

            /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }

        /* JADX INFO: renamed from: android.support.v7.widget.ListPopupWindow$b$b, reason: collision with other inner class name */
        private class RunnableC0015b implements Runnable {
            private RunnableC0015b() {
            }

            /* synthetic */ RunnableC0015b(b bVar, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.e();
            }
        }
    }

    private static class a extends ListViewCompat {
        private boolean g;
        private boolean h;
        private boolean i;
        private bb j;
        private android.support.v4.widget.n k;

        public a(Context context, boolean z) {
            super(context, null, a.C0012a.dropDownListViewStyle);
            this.h = z;
            setCacheColorHint(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.view.MotionEvent r9, int r10) {
            /*
                r8 = this;
                r2 = 1
                r1 = 0
                int r3 = android.support.v4.view.t.a(r9)
                switch(r3) {
                    case 1: goto L2d;
                    case 2: goto L6a;
                    case 3: goto L2a;
                    default: goto L9;
                }
            L9:
                r0 = r1
                r3 = r2
            Lb:
                if (r3 == 0) goto Lf
                if (r0 == 0) goto L12
            Lf:
                r8.d()
            L12:
                if (r3 == 0) goto L60
                android.support.v4.widget.n r0 = r8.k
                if (r0 != 0) goto L1f
                android.support.v4.widget.n r0 = new android.support.v4.widget.n
                r0.<init>(r8)
                r8.k = r0
            L1f:
                android.support.v4.widget.n r0 = r8.k
                r0.a(r2)
                android.support.v4.widget.n r0 = r8.k
                r0.onTouch(r8, r9)
            L29:
                return r3
            L2a:
                r0 = r1
                r3 = r1
                goto Lb
            L2d:
                r0 = r1
            L2e:
                int r4 = r9.findPointerIndex(r10)
                if (r4 >= 0) goto L37
                r0 = r1
                r3 = r1
                goto Lb
            L37:
                float r5 = r9.getX(r4)
                int r5 = (int) r5
                float r4 = r9.getY(r4)
                int r4 = (int) r4
                int r6 = r8.pointToPosition(r5, r4)
                r7 = -1
                if (r6 != r7) goto L4b
                r3 = r0
                r0 = r2
                goto Lb
            L4b:
                int r0 = r8.getFirstVisiblePosition()
                int r0 = r6 - r0
                android.view.View r0 = r8.getChildAt(r0)
                float r5 = (float) r5
                float r4 = (float) r4
                r8.a(r0, r6, r5, r4)
                if (r3 != r2) goto L9
                r8.a(r0, r6)
                goto L9
            L60:
                android.support.v4.widget.n r0 = r8.k
                if (r0 == 0) goto L29
                android.support.v4.widget.n r0 = r8.k
                r0.a(r1)
                goto L29
            L6a:
                r0 = r2
                goto L2e
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListPopupWindow.a.a(android.view.MotionEvent, int):boolean");
        }

        private void a(View view, int i) {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        private void d() {
            this.i = false;
            setPressed(false);
            drawableStateChanged();
            View childAt = getChildAt(this.f - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.j != null) {
                this.j.b();
                this.j = null;
            }
        }

        private void a(View view, int i, float f, float f2) {
            View childAt;
            this.i = true;
            if (Build.VERSION.SDK_INT >= 21) {
                drawableHotspotChanged(f, f2);
            }
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            if (this.f != -1 && (childAt = getChildAt(this.f - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
                childAt.setPressed(false);
            }
            this.f = i;
            float left = f - view.getLeft();
            float top = f2 - view.getTop();
            if (Build.VERSION.SDK_INT >= 21) {
                view.drawableHotspotChanged(left, top);
            }
            if (!view.isPressed()) {
                view.setPressed(true);
            }
            a(i, view, f, f2);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

        @Override // android.support.v7.widget.ListViewCompat
        protected boolean a() {
            return this.i || super.a();
        }

        @Override // android.view.View
        public boolean isInTouchMode() {
            return (this.h && this.g) || super.isInTouchMode();
        }

        @Override // android.view.View
        public boolean hasWindowFocus() {
            return this.h || super.hasWindowFocus();
        }

        @Override // android.view.View
        public boolean isFocused() {
            return this.h || super.isFocused();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean hasFocus() {
            return this.h || super.hasFocus();
        }
    }

    private class d extends DataSetObserver {
        private d() {
        }

        /* synthetic */ d(ListPopupWindow listPopupWindow, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.k()) {
                ListPopupWindow.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.i();
        }
    }

    private class c implements Runnable {
        private c() {
        }

        /* synthetic */ c(ListPopupWindow listPopupWindow, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.j();
        }
    }

    private class g implements Runnable {
        private g() {
        }

        /* synthetic */ g(ListPopupWindow listPopupWindow, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ListPopupWindow.this.g != null && ai.y(ListPopupWindow.this.g) && ListPopupWindow.this.g.getCount() > ListPopupWindow.this.g.getChildCount() && ListPopupWindow.this.g.getChildCount() <= ListPopupWindow.this.b) {
                ListPopupWindow.this.e.setInputMethodMode(2);
                ListPopupWindow.this.c();
            }
        }
    }

    private class f implements View.OnTouchListener {
        private f() {
        }

        /* synthetic */ f(ListPopupWindow listPopupWindow, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.e != null && ListPopupWindow.this.e.isShowing() && x >= 0 && x < ListPopupWindow.this.e.getWidth() && y >= 0 && y < ListPopupWindow.this.e.getHeight()) {
                ListPopupWindow.this.C.postDelayed(ListPopupWindow.this.x, 250L);
                return false;
            }
            if (action == 1) {
                ListPopupWindow.this.C.removeCallbacks(ListPopupWindow.this.x);
                return false;
            }
            return false;
        }
    }

    private class e implements AbsListView.OnScrollListener {
        private e() {
        }

        /* synthetic */ e(ListPopupWindow listPopupWindow, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.l() && ListPopupWindow.this.e.getContentView() != null) {
                ListPopupWindow.this.C.removeCallbacks(ListPopupWindow.this.x);
                ListPopupWindow.this.x.run();
            }
        }
    }

    private void b(boolean z) {
        if (a != null) {
            try {
                a.invoke(this.e, Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int a(View view, int i, boolean z) {
        if (c != null) {
            try {
                return ((Integer) c.invoke(this.e, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e2) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.e.getMaxAvailableHeight(view, i);
    }
}
