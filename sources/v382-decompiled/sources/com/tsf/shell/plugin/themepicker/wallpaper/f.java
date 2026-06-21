package com.tsf.shell.plugin.themepicker.wallpaper;

import android.app.WallpaperManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.g;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
class f extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ e a;
    private final Context b;
    private int f;
    private int[] g;
    private int c = 0;
    private int e = 0;
    private AbsListView.LayoutParams d = new AbsListView.LayoutParams(-1, -1);

    public f(e eVar, Context context) {
        this.a = eVar;
        this.f = 0;
        this.b = context;
        this.f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
        g.b("mActionBarHeight:" + this.f);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (a() == 0 || this.g == null) {
            return 0;
        }
        return this.g.length + this.e;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.e) {
            return null;
        }
        return Integer.valueOf(this.g[i - this.e]);
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

    public void a(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        this.g = iArr;
        notifyDataSetChanged();
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
                recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                recyclingImageView.setLayoutParams(this.d);
                imageView = recyclingImageView;
            } else {
                imageView = (ImageView) view;
            }
            if (imageView.getLayoutParams().height != this.c) {
                imageView.setLayoutParams(this.d);
            }
            this.a.e.a(Integer.valueOf(this.g[i - this.e]), imageView);
            view2 = imageView;
        }
        return view2;
    }

    public void a(int i) {
        int i2;
        if (i != this.c) {
            this.c = i;
            i2 = this.a.b;
            this.d = new AbsListView.LayoutParams(-1, i2);
            notifyDataSetChanged();
        }
    }

    public void b(int i) {
        this.e = i;
    }

    public int a() {
        return this.e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c(((Integer) getItem(i)).intValue());
    }

    private void c(int i) {
        InputStream a;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this.a.i());
        try {
            a = this.a.a(i);
            wallpaperManager.setStream(a);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
