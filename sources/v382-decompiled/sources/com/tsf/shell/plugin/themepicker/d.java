package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
class d extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ c a;
    private Context b;
    private int c;
    private int d;
    private int e;
    private AbsListView.LayoutParams f;
    private ResolveInfo[] g;
    private PackageManager h;

    public d(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
        this.h = context.getPackageManager();
        this.c = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
        a();
    }

    private void a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        List<ResolveInfo> queryIntentActivities = this.h.queryIntentActivities(intent, 0);
        this.g = new ResolveInfo[queryIntentActivities.size()];
        queryIntentActivities.toArray(this.g);
    }

    public void a(int i) {
        if (i != this.e) {
            this.e = i;
            this.f = new AbsListView.LayoutParams(-1, this.e);
            notifyDataSetChanged();
        }
    }

    public void b(int i) {
        g.b("mNumColumns:" + i);
        this.d = i;
    }

    private int b() {
        return this.d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (b() == 0 || this.g == null) {
            return 0;
        }
        return this.g.length + this.d;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.d) {
            return null;
        }
        return this.g[i - this.d];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i < this.d ? 0 : i - this.d;
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
        return i < this.d ? 1 : 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i < this.d) {
            if (view == null) {
                view = new View(this.b);
            }
            view.setLayoutParams(new AbsListView.LayoutParams(-1, this.c));
        } else {
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(p.theme_preview_gallery_app_item, viewGroup, false);
            }
            if (view.getLayoutParams().height != this.e) {
                view.setLayoutParams(this.f);
            }
            ResolveInfo resolveInfo = this.g[i - this.d];
            ((ImageView) view.findViewById(n.imageView1)).setImageDrawable(resolveInfo.loadIcon(this.h));
            ((TextView) view.findViewById(n.textView1)).setText(resolveInfo.loadLabel(this.h));
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ResolveInfo resolveInfo = this.g[i - this.d];
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        intent.setPackage(resolveInfo.activityInfo.packageName);
        this.a.i().startActivityForResult(intent, 100);
    }
}
