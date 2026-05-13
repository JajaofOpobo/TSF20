package com.tsf.extend.base.p069a;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.p074d.C1398b;
import com.tsf.extend.base.p079i.C1416a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.tsf.extend.base.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1341a {

    /* renamed from: b */
    private static final Map<String, String> f4227b = new HashMap();

    /* renamed from: c */
    private static boolean f4228c = false;

    /* renamed from: a */
    private Map<String, String> f4229a = new HashMap();

    /* renamed from: b */
    protected abstract String mo7143b();

    /* renamed from: c */
    protected abstract String mo7142c();

    public AbstractC1341a() {
        this.f4229a.putAll(m8952a());
        m8950a(this.f4229a);
    }

    /* renamed from: a */
    public static Map<String, String> m8952a() {
        if (!f4228c) {
            Map<String, String> map = f4227b;
            synchronized (f4227b) {
                if (!f4228c) {
                    Context m8290b = C1547h.m8290b();
                    m8949a(f4227b, "pid", C1416a.m8719a().m8715b());
                    m8949a(f4227b, "ch", C1416a.m8719a().m8714c());
                    m8949a(f4227b, "aid", C1398b.m8783a(m8290b));
                    m8949a(f4227b, "brand", C1398b.m8784a());
                    m8949a(f4227b, "model", C1398b.m8782b());
                    m8949a(f4227b, "osv", C1398b.m8780c());
                    m8949a(f4227b, "api_level", C1398b.m8778d());
                    m8949a(f4227b, "appv", C1398b.m8781b(m8290b));
                    f4228c = true;
                }
            }
        }
        return f4227b;
    }

    /* renamed from: a */
    public static void m8950a(Map<String, String> map) {
        Context m8290b;
        if (map != null && (m8290b = C1547h.m8290b()) != null) {
            m8949a(map, "mcc", C1398b.m8777d(m8290b));
            m8949a(map, "mnc", C1398b.m8779c(m8290b));
            m8949a(map, "nmcc", C1398b.m8776e(m8290b));
            m8949a(map, "nmnc", C1398b.m8775f(m8290b));
            m8949a(map, "net", C1398b.m8773h(m8290b));
            m8949a(map, "lan", C1398b.m8774g(m8290b));
            m8949a(map, "app_lan", C1416a.m8719a().m8713d());
        }
    }

    /* renamed from: a */
    public static void m8949a(Map<String, String> map, String str, String str2) {
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
    /* renamed from: a */
    public AbstractC1341a m8951a(String str, String str2) {
        m8949a(this.f4229a, str, str2);
        return this;
    }

    /* renamed from: d */
    public String m8948d() {
        String mo7143b = mo7143b();
        if (TextUtils.isEmpty(mo7143b)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String trim = mo7143b.trim();
        sb.append(trim);
        if (!trim.endsWith("/")) {
            sb.append("/");
        }
        sb.append(mo7142c());
        if (!this.f4229a.isEmpty()) {
            sb.append(TextUtils.join("&", this.f4229a.values()));
        }
        return sb.toString();
    }
}
