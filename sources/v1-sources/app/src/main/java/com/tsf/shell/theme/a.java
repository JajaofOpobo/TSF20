package com.tsf.shell.theme;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends BaseAdapter {
    final /* synthetic */ ThemeDetailedActivity a;
    private Context b;
    private LayoutInflater c;

    public a(ThemeDetailedActivity themeDetailedActivity, Context context) {
        this.a = themeDetailedActivity;
        this.b = context;
        this.c = LayoutInflater.from(this.b);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList;
        arrayList = this.a.c;
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
        b bVar;
        ArrayList arrayList;
        if (view == null) {
            view = this.c.inflate(R.layout.theme_gallery_item, (ViewGroup) null);
            bVar = new b();
            bVar.a = (ImageView) view.findViewById(R.id.theme_item_image);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        arrayList = this.a.c;
        bVar.a.setImageBitmap((Bitmap) arrayList.get(i));
        return view;
    }
}
