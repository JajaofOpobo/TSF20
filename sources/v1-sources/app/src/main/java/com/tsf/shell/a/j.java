package com.tsf.shell.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
final class j extends AsyncTask {
    private final ProgressDialog a;
    private Context b;
    private String c;
    private String d;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object... objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
        Toast.makeText(this.b, str, 0).show();
    }

    public j(Context context, String str, String str2) {
        this.b = context;
        this.a = new ProgressDialog(context);
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.a.setMessage(this.b.getResources().getString(R.string.dbfile_import_dialog));
        this.a.show();
    }

    private String a() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return this.b.getResources().getString(R.string.import_export_sdcard_unmounted);
        }
        boolean z = false;
        File file = new File(this.c);
        File file2 = new File(this.d);
        if (!file.exists()) {
            return this.b.getResources().getString(R.string.dbfile_not_found);
        }
        if (!file.canRead()) {
            return this.b.getResources().getString(R.string.dbfile_not_readable);
        }
        File file3 = new File(Environment.getDataDirectory() + "/data/com.tsf.shell/databases/TSFLauncher-database.db");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            file3.createNewFile();
            com.tsf.shell.g.f.a(file, file3);
            z = true;
        } catch (IOException e) {
        }
        if (file2.exists()) {
            File file4 = new File(Environment.getDataDirectory() + "/data/com.tsf.shell/shared_prefs/config.xml");
            if (file4.exists()) {
                file4.delete();
            }
            try {
                file4.createNewFile();
                com.tsf.shell.g.f.a(file2, file4);
                z = true;
            } catch (IOException e2) {
            }
        }
        if (z) {
            Home.d().c();
            return this.b.getResources().getString(R.string.dbfile_import_success);
        }
        return this.b.getResources().getString(R.string.dbfile_import_error);
    }
}
