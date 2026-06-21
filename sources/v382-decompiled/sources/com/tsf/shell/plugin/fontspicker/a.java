package com.tsf.shell.plugin.fontspicker;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.n;
import com.tsf.shell.plugin.themepicker.p;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a extends BaseAdapter {
    private Context a;
    private g c;
    private ArrayList b = new ArrayList();
    private int d = -1;

    public a(Context context) {
        this.a = context;
        this.c = new g(context);
        a();
    }

    public void a() {
        Context context;
        this.b = new ArrayList();
        Cursor a = d.a(this.a).a(c.d, null, String.valueOf(c.c) + "=?", new String[]{this.a.getPackageName()}, null);
        if (a != null) {
            com.tsf.shell.plugin.themepicker.g.b("Size:" + a.getCount());
            int columnIndex = a.getColumnIndex(c.c);
            int columnIndex2 = a.getColumnIndex(c.a);
            int columnIndex3 = a.getColumnIndex(c.b);
            while (a.moveToNext()) {
                this.b.add(new b(a.getString(columnIndex), a.getString(columnIndex2), a.getString(columnIndex3)));
            }
            a.close();
            d.a(this.a).b();
        }
        Cursor a2 = d.a(this.a).a(c.d, null, String.valueOf(c.c) + "!=?", new String[]{this.a.getPackageName()}, null);
        if (a2 != null) {
            com.tsf.shell.plugin.themepicker.g.c("", "Size:" + a2.getCount());
            int columnIndex4 = a2.getColumnIndex(c.c);
            int columnIndex5 = a2.getColumnIndex(c.a);
            int columnIndex6 = a2.getColumnIndex(c.b);
            while (a2.moveToNext()) {
                b bVar = new b(a2.getString(columnIndex4), a2.getString(columnIndex5), a2.getString(columnIndex6));
                if (bVar.b.equals("external")) {
                    if (new File(bVar.c).exists()) {
                        this.b.add(bVar);
                    } else {
                        com.tsf.shell.plugin.themepicker.g.b("fonts is miss delete " + d.a(this.a).a(c.d, "_id=" + a2.getInt(a2.getColumnIndex("_id")), null));
                    }
                } else if (bVar.b.equals("package")) {
                    try {
                        context = this.a.createPackageContext(bVar.a, 2);
                    } catch (PackageManager.NameNotFoundException e) {
                        com.tsf.shell.plugin.themepicker.g.c("", e.getMessage());
                        context = null;
                    }
                    if (context != null) {
                        this.b.add(bVar);
                    } else {
                        com.tsf.shell.plugin.themepicker.g.b("fonts is miss delete " + d.a(this.a).a(c.d, "_id=" + a2.getInt(a2.getColumnIndex("_id")), null));
                    }
                } else {
                    this.b.add(bVar);
                }
            }
            a2.close();
            d.a(this.a).b();
        }
    }

    public b a(int i) {
        return (b) this.b.get(i - 1);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size() + 1;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.a).inflate(p.fonts_list_item_radio, (ViewGroup) null);
        }
        TextView textView = (TextView) view.findViewById(n.textView1);
        if (i == 0) {
            textView.setText("Default");
            textView.setTag(null);
            textView.setTypeface(Typeface.DEFAULT);
        } else {
            b bVar = (b) this.b.get(i - 1);
            this.c.a(bVar, textView);
            textView.setText(bVar.b(this.a));
        }
        return view;
    }

    public void a(ListView listView, View view, int i) {
    }
}
