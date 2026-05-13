package android.support.p013v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.widget.ListPopupWindow;
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
/* renamed from: android.support.v7.view.menu.k */
/* loaded from: classes.dex */
public class View$OnKeyListenerC0641k implements InterfaceC0643l, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    static final int f1583a = C0535a.C0543h.abc_popup_menu_item_layout;

    /* renamed from: b */
    boolean f1584b;

    /* renamed from: c */
    private final Context f1585c;

    /* renamed from: d */
    private final LayoutInflater f1586d;

    /* renamed from: e */
    private final C0628f f1587e;

    /* renamed from: f */
    private final C0642a f1588f;

    /* renamed from: g */
    private final boolean f1589g;

    /* renamed from: h */
    private final int f1590h;

    /* renamed from: i */
    private final int f1591i;

    /* renamed from: j */
    private final int f1592j;

    /* renamed from: k */
    private View f1593k;

    /* renamed from: l */
    private ListPopupWindow f1594l;

    /* renamed from: m */
    private ViewTreeObserver f1595m;

    /* renamed from: n */
    private InterfaceC0643l.InterfaceC0644a f1596n;

    /* renamed from: o */
    private ViewGroup f1597o;

    /* renamed from: p */
    private boolean f1598p;

    /* renamed from: q */
    private int f1599q;

    /* renamed from: r */
    private int f1600r;

    public View$OnKeyListenerC0641k(Context context, C0628f c0628f, View view) {
        this(context, c0628f, view, false, C0535a.C0536a.popupMenuStyle);
    }

    public View$OnKeyListenerC0641k(Context context, C0628f c0628f, View view, boolean z, int i) {
        this(context, c0628f, view, z, i, 0);
    }

    public View$OnKeyListenerC0641k(Context context, C0628f c0628f, View view, boolean z, int i, int i2) {
        this.f1600r = 0;
        this.f1585c = context;
        this.f1586d = LayoutInflater.from(context);
        this.f1587e = c0628f;
        this.f1588f = new C0642a(this.f1587e);
        this.f1589g = z;
        this.f1591i = i;
        this.f1592j = i2;
        Resources resources = context.getResources();
        this.f1590h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0535a.C0539d.abc_config_prefDialogWidth));
        this.f1593k = view;
        c0628f.m11775a(this, context);
    }

    /* renamed from: a */
    public void m11693a(View view) {
        this.f1593k = view;
    }

    /* renamed from: a */
    public void m11692a(boolean z) {
        this.f1584b = z;
    }

    /* renamed from: a */
    public void m11696a(int i) {
        this.f1600r = i;
    }

    /* renamed from: a */
    public void m11697a() {
        if (!m11688d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public ListPopupWindow m11690c() {
        return this.f1594l;
    }

    /* renamed from: d */
    public boolean m11688d() {
        this.f1594l = new ListPopupWindow(this.f1585c, null, this.f1591i, this.f1592j);
        this.f1594l.m11504a((PopupWindow.OnDismissListener) this);
        this.f1594l.m11506a((AdapterView.OnItemClickListener) this);
        this.f1594l.mo11505a(this.f1588f);
        this.f1594l.m11503a(true);
        View view = this.f1593k;
        if (view != null) {
            boolean z = this.f1595m == null;
            this.f1595m = view.getViewTreeObserver();
            if (z) {
                this.f1595m.addOnGlobalLayoutListener(this);
            }
            this.f1594l.m11508a(view);
            this.f1594l.m11494d(this.f1600r);
            if (!this.f1598p) {
                this.f1599q = m11685g();
                this.f1598p = true;
            }
            this.f1594l.m11489f(this.f1599q);
            this.f1594l.m11487g(2);
            this.f1594l.mo11498c();
            this.f1594l.m11480m().setOnKeyListener(this);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m11687e() {
        if (m11686f()) {
            this.f1594l.m11484i();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1594l = null;
        this.f1587e.close();
        if (this.f1595m != null) {
            if (!this.f1595m.isAlive()) {
                this.f1595m = this.f1593k.getViewTreeObserver();
            }
            this.f1595m.removeGlobalOnLayoutListener(this);
            this.f1595m = null;
        }
    }

    /* renamed from: f */
    public boolean m11686f() {
        return this.f1594l != null && this.f1594l.m11482k();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0642a c0642a = this.f1588f;
        c0642a.f1602b.m11772a(c0642a.getItem(i), 0);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            m11687e();
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int m11685g() {
        View view;
        C0642a c0642a = this.f1588f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0642a.getCount();
        int i = 0;
        int i2 = 0;
        View view2 = null;
        int i3 = 0;
        while (i < count) {
            int itemViewType = c0642a.getItemViewType(i);
            if (itemViewType != i2) {
                i2 = itemViewType;
                view = null;
            } else {
                view = view2;
            }
            if (this.f1597o == null) {
                this.f1597o = new FrameLayout(this.f1585c);
            }
            view2 = c0642a.getView(i, view, this.f1597o);
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= this.f1590h) {
                return this.f1590h;
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
        if (m11686f()) {
            View view = this.f1593k;
            if (view == null || !view.isShown()) {
                m11687e();
            } else if (m11686f()) {
                this.f1594l.mo11498c();
            }
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11319a(Context context, C0628f c0628f) {
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public void mo11313b(boolean z) {
        this.f1598p = false;
        if (this.f1588f != null) {
            this.f1588f.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m11694a(InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
        this.f1596n = interfaceC0644a;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11316a(SubMenuC0649p subMenuC0649p) {
        boolean z;
        if (subMenuC0649p.hasVisibleItems()) {
            View$OnKeyListenerC0641k view$OnKeyListenerC0641k = new View$OnKeyListenerC0641k(this.f1585c, subMenuC0649p, this.f1593k);
            view$OnKeyListenerC0641k.m11694a(this.f1596n);
            int size = subMenuC0649p.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuC0649p.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            view$OnKeyListenerC0641k.m11692a(z);
            if (view$OnKeyListenerC0641k.m11688d()) {
                if (this.f1596n != null) {
                    this.f1596n.mo11114a_(subMenuC0649p);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11317a(C0628f c0628f, boolean z) {
        if (c0628f == this.f1587e) {
            m11687e();
            if (this.f1596n != null) {
                this.f1596n.mo11116a(c0628f, z);
            }
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public boolean mo11315b() {
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11318a(C0628f c0628f, C0632h c0632h) {
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public boolean mo11314b(C0628f c0628f, C0632h c0632h) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.k$a */
    /* loaded from: classes.dex */
    public class C0642a extends BaseAdapter {

        /* renamed from: b */
        private C0628f f1602b;

        /* renamed from: c */
        private int f1603c = -1;

        public C0642a(C0628f c0628f) {
            this.f1602b = c0628f;
            m11684a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ArrayList<C0632h> m11747l = View$OnKeyListenerC0641k.this.f1589g ? this.f1602b.m11747l() : this.f1602b.m11750i();
            if (this.f1603c < 0) {
                return m11747l.size();
            }
            return m11747l.size() - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public C0632h getItem(int i) {
            ArrayList<C0632h> m11747l = View$OnKeyListenerC0641k.this.f1589g ? this.f1602b.m11747l() : this.f1602b.m11750i();
            if (this.f1603c >= 0 && i >= this.f1603c) {
                i++;
            }
            return m11747l.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? View$OnKeyListenerC0641k.this.f1586d.inflate(View$OnKeyListenerC0641k.f1583a, viewGroup, false) : view;
            InterfaceC0645m.InterfaceC0646a interfaceC0646a = (InterfaceC0645m.InterfaceC0646a) inflate;
            if (View$OnKeyListenerC0641k.this.f1584b) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            interfaceC0646a.mo11680a(getItem(i), 0);
            return inflate;
        }

        /* renamed from: a */
        void m11684a() {
            C0632h m11742r = View$OnKeyListenerC0641k.this.f1587e.m11742r();
            if (m11742r != null) {
                ArrayList<C0632h> m11747l = View$OnKeyListenerC0641k.this.f1587e.m11747l();
                int size = m11747l.size();
                for (int i = 0; i < size; i++) {
                    if (m11747l.get(i) == m11742r) {
                        this.f1603c = i;
                        return;
                    }
                }
            }
            this.f1603c = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m11684a();
            super.notifyDataSetChanged();
        }
    }
}
