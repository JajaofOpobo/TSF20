package com.tsf.extend.base.p078h;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* renamed from: com.tsf.extend.base.h.a */
/* loaded from: classes.dex */
public class C1413a extends AbstractC1414b {

    /* renamed from: b */
    private static C1413a f4388b;

    /* renamed from: d */
    private static SimpleDateFormat f4389d = new SimpleDateFormat("\r\n\r\nyyyy-MM-dd HH:mm:ss.Z : ");

    /* renamed from: c */
    private final C1415c f4390c = C1415c.m8737a();

    private C1413a() {
    }

    /* renamed from: a */
    public static synchronized C1413a m8754a() {
        C1413a c1413a;
        synchronized (C1413a.class) {
            if (f4388b == null) {
                f4388b = new C1413a();
            }
            c1413a = f4388b;
        }
        return c1413a;
    }

    /* renamed from: b */
    public C1415c m8750b() {
        return this.f4390c;
    }

    /* renamed from: c */
    public void m8746c() {
        this.f4390c.m8720b("subcribed_fb", true);
    }

    /* renamed from: d */
    public boolean m8743d() {
        return this.f4390c.m8726a("subcribed_fb", false);
    }

    /* renamed from: a */
    public void m8751a(boolean z) {
        this.f4390c.m8720b("key_wallpaper_big_type", z);
    }

    @Override // com.tsf.extend.base.p078h.AbstractC1414b
    /* renamed from: e */
    public String mo8738e() {
        return this.f4390c.m8734a("theme_current", (String) null);
    }

    /* renamed from: a */
    public void m8752a(String str) {
        LinkedHashSet<String> m8741f = m8741f();
        m8741f.add(str);
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = m8741f.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append("|");
        }
        this.f4390c.m8724b("theme_current_set", stringBuffer.substring(0, stringBuffer.length() - 1));
    }

    /* renamed from: b */
    public void m8748b(String str) {
        LinkedHashSet<String> m8741f = m8741f();
        if (m8741f.contains(str)) {
            m8741f.remove(str);
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = m8741f.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append("|");
            }
            String str2 = null;
            if (stringBuffer.length() > 0) {
                str2 = stringBuffer.substring(0, stringBuffer.length() - 1);
            }
            this.f4390c.m8724b("theme_current_set", str2);
        }
    }

    /* renamed from: f */
    public LinkedHashSet<String> m8741f() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        String m8734a = this.f4390c.m8734a("theme_current_set", (String) null);
        if (m8734a != null) {
            String[] split = m8734a.split("\\|");
            for (String str : split) {
                linkedHashSet.add(str);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m8747b(boolean z) {
        this.f4390c.m8720b("key_theme_livewallpaper_enable", z);
    }

    /* renamed from: c */
    public void m8744c(String str) {
        this.f4390c.m8724b("key_diy_theme_share_data", str);
    }

    /* renamed from: d */
    public void m8742d(String str) {
        this.f4390c.m8724b("key_theme_share_id", str);
    }

    @Override // com.tsf.extend.base.p078h.AbstractC1414b
    /* renamed from: a */
    protected String mo8739a(String str, String str2, String str3) {
        return this.f4390c.m8730a(str, str2, str3);
    }

    /* renamed from: a */
    public void m8753a(int i) {
        this.f4390c.m8725b("key_wallpaper_width", i);
    }

    /* renamed from: b */
    public void m8749b(int i) {
        this.f4390c.m8725b("key_wallpaper_height", i);
    }

    /* renamed from: g */
    public long m8740g() {
        return this.f4390c.m8735a("key_last_share_time", 0L);
    }

    /* renamed from: c */
    public int m8745c(int i) {
        return this.f4390c.m8736a("first_install_launcher_version", i);
    }
}
