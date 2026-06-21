package android.support.v7.internal.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
class e extends BaseAdapter {
    final /* synthetic */ d a;
    private a b;
    private int c = -1;

    public e(d dVar, a aVar) {
        this.a = dVar;
        this.b = aVar;
        a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList i = this.a.g ? this.b.i() : this.b.g();
        if (this.c < 0) {
            return i.size();
        }
        return i.size() - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c getItem(int i) {
        ArrayList i2 = this.a.g ? this.b.i() : this.b.g();
        if (this.c >= 0 && i >= this.c) {
            i++;
        }
        return (c) i2.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.a.d.inflate(d.a, viewGroup, false) : view;
        i iVar = (i) inflate;
        if (this.a.b) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        iVar.a(getItem(i), 0);
        return inflate;
    }

    void a() {
        c l = this.a.e.l();
        if (l != null) {
            ArrayList i = this.a.e.i();
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((c) i.get(i2)) == l) {
                    this.c = i2;
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
