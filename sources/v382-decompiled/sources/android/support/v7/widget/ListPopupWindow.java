package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.internal.widget.AppCompatPopupWindow;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ListPopupWindow {
    private static Method b;
    private Handler A;
    private Rect B;
    private boolean C;
    private int D;
    int a;
    private Context c;
    private PopupWindow d;
    private ListAdapter e;
    private a f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private int p;
    private DataSetObserver q;
    private View r;
    private Drawable s;
    private AdapterView.OnItemClickListener t;
    private AdapterView.OnItemSelectedListener u;
    private final f v;
    private final e w;
    private final d x;
    private final b y;
    private Runnable z;

    static {
        try {
            b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.a.b.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.g = -2;
        this.h = -2;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.a = Integer.MAX_VALUE;
        this.p = 0;
        this.v = new f(this, null);
        this.w = new e(this, 0 == true ? 1 : 0);
        this.x = new d(this, 0 == true ? 1 : 0);
        this.y = new b(this, null);
        this.A = new Handler();
        this.B = new Rect();
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.a.h.ListPopupWindow, i, i2);
        this.i = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.a.h.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.a.h.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.j != 0) {
            this.k = true;
        }
        obtainStyledAttributes.recycle();
        this.d = new AppCompatPopupWindow(context, attributeSet, i);
        this.d.setInputMethodMode(1);
        this.D = android.support.v4.e.f.a(this.c.getResources().getConfiguration().locale);
    }

    public void a(ListAdapter listAdapter) {
        if (this.q == null) {
            this.q = new c(this, null);
        } else if (this.e != null) {
            this.e.unregisterDataSetObserver(this.q);
        }
        this.e = listAdapter;
        if (this.e != null) {
            listAdapter.registerDataSetObserver(this.q);
        }
        if (this.f != null) {
            this.f.setAdapter(this.e);
        }
    }

    public void a(boolean z) {
        this.C = z;
        this.d.setFocusable(z);
    }

    public View a() {
        return this.r;
    }

    public void a(View view) {
        this.r = view;
    }

    public void a(int i) {
        this.l = i;
    }

    public void b(int i) {
        this.h = i;
    }

    public void c(int i) {
        Drawable background = this.d.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            this.h = this.B.left + this.B.right + i;
        } else {
            b(i);
        }
    }

    public void a(AdapterView.OnItemClickListener onItemClickListener) {
        this.t = onItemClickListener;
    }

    public void b() {
        int i;
        int i2;
        int i3;
        boolean z = false;
        int i4 = i();
        boolean f = f();
        if (this.d.isShowing()) {
            if (this.h == -1) {
                i3 = -1;
            } else if (this.h == -2) {
                i3 = a().getWidth();
            } else {
                i3 = this.h;
            }
            if (this.g == -1) {
                if (!f) {
                    i4 = -1;
                }
                if (f) {
                    this.d.setWindowLayoutMode(this.h != -1 ? 0 : -1, 0);
                } else {
                    this.d.setWindowLayoutMode(this.h == -1 ? -1 : 0, -1);
                }
            } else if (this.g != -2) {
                i4 = this.g;
            }
            PopupWindow popupWindow = this.d;
            if (!this.n && !this.m) {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.d.update(a(), this.i, this.j, i3, i4);
            return;
        }
        if (this.h == -1) {
            i = -1;
        } else if (this.h == -2) {
            this.d.setWidth(a().getWidth());
            i = 0;
        } else {
            this.d.setWidth(this.h);
            i = 0;
        }
        if (this.g == -1) {
            i2 = -1;
        } else if (this.g == -2) {
            this.d.setHeight(i4);
            i2 = 0;
        } else {
            this.d.setHeight(this.g);
            i2 = 0;
        }
        this.d.setWindowLayoutMode(i, i2);
        b(true);
        this.d.setOutsideTouchable((this.n || this.m) ? false : true);
        this.d.setTouchInterceptor(this.w);
        android.support.v4.g.f.a(this.d, a(), this.i, this.j, this.l);
        this.f.setSelection(-1);
        if (!this.C || this.f.isInTouchMode()) {
            d();
        }
        if (!this.C) {
            this.A.post(this.y);
        }
    }

    public void c() {
        this.d.dismiss();
        h();
        this.d.setContentView(null);
        this.f = null;
        this.A.removeCallbacks(this.v);
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.d.setOnDismissListener(onDismissListener);
    }

    private void h() {
        if (this.o != null) {
            ViewParent parent = this.o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.o);
            }
        }
    }

    public void d(int i) {
        this.d.setInputMethodMode(i);
    }

    public void d() {
        a aVar = this.f;
        if (aVar == null) {
            return;
        }
        aVar.f = true;
        aVar.requestLayout();
    }

    public boolean e() {
        return this.d.isShowing();
    }

    public boolean f() {
        return this.d.getInputMethodMode() == 2;
    }

    public ListView g() {
        return this.f;
    }

    private int i() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        if (this.f == null) {
            Context context = this.c;
            this.z = new Runnable() { // from class: android.support.v7.widget.ListPopupWindow.1
                @Override // java.lang.Runnable
                public void run() {
                    View a = ListPopupWindow.this.a();
                    if (a != null && a.getWindowToken() != null) {
                        ListPopupWindow.this.b();
                    }
                }
            };
            this.f = new a(context, !this.C);
            if (this.s != null) {
                this.f.setSelector(this.s);
            }
            this.f.setAdapter(this.e);
            this.f.setOnItemClickListener(this.t);
            this.f.setFocusable(true);
            this.f.setFocusableInTouchMode(true);
            this.f.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.ListPopupWindow.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView adapterView, View view2, int i4, long j) {
                    a aVar;
                    if (i4 == -1 || (aVar = ListPopupWindow.this.f) == null) {
                        return;
                    }
                    aVar.f = false;
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView adapterView) {
                }
            });
            this.f.setOnScrollListener(this.x);
            if (this.u != null) {
                this.f.setOnItemSelectedListener(this.u);
            }
            View view2 = this.f;
            View view3 = this.o;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.p) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.p);
                        break;
                }
                view3.measure(View.MeasureSpec.makeMeasureSpec(this.h, Integer.MIN_VALUE), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i3 = layoutParams2.bottomMargin + view3.getMeasuredHeight() + layoutParams2.topMargin;
                view = linearLayout;
            } else {
                view = view2;
                i3 = 0;
            }
            this.d.setContentView(view);
            i = i3;
        } else {
            View view4 = this.o;
            if (view4 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                i = layoutParams3.bottomMargin + view4.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.d.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            int i4 = this.B.top + this.B.bottom;
            if (this.k) {
                i2 = i4;
            } else {
                this.j = -this.B.top;
                i2 = i4;
            }
        } else {
            this.B.setEmpty();
            i2 = 0;
        }
        if (this.d.getInputMethodMode() == 2) {
        }
        int maxAvailableHeight = this.d.getMaxAvailableHeight(a(), this.j);
        if (this.m || this.g == -1) {
            return maxAvailableHeight + i2;
        }
        switch (this.h) {
            case -2:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), Integer.MIN_VALUE);
                break;
            case ItemInfo.NO_ID /* -1 */:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.c.getResources().getDisplayMetrics().widthPixels - (this.B.left + this.B.right), 1073741824);
                break;
            default:
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
                break;
        }
        int a = this.f.a(makeMeasureSpec, 0, -1, maxAvailableHeight - i, -1);
        if (a > 0) {
            i += i2;
        }
        return a + i;
    }

    private void b(boolean z) {
        if (b != null) {
            try {
                b.invoke(this.d, Boolean.valueOf(z));
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }
}
