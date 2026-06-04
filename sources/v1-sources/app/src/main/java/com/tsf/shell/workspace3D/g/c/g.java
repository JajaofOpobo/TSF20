package com.tsf.shell.workspace3D.g.c;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class g implements Runnable {
    private final /* synthetic */ com.tsf.shell.workspace3D.k.j a;

    g(com.tsf.shell.workspace3D.k.j jVar) {
        this.a = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.workspace3D.k.j jVar = this.a;
        LauncherItem3DInfo be = jVar.be();
        Context c = com.censivn.C3DEngine.a.c();
        View inflate = LayoutInflater.from(com.censivn.C3DEngine.a.c()).inflate(R.layout.tsf_launcher_rename_dialog, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
        editText.setText(be.title);
        AlertDialog.Builder builder = new AlertDialog.Builder(com.censivn.C3DEngine.a.c());
        builder.setTitle(R.string.rename_title);
        builder.setView(inflate);
        builder.setPositiveButton(c.getString(R.string.public_action_ok), new h(editText, jVar));
        builder.setNegativeButton(c.getString(R.string.public_action_cancel), new i());
        builder.show();
    }
}
