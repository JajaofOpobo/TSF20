package com.tsf.shell.workspace3D.g.c;

import android.content.DialogInterface;
import android.widget.EditText;
import com.tsf.shell.workspace3D.k.c.b.ac;

/* loaded from: classes.dex */
final class h implements DialogInterface.OnClickListener {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j b;

    h(EditText editText, com.tsf.shell.workspace3D.k.j jVar) {
        this.a = editText;
        this.b = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String editable = this.a.getText().toString();
        if (this.b instanceof com.tsf.shell.workspace3D.k.p) {
            ((com.tsf.shell.workspace3D.k.p) this.b).c(editable);
        } else if (this.b instanceof ac) {
            ((ac) this.b).aH().a(editable);
        }
    }
}
