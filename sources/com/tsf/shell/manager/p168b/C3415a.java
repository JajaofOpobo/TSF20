package com.tsf.shell.manager.p168b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tsf.C1306b;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.b.a */
/* loaded from: classes.dex */
public class C3415a extends ArrayAdapter<C3424c> {

    /* renamed from: a */
    int f11291a;

    /* renamed from: b */
    private final ArrayList<C3424c> f11292b;

    /* renamed from: c */
    private final Context f11293c;

    public C3415a(Context context, int i, ArrayList<C3424c> arrayList) {
        super(context, i, arrayList);
        this.f11291a = 0;
        this.f11292b = arrayList;
        this.f11293c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.f11292b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C3424c c3424c;
        if (view == null) {
            view = ((LayoutInflater) this.f11293c.getSystemService("layout_inflater")).inflate(C1306b.C1313g.preference_backup_data_item, (ViewGroup) null);
        }
        if (i < getCount() && (c3424c = this.f11292b.get(i)) != null) {
            ((TextView) view.findViewById(C1306b.C1311e.title)).setText(c3424c.f11315a);
            ((TextView) view.findViewById(C1306b.C1311e.time)).setText(c3424c.f11316b);
        }
        return view;
    }
}
