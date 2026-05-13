package com.tsf.shell.manager.p168b;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import java.io.File;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.manager.b.b */
/* loaded from: classes.dex */
public class C3416b {

    /* renamed from: a */
    C3415a f11294a;

    /* renamed from: a */
    public void m2595a(final Context context, final ArrayList<C3424c> arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str);
        this.f11294a = new C3415a(context, 0, arrayList);
        ListView listView = new ListView(context);
        listView.setAdapter((ListAdapter) this.f11294a);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.tsf.shell.manager.b.b.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C3416b.this.m2597a(context, (C3424c) arrayList.get(i));
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.tsf.shell.manager.b.b.2
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                C3416b.this.m2596a(context, arrayList, (C3424c) arrayList.get(i));
                return true;
            }
        });
        builder.setView(listView);
        builder.create().show();
    }

    /* renamed from: a */
    public void m2596a(final Context context, final ArrayList<C3424c> arrayList, final C3424c c3424c) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setItems(new String[]{context.getString(C1306b.C1315i.public_action_restore), context.getString(C1306b.C1315i.rename_title), context.getString(C1306b.C1315i.text_delete)}, new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                switch (i) {
                    case 0:
                        C3416b.this.m2597a(context, c3424c);
                        return;
                    case 1:
                        C3416b.this.m2592b(context, arrayList, c3424c);
                        return;
                    case 2:
                        new File(c3424c.f11317c + c3424c.f11315a + ".config").delete();
                        arrayList.remove(c3424c);
                        C3416b.this.f11294a.notifyDataSetChanged();
                        return;
                    default:
                        return;
                }
            }
        }).create();
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2597a(final Context context, final C3424c c3424c) {
        C2244e.m6017a(context, C1306b.C1315i.public_action_confirm, C1306b.C1315i.notic_restore_desktop_message, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.b.b.4
            @Override // java.lang.Runnable
            public void run() {
                new AsyncTaskC3423a(context, c3424c.f11317c + c3424c.f11315a + ".config").execute(new Void[0]);
            }
        }, (Runnable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m2592b(Context context, ArrayList<C3424c> arrayList, final C3424c c3424c) {
        View inflate = LayoutInflater.from(context).inflate(C1306b.C1313g.dialog_rename, (ViewGroup) null);
        final EditText editText = (EditText) inflate.findViewById(C1306b.C1311e.username_edit);
        editText.setText(c3424c.f11315a);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(context.getString(C1306b.C1315i.rename_folder_title));
        builder.setView(inflate);
        builder.setPositiveButton(context.getString(C1306b.C1315i.public_action_ok), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                File file = new File(c3424c.f11317c + c3424c.f11315a + ".config");
                File file2 = new File(c3424c.f11317c + obj + "config");
                c3424c.f11315a = obj;
                file.renameTo(file2);
                C3416b.this.f11294a.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(context.getString(C1306b.C1315i.public_action_cancel), new DialogInterface.OnClickListener() { // from class: com.tsf.shell.manager.b.b.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        builder.show();
    }

    /* renamed from: com.tsf.shell.manager.b.b$a */
    /* loaded from: classes.dex */
    static class AsyncTaskC3423a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private final ProgressDialog f11312a;

        /* renamed from: b */
        private Context f11313b;

        /* renamed from: c */
        private String f11314c;

        public AsyncTaskC3423a(Context context, String str) {
            this.f11313b = context;
            this.f11312a = new ProgressDialog(context);
            this.f11314c = str;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            this.f11312a.setMessage(this.f11313b.getResources().getString(C1306b.C1315i.dbfile_import_dialog));
            this.f11312a.show();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.Void... r12) {
            /*
                r11 = this;
                r1 = 1
                r2 = 0
                java.lang.String r0 = "mounted"
                java.lang.String r3 = android.os.Environment.getExternalStorageState()
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L1b
                android.content.Context r0 = r11.f11313b
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.tsf.C1306b.C1315i.import_export_sdcard_unmounted
                java.lang.String r0 = r0.getString(r1)
            L1a:
                return r0
            L1b:
                java.io.File r0 = new java.io.File
                java.lang.String r3 = r11.f11314c
                r0.<init>(r3)
                boolean r3 = r0.exists()
                if (r3 != 0) goto L35
                android.content.Context r0 = r11.f11313b
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.tsf.C1306b.C1315i.dbfile_not_found
                java.lang.String r0 = r0.getString(r1)
                goto L1a
            L35:
                boolean r3 = r0.canRead()
                if (r3 != 0) goto L48
                android.content.Context r0 = r11.f11313b
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.tsf.C1306b.C1315i.dbfile_not_readable
                java.lang.String r0 = r0.getString(r1)
                goto L1a
            L48:
                java.io.File r3 = com.tsf.shell.manager.p168b.C3425d.m2575d()
                java.io.File r4 = new java.io.File
                java.lang.String r5 = "temp"
                r4.<init>(r3, r5)
                boolean r3 = r4.exists()
                if (r3 == 0) goto L5c
                r4.delete()
            L5c:
                r4.mkdirs()
                java.lang.String r3 = r4.getPath()     // Catch: java.lang.Exception -> Lbe
                com.tsf.shell.utils.C4191z.m585a(r0, r3)     // Catch: java.lang.Exception -> Lbe
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lbe
                java.lang.String r3 = "database.db"
                r0.<init>(r4, r3)     // Catch: java.lang.Exception -> Lbe
                java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lbe
                java.lang.String r5 = "config.xml"
                r3.<init>(r4, r5)     // Catch: java.lang.Exception -> Lbe
                java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> Lbe
                java.lang.String r6 = "theme.xml"
                r5.<init>(r4, r6)     // Catch: java.lang.Exception -> Lbe
                java.io.File r6 = com.tsf.shell.manager.p168b.C3425d.m2589a()     // Catch: java.lang.Exception -> Lbe
                java.io.File r7 = com.tsf.shell.manager.p168b.C3425d.m2581b()     // Catch: java.lang.Exception -> Lbe
                java.io.File r8 = com.tsf.shell.manager.p168b.C3425d.m2577c()     // Catch: java.lang.Exception -> Lbe
                r9 = 0
                boolean r0 = com.tsf.shell.manager.p168b.C3425d.m2583a(r0, r6, r9)     // Catch: java.lang.Exception -> Lbe
                if (r0 == 0) goto L8f
                r2 = r1
            L8f:
                r0 = 0
                boolean r0 = com.tsf.shell.manager.p168b.C3425d.m2583a(r3, r7, r0)     // Catch: java.lang.Exception -> Lbe
                if (r0 == 0) goto Ld6
                r0 = r1
            L97:
                r2 = 0
                boolean r2 = com.tsf.shell.manager.p168b.C3425d.m2583a(r5, r8, r2)     // Catch: java.lang.Exception -> Ld4
                if (r2 == 0) goto L9f
                r0 = r1
            L9f:
                com.tsf.shell.utils.C4179o.m664a(r4)
                if (r0 == 0) goto Lc6
                com.tsf.shell.manager.p168b.C3432f.m2401b(r1)
                com.tsf.shell.Home r0 = com.tsf.shell.Home.m6177b()
                r1 = 100
                r0.m6186a(r1)
                android.content.Context r0 = r11.f11313b
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.tsf.C1306b.C1315i.dbfile_import_success
                java.lang.String r0 = r0.getString(r1)
                goto L1a
            Lbe:
                r0 = move-exception
                r10 = r0
                r0 = r2
                r2 = r10
            Lc2:
                r2.printStackTrace()
                goto L9f
            Lc6:
                android.content.Context r0 = r11.f11313b
                android.content.res.Resources r0 = r0.getResources()
                int r1 = com.tsf.C1306b.C1315i.dbfile_import_error
                java.lang.String r0 = r0.getString(r1)
                goto L1a
            Ld4:
                r2 = move-exception
                goto Lc2
            Ld6:
                r0 = r2
                goto L97
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.manager.p168b.C3416b.AsyncTaskC3423a.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            if (this.f11312a.isShowing()) {
                this.f11312a.dismiss();
            }
            Toast.makeText(this.f11313b, str, 0).show();
        }
    }
}
