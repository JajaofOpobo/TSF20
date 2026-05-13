package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class dn {
    private static final String a = dn.class.getSimpleName();
    private static dn b;

    public static synchronized dn a() {
        dn dnVar;
        synchronized (dn.class) {
            if (b == null) {
                b = new dn();
            }
            dnVar = b;
        }
        return dnVar;
    }

    public int b() {
        int intValue = ((Integer) dp.a().a("AgentVersion")).intValue();
        eo.a(4, a, "getAgentVersion() = " + intValue);
        return intValue;
    }

    int c() {
        return ((Integer) dp.a().a("ReleaseMajorVersion")).intValue();
    }

    int d() {
        return ((Integer) dp.a().a("ReleaseMinorVersion")).intValue();
    }

    int e() {
        return ((Integer) dp.a().a("ReleasePatchVersion")).intValue();
    }

    String f() {
        return (String) dp.a().a("ReleaseBetaVersion");
    }

    public String g() {
        String str;
        if (f().length() > 0) {
            str = ".";
        } else {
            str = "";
        }
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", Integer.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(e()), str, f());
    }

    public String h() {
        dj c = dl.a().c();
        if (c == null) {
            return null;
        }
        return c.j();
    }

    public String i() {
        dj c = dl.a().c();
        if (c == null) {
            return null;
        }
        return c.k();
    }

    public String j() {
        dj c = dl.a().c();
        if (c == null) {
            return null;
        }
        return c.l();
    }

    public boolean k() {
        dj c = dl.a().c();
        if (c != null) {
            return c.o();
        }
        return true;
    }

    public Map<dr, ByteBuffer> l() {
        dj c = dl.a().c();
        return c != null ? c.p() : Collections.emptyMap();
    }
}
