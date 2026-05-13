package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;
/* renamed from: com.flurry.sdk.cy */
/* loaded from: classes.dex */
public class C1175cy {

    /* renamed from: b */
    private static final String f3735b = C1175cy.class.getSimpleName();

    /* renamed from: a */
    boolean f3736a;

    /* renamed from: c */
    private final C1176cz f3737c;

    /* renamed from: d */
    private final File f3738d;

    /* renamed from: e */
    private String f3739e;

    public C1175cy() {
        this(C1211do.m9390a().m9386b());
    }

    public C1175cy(Context context) {
        this.f3737c = new C1176cz();
        this.f3738d = context.getFileStreamPath(".flurryinstallreceiver.");
        C1258eo.m9234a(3, f3735b, "Referrer file name if it exists:  " + this.f3738d);
    }

    /* renamed from: a */
    public synchronized void m9571a() {
        this.f3738d.delete();
        this.f3739e = null;
        this.f3736a = true;
    }

    /* renamed from: a */
    public synchronized Map<String, List<String>> m9569a(boolean z) {
        Map<String, List<String>> m9565a;
        m9568b();
        m9565a = this.f3737c.m9565a(this.f3739e);
        if (z) {
            m9571a();
        }
        return m9565a;
    }

    /* renamed from: a */
    public synchronized void m9570a(String str) {
        this.f3736a = true;
        m9567b(str);
        m9566c();
    }

    /* renamed from: b */
    private void m9567b(String str) {
        if (str != null) {
            this.f3739e = str;
        }
    }

    /* renamed from: b */
    private void m9568b() {
        if (!this.f3736a) {
            this.f3736a = true;
            C1258eo.m9234a(4, f3735b, "Loading referrer info from file: " + this.f3738d.getAbsolutePath());
            String m9155c = C1276fd.m9155c(this.f3738d);
            C1258eo.m9232a(f3735b, "Referrer file contents: " + m9155c);
            m9567b(m9155c);
        }
    }

    /* renamed from: c */
    private void m9566c() {
        C1276fd.m9159a(this.f3738d, this.f3739e);
    }
}
