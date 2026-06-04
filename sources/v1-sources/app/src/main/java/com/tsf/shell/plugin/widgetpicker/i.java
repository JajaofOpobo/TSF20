package com.tsf.shell.plugin.widgetpicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class i implements AdapterView.OnItemClickListener {
    final /* synthetic */ g a;

    private i(g gVar) {
        this.a = gVar;
    }

    /* synthetic */ i(g gVar, byte b) {
        this(gVar);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        j jVar = (j) this.a.b.getItem(i);
        this.a.a.dismiss();
        this.a.a(jVar);
    }
}
