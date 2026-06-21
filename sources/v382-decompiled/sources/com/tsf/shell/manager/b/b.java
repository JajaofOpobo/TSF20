package com.tsf.shell.manager.b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.R;
import com.tsf.shell.k;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    a a;

    public void a(final Context context, final ArrayList arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        this.a = new a(context, 0, arrayList);
        ListView listView = new ListView(context);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.tsf.shell.manager.b.b.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                b.this.a(context, (d) arrayList.get(i));
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.tsf.shell.manager.b.b.2
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                b.this.a(context, arrayList, (d) arrayList.get(i));
                return true;
            }
        });
        builder.setView(listView);
        builder.create().show();
    }

    public void a(final Context context, final ArrayList arrayList, final d dVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setItems(new String[]{context.getString(R.string.public_action_restore), context.getString(R.string.rename_title), context.getString(R.string.text_delete)}, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        b.this.a(context, dVar);
                        break;
                    case 1:
                        b.this.b(context, arrayList, dVar);
                        break;
                    case 2:
                        new File(String.valueOf(dVar.c) + dVar.a + ".config").delete();
                        arrayList.remove(dVar);
                        b.this.a.notifyDataSetChanged();
                        break;
                }
            }
        }).create();
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final d dVar) {
        k.a(context, R.string.public_action_confirm, R.string.notic_restore_desktop_message, R.string.public_action_ok, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.b.b.4
            @Override // java.lang.Runnable
            public void run() {
                new c(context, String.valueOf(dVar.c) + dVar.a + ".config").execute(new Void[0]);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, ArrayList arrayList, final d dVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_rename, (ViewGroup) null);
        final EditText editText = (EditText) inflate.findViewById(R.id.username_edit);
        editText.setText(dVar.a);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(R.string.rename_folder_title));
        builder.setView(inflate);
        builder.setPositiveButton(context.getString(R.string.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String editable = editText.getText().toString();
                File file = new File(String.valueOf(dVar.c) + dVar.a + ".config");
                File file2 = new File(String.valueOf(dVar.c) + editable + "config");
                dVar.a = editable;
                file.renameTo(file2);
                b.this.a.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(context.getString(R.string.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }
}
