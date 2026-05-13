package com.tsf.extend;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.extend.base.j.z;
import com.tsf.extend.d;
import com.tsf.extend.theme.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c {
    private static int i = 4096;
    Context a;
    Map<String, String> b = new ArrayMap();
    Map<String, a> c = new ArrayMap();
    List<com.tsf.extend.wallpaper.a> d = new ArrayList();
    private boolean e = true;
    private boolean f = true;
    private boolean g = true;
    private boolean h = true;

    private Map<String, a> a(List<com.tsf.extend.wallpaper.a> list) {
        d.a a;
        ArrayMap arrayMap = new ArrayMap();
        for (com.tsf.extend.wallpaper.a aVar : list) {
            String a2 = aVar.a();
            if (!TextUtils.isEmpty(a2) && (a = d.a().a(a2)) != null && !TextUtils.isEmpty(a.b)) {
                a c = a.a(a2).c(a.b);
                c.a(1);
                c.b(a.a);
                arrayMap.put(a2, c);
            }
        }
        d.a().b();
        return arrayMap;
    }

    private c(Context context) {
        this.a = null;
        this.a = context;
        com.tsf.extend.wallpaper.c.a().a(context);
    }

    private List<com.tsf.extend.wallpaper.a> a(Map<String, a> map, List<com.tsf.extend.wallpaper.a> list) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (com.tsf.extend.wallpaper.a aVar : list) {
                String a = aVar.a();
                if (!TextUtils.isEmpty(a) && !map.containsKey(a)) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
        return list;
    }

    private Map<String, a> b() {
        return this.c;
    }

    private void c() {
        if (this.d == null || this.d.isEmpty()) {
            this.d = com.tsf.extend.wallpaper.c.b();
        }
        if (this.e) {
            this.c.putAll(com.tsf.extend.wallpaper.d.a().b());
            this.d = a(this.c, this.d);
            if (this.d.isEmpty()) {
                com.tsf.extend.wallpaper.c.a().a(VEasing.Back.easeIn);
                return;
            }
        }
        if (this.h) {
            this.c.putAll(b(this.d));
            this.d = a(this.c, this.d);
            if (this.d.isEmpty()) {
                return;
            }
        }
        if (this.g) {
            this.c.putAll(a(this.d));
            this.d = a(this.c, this.d);
            if (this.d.isEmpty()) {
                com.tsf.extend.wallpaper.c.a().a(VEasing.Back.easeIn);
            }
        }
    }

    public static Map<String, a> a(Context context) {
        c cVar = new c(context);
        cVar.c();
        cVar.a();
        return cVar.b();
    }

    public void a() {
        z.a(2, new Runnable() { // from class: com.tsf.extend.c.1
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.wallpaper.d.a().a(c.this.c);
            }
        });
    }

    private Map<String, a> b(List<com.tsf.extend.wallpaper.a> list) {
        HashMap hashMap = new HashMap();
        for (com.tsf.extend.wallpaper.a aVar : list) {
            String a = aVar.a();
            if (!TextUtils.isEmpty(a) && v.e(a)) {
                a c = a.a(a).c(a.q);
                c.a(2);
                hashMap.put(a, c);
            }
        }
        return hashMap;
    }
}
