package com.tsf.shell.manager.b;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.utils.o;
import com.tsf.shell.utils.z;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    com.tsf.shell.manager.b.a a;

    public void a(final Context context, final ArrayList<c> arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        this.a = new com.tsf.shell.manager.b.a(context, 0, arrayList);
        ListView listView = new ListView(context);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.tsf.shell.manager.b.b.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                b.this.a(context, (c) arrayList.get(i));
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.tsf.shell.manager.b.b.2
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                b.this.a(context, arrayList, (c) arrayList.get(i));
                return true;
            }
        });
        builder.setView(listView);
        builder.create().show();
    }

    public void a(final Context context, final ArrayList<c> arrayList, final c cVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setItems(new String[]{context.getString(b.i.public_action_restore), context.getString(b.i.rename_title), context.getString(b.i.text_delete)}, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        b.this.a(context, cVar);
                        break;
                    case 1:
                        b.this.b(context, arrayList, cVar);
                        break;
                    case 2:
                        new File(cVar.c + cVar.a + ".config").delete();
                        arrayList.remove(cVar);
                        b.this.a.notifyDataSetChanged();
                        break;
                }
            }
        }).create();
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final c cVar) {
        com.tsf.shell.e.a(context, b.i.public_action_confirm, b.i.notic_restore_desktop_message, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.b.b.4
            @Override // java.lang.Runnable
            public void run() {
                new a(context, cVar.c + cVar.a + ".config").execute(new Void[0]);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, ArrayList<c> arrayList, final c cVar) {
        View viewInflate = LayoutInflater.from(context).inflate(b.g.dialog_rename, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(b.e.username_edit);
        editText.setText(cVar.a);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(b.i.rename_folder_title));
        builder.setView(viewInflate);
        builder.setPositiveButton(context.getString(b.i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String string = editText.getText().toString();
                File file = new File(cVar.c + cVar.a + ".config");
                File file2 = new File(cVar.c + string + "config");
                cVar.a = string;
                file.renameTo(file2);
                b.this.a.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(context.getString(b.i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    static class a extends AsyncTask<Void, Void, String> {
        private final ProgressDialog a;
        private Context b;
        private String c;

        public a(Context context, String str) {
            this.b = context;
            this.a = new ProgressDialog(context);
            this.c = str;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.a.setMessage(this.b.getResources().getString(b.i.dbfile_import_dialog));
            this.a.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            boolean z;
            Exception e;
            File file;
            File fileC;
            if (!"mounted".equals(Environment.getExternalStorageState())) {
                return this.b.getResources().getString(b.i.import_export_sdcard_unmounted);
            }
            File file2 = new File(this.c);
            if (!file2.exists()) {
                return this.b.getResources().getString(b.i.dbfile_not_found);
            }
            if (!file2.canRead()) {
                return this.b.getResources().getString(b.i.dbfile_not_readable);
            }
            File file3 = new File(d.d(), "temp");
            if (file3.exists()) {
                file3.delete();
            }
            file3.mkdirs();
            try {
                z.a(file2, file3.getPath());
                File file4 = new File(file3, "database.db");
                File file5 = new File(file3, "config.xml");
                file = new File(file3, "theme.xml");
                File fileA = d.a();
                File fileB = d.b();
                fileC = d.c();
                z = d.a(file4, fileA, false);
                z = d.a(file5, fileB, false) ? true : z;
            } catch (Exception e2) {
                z = z;
                e = e2;
            }
            try {
                if (d.a(file, fileC, false)) {
                    z = true;
                }
            } catch (Exception e3) {
                e = e3;
                e.printStackTrace();
            }
            o.a(file3);
            if (z) {
                f.b(true);
                Home.b().a(100);
                return this.b.getResources().getString(b.i.dbfile_import_success);
            }
            return this.b.getResources().getString(b.i.dbfile_import_error);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            if (this.a.isShowing()) {
                this.a.dismiss();
            }
            Toast.makeText(this.b, str, 0).show();
        }
    }
}
