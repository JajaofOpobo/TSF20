package com.tsf.shell.plugin.themepicker.wallpaper;

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
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class c extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ b a;
    private Context b;
    private int c;
    private int d;
    private int e;
    private AbsListView.LayoutParams f;
    private ResolveInfo[] g;
    private PackageManager h;

    public c(b bVar, Context context) {
        this.a = bVar;
        this.b = context;
        this.h = context.getPackageManager();
        this.c = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
        a();
    }

    private void a() {
        int i = 0;
        List<ResolveInfo> queryIntentActivities = this.h.queryIntentActivities(new Intent("android.intent.action.SET_WALLPAPER"), 0);
        ArrayList arrayList = new ArrayList();
        String packageName = this.b.getPackageName();
        while (true) {
            int i2 = i;
            if (i2 < queryIntentActivities.size()) {
                ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                if (!resolveInfo.activityInfo.packageName.equals(packageName)) {
                    arrayList.add(resolveInfo);
                }
                i = i2 + 1;
            } else {
                this.g = new ResolveInfo[arrayList.size()];
                arrayList.toArray(this.g);
                return;
            }
        }
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
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            ((ImageView) view.findViewById(n.imageView1)).setImageDrawable(resolveInfo.loadIcon(this.h));
            ((TextView) view.findViewById(n.textView1)).setText(resolveInfo.loadLabel(this.h));
        }
        return view;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
        if (resolveInfo != null) {
            Intent intent = new Intent("android.intent.action.SET_WALLPAPER");
            intent.setPackage(resolveInfo.activityInfo.packageName);
            g.b("packageName:" + resolveInfo.activityInfo.packageName);
            this.a.i().startActivity(intent);
        }
    }
}
