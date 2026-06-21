package com.tsf.shell.plugin.classification;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;
import com.tsf.shell.plugin.themepicker.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
class g extends AsyncTask {
    private Context a;
    private h b;
    private ArrayList c;

    public g(Context context, ArrayList arrayList, h hVar) {
        this.a = context;
        this.b = hVar;
        this.c = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e doInBackground(Void... voidArr) {
        ArrayList d;
        e c;
        String b;
        if (isCancelled()) {
            return null;
        }
        d = d.d(this.a, this.c);
        com.tsf.shell.plugin.themepicker.g.b("filterPackage:" + d.size());
        if (isCancelled()) {
            return null;
        }
        if (d.size() > 0) {
            b = d.b(d);
            if (b != null) {
                d.b(this.a, b);
            } else {
                if (this.b != null) {
                    this.b.a();
                }
                cancel(true);
                return null;
            }
        }
        if (isCancelled()) {
            return null;
        }
        c = d.c(this.a, this.c);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(e eVar) {
        if (this.b != null && eVar != null) {
            this.b.a(eVar);
        } else {
            Toast.makeText(this.a, r.httpError, 1).show();
        }
    }
}
