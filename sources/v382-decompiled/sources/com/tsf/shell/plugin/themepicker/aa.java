package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.theme.ThemePickerActivity;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import java.util.List;

/* loaded from: classes.dex */
class aa extends BaseAdapter implements AdapterView.OnItemClickListener {
    final /* synthetic */ z a;
    private final Context b;
    private int f;
    private int[] g;
    private String[] h;
    private int c = 0;
    private int e = 0;
    private AbsListView.LayoutParams d = new AbsListView.LayoutParams(-1, -1);

    public aa(z zVar, Context context) {
        this.a = zVar;
        this.f = 0;
        this.b = context;
        this.f = (int) TypedValue.applyDimension(1, 100.0f, context.getResources().getDisplayMetrics());
        g.b("mActionBarHeight:" + this.f);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (a() == 0) {
            return 0;
        }
        if (this.g == null && this.h == null) {
            return 0;
        }
        if (this.g != null) {
            return this.g.length + this.e;
        }
        if (this.h != null) {
            return this.h.length + this.e;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (i < this.e) {
            return null;
        }
        if (this.g != null) {
            return Integer.valueOf(this.g[i - this.e]);
        }
        if (this.h != null) {
            return this.h[i - this.e];
        }
        return null;
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
                recyclingImageView.setLayoutParams(this.d);
                imageView = recyclingImageView;
            } else {
                imageView = (ImageView) view;
            }
            if (imageView.getLayoutParams().height != this.c) {
                imageView.setLayoutParams(this.d);
            }
            if (this.g != null) {
                this.a.d.a(Integer.valueOf(this.g[i - this.e]), imageView);
                view2 = imageView;
            } else {
                this.a.d.a(this.h[i - this.e], imageView);
                view2 = imageView;
            }
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

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Bitmap bitmap;
        Drawable drawable = ((ImageView) view).getDrawable();
        if ((drawable instanceof TransitionDrawable) && (bitmap = ((BitmapDrawable) ((TransitionDrawable) drawable).getDrawable(1)).getBitmap()) != null && !(this.a.i() instanceof ThemePickerActivity)) {
            ((IconPickerActivity) this.a.i()).a(bitmap);
        }
    }
}
