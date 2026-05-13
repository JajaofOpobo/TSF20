package com.flurry.sdk;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: com.flurry.sdk.de */
/* loaded from: classes.dex */
public abstract class AbstractC1184de implements InterfaceC1264eu {

    /* renamed from: d */
    protected final String f3768d;

    /* renamed from: f */
    C1192dg f3770f;

    /* renamed from: e */
    Set<String> f3769e = new HashSet();

    /* renamed from: g */
    protected String f3771g = "defaultDataKey_";

    /* renamed from: com.flurry.sdk.de$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1190a {
        /* renamed from: a */
        void m9530a();
    }

    /* renamed from: a */
    protected abstract void mo9541a(byte[] bArr, String str, String str2);

    public AbstractC1184de(String str, String str2) {
        this.f3768d = str2;
        C1265ev.m9207a().m9205a(this);
        m9544a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m9545a(AbstractRunnableC1278ff abstractRunnableC1278ff) {
        C1211do.m9390a().m9382c(abstractRunnableC1278ff);
    }

    /* renamed from: a */
    protected void m9544a(final String str) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.de.1
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                AbstractC1184de.this.f3770f = new C1192dg(str);
            }
        });
    }

    @Override // com.flurry.sdk.InterfaceC1264eu
    /* renamed from: a */
    public void mo9208a(boolean z) {
        C1258eo.m9234a(4, this.f3768d, "onNetworkStateChanged : isNetworkEnable = " + z);
        if (z) {
            m9534d();
        }
    }

    /* renamed from: b */
    public void m9538b(byte[] bArr, String str, String str2) {
        m9540a(bArr, str, str2, null);
    }

    /* renamed from: a */
    protected void m9540a(byte[] bArr, String str, String str2, InterfaceC1190a interfaceC1190a) {
        if (bArr == null || bArr.length == 0) {
            C1258eo.m9234a(6, this.f3768d, "Report that has to be sent is EMPTY or NULL");
            return;
        }
        m9535c(bArr, str, str2);
        m9546a(interfaceC1190a);
    }

    /* renamed from: c */
    protected int m9537c() {
        return this.f3769e.size();
    }

    /* renamed from: c */
    protected void m9535c(final byte[] bArr, final String str, final String str2) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.de.2
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                AbstractC1184de.this.m9533d(bArr, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void m9534d() {
        m9546a((InterfaceC1190a) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m9546a(final InterfaceC1190a interfaceC1190a) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.de.3
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                AbstractC1184de.this.m9531f();
                if (interfaceC1190a != null) {
                    interfaceC1190a.m9530a();
                }
            }
        });
    }

    /* renamed from: e */
    protected boolean m9532e() {
        return m9537c() <= 5;
    }

    /* renamed from: a */
    protected String m9543a(String str, String str2) {
        return this.f3771g + str + "_" + str2;
    }

    /* renamed from: d */
    protected String m9533d(byte[] bArr, String str, String str2) {
        String m9543a = m9543a(str, str2);
        C1191df c1191df = new C1191df();
        c1191df.m9528a(bArr);
        String m9529a = c1191df.m9529a();
        this.f3770f.m9524a(c1191df, m9543a);
        return m9529a;
    }

    /* renamed from: f */
    protected void m9531f() {
        if (!C1265ev.m9207a().m9203c()) {
            C1258eo.m9234a(5, this.f3768d, "Reports were not sent! No Internet connection!");
            return;
        }
        List<String> m9525a = this.f3770f.m9525a();
        if (m9525a == null || m9525a.isEmpty()) {
            C1258eo.m9234a(4, this.f3768d, "No more reports to send.");
            return;
        }
        for (String str : m9525a) {
            if (m9532e()) {
                List<String> m9516c = this.f3770f.m9516c(str);
                C1258eo.m9234a(4, this.f3768d, "Number of not sent blocks = " + m9516c.size());
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < m9516c.size()) {
                        String str2 = m9516c.get(i2);
                        if (!this.f3769e.contains(str2)) {
                            if (m9532e()) {
                                byte[] m9527b = new C1191df(str2).m9527b();
                                if (m9527b == null || m9527b.length == 0) {
                                    C1258eo.m9234a(6, this.f3768d, "Internal ERROR! Report is empty!");
                                    this.f3770f.m9521a(str2, str);
                                } else {
                                    this.f3769e.add(str2);
                                    mo9541a(m9527b, str2, str);
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
    /* renamed from: a */
    public void mo9542a(final String str, final String str2, int i) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.de.4
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                if (!AbstractC1184de.this.f3770f.m9521a(str, str2)) {
                    C1258eo.m9234a(6, AbstractC1184de.this.f3768d, "Internal error. Block wasn't deleted with id = " + str);
                }
                if (!AbstractC1184de.this.f3769e.remove(str)) {
                    C1258eo.m9234a(6, AbstractC1184de.this.f3768d, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m9539b(final String str, String str2) {
        m9545a(new AbstractRunnableC1278ff() { // from class: com.flurry.sdk.de.5
            @Override // com.flurry.sdk.AbstractRunnableC1278ff
            /* renamed from: a */
            public void mo9140a() {
                if (!AbstractC1184de.this.f3769e.remove(str)) {
                    C1258eo.m9234a(6, AbstractC1184de.this.f3768d, "Internal error. Block with id = " + str + " was not in progress state");
                }
            }
        });
    }

    /* renamed from: c */
    protected void m9536c(String str, String str2) {
        if (!this.f3770f.m9521a(str, str2)) {
            C1258eo.m9234a(6, this.f3768d, "Internal error. Block wasn't deleted with id = " + str);
        }
        if (!this.f3769e.remove(str)) {
            C1258eo.m9234a(6, this.f3768d, "Internal error. Block with id = " + str + " was not in progress state");
        }
    }
}
