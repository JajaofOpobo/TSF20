package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.a.a;
import android.support.v7.view.menu.l;
import android.support.v7.view.menu.m;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e implements l, AdapterView.OnItemClickListener {
    Context a;
    LayoutInflater b;
    f c;
    ExpandedMenuView d;
    int e;
    int f;
    a g;
    private int h;
    private l.a i;

    public e(Context context, int i) {
        this(i, 0);
        this.a = context;
        this.b = LayoutInflater.from(this.a);
    }

    public e(int i, int i2) {
        this.f = i;
        this.e = i2;
    }

    @Override // android.support.v7.view.menu.l
    public void a(Context context, f fVar) {
        if (this.e != 0) {
            this.a = new ContextThemeWrapper(context, this.e);
            this.b = LayoutInflater.from(this.a);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(this.a);
            }
        }
        this.c = fVar;
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    public m a(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(a.h.abc_expanded_menu_layout, viewGroup, false);
            if (this.g == null) {
                this.g = new a();
            }
            this.d.setAdapter((ListAdapter) this.g);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public ListAdapter a() {
        if (this.g == null) {
            this.g = new a();
        }
        return this.g;
    }

    @Override // android.support.v7.view.menu.l
    public void b(boolean z) {
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    public void a(l.a aVar) {
        this.i = aVar;
    }

    @Override // android.support.v7.view.menu.l
    public boolean a(p pVar) {
        if (!pVar.hasVisibleItems()) {
            return false;
        }
        new g(pVar).a(null);
        if (this.i != null) {
            this.i.a_(pVar);
        }
        return true;
    }

    @Override // android.support.v7.view.menu.l
    public void a(f fVar, boolean z) {
        if (this.i != null) {
            this.i.a(fVar, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c.a(this.g.getItem(i), this, 0);
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

    private class a extends BaseAdapter {
        private int b = -1;

        public a() {
            a();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.c.l().size() - e.this.h;
            return this.b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h getItem(int i) {
            ArrayList<h> arrayListL = e.this.c.l();
            int i2 = e.this.h + i;
            if (this.b >= 0 && i2 >= this.b) {
                i2++;
            }
            return arrayListL.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View viewInflate = view == null ? e.this.b.inflate(e.this.f, viewGroup, false) : view;
            ((m.a) viewInflate).a(getItem(i), 0);
            return viewInflate;
        }

        void a() {
            h hVarR = e.this.c.r();
            if (hVarR != null) {
                ArrayList<h> arrayListL = e.this.c.l();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListL.get(i) == hVarR) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
