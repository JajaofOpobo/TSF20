package com.tsf.shell.plugin.widgetpicker;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class g {
    AlertDialog a;
    f b;
    private final AppWidgetPicker c;

    public g(AppWidgetPicker appWidgetPicker) {
        this.c = appWidgetPicker;
    }

    public final void a(j jVar) {
        if (jVar == null || (jVar instanceof d)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.c);
            if (jVar == null) {
                builder.setTitle(this.c.getString(R.string.title_appwidget));
                this.b = new f(this.c, this.c.a());
                GridView gridView = (GridView) LayoutInflater.from(this.c).inflate(R.layout.appwidget_gridview_dialog, (ViewGroup) null);
                gridView.setAdapter((ListAdapter) this.b);
                gridView.setOnItemClickListener(new i(this, (byte) 0));
                builder.setView(gridView);
            } else {
                d dVar = (d) jVar;
                if (dVar.a().size() == 1) {
                    this.c.a((j) dVar.a().get(0));
                    return;
                }
                builder.setTitle(jVar.b());
                this.b = new f(this.c, dVar.a());
                GridView gridView2 = (GridView) LayoutInflater.from(this.c).inflate(R.layout.appwidget_gridview_dialog, (ViewGroup) null);
                gridView2.setAdapter((ListAdapter) this.b);
                gridView2.setOnItemClickListener(new i(this, (byte) 0));
                builder.setView(gridView2);
            }
            builder.setOnCancelListener(new h(this, jVar == null));
            this.a = builder.create();
            this.a.show();
            return;
        }
        this.c.a(jVar);
    }
}
