package com.tsf.shell.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends ArrayAdapter {
    int a;
    private final ArrayList b;
    private final Context c;

    public a(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = 0;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        k kVar;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.preference_backup_data_item, (ViewGroup) null);
        }
        if (i < getCount() && (kVar = (k) this.b.get(i)) != null) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.time);
            textView.setText(kVar.a);
            textView2.setText(kVar.b);
        }
        return view;
    }
}
