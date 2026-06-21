package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;

/* loaded from: classes.dex */
class h extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ f a;
    private List b;
    private Context c;
    private PackageManager d;
    private int e = 0;
    private int f = 0;
    private AbsListView.LayoutParams g;

    public h(f fVar, List list, Context context) {
        this.a = fVar;
        this.b = list;
        this.c = context;
        this.d = context.getPackageManager();
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(int i) {
        if (i != this.f) {
            this.f = i;
            this.g = new AbsListView.LayoutParams(-1, this.f);
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.b != null) {
            return this.b.size() + this.e;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.e) {
            return null;
        }
        return (ResolveInfo) this.b.get(i - this.e);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i < this.e ? 0 : i - this.e;
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
        d dVar;
        String a;
        int i2;
        if (i < this.e) {
            if (view == null) {
                view = new View(this.c);
            }
            i2 = this.a.f;
            view.setLayoutParams(new AbsListView.LayoutParams(-1, i2));
        } else {
            if (view == null) {
                view = LayoutInflater.from(this.c).inflate(p.theme_preview_grid_item, (ViewGroup) null);
            }
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            view.setTag(resolveInfo.activityInfo.packageName);
            RecyclingImageView recyclingImageView = (RecyclingImageView) view.findViewById(n.imageView1);
            dVar = this.a.a;
            dVar.a(resolveInfo, recyclingImageView);
            TextView textView = (TextView) view.findViewById(n.textView1);
            a = this.a.a(resolveInfo.loadLabel(this.d).toString());
            textView.setText(a);
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
        if (resolveInfo != null) {
            Intent intent = new Intent();
            intent.setClass(this.c, ThemePreviewDetilActivity.class);
            intent.putExtra("packagename", resolveInfo.activityInfo.packageName);
            this.a.i().startActivityForResult(intent, 100);
        }
    }
}
