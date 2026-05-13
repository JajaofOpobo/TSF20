package com.tsf.extend.theme.pull;

import android.text.TextUtils;
import com.tsf.extend.base.p069a.AbstractC1342b;
import com.tsf.extend.theme.C1685ai;
/* renamed from: com.tsf.extend.theme.pull.a */
/* loaded from: classes.dex */
public class C1872a extends AbstractC1342b {
    public C1872a(String str, long j, boolean z, boolean z2) {
        m7176e();
        m7177b("5.0");
        m8946a("1");
        m7175f();
        m7178a(str, j, z, z2);
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: b */
    protected String mo7143b() {
        return "https://push.cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.p069a.AbstractC1341a
    /* renamed from: c */
    protected String mo7142c() {
        return "push?";
    }

    /* renamed from: e */
    protected void m7176e() {
        m8951a("vga", C1873b.m7174a());
    }

    /* renamed from: b */
    protected void m7177b(String str) {
        m8951a("themev", str);
    }

    /* renamed from: f */
    protected void m7175f() {
        m8951a("time", C1873b.m7167b());
    }

    /* renamed from: a */
    protected void m7178a(String str, long j, boolean z, boolean z2) {
        if (System.currentTimeMillis() - j < 86400000 && !z) {
            m8951a("scene", "1");
            if (!TextUtils.isEmpty(str)) {
                m8951a("cn", str);
                return;
            }
            String m7805b = C1685ai.m7809a().m7805b();
            if (!TextUtils.isEmpty(m7805b)) {
                m8951a("cn", m7805b);
            }
        } else if (z2) {
            m8951a("scene", "0");
        } else {
            m8951a("scene", "2");
        }
    }
}
