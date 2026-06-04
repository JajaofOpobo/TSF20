package com.tsf.shell.workspace3D.k.c.b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class au implements Runnable {
    final /* synthetic */ at a;

    au(at atVar) {
        this.a = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao aoVar = this.a.a;
        c cVar = c.c;
        Context c = com.censivn.C3DEngine.a.c();
        View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.c()).inflate(R.layout.tsf_launcher_rename_dialog, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
        editText.setText(cVar.o());
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.c());
        builder.setTitle(c.getString(R.string.rename_folder_title));
        builder.setView(inflate);
        builder.setPositiveButton(c.getString(R.string.public_action_ok), new av(aoVar, editText, cVar));
        builder.setNegativeButton(c.getString(R.string.public_action_cancel), new aw(aoVar));
        builder.show();
    }
}
