package com.tsf.shell.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import com.tsf.shell.R;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
final class p extends AsyncTask {
    private ProgressDialog a;
    private Context b;
    private String c;
    private Runnable d;

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

    public p(Context context, String str, Runnable runnable) {
        this.b = context;
        this.c = str;
        if (this.c == null || this.c.equals("")) {
            this.c = "TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date(System.currentTimeMillis()));
        }
        this.d = runnable;
        this.a = new ProgressDialog(context);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        this.a.setMessage(this.b.getResources().getString(R.string.dbfile_export_dialog));
        this.a.show();
    }

    private String a() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return this.b.getResources().getString(R.string.import_export_sdcard_unmounted);
        }
        File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getPath()) + "/TSFShell_data");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(Environment.getDataDirectory() + "/data/com.tsf.shell/databases/TSFLauncher-database.db");
        File file3 = new File(file, String.valueOf(this.c) + ".db");
        if (file3.exists()) {
            file3.delete();
        }
        File file4 = new File(Environment.getDataDirectory() + "/data/com.tsf.shell/shared_prefs/config.xml");
        File file5 = new File(file, String.valueOf(this.c) + ".xml");
        if (file5.exists()) {
            file5.delete();
        }
        try {
            file3.createNewFile();
            l.a(file2, file3);
            file5.createNewFile();
            l.a(file4, file5);
            if (this.d != null) {
                this.d.run();
            }
            return this.b.getResources().getString(R.string.dbfile_export_success);
        } catch (IOException e) {
            if (this.d != null) {
                this.d.run();
            }
            return this.b.getResources().getString(R.string.dbfile_export_error);
        }
    }
}
