package com.tsf.shell.theme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class g extends BaseAdapter {
    final /* synthetic */ c a;
    private Context b;
    private LayoutInflater c;

    public g(c cVar, Context context) {
        this.a = cVar;
        this.b = context;
        this.c = LayoutInflater.from(this.b);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayList;
        arrayList = this.a.d;
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
        h hVar;
        ArrayList arrayList;
        if (view == null) {
            view = this.c.inflate(R.layout.theme_item, (ViewGroup) null);
            hVar = new h();
            hVar.c = (TextView) view.findViewById(R.id.theme_item_text);
            hVar.c.setTypeface(com.tsf.shell.workspace3D.i.a.a);
            hVar.a = (ImageView) view.findViewById(R.id.theme_item_image);
            hVar.d = (ImageView) view.findViewById(R.id.theme_radio);
            hVar.b = (ImageView) view.findViewById(R.id.hd_mark);
            view.setTag(hVar);
        } else {
            hVar = (h) view.getTag();
        }
        arrayList = this.a.d;
        n nVar = (n) arrayList.get(i);
        hVar.c.setText(nVar.f);
        hVar.a.setImageBitmap(nVar.a());
        if (nVar.h) {
            hVar.d.setSelected(true);
        } else {
            hVar.d.setSelected(false);
        }
        if (nVar.i) {
            hVar.b.setImageResource(R.drawable.theme_hd_mark);
            hVar.b.setVisibility(0);
        } else {
            hVar.b.setVisibility(4);
        }
        return view;
    }
}
