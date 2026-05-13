package com.flurry.sdk;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class de implements eu {
    protected final String d;
    dg f;
    Set<String> e = new HashSet();
    protected String g = "defaultDataKey_";

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    protected abstract void a(byte[] bArr, String str, String str2);

    public de(String str, String str2) {
        this.d = str2;
        ev.a().a(this);
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(ff ffVar) {
        Cdo.a().c(ffVar);
    }

    protected void a(final String str) {
        a(new ff() { // from class: com.flurry.sdk.de.1
            @Override // com.flurry.sdk.ff
            public void a() {
                de.this.f = new dg(str);
            }
        });
    }

    @Override // com.flurry.sdk.eu
    public void a(boolean z) {
        eo.a(4, this.d, "onNetworkStateChanged : isNetworkEnable = " + z);
        if (z) {
            d();
        }
    }

    public void b(byte[] bArr, String str, String str2) {
        a(bArr, str, str2, null);
    }

    protected void a(byte[] bArr, String str, String str2, a aVar) {
        if (bArr == null || bArr.length == 0) {
            eo.a(6, this.d, "Report that has to be sent is EMPTY or NULL");
            return;
        }
        c(bArr, str, str2);
        a(aVar);
    }

    protected int c() {
        return this.e.size();
    }

    protected void c(final byte[] bArr, final String str, final String str2) {
        a(new ff() { // from class: com.flurry.sdk.de.2
            @Override // com.flurry.sdk.ff
            public void a() {
                de.this.d(bArr, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        a((a) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final a aVar) {
        a(new ff() { // from class: com.flurry.sdk.de.3
            @Override // com.flurry.sdk.ff
            public void a() {
                de.this.f();
                if (aVar != null) {
                    aVar.a();
                }
            }
        });
    }

    protected boolean e() {
        return c() <= 5;
    }

    protected String a(String str, String str2) {
        return this.g + str + "_" + str2;
    }

    protected String d(byte[] bArr, String str, String str2) {
        String a2 = a(str, str2);
        df dfVar = new df();
        dfVar.a(bArr);
        String a3 = dfVar.a();
        this.f.a(dfVar, a2);
        return a3;
    }

    protected void f() {
        if (!ev.a().c()) {
            eo.a(5, this.d, "Reports were not sent! No Internet connection!");
            return;
        }
        List<String> a2 = this.f.a();
        if (a2 == null || a2.isEmpty()) {
            eo.a(4, this.d, "No more reports to send.");
            return;
        }
        for (String str : a2) {
            if (e()) {
                List<String> c = this.f.c(str);
                eo.a(4, this.d, "Number of not sent blocks = " + c.size());
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < c.size()) {
                        String str2 = c.get(i2);
                        if (!this.e.contains(str2)) {
                            if (e()) {
                                byte[] b = new df(str2).b();
                                if (b == null || b.length == 0) {
                                    eo.a(6, this.d, "Internal ERROR! Report is empty!");
                                    this.f.a(str2, str);
                                } else {
                                    this.e.add(str2);
                                    a(b, str2, str);
                                }
                            }
                        }
                        i = i2 + 1;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str, final String str2, int i) {
        a(new ff() { // from class: com.flurry.sdk.de.4
            @Override // com.flurry.sdk.ff
            public void a() {
                if (!de.this.f.a(str, str2)) {
                    eo.a(6, de.this.d, "Internal error. Block wasn't deleted with id = " + str);
                }
                if (!de.this.e.remove(str)) {
                    eo.a(6, de.this.d, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(final String str, String str2) {
        a(new ff() { // from class: com.flurry.sdk.de.5
            @Override // com.flurry.sdk.ff
            public void a() {
                if (!de.this.e.remove(str)) {
                    eo.a(6, de.this.d, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    protected void c(String str, String str2) {
        if (!this.f.a(str, str2)) {
            eo.a(6, this.d, "Internal error. Block wasn't deleted with id = " + str);
        }
        if (!this.e.remove(str)) {
            eo.a(6, this.d, "Internal error. Block with id = " + str + " was not in progress state");
        }
    }
}
