package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.ah;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import com.tsf.shell.plugin.themepicker.utils.o;
import java.util.List;

/* loaded from: classes.dex */
class k extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ i a;
    private List b;
    private Context c;
    private int d = 0;
    private int e = 0;
    private AbsListView.LayoutParams f;

    public k(i iVar, List list, Context context) {
        this.a = iVar;
        this.b = list;
        this.c = context;
    }

    public void a(int i) {
        this.d = i;
    }

    public void b(int i) {
        if (i != this.e) {
            this.e = i;
            this.f = new AbsListView.LayoutParams(-1, this.e);
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.b != null) {
            return this.b.size() + this.d;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.d) {
            return null;
        }
        return (ah) this.b.get(i - this.d);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i < this.d ? 0 : i - this.d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i < this.d ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        o oVar;
        String b;
        int i2;
        if (i < this.d) {
            if (view == null) {
                view = new View(this.c);
            }
            i2 = this.a.g;
            view.setLayoutParams(new AbsListView.LayoutParams(-1, i2));
        } else {
            if (view == null) {
                view = LayoutInflater.from(this.c).inflate(p.theme_preview_grid_item, (ViewGroup) null);
            }
            ah ahVar = (ah) getItem(i);
            view.setTag(ahVar.b);
            RecyclingImageView recyclingImageView = (RecyclingImageView) view.findViewById(n.imageView1);
            oVar = this.a.a;
            oVar.a(ahVar.c, recyclingImageView);
            TextView textView = (TextView) view.findViewById(n.textView1);
            b = this.a.b(ahVar.a);
            textView.setText(b);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ah ahVar = (ah) getItem(i);
        if (ahVar == null) {
            return;
        }
        this.a.a(ahVar.b);
    }
}
