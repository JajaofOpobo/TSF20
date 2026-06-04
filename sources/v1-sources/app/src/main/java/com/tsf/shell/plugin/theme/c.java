package com.tsf.shell.plugin.theme;

import android.content.DialogInterface;

/* loaded from: classes.dex */
final class c implements DialogInterface.OnCancelListener {
    final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ThemeElementPicker themeElementPicker;
        themeElementPicker = this.a.b;
        themeElementPicker.finish();
    }
}
