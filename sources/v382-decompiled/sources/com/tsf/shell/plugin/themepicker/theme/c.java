package com.tsf.shell.plugin.themepicker.theme;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;

/* loaded from: classes.dex */
class c extends BaseAdapter {
    final /* synthetic */ b a;
    private final Context b;
    private int f;
    private List g;
    private int c = 0;
    private int e = 0;
    private AbsListView.LayoutParams d = new AbsListView.LayoutParams(-1, -1);

    public c(b bVar, Context context, List list) {
        this.a = bVar;
        this.f = 0;
        this.g = list;
        this.b = context;
        this.f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
        g.b("mActionBarHeight:" + this.f);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (a() == 0 || this.g == null) {
            return 0;
        }
        return this.g.size() + this.e;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.e) {
            return null;
        }
        return (ResolveInfo) this.g.get(i - this.e);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i < this.e ? 0 : i - this.e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i < this.e ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        View view2;
        View view3 = view;
        if (i < this.e) {
            if (view == null) {
                view3 = new View(this.b);
            }
            view3.setLayoutParams(new AbsListView.LayoutParams(-1, this.f));
            view2 = view3;
        } else {
            if (view == null) {
                RecyclingImageView recyclingImageView = new RecyclingImageView(this.b);
                recyclingImageView.setLayoutParams(this.d);
                imageView = recyclingImageView;
            } else {
                imageView = (ImageView) view;
            }
            if (imageView.getLayoutParams().height != this.c) {
                imageView.setLayoutParams(this.d);
            }
            this.a.e.a(this.g.get(i - this.e), imageView);
            view2 = imageView;
        }
        return view2;
    }

    public void a(int i) {
        if (i != this.c) {
            this.c = i;
            this.d = new AbsListView.LayoutParams(-1, this.c);
            notifyDataSetChanged();
        }
    }

    public void b(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }
}
