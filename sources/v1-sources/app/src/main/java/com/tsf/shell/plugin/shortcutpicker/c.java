package com.tsf.shell.plugin.shortcutpicker;

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
public final class c extends BaseAdapter {
    public ArrayList a;
    private Context b;

    public c(Context context) {
        this.b = context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.tsf.shell.e.c(context, 100, R.drawable.setting_theme_icon, R.string.menu_theme));
        arrayList.add(new com.tsf.shell.e.c(context, 200, R.drawable.setting_gesture_icon, R.string.menu_gestures));
        this.a = arrayList;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.listitem_icontext, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        com.tsf.shell.e.c cVar = (com.tsf.shell.e.c) this.a.get(i);
        imageView.setImageDrawable(cVar.a);
        textView.setText(cVar.b);
        return view;
    }
}
