package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.a;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.support.v7.widget.ListPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class k implements l, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    static final int a = a.h.abc_popup_menu_item_layout;
    boolean b;
    private final Context c;
    private final LayoutInflater d;
    private final f e;
    private final a f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private View k;
    private ListPopupWindow l;
    private ViewTreeObserver m;
    private l.a n;
    private ViewGroup o;
    private boolean p;
    private int q;
    private int r;

    public k(Context context, f fVar, View view) {
        this(context, fVar, view, false, a.C0012a.popupMenuStyle);
    }

    public k(Context context, f fVar, View view, boolean z, int i) {
        this(context, fVar, view, z, i, 0);
    }

    public k(Context context, f fVar, View view, boolean z, int i, int i2) {
        this.r = 0;
        this.c = context;
        this.d = LayoutInflater.from(context);
        this.e = fVar;
        this.f = new a(this.e);
        this.g = z;
        this.i = i;
        this.j = i2;
        Resources resources = context.getResources();
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
        this.k = view;
        fVar.a(this, context);
    }

    public void a(View view) {
        this.k = view;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(int i) {
        this.r = i;
    }

    public void a() {
        if (!d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public ListPopupWindow c() {
        return this.l;
    }

    public boolean d() {
        this.l = new ListPopupWindow(this.c, null, this.i, this.j);
        this.l.a((PopupWindow.OnDismissListener) this);
        this.l.a((AdapterView.OnItemClickListener) this);
        this.l.a(this.f);
        this.l.a(true);
        View view = this.k;
        if (view != null) {
            boolean z = this.m == null;
            this.m = view.getViewTreeObserver();
            if (z) {
                this.m.addOnGlobalLayoutListener(this);
            }
            this.l.a(view);
            this.l.d(this.r);
            if (!this.p) {
                this.q = g();
                this.p = true;
            }
            this.l.f(this.q);
            this.l.g(2);
            this.l.c();
            this.l.m().setOnKeyListener(this);
            return true;
        }
        return false;
    }

    public void e() {
        if (f()) {
            this.l.i();
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

    public boolean f() {
        return this.l != null && this.l.k();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = this.f;
        aVar.b.a(aVar.getItem(i), 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            e();
            return true;
        }
        return false;
    }

    private int g() {
        View view;
        a aVar = this.f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = aVar.getCount();
        int i = 0;
        int i2 = 0;
        View view2 = null;
        int i3 = 0;
        while (i < count) {
            int itemViewType = aVar.getItemViewType(i);
            if (itemViewType != i2) {
                i2 = itemViewType;
                view = null;
            } else {
                view = view2;
            }
            if (this.o == null) {
                this.o = new FrameLayout(this.c);
            }
            view2 = aVar.getView(i, view, this.o);
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
        if (f()) {
            View view = this.k;
            if (view == null || !view.isShown()) {
                e();
            } else if (f()) {
                this.l.c();
            }
        }
    }

    @Override // android.support.v7.view.menu.l
    public void a(Context context, f fVar) {
    }

    @Override // android.support.v7.view.menu.l
    public void b(boolean z) {
        this.p = false;
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
    }

    public void a(l.a aVar) {
        this.n = aVar;
    }

    @Override // android.support.v7.view.menu.l
    public boolean a(p pVar) {
        boolean z;
        if (pVar.hasVisibleItems()) {
            k kVar = new k(this.c, pVar, this.k);
            kVar.a(this.n);
            int size = pVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = pVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            kVar.a(z);
            if (kVar.d()) {
                if (this.n != null) {
                    this.n.a_(pVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public void a(f fVar, boolean z) {
        if (fVar == this.e) {
            e();
            if (this.n != null) {
                this.n.a(fVar, z);
            }
        }
    }

    @Override // android.support.v7.view.menu.l
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean a(f fVar, h hVar) {
        return false;
    }

    @Override // android.support.v7.view.menu.l
    public boolean b(f fVar, h hVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        private f b;
        private int c = -1;

        public a(f fVar) {
            this.b = fVar;
            a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ArrayList<h> l = k.this.g ? this.b.l() : this.b.i();
            if (this.c < 0) {
                return l.size();
            }
            return l.size() - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public h getItem(int i) {
            ArrayList<h> l = k.this.g ? this.b.l() : this.b.i();
            if (this.c >= 0 && i >= this.c) {
                i++;
            }
            return l.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? k.this.d.inflate(k.a, viewGroup, false) : view;
            m.a aVar = (m.a) inflate;
            if (k.this.b) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            aVar.a(getItem(i), 0);
            return inflate;
        }

        void a() {
            h r = k.this.e.r();
            if (r != null) {
                ArrayList<h> l = k.this.e.l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (l.get(i) == r) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
