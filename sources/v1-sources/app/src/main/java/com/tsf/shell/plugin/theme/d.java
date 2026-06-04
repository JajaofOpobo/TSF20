package com.tsf.shell.plugin.theme;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class d implements DialogInterface.OnClickListener {
    final /* synthetic */ b a;

    public d(b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ThemeElementPicker themeElementPicker;
        ThemeElementSubItem themeElementSubItem = (ThemeElementSubItem) this.a.a.getItem(i);
        themeElementPicker = this.a.b;
        themeElementPicker.a(themeElementSubItem);
    }
}
