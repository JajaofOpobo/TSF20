package com.tsf.extend;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.extend.C1524d;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.wallpaper.C2020a;
import com.tsf.extend.wallpaper.C2063c;
import com.tsf.extend.wallpaper.C2064d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.tsf.extend.c */
/* loaded from: classes.dex */
public class C1522c {

    /* renamed from: i */
    private static int f4785i = 4096;

    /* renamed from: a */
    Context f4786a;

    /* renamed from: b */
    Map<String, String> f4787b = new ArrayMap();

    /* renamed from: c */
    Map<String, C1318a> f4788c = new ArrayMap();

    /* renamed from: d */
    List<C2020a> f4789d = new ArrayList();

    /* renamed from: e */
    private boolean f4790e = true;

    /* renamed from: f */
    private boolean f4791f = true;

    /* renamed from: g */
    private boolean f4792g = true;

    /* renamed from: h */
    private boolean f4793h = true;

    /* renamed from: a */
    private Map<String, C1318a> m8334a(List<C2020a> list) {
        C1524d.C1525a m8328a;
        ArrayMap arrayMap = new ArrayMap();
        for (C2020a c2020a : list) {
            String m6707a = c2020a.m6707a();
            if (!TextUtils.isEmpty(m6707a) && (m8328a = C1524d.m8329a().m8328a(m6707a)) != null && !TextUtils.isEmpty(m8328a.f4810b)) {
                C1318a m9028c = C1318a.m9033a(m6707a).m9028c(m8328a.f4810b);
                m9028c.m9039a(1);
                m9028c.m9031b(m8328a.f4809a);
                arrayMap.put(m6707a, m9028c);
            }
        }
        C1524d.m8329a().m8327b();
        return arrayMap;
    }

    private C1522c(Context context) {
        this.f4786a = null;
        this.f4786a = context;
        C2063c.m6547a().m6545a(context);
    }

    /* renamed from: a */
    private List<C2020a> m8333a(Map<String, C1318a> map, List<C2020a> list) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C2020a c2020a : list) {
                String m6707a = c2020a.m6707a();
                if (!TextUtils.isEmpty(m6707a) && !map.containsKey(m6707a)) {
                    arrayList.add(c2020a);
                }
            }
            return arrayList;
        }
        return list;
    }

    /* renamed from: b */
    private Map<String, C1318a> m8332b() {
        return this.f4788c;
    }

    /* renamed from: c */
    private void m8330c() {
        if (this.f4789d == null || this.f4789d.isEmpty()) {
            this.f4789d = C2063c.m6544b();
        }
        if (this.f4790e) {
            this.f4788c.putAll(C2064d.m6543a().m6540b());
            this.f4789d = m8333a(this.f4788c, this.f4789d);
            if (this.f4789d.isEmpty()) {
                C2063c.m6547a().m6546a(VEasing.Back.easeIn);
                return;
            }
        }
        if (this.f4793h) {
            this.f4788c.putAll(m8331b(this.f4789d));
            this.f4789d = m8333a(this.f4788c, this.f4789d);
            if (this.f4789d.isEmpty()) {
                return;
            }
        }
        if (this.f4792g) {
            this.f4788c.putAll(m8334a(this.f4789d));
            this.f4789d = m8333a(this.f4788c, this.f4789d);
            if (this.f4789d.isEmpty()) {
                C2063c.m6547a().m6546a(VEasing.Back.easeIn);
            }
        }
    }

    /* renamed from: a */
    public static Map<String, C1318a> m8335a(Context context) {
        C1522c c1522c = new C1522c(context);
        c1522c.m8330c();
        c1522c.m8336a();
        return c1522c.m8332b();
    }

    /* renamed from: a */
    public void m8336a() {
        C1455z.m8564a(2, new Runnable() { // from class: com.tsf.extend.c.1
            @Override // java.lang.Runnable
            public void run() {
                C2064d.m6543a().m6541a(C1522c.this.f4788c);
            }
        });
    }

    /* renamed from: b */
    private Map<String, C1318a> m8331b(List<C2020a> list) {
        HashMap hashMap = new HashMap();
        for (C2020a c2020a : list) {
            String m6707a = c2020a.m6707a();
            if (!TextUtils.isEmpty(m6707a) && C1894v.m7075e(m6707a)) {
                C1318a m9028c = C1318a.m9033a(m6707a).m9028c(C1318a.f4135q);
                m9028c.m9039a(2);
                hashMap.put(m6707a, m9028c);
            }
        }
        return hashMap;
    }
}
