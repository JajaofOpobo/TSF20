package com.tsf.shell.theme;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements AdapterView.OnItemClickListener {
    private static j e;
    private GridView a;
    private Context b;
    private ArrayList c;
    private k d;

    public j(Context context, GridView gridView) {
        e = this;
        this.b = context;
        this.a = gridView;
        this.c = new ArrayList();
        this.c.add(new l(this, "DCikonZ Leather", "com.czarnomorski.theme.dcikonz.tsf", R.drawable.theme_dcikonz_leather));
        this.c.add(new l(this, "DCikonZ Wood", "com.czarnomorski.theme.dcikonz.tsf.wood", R.drawable.theme_dcikonz_wood));
        this.c.add(new l(this, "DCikonZ Carbon", "com.czarnomorski.theme.dcikonz.tsf.carbon", R.drawable.theme_dcikonz_carbon));
        this.c.add(new l(this, "Miui X5", "com.twipi.tsf.theme.miuix5.pro", R.drawable.theme_miui_x5));
        this.c.add(new l(this, "ThemeBxo HD", "com.tsf.shell.themes.hd.box", R.drawable.theme_box_default));
        this.d = new k(this, this.b);
        this.a.setAdapter((ListAdapter) this.d);
        this.a.setOnItemClickListener(this);
    }

    public static j a() {
        return e;
    }

    public final void a(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar.b.equals(str)) {
                lVar.e = false;
                this.d.notifyDataSetChanged();
            }
        }
    }

    public final void b(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar.b.equals(str)) {
                lVar.e = true;
                this.d.notifyDataSetChanged();
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l lVar = (l) this.c.get(i);
        if (lVar != null) {
            c.a.b(lVar.b);
        }
    }
}
