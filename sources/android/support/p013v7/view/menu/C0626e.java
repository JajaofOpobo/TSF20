package android.support.p013v7.view.menu;

import android.content.Context;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
/* renamed from: android.support.v7.view.menu.e */
/* loaded from: classes.dex */
public class C0626e implements InterfaceC0643l, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1508a;

    /* renamed from: b */
    LayoutInflater f1509b;

    /* renamed from: c */
    C0628f f1510c;

    /* renamed from: d */
    ExpandedMenuView f1511d;

    /* renamed from: e */
    int f1512e;

    /* renamed from: f */
    int f1513f;

    /* renamed from: g */
    C0627a f1514g;

    /* renamed from: h */
    private int f1515h;

    /* renamed from: i */
    private InterfaceC0643l.InterfaceC0644a f1516i;

    public C0626e(Context context, int i) {
        this(i, 0);
        this.f1508a = context;
        this.f1509b = LayoutInflater.from(this.f1508a);
    }

    public C0626e(int i, int i2) {
        this.f1513f = i;
        this.f1512e = i2;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11319a(Context context, C0628f c0628f) {
        if (this.f1512e != 0) {
            this.f1508a = new ContextThemeWrapper(context, this.f1512e);
            this.f1509b = LayoutInflater.from(this.f1508a);
        } else if (this.f1508a != null) {
            this.f1508a = context;
            if (this.f1509b == null) {
                this.f1509b = LayoutInflater.from(this.f1508a);
            }
        }
        this.f1510c = c0628f;
        if (this.f1514g != null) {
            this.f1514g.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public InterfaceC0645m m11789a(ViewGroup viewGroup) {
        if (this.f1511d == null) {
            this.f1511d = (ExpandedMenuView) this.f1509b.inflate(C0535a.C0543h.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1514g == null) {
                this.f1514g = new C0627a();
            }
            this.f1511d.setAdapter((ListAdapter) this.f1514g);
            this.f1511d.setOnItemClickListener(this);
        }
        return this.f1511d;
    }

    /* renamed from: a */
    public ListAdapter m11792a() {
        if (this.f1514g == null) {
            this.f1514g = new C0627a();
        }
        return this.f1514g;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: b */
    public void mo11313b(boolean z) {
        if (this.f1514g != null) {
            this.f1514g.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void m11790a(InterfaceC0643l.InterfaceC0644a interfaceC0644a) {
        this.f1516i = interfaceC0644a;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public boolean mo11316a(SubMenuC0649p subMenuC0649p) {
        if (subMenuC0649p.hasVisibleItems()) {
            new DialogInterface$OnClickListenerC0631g(subMenuC0649p).m11740a(null);
            if (this.f1516i != null) {
                this.f1516i.mo11114a_(subMenuC0649p);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l
    /* renamed from: a */
    public void mo11317a(C0628f c0628f, boolean z) {
        if (this.f1516i != null) {
            this.f1516i.mo11116a(c0628f, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1510c.m11771a(this.f1514g.getItem(i), this, 0);
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
    /* renamed from: android.support.v7.view.menu.e$a */
    /* loaded from: classes.dex */
    public class C0627a extends BaseAdapter {

        /* renamed from: b */
        private int f1518b = -1;

        public C0627a() {
            m11788a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0626e.this.f1510c.m11747l().size() - C0626e.this.f1515h;
            return this.f1518b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public C0632h getItem(int i) {
            ArrayList<C0632h> m11747l = C0626e.this.f1510c.m11747l();
            int i2 = C0626e.this.f1515h + i;
            if (this.f1518b >= 0 && i2 >= this.f1518b) {
                i2++;
            }
            return m11747l.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? C0626e.this.f1509b.inflate(C0626e.this.f1513f, viewGroup, false) : view;
            ((InterfaceC0645m.InterfaceC0646a) inflate).mo11680a(getItem(i), 0);
            return inflate;
        }

        /* renamed from: a */
        void m11788a() {
            C0632h m11742r = C0626e.this.f1510c.m11742r();
            if (m11742r != null) {
                ArrayList<C0632h> m11747l = C0626e.this.f1510c.m11747l();
                int size = m11747l.size();
                for (int i = 0; i < size; i++) {
                    if (m11747l.get(i) == m11742r) {
                        this.f1518b = i;
                        return;
                    }
                }
            }
            this.f1518b = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m11788a();
            super.notifyDataSetChanged();
        }
    }
}
