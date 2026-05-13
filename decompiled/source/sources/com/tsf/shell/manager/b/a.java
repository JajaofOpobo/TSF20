package com.tsf.shell.manager.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tsf.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a extends ArrayAdapter<c> {
    int a;
    private final ArrayList<c> b;
    private final Context c;

    public a(Context context, int i, ArrayList<c> arrayList) {
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
        c cVar;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(b.g.preference_backup_data_item, (ViewGroup) null);
        }
        if (i < getCount() && (cVar = this.b.get(i)) != null) {
            ((TextView) view.findViewById(b.e.title)).setText(cVar.a);
            ((TextView) view.findViewById(b.e.time)).setText(cVar.b);
        }
        return view;
    }
}
