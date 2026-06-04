package com.tsf.shell.a;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.File;

/* loaded from: classes.dex */
final class h implements DialogInterface.OnClickListener {
    final /* synthetic */ b a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ k c;

    h(b bVar, EditText editText, k kVar) {
        this.a = bVar;
        this.b = editText;
        this.c = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String editable = this.b.getText().toString();
        File file = new File(String.valueOf(this.c.c) + this.c.a + ".db");
        File file2 = new File(String.valueOf(this.c.c) + this.c.a + ".xml");
        File file3 = new File(String.valueOf(this.c.c) + editable + ".db");
        File file4 = new File(String.valueOf(this.c.c) + editable + ".xml");
        this.c.a = editable;
        file.renameTo(file3);
        file2.renameTo(file4);
        this.a.a.notifyDataSetChanged();
    }
}
