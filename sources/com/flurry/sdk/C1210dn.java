package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
/* renamed from: com.flurry.sdk.dn */
/* loaded from: classes.dex */
public class C1210dn {

    /* renamed from: a */
    private static final String f3885a = C1210dn.class.getSimpleName();

    /* renamed from: b */
    private static C1210dn f3886b;

    /* renamed from: a */
    public static synchronized C1210dn m9402a() {
        C1210dn c1210dn;
        synchronized (C1210dn.class) {
            if (f3886b == null) {
                f3886b = new C1210dn();
            }
            c1210dn = f3886b;
        }
        return c1210dn;
    }

    /* renamed from: b */
    public int m9401b() {
        int intValue = ((Integer) C1212dp.m9380a().m9377a("AgentVersion")).intValue();
        C1258eo.m9234a(4, f3885a, "getAgentVersion() = " + intValue);
        return intValue;
    }

    /* renamed from: c */
    int m9400c() {
        return ((Integer) C1212dp.m9380a().m9377a("ReleaseMajorVersion")).intValue();
    }

    /* renamed from: d */
    int m9399d() {
        return ((Integer) C1212dp.m9380a().m9377a("ReleaseMinorVersion")).intValue();
    }

    /* renamed from: e */
    int m9398e() {
        return ((Integer) C1212dp.m9380a().m9377a("ReleasePatchVersion")).intValue();
    }

    /* renamed from: f */
    String m9397f() {
        return (String) C1212dp.m9380a().m9377a("ReleaseBetaVersion");
    }

    /* renamed from: g */
    public String m9396g() {
        String str;
        if (m9397f().length() > 0) {
            str = ".";
        } else {
            str = "";
        }
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", Integer.valueOf(m9401b()), Integer.valueOf(m9400c()), Integer.valueOf(m9399d()), Integer.valueOf(m9398e()), str, m9397f());
    }

    /* renamed from: h */
    public String m9395h() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c == null) {
            return null;
        }
        return m9408c.m9440j();
    }

    /* renamed from: i */
    public String m9394i() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c == null) {
            return null;
        }
        return m9408c.m9439k();
    }

    /* renamed from: j */
    public String m9393j() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c == null) {
            return null;
        }
        return m9408c.m9438l();
    }

    /* renamed from: k */
    public boolean m9392k() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        if (m9408c != null) {
            return m9408c.m9435o();
        }
        return true;
    }

    /* renamed from: l */
    public Map<EnumC1215dr, ByteBuffer> m9391l() {
        C1195dj m9408c = C1206dl.m9414a().m9408c();
        return m9408c != null ? m9408c.m9434p() : Collections.emptyMap();
    }
}
