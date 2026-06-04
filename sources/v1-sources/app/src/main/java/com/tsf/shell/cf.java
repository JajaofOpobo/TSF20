package com.tsf.shell;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class cf extends BaseAdapter {
    final /* synthetic */ ShellWallpaperSelector a;
    private LayoutInflater b;

    cf(ShellWallpaperSelector shellWallpaperSelector, ShellWallpaperSelector shellWallpaperSelector2) {
        this.a = shellWallpaperSelector;
        this.b = shellWallpaperSelector2.getLayoutInflater();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList;
        arrayList = this.a.e;
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return Integer.valueOf(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        ArrayList arrayList;
        if (view == null) {
            imageView = (ImageView) this.b.inflate(R.layout.wallpaper_item, viewGroup, false);
        } else {
            imageView = (ImageView) view;
        }
        arrayList = this.a.e;
        cg cgVar = (cg) arrayList.get(i);
        try {
            imageView.setImageDrawable(cgVar.a.getResources().getDrawable(cgVar.b));
        } catch (Exception e) {
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        return imageView;
    }
}
