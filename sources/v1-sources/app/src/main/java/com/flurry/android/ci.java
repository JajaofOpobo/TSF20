package com.flurry.android;

import android.content.Context;
import android.os.AsyncTask;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class ci extends AsyncTask {
    private Context a;
    private String b;
    private q c;
    private ViewGroup d;
    private boolean e;
    private boolean f;
    private /* synthetic */ s g;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        try {
            if (this.f && !this.e) {
                this.g.a(this.a, this.b);
            } else if (this.f && this.e) {
                this.g.a(this.a, this.b, this.d);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public ci(s sVar, Context context, String str, q qVar) {
        this.g = sVar;
        this.a = context;
        this.b = str;
        this.c = qVar;
    }

    public ci(s sVar, Context context, String str, q qVar, ViewGroup viewGroup, boolean z, boolean z2) {
        this(sVar, context, str, qVar);
        this.d = viewGroup;
        this.e = z2;
        this.f = z;
    }

    private List a() {
        try {
            List a = this.g.a(this.a, this.b, this.d, this.c);
            this.g.b.a(a);
            return a;
        } catch (Throwable th) {
            th.printStackTrace();
            return Collections.emptyList();
        }
    }
}
