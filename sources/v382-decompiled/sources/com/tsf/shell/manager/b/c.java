package com.tsf.shell.manager.b;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.utils.p;
import com.tsf.shell.utils.z;
import java.io.File;

/* loaded from: classes.dex */
class c extends AsyncTask {
    private final ProgressDialog a;
    private Context b;
    private String c;

    public c(Context context, String str) {
        this.b = context;
        this.a = new ProgressDialog(context);
        this.c = str;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        this.a.setMessage(this.b.getResources().getString(R.string.dbfile_import_dialog));
        this.a.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String doInBackground(Void... voidArr) {
        boolean z;
        Exception e;
        File file;
        File c;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return this.b.getResources().getString(R.string.import_export_sdcard_unmounted);
        }
        File file2 = new File(this.c);
        if (!file2.exists()) {
            return this.b.getResources().getString(R.string.dbfile_not_found);
        }
        if (!file2.canRead()) {
            return this.b.getResources().getString(R.string.dbfile_not_readable);
        }
        File file3 = new File(e.d(), "temp");
        if (file3.exists()) {
            file3.delete();
        }
        file3.mkdirs();
        try {
            z.a(file2, file3.getPath());
            File file4 = new File(file3, "database.db");
            File file5 = new File(file3, "config.xml");
            file = new File(file3, "theme.xml");
            File a = e.a();
            File b = e.b();
            c = e.c();
            r2 = e.a(file4, a, false);
            z = e.a(file5, b, false) ? true : r2;
        } catch (Exception e2) {
            z = r2;
            e = e2;
        }
        try {
            if (e.a(file, c, false)) {
                z = true;
            }
        } catch (Exception e3) {
            e = e3;
            e.printStackTrace();
            p.a(file3);
            if (!z) {
            }
        }
        p.a(file3);
        if (!z) {
            h.b(true);
            Home.b().a(100);
            return this.b.getResources().getString(R.string.dbfile_import_success);
        }
        return this.b.getResources().getString(R.string.dbfile_import_error);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
        Toast.makeText(this.b, str, 0).show();
    }
}
