package com.tsf.shell.a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.tsf.shell.R;
import com.tsf.shell.au;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class f implements DialogInterface.OnClickListener {
    final /* synthetic */ b a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ ArrayList c;
    private final /* synthetic */ k d;

    f(b bVar, Context context, ArrayList arrayList, k kVar) {
        this.a = bVar;
        this.b = context;
        this.c = arrayList;
        this.d = kVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                au.a(this.b, R.string.public_action_confirm, R.string.notic_restore_desktop_message, new g(this, this.b, this.d), null);
                break;
            case 1:
                b bVar = this.a;
                Context context = this.b;
                ArrayList arrayList = this.c;
                k kVar = this.d;
                View inflate = LayoutInflater.from(context).inflate(R.layout.tsf_launcher_rename_dialog, (ViewGroup) null);
                EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
                editText.setText(kVar.a);
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(context.getString(R.string.rename_folder_title));
                builder.setView(inflate);
                builder.setPositiveButton(context.getString(R.string.public_action_ok), new h(bVar, editText, kVar));
                builder.setNegativeButton(context.getString(R.string.public_action_cancel), new i(bVar));
                builder.show();
                break;
            case 2:
                File file = new File(String.valueOf(this.d.c) + this.d.a + ".db");
                File file2 = new File(String.valueOf(this.d.c) + this.d.a + ".xml");
                file.delete();
                file2.delete();
                this.c.remove(this.d);
                this.a.a.notifyDataSetChanged();
                break;
        }
    }
}
