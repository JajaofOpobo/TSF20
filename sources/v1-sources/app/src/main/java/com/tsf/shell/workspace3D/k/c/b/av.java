package com.tsf.shell.workspace3D.k.c.b;

import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: classes.dex */
final class av implements DialogInterface.OnClickListener {
    final /* synthetic */ ao a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ c c;

    av(ao aoVar, EditText editText, c cVar) {
        this.a = aoVar;
        this.b = editText;
        this.c = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.c.a(this.b.getText().toString());
    }
}
