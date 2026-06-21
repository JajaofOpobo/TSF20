package com.tsf.shell.manager.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends ArrayAdapter {
    int a;
    private final ArrayList b;
    private final Context c;

    public a(Context context, int i, ArrayList arrayList) {
        super(context, i, arrayList);
        this.a = 0;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(R.layout.preference_backup_data_item, (ViewGroup) null);
        }
        if (i < getCount() && (dVar = (d) this.b.get(i)) != null) {
            TextView textView = (TextView) view.findViewById(R.id.title);
            TextView textView2 = (TextView) view.findViewById(R.id.time);
            textView.setText(dVar.a);
            textView2.setText(dVar.b);
        }
        return view;
    }
}
