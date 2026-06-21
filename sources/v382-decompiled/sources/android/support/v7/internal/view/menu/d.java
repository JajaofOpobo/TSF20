package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ListPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class d implements f, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    static final int a = android.support.v7.a.g.abc_popup_menu_item_layout;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final a e;
    private final e f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ListPopupWindow l;
    private ViewTreeObserver m;
    private g n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    public d(Context context, a aVar, View view) {
        this(context, aVar, view, false, android.support.v7.a.b.popupMenuStyle);
    }

    public d(Context context, a aVar, View view, boolean z, int i) {
        this(context, aVar, view, z, i, 0);
    }

    public d(Context context, a aVar, View view, boolean z, int i, int i2) {
        this.r = 0;
        this.c = context;
        this.d = LayoutInflater.from(context);
        this.e = aVar;
        this.f = new e(this, this.e);
        this.g = z;
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.a.d.abc_config_prefDialogWidth));
        this.k = view;
        aVar.a(this, context);
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(int i) {
        this.r = i;
    }

    public void a() {
        if (!b()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean b() {
        this.l = new ListPopupWindow(this.c, null, this.i, this.j);
        this.l.a((PopupWindow.OnDismissListener) this);
        this.l.a((AdapterView.OnItemClickListener) this);
        this.l.a(this.f);
        this.l.a(true);
        View view = this.k;
        if (view == null) {
            return false;
        }
        boolean z = this.m == null;
        this.m = view.getViewTreeObserver();
        if (z) {
            this.m.addOnGlobalLayoutListener(this);
        }
        this.l.a(view);
        this.l.a(this.r);
        if (!this.p) {
            this.q = f();
            this.p = true;
        }
        this.l.c(this.q);
        this.l.d(2);
        this.l.b();
        this.l.g().setOnKeyListener(this);
        return true;
    }

    public void c() {
        if (d()) {
            this.l.c();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.l = null;
        this.e.close();
        if (this.m != null) {
            if (!this.m.isAlive()) {
                this.m = this.k.getViewTreeObserver();
            }
            this.m.removeGlobalOnLayoutListener(this);
            this.m = null;
        }
    }

    public boolean d() {
        return this.l != null && this.l.e();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a aVar;
        e eVar = this.f;
        aVar = eVar.b;
        aVar.a(eVar.getItem(i), 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        c();
        return true;
    }

    private int f() {
        View view;
        e eVar = this.f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i = 0;
        int i2 = 0;
        View view2 = null;
        int i3 = 0;
        while (i < count) {
            int itemViewType = eVar.getItemViewType(i);
            if (itemViewType != i2) {
                i2 = itemViewType;
                view = null;
            } else {
                view = view2;
            }
            if (this.o == null) {
                this.o = new FrameLayout(this.c);
            }
            view2 = eVar.getView(i, view, this.o);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= this.h) {
                return this.h;
            }
            if (measuredWidth <= i3) {
                measuredWidth = i3;
            }
            i++;
            i3 = measuredWidth;
        }
        return i3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (d()) {
            View view = this.k;
            if (view == null || !view.isShown()) {
                c();
            } else if (d()) {
                this.l.b();
            }
        }
    }

    @Override // android.support.v7.internal.view.menu.f
    public void a(Context context, a aVar) {
    }

    @Override // android.support.v7.internal.view.menu.f
    public void b(boolean z) {
        this.p = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public void a(g gVar) {
        this.n = gVar;
    }

    @Override // android.support.v7.internal.view.menu.f
    public boolean a(j jVar) {
        boolean z;
        if (jVar.hasVisibleItems()) {
            d dVar = new d(this.c, jVar, this.k);
            dVar.a(this.n);
            int size = jVar.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    MenuItem item = jVar.getItem(i);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            dVar.a(z);
            if (dVar.b()) {
                if (this.n == null) {
                    return true;
                }
                this.n.a(jVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.internal.view.menu.f
    public void a(a aVar, boolean z) {
        if (aVar == this.e) {
            c();
            if (this.n != null) {
                this.n.a(aVar, z);
            }
        }
    }

    @Override // android.support.v7.internal.view.menu.f
    public boolean e() {
        return false;
    }

    @Override // android.support.v7.internal.view.menu.f
    public boolean a(a aVar, c cVar) {
        return false;
    }

    @Override // android.support.v7.internal.view.menu.f
    public boolean b(a aVar, c cVar) {
        return false;
    }
}
