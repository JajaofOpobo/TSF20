package com.tsf.shell.manager.b;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.widget.Toast;
import com.tsf.shell.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
class f extends AsyncTask {
    private ProgressDialog a;
    private Context b;
    private String c;
    private Runnable d;

    public f(Context context, String str, Runnable runnable) {
        this.b = context;
        this.c = str;
        if (this.c == null || this.c.equals("")) {
            this.c = "TSF" + new SimpleDateFormat("yyyyMMdd_hhmmss").format(new Date(System.currentTimeMillis()));
        }
        this.d = runnable;
        this.a = new ProgressDialog(context);
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        this.a.setMessage(this.b.getResources().getString(R.string.dbfile_export_dialog));
        this.a.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Void... voidArr) {
        String b;
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return this.b.getResources().getString(R.string.import_export_sdcard_unmounted);
        }
        e.d();
        b = e.b(this.c, this.d, this.b);
        return b;
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
