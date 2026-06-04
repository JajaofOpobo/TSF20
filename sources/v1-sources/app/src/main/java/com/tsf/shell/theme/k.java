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
final class k extends BaseAdapter {
    final /* synthetic */ j a;
    private Context b;
    private LayoutInflater c;

    public k(j jVar, Context context) {
        this.a = jVar;
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
        m mVar;
        ArrayList arrayList;
        if (view == null) {
            view = this.c.inflate(R.layout.theme_online_item, (ViewGroup) null);
            mVar = new m();
            mVar.c = (TextView) view.findViewById(R.id.theme_item_text);
            mVar.c.setTypeface(com.tsf.shell.workspace3D.i.a.a);
            mVar.a = (ImageView) view.findViewById(R.id.theme_item_image);
            mVar.d = (ImageView) view.findViewById(R.id.theme_online_radio);
            mVar.b = (ImageView) view.findViewById(R.id.hd_mark);
            view.setTag(mVar);
        } else {
            mVar = (m) view.getTag();
        }
        arrayList = this.a.c;
        l lVar = (l) arrayList.get(i);
        mVar.c.setText(lVar.a);
        mVar.a.setImageResource(lVar.c);
        if (lVar.d) {
            mVar.b.setImageResource(R.drawable.theme_hd_mark);
            mVar.b.setVisibility(0);
        } else {
            mVar.b.setVisibility(4);
        }
        if (lVar.e) {
            mVar.d.setSelected(true);
        } else {
            mVar.d.setSelected(false);
        }
        return view;
    }
}
