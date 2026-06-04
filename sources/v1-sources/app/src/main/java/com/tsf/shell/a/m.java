package com.tsf.shell.a;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* loaded from: classes.dex */
final class m implements DialogInterface.OnClickListener {
    private final /* synthetic */ Context a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ Runnable c;

    m(Context context, EditText editText, Runnable runnable) {
        this.a = context;
        this.b = editText;
        this.c = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        new p(this.a, this.b.getText().toString(), this.c).execute(new Void[0]);
    }
}
