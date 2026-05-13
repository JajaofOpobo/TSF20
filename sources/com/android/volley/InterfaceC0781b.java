package com.android.volley;

import java.util.Collections;
import java.util.Map;
/* renamed from: com.android.volley.b */
/* loaded from: classes.dex */
public interface InterfaceC0781b {
    /* renamed from: a */
    C0782a mo8836a(String str);

    /* renamed from: a */
    void mo8842a();

    /* renamed from: a */
    void mo8835a(String str, C0782a c0782a);

    /* renamed from: com.android.volley.b$a */
    /* loaded from: classes.dex */
    public static class C0782a {

        /* renamed from: a */
        public byte[] f2250a;

        /* renamed from: b */
        public String f2251b;

        /* renamed from: c */
        public long f2252c;

        /* renamed from: d */
        public long f2253d;

        /* renamed from: e */
        public long f2254e;

        /* renamed from: f */
        public long f2255f;

        /* renamed from: g */
        public Map<String, String> f2256g = Collections.emptyMap();

        /* renamed from: a */
        public boolean m11047a() {
            return this.f2254e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean m11046b() {
            return this.f2255f < System.currentTimeMillis();
        }
    }
}
