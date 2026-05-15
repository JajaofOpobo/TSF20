package com.tsf.extend.base.h;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class a extends b {
    private static a b;
    private static SimpleDateFormat d = new SimpleDateFormat("\r\n\r\nyyyy-MM-dd HH:mm:ss.Z : ");
    private final c c = c.a();

    private a() {
    }

    public static synchronized a a() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public c b() {
        return this.c;
    }

    public void c() {
        this.c.b("subcribed_fb", true);
    }

    public boolean d() {
        return this.c.a("subcribed_fb", false);
    }

    public void a(boolean z) {
        this.c.b("key_wallpaper_big_type", z);
    }

    @Override // com.tsf.extend.base.h.b
    public String e() {
        return this.c.a("theme_current", (String) null);
    }

    public void a(String str) {
        LinkedHashSet<String> linkedHashSetF = f();
        linkedHashSetF.add(str);
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = linkedHashSetF.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append("|");
        }
        this.c.b("theme_current_set", stringBuffer.substring(0, stringBuffer.length() - 1));
    }

    public void b(String str) {
        LinkedHashSet<String> linkedHashSetF = f();
        if (linkedHashSetF.contains(str)) {
            linkedHashSetF.remove(str);
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<String> it = linkedHashSetF.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append("|");
            }
            String strSubstring = null;
            if (stringBuffer.length() > 0) {
                strSubstring = stringBuffer.substring(0, stringBuffer.length() - 1);
            }
            this.c.b("theme_current_set", strSubstring);
        }
    }

    public LinkedHashSet<String> f() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        String strA = this.c.a("theme_current_set", (String) null);
        if (strA != null) {
            String[] strArrSplit = strA.split("\\|");
            for (String str : strArrSplit) {
                linkedHashSet.add(str);
            }
        }
        return linkedHashSet;
    }

    public void b(boolean z) {
        this.c.b("key_theme_livewallpaper_enable", z);
    }

    public void c(String str) {
        this.c.b("key_diy_theme_share_data", str);
    }

    public void d(String str) {
        this.c.b("key_theme_share_id", str);
    }

    @Override // com.tsf.extend.base.h.b
    protected String a(String str, String str2, String str3) {
        return this.c.a(str, str2, str3);
    }

    public void a(int i) {
        this.c.b("key_wallpaper_width", i);
    }

    public void b(int i) {
        this.c.b("key_wallpaper_height", i);
    }

    public long g() {
        return this.c.a("key_last_share_time", 0L);
    }

    public int c(int i) {
        return this.c.a("first_install_launcher_version", i);
    }
}
