package com.tsf.extend.base.a;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.h;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class a {
    private static final Map<String, String> b = new HashMap();
    private static boolean c = false;
    private Map<String, String> a = new HashMap();

    protected abstract String b();

    protected abstract String c();

    public a() {
        this.a.putAll(a());
        a(this.a);
    }

    public static Map<String, String> a() {
        if (!c) {
            Map<String, String> map = b;
            synchronized (b) {
                if (!c) {
                    Context b2 = h.b();
                    a(b, "pid", com.tsf.extend.base.i.a.a().b());
                    a(b, "ch", com.tsf.extend.base.i.a.a().c());
                    a(b, "aid", com.tsf.extend.base.d.b.a(b2));
                    a(b, "brand", com.tsf.extend.base.d.b.a());
                    a(b, "model", com.tsf.extend.base.d.b.b());
                    a(b, "osv", com.tsf.extend.base.d.b.c());
                    a(b, "api_level", com.tsf.extend.base.d.b.d());
                    a(b, "appv", com.tsf.extend.base.d.b.b(b2));
                    c = true;
                }
            }
        }
        return b;
    }

    public static void a(Map<String, String> map) {
        Context b2;
        if (map != null && (b2 = h.b()) != null) {
            a(map, "mcc", com.tsf.extend.base.d.b.d(b2));
            a(map, "mnc", com.tsf.extend.base.d.b.c(b2));
            a(map, "nmcc", com.tsf.extend.base.d.b.e(b2));
            a(map, "nmnc", com.tsf.extend.base.d.b.f(b2));
            a(map, "net", com.tsf.extend.base.d.b.h(b2));
            a(map, "lan", com.tsf.extend.base.d.b.g(b2));
            a(map, "app_lan", com.tsf.extend.base.i.a.a().d());
        }
    }

    public static void a(Map<String, String> map, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str).append("=");
                sb.append(URLEncoder.encode(str2, "UTF-8"));
                map.put(str, sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a a(String str, String str2) {
        a(this.a, str, str2);
        return this;
    }

    public String d() {
        String b2 = b();
        if (TextUtils.isEmpty(b2)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String trim = b2.trim();
        sb.append(trim);
        if (!trim.endsWith("/")) {
            sb.append("/");
        }
        sb.append(c());
        if (!this.a.isEmpty()) {
            sb.append(TextUtils.join("&", this.a.values()));
        }
        return sb.toString();
    }
}
