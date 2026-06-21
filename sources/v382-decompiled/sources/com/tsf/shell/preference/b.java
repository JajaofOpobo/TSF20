package com.tsf.shell.preference;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/* loaded from: classes.dex */
class b implements TabHost.TabContentFactory {
    private final Context a;

    public b(Context context) {
        this.a = context;
    }

    @Override // android.widget.TabHost.TabContentFactory
    public View createTabContent(String str) {
        View view = new View(this.a);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
