package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p002v4.p007c.C0137d;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0427t;
import android.support.p002v4.widget.C0508n;
import android.support.p002v4.widget.C0517s;
import android.support.p013v7.p014a.C0535a;
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
/* renamed from: android.support.v7.widget.ListPopupWindow */
/* loaded from: classes.dex */
public class ListPopupWindow {

    /* renamed from: a */
    private static Method f1834a;

    /* renamed from: c */
    private static Method f1835c;

    /* renamed from: A */
    private final RunnableC0691c f1836A;

    /* renamed from: B */
    private Runnable f1837B;

    /* renamed from: C */
    private final Handler f1838C;

    /* renamed from: D */
    private Rect f1839D;

    /* renamed from: E */
    private boolean f1840E;

    /* renamed from: F */
    private int f1841F;

    /* renamed from: b */
    int f1842b;

    /* renamed from: d */
    private Context f1843d;

    /* renamed from: e */
    private PopupWindow f1844e;

    /* renamed from: f */
    private ListAdapter f1845f;

    /* renamed from: g */
    private C0687a f1846g;

    /* renamed from: h */
    private int f1847h;

    /* renamed from: i */
    private int f1848i;

    /* renamed from: j */
    private int f1849j;

    /* renamed from: k */
    private int f1850k;

    /* renamed from: l */
    private int f1851l;

    /* renamed from: m */
    private boolean f1852m;

    /* renamed from: n */
    private int f1853n;

    /* renamed from: o */
    private boolean f1854o;

    /* renamed from: p */
    private boolean f1855p;

    /* renamed from: q */
    private View f1856q;

    /* renamed from: r */
    private int f1857r;

    /* renamed from: s */
    private DataSetObserver f1858s;

    /* renamed from: t */
    private View f1859t;

    /* renamed from: u */
    private Drawable f1860u;

    /* renamed from: v */
    private AdapterView.OnItemClickListener f1861v;

    /* renamed from: w */
    private AdapterView.OnItemSelectedListener f1862w;

    /* renamed from: x */
    private final RunnableC0695g f1863x;

    /* renamed from: y */
    private final View$OnTouchListenerC0694f f1864y;

    /* renamed from: z */
    private final C0693e f1865z;

    static {
        try {
            f1834a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f1835c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, C0535a.C0536a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1847h = -2;
        this.f1848i = -2;
        this.f1851l = 1002;
        this.f1853n = 0;
        this.f1854o = false;
        this.f1855p = false;
        this.f1842b = Integer.MAX_VALUE;
        this.f1857r = 0;
        this.f1863x = new RunnableC0695g(this, null);
        this.f1864y = new View$OnTouchListenerC0694f(this, null);
        this.f1865z = new C0693e(this, null);
        this.f1836A = new RunnableC0691c(this, null);
        this.f1839D = new Rect();
        this.f1843d = context;
        this.f1838C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ListPopupWindow, i, i2);
        this.f1849j = obtainStyledAttributes.getDimensionPixelOffset(C0535a.C0546k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1850k = obtainStyledAttributes.getDimensionPixelOffset(C0535a.C0546k.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1850k != 0) {
            this.f1852m = true;
        }
        obtainStyledAttributes.recycle();
        this.f1844e = new AppCompatPopupWindow(context, attributeSet, i);
        this.f1844e.setInputMethodMode(1);
        this.f1841F = C0137d.m13416a(this.f1843d.getResources().getConfiguration().locale);
    }

    /* renamed from: a */
    public void mo11505a(ListAdapter listAdapter) {
        if (this.f1858s == null) {
            this.f1858s = new C0692d(this, null);
        } else if (this.f1845f != null) {
            this.f1845f.unregisterDataSetObserver(this.f1858s);
        }
        this.f1845f = listAdapter;
        if (this.f1845f != null) {
            listAdapter.registerDataSetObserver(this.f1858s);
        }
        if (this.f1846g != null) {
            this.f1846g.setAdapter(this.f1845f);
        }
    }

    /* renamed from: a */
    public void m11511a(int i) {
        this.f1857r = i;
    }

    /* renamed from: a */
    public void m11503a(boolean z) {
        this.f1840E = z;
        this.f1844e.setFocusable(z);
    }

    /* renamed from: d */
    public Drawable m11495d() {
        return this.f1844e.getBackground();
    }

    /* renamed from: a */
    public void m11510a(Drawable drawable) {
        this.f1844e.setBackgroundDrawable(drawable);
    }

    /* renamed from: e */
    public View m11492e() {
        return this.f1859t;
    }

    /* renamed from: a */
    public void m11508a(View view) {
        this.f1859t = view;
    }

    /* renamed from: f */
    public int m11490f() {
        return this.f1849j;
    }

    /* renamed from: b */
    public void m11501b(int i) {
        this.f1849j = i;
    }

    /* renamed from: g */
    public int m11488g() {
        if (this.f1852m) {
            return this.f1850k;
        }
        return 0;
    }

    /* renamed from: c */
    public void m11497c(int i) {
        this.f1850k = i;
        this.f1852m = true;
    }

    /* renamed from: d */
    public void m11494d(int i) {
        this.f1853n = i;
    }

    /* renamed from: h */
    public int m11486h() {
        return this.f1848i;
    }

    /* renamed from: e */
    public void m11491e(int i) {
        this.f1848i = i;
    }

    /* renamed from: f */
    public void m11489f(int i) {
        Drawable background = this.f1844e.getBackground();
        if (background != null) {
            background.getPadding(this.f1839D);
            this.f1848i = this.f1839D.left + this.f1839D.right + i;
            return;
        }
        m11491e(i);
    }

    /* renamed from: a */
    public void m11506a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1861v = onItemClickListener;
    }

    /* renamed from: c */
    public void mo11498c() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        boolean z2 = false;
        int m11502b = m11502b();
        boolean m11481l = m11481l();
        C0517s.m12175a(this.f1844e, this.f1851l);
        if (this.f1844e.isShowing()) {
            if (this.f1848i == -1) {
                i2 = -1;
            } else if (this.f1848i == -2) {
                i2 = m11492e().getWidth();
            } else {
                i2 = this.f1848i;
            }
            if (this.f1847h == -1) {
                if (!m11481l) {
                    m11502b = -1;
                }
                if (m11481l) {
                    this.f1844e.setWidth(this.f1848i == -1 ? -1 : 0);
                    this.f1844e.setHeight(0);
                    i3 = m11502b;
                } else {
                    this.f1844e.setWidth(this.f1848i == -1 ? -1 : 0);
                    this.f1844e.setHeight(-1);
                    i3 = m11502b;
                }
            } else {
                i3 = this.f1847h == -2 ? m11502b : this.f1847h;
            }
            PopupWindow popupWindow = this.f1844e;
            if (!this.f1855p && !this.f1854o) {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            PopupWindow popupWindow2 = this.f1844e;
            View m11492e = m11492e();
            int i4 = this.f1849j;
            int i5 = this.f1850k;
            if (i2 < 0) {
                i2 = -1;
            }
            popupWindow2.update(m11492e, i4, i5, i2, i3 >= 0 ? i3 : -1);
            return;
        }
        if (this.f1848i == -1) {
            i = -1;
        } else if (this.f1848i == -2) {
            i = m11492e().getWidth();
        } else {
            i = this.f1848i;
        }
        if (this.f1847h == -1) {
            m11502b = -1;
        } else if (this.f1847h != -2) {
            m11502b = this.f1847h;
        }
        this.f1844e.setWidth(i);
        this.f1844e.setHeight(m11502b);
        m11499b(true);
        PopupWindow popupWindow3 = this.f1844e;
        if (this.f1855p || this.f1854o) {
            z = false;
        }
        popupWindow3.setOutsideTouchable(z);
        this.f1844e.setTouchInterceptor(this.f1864y);
        C0517s.m12174a(this.f1844e, m11492e(), this.f1849j, this.f1850k, this.f1853n);
        this.f1846g.setSelection(-1);
        if (!this.f1840E || this.f1846g.isInTouchMode()) {
            m11483j();
        }
        if (!this.f1840E) {
            this.f1838C.post(this.f1836A);
        }
    }

    /* renamed from: i */
    public void m11484i() {
        this.f1844e.dismiss();
        m11512a();
        this.f1844e.setContentView(null);
        this.f1846g = null;
        this.f1838C.removeCallbacks(this.f1863x);
    }

    /* renamed from: a */
    public void m11504a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1844e.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    private void m11512a() {
        if (this.f1856q != null) {
            ViewParent parent = this.f1856q.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1856q);
            }
        }
    }

    /* renamed from: g */
    public void m11487g(int i) {
        this.f1844e.setInputMethodMode(i);
    }

    /* renamed from: h */
    public void m11485h(int i) {
        C0687a c0687a = this.f1846g;
        if (!m11482k() || c0687a == null) {
            return;
        }
        c0687a.f1869g = false;
        c0687a.setSelection(i);
        if (Build.VERSION.SDK_INT >= 11 && c0687a.getChoiceMode() != 0) {
            c0687a.setItemChecked(i, true);
        }
    }

    /* renamed from: j */
    public void m11483j() {
        C0687a c0687a = this.f1846g;
        if (c0687a == null) {
            return;
        }
        c0687a.f1869g = true;
        c0687a.requestLayout();
    }

    /* renamed from: k */
    public boolean m11482k() {
        return this.f1844e.isShowing();
    }

    /* renamed from: l */
    public boolean m11481l() {
        return this.f1844e.getInputMethodMode() == 2;
    }

    /* renamed from: m */
    public ListView m11480m() {
        return this.f1846g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$1 */
    /* loaded from: classes.dex */
    public class C06841 extends AbstractView$OnTouchListenerC0688b {

        /* renamed from: a */
        final /* synthetic */ ListPopupWindow f1866a;

        @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
        /* renamed from: a */
        public ListPopupWindow mo11474a() {
            return this.f1866a;
        }
    }

    /* renamed from: b */
    private int m11502b() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        int i4;
        int i5;
        if (this.f1846g == null) {
            Context context = this.f1843d;
            this.f1837B = new Runnable() { // from class: android.support.v7.widget.ListPopupWindow.2
                @Override // java.lang.Runnable
                public void run() {
                    View m11492e = ListPopupWindow.this.m11492e();
                    if (m11492e != null && m11492e.getWindowToken() != null) {
                        ListPopupWindow.this.mo11498c();
                    }
                }
            };
            this.f1846g = new C0687a(context, !this.f1840E);
            if (this.f1860u != null) {
                this.f1846g.setSelector(this.f1860u);
            }
            this.f1846g.setAdapter(this.f1845f);
            this.f1846g.setOnItemClickListener(this.f1861v);
            this.f1846g.setFocusable(true);
            this.f1846g.setFocusableInTouchMode(true);
            this.f1846g.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.ListPopupWindow.3
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view2, int i6, long j) {
                    C0687a c0687a;
                    if (i6 == -1 || (c0687a = ListPopupWindow.this.f1846g) == null) {
                        return;
                    }
                    c0687a.f1869g = false;
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            this.f1846g.setOnScrollListener(this.f1865z);
            if (this.f1862w != null) {
                this.f1846g.setOnItemSelectedListener(this.f1862w);
            }
            View view2 = this.f1846g;
            View view3 = this.f1856q;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.f1857r) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f1857r);
                        break;
                }
                if (this.f1848i >= 0) {
                    i5 = this.f1848i;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                view3.measure(View.MeasureSpec.makeMeasureSpec(i5, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i3 = layoutParams2.bottomMargin + view3.getMeasuredHeight() + layoutParams2.topMargin;
                view = linearLayout;
            } else {
                view = view2;
                i3 = 0;
            }
            this.f1844e.setContentView(view);
            i = i3;
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1844e.getContentView();
            View view4 = this.f1856q;
            if (view4 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                i = layoutParams3.bottomMargin + view4.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f1844e.getBackground();
        if (background != null) {
            background.getPadding(this.f1839D);
            int i6 = this.f1839D.top + this.f1839D.bottom;
            if (this.f1852m) {
                i2 = i6;
            } else {
                this.f1850k = -this.f1839D.top;
                i2 = i6;
            }
        } else {
            this.f1839D.setEmpty();
            i2 = 0;
        }
        int m11507a = m11507a(m11492e(), this.f1850k, this.f1844e.getInputMethodMode() == 2);
        if (this.f1854o || this.f1847h == -1) {
            return m11507a + i2;
        }
        switch (this.f1848i) {
            case -2:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1843d.getResources().getDisplayMetrics().widthPixels - (this.f1839D.left + this.f1839D.right), Integer.MIN_VALUE);
                break;
            case ItemInfo.NO_ID /* -1 */:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1843d.getResources().getDisplayMetrics().widthPixels - (this.f1839D.left + this.f1839D.right), 1073741824);
                break;
            default:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1848i, 1073741824);
                break;
        }
        int a = this.f1846g.m11461a(makeMeasureSpec, 0, -1, m11507a - i, -1);
        if (a > 0) {
            i += i2;
        }
        return a + i;
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractView$OnTouchListenerC0688b implements View.OnTouchListener {

        /* renamed from: a */
        private final float f1874a;

        /* renamed from: d */
        private final View f1877d;

        /* renamed from: e */
        private Runnable f1878e;

        /* renamed from: f */
        private Runnable f1879f;

        /* renamed from: g */
        private boolean f1880g;

        /* renamed from: h */
        private boolean f1881h;

        /* renamed from: i */
        private int f1882i;

        /* renamed from: j */
        private final int[] f1883j = new int[2];

        /* renamed from: b */
        private final int f1875b = ViewConfiguration.getTapTimeout();

        /* renamed from: c */
        private final int f1876c = (this.f1875b + ViewConfiguration.getLongPressTimeout()) / 2;

        /* renamed from: a */
        public abstract ListPopupWindow mo11474a();

        public AbstractView$OnTouchListenerC0688b(View view) {
            this.f1877d = view;
            this.f1874a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            boolean z2 = this.f1880g;
            if (z2) {
                if (this.f1881h) {
                    z = m11467b(motionEvent);
                } else {
                    z = m11467b(motionEvent) || !mo11465c();
                }
            } else {
                boolean z3 = m11472a(motionEvent) && mo11469b();
                if (z3) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.f1877d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                z = z3;
            }
            this.f1880g = z;
            return z || z2;
        }

        /* renamed from: b */
        protected boolean mo11469b() {
            ListPopupWindow mo11474a = mo11474a();
            if (mo11474a != null && !mo11474a.m11482k()) {
                mo11474a.mo11498c();
                return true;
            }
            return true;
        }

        /* renamed from: c */
        protected boolean mo11465c() {
            ListPopupWindow mo11474a = mo11474a();
            if (mo11474a != null && mo11474a.m11482k()) {
                mo11474a.m11484i();
                return true;
            }
            return true;
        }

        /* renamed from: a */
        private boolean m11472a(MotionEvent motionEvent) {
            View view = this.f1877d;
            if (view.isEnabled()) {
                switch (C0427t.m12599a(motionEvent)) {
                    case 0:
                        this.f1882i = motionEvent.getPointerId(0);
                        this.f1881h = false;
                        if (this.f1878e == null) {
                            this.f1878e = new RunnableC0689a(this, null);
                        }
                        view.postDelayed(this.f1878e, this.f1875b);
                        if (this.f1879f == null) {
                            this.f1879f = new RunnableC0690b(this, null);
                        }
                        view.postDelayed(this.f1879f, this.f1876c);
                        return false;
                    case 1:
                    case 3:
                        m11464d();
                        return false;
                    case 2:
                        int findPointerIndex = motionEvent.findPointerIndex(this.f1882i);
                        if (findPointerIndex < 0 || m11471a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f1874a)) {
                            return false;
                        }
                        m11464d();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    default:
                        return false;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m11464d() {
            if (this.f1879f != null) {
                this.f1877d.removeCallbacks(this.f1879f);
            }
            if (this.f1878e != null) {
                this.f1877d.removeCallbacks(this.f1878e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m11463e() {
            m11464d();
            View view = this.f1877d;
            if (view.isEnabled() && !view.isLongClickable() && mo11469b()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                this.f1880g = true;
                this.f1881h = true;
            }
        }

        /* renamed from: b */
        private boolean m11467b(MotionEvent motionEvent) {
            C0687a c0687a;
            boolean z = true;
            View view = this.f1877d;
            ListPopupWindow mo11474a = mo11474a();
            if (mo11474a == null || !mo11474a.m11482k() || (c0687a = mo11474a.f1846g) == null || !c0687a.isShown()) {
                return false;
            }
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m11466b(view, obtainNoHistory);
            m11470a(c0687a, obtainNoHistory);
            boolean m11478a = c0687a.m11478a(obtainNoHistory, this.f1882i);
            obtainNoHistory.recycle();
            int m12599a = C0427t.m12599a(motionEvent);
            boolean z2 = (m12599a == 1 || m12599a == 3) ? false : true;
            if (!m11478a || !z2) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private static boolean m11471a(View view, float f, float f2, float f3) {
            return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
        }

        /* renamed from: a */
        private boolean m11470a(View view, MotionEvent motionEvent) {
            int[] iArr = this.f1883j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
            return true;
        }

        /* renamed from: b */
        private boolean m11466b(View view, MotionEvent motionEvent) {
            int[] iArr = this.f1883j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation(iArr[0], iArr[1]);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.widget.ListPopupWindow$b$a */
        /* loaded from: classes.dex */
        public class RunnableC0689a implements Runnable {
            private RunnableC0689a() {
            }

            /* synthetic */ RunnableC0689a(AbstractView$OnTouchListenerC0688b abstractView$OnTouchListenerC0688b, C06841 c06841) {
                this();
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractView$OnTouchListenerC0688b.this.f1877d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: android.support.v7.widget.ListPopupWindow$b$b */
        /* loaded from: classes.dex */
        public class RunnableC0690b implements Runnable {
            private RunnableC0690b() {
            }

            /* synthetic */ RunnableC0690b(AbstractView$OnTouchListenerC0688b abstractView$OnTouchListenerC0688b, C06841 c06841) {
                this();
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractView$OnTouchListenerC0688b.this.m11463e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$a */
    /* loaded from: classes.dex */
    public static class C0687a extends ListViewCompat {

        /* renamed from: g */
        private boolean f1869g;

        /* renamed from: h */
        private boolean f1870h;

        /* renamed from: i */
        private boolean f1871i;

        /* renamed from: j */
        private C0363bb f1872j;

        /* renamed from: k */
        private C0508n f1873k;

        public C0687a(Context context, boolean z) {
            super(context, null, C0535a.C0536a.dropDownListViewStyle);
            this.f1870h = z;
            setCacheColorHint(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean m11478a(android.view.MotionEvent r9, int r10) {
            /*
                r8 = this;
                r2 = 1
                r1 = 0
                int r3 = android.support.p002v4.view.C0427t.m12599a(r9)
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
                r8.m11475d()
            L12:
                if (r3 == 0) goto L60
                android.support.v4.widget.n r0 = r8.f1873k
                if (r0 != 0) goto L1f
                android.support.v4.widget.n r0 = new android.support.v4.widget.n
                r0.<init>(r8)
                r8.f1873k = r0
            L1f:
                android.support.v4.widget.n r0 = r8.f1873k
                r0.m12377a(r2)
                android.support.v4.widget.n r0 = r8.f1873k
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
                r8.m11476a(r0, r6, r5, r4)
                if (r3 != r2) goto L9
                r8.m11477a(r0, r6)
                goto L9
            L60:
                android.support.v4.widget.n r0 = r8.f1873k
                if (r0 == 0) goto L29
                android.support.v4.widget.n r0 = r8.f1873k
                r0.m12377a(r1)
                goto L29
            L6a:
                r0 = r2
                goto L2e
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p013v7.widget.ListPopupWindow.C0687a.m11478a(android.view.MotionEvent, int):boolean");
        }

        /* renamed from: a */
        private void m11477a(View view, int i) {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        /* renamed from: d */
        private void m11475d() {
            this.f1871i = false;
            setPressed(false);
            drawableStateChanged();
            View childAt = getChildAt(this.f1897f - getFirstVisiblePosition());
            if (childAt != null) {
                childAt.setPressed(false);
            }
            if (this.f1872j != null) {
                this.f1872j.m12702b();
                this.f1872j = null;
            }
        }

        /* renamed from: a */
        private void m11476a(View view, int i, float f, float f2) {
            View childAt;
            this.f1871i = true;
            if (Build.VERSION.SDK_INT >= 21) {
                drawableHotspotChanged(f, f2);
            }
            if (!isPressed()) {
                setPressed(true);
            }
            layoutChildren();
            if (this.f1897f != -1 && (childAt = getChildAt(this.f1897f - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
                childAt.setPressed(false);
            }
            this.f1897f = i;
            float left = f - view.getLeft();
            float top = f2 - view.getTop();
            if (Build.VERSION.SDK_INT >= 21) {
                view.drawableHotspotChanged(left, top);
            }
            if (!view.isPressed()) {
                view.setPressed(true);
            }
            m11459a(i, view, f, f2);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.support.p013v7.widget.ListViewCompat
        /* renamed from: a */
        public boolean mo11462a() {
            return this.f1871i || super.mo11462a();
        }

        @Override // android.view.View
        public boolean isInTouchMode() {
            return (this.f1870h && this.f1869g) || super.isInTouchMode();
        }

        @Override // android.view.View
        public boolean hasWindowFocus() {
            return this.f1870h || super.hasWindowFocus();
        }

        @Override // android.view.View
        public boolean isFocused() {
            return this.f1870h || super.isFocused();
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean hasFocus() {
            return this.f1870h || super.hasFocus();
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$d */
    /* loaded from: classes.dex */
    private class C0692d extends DataSetObserver {
        private C0692d() {
        }

        /* synthetic */ C0692d(ListPopupWindow listPopupWindow, C06841 c06841) {
            this();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ListPopupWindow.this.m11482k()) {
                ListPopupWindow.this.mo11498c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.m11484i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$c */
    /* loaded from: classes.dex */
    public class RunnableC0691c implements Runnable {
        private RunnableC0691c() {
        }

        /* synthetic */ RunnableC0691c(ListPopupWindow listPopupWindow, C06841 c06841) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            ListPopupWindow.this.m11483j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$g */
    /* loaded from: classes.dex */
    public class RunnableC0695g implements Runnable {
        private RunnableC0695g() {
        }

        /* synthetic */ RunnableC0695g(ListPopupWindow listPopupWindow, C06841 c06841) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ListPopupWindow.this.f1846g != null && C0309ai.m12882y(ListPopupWindow.this.f1846g) && ListPopupWindow.this.f1846g.getCount() > ListPopupWindow.this.f1846g.getChildCount() && ListPopupWindow.this.f1846g.getChildCount() <= ListPopupWindow.this.f1842b) {
                ListPopupWindow.this.f1844e.setInputMethodMode(2);
                ListPopupWindow.this.mo11498c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$f */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0694f implements View.OnTouchListener {
        private View$OnTouchListenerC0694f() {
        }

        /* synthetic */ View$OnTouchListenerC0694f(ListPopupWindow listPopupWindow, C06841 c06841) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.f1844e != null && ListPopupWindow.this.f1844e.isShowing() && x >= 0 && x < ListPopupWindow.this.f1844e.getWidth() && y >= 0 && y < ListPopupWindow.this.f1844e.getHeight()) {
                ListPopupWindow.this.f1838C.postDelayed(ListPopupWindow.this.f1863x, 250L);
                return false;
            } else if (action == 1) {
                ListPopupWindow.this.f1838C.removeCallbacks(ListPopupWindow.this.f1863x);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListPopupWindow$e */
    /* loaded from: classes.dex */
    public class C0693e implements AbsListView.OnScrollListener {
        private C0693e() {
        }

        /* synthetic */ C0693e(ListPopupWindow listPopupWindow, C06841 c06841) {
            this();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.m11481l() && ListPopupWindow.this.f1844e.getContentView() != null) {
                ListPopupWindow.this.f1838C.removeCallbacks(ListPopupWindow.this.f1863x);
                ListPopupWindow.this.f1863x.run();
            }
        }
    }

    /* renamed from: b */
    private void m11499b(boolean z) {
        if (f1834a != null) {
            try {
                f1834a.invoke(this.f1844e, Boolean.valueOf(z));
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: a */
    private int m11507a(View view, int i, boolean z) {
        if (f1835c != null) {
            try {
                return ((Integer) f1835c.invoke(this.f1844e, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1844e.getMaxAvailableHeight(view, i);
    }
}
