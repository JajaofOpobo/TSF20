package com.tsf.shell.e.e.f;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;

/* loaded from: classes.dex */
class c {
    public static void a(final com.tsf.shell.e.i.c cVar) {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.e.e.f.c.1
            @Override // java.lang.Runnable
            public void run() {
                c.c(com.tsf.shell.e.i.c.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final com.tsf.shell.e.i.c cVar) {
        ItemInfo K = cVar.K();
        Context d = com.censivn.C3DEngine.a.d();
        View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.d()).inflate(R.layout.dialog_rename, (ViewGroup) null);
        final EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
        editText.setText(K.title);
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.d());
        builder.setTitle(R.string.rename_title);
        builder.setView(inflate);
        builder.setPositiveButton(d.getString(R.string.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.e.f.c.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String editable = editText.getText().toString();
                if (cVar instanceof com.tsf.shell.e.i.b.e.a) {
                    ((com.tsf.shell.e.i.b.e.a) cVar).a(editable);
                } else if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                    ((com.tsf.shell.e.i.b.d.b) cVar).a(editable);
                }
            }
        });
        builder.setNegativeButton(d.getString(R.string.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.e.e.f.c.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }
}
