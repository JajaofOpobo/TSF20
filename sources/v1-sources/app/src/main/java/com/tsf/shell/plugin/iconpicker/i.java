package com.tsf.shell.plugin.iconpicker;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/* loaded from: classes.dex */
final class i implements TabHost.TabContentFactory {
    private final Context a;

    public i(Context context) {
        this.a = context;
    }

    @Override // android.widget.TabHost.TabContentFactory
    public final View createTabContent(String str) {
        View view = new View(this.a);
        view.setMinimumWidth(0);
        view.setMinimumHeight(0);
        return view;
    }
}
