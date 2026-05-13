package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class cy {
    private static final String b = cy.class.getSimpleName();
    boolean a;
    private final cz c;
    private final File d;
    private String e;

    public cy() {
        this(Cdo.a().b());
    }

    public cy(Context context) {
        this.c = new cz();
        this.d = context.getFileStreamPath(".flurryinstallreceiver.");
        eo.a(3, b, "Referrer file name if it exists:  " + this.d);
    }

    public synchronized void a() {
        this.d.delete();
        this.e = null;
        this.a = true;
    }

    public synchronized Map<String, List<String>> a(boolean z) {
        Map<String, List<String>> a;
        b();
        a = this.c.a(this.e);
        if (z) {
            a();
        }
        return a;
    }

    public synchronized void a(String str) {
        this.a = true;
        b(str);
        c();
    }

    private void b(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    private void b() {
        if (!this.a) {
            this.a = true;
            eo.a(4, b, "Loading referrer info from file: " + this.d.getAbsolutePath());
            String c = fd.c(this.d);
            eo.a(b, "Referrer file contents: " + c);
            b(c);
        }
    }

    private void c() {
        fd.a(this.d, this.e);
    }
}
