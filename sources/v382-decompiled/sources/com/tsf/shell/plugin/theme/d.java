package com.tsf.shell.plugin.theme;

import android.content.DialogInterface;

/* loaded from: classes.dex */
class d implements DialogInterface.OnClickListener {
    final /* synthetic */ b a;

    public d(b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ThemeElementPicker themeElementPicker;
        e eVar = (e) this.a.a.getItem(i);
        themeElementPicker = this.a.b;
        themeElementPicker.a(eVar);
    }
}
