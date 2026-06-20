package com.tsf.extend;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.extend.base.j.HandlerUtils;
import com.tsf.extend.DigestCache;
import com.tsf.extend.theme.ThemeDataProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeCacheManager {
    private static int i = 4096;
    Context a;
    Map<String, String> b = new ArrayMap();
    Map<String, ConfigConstants> c = new ArrayMap();

    private Map<String, ConfigConstants> a(List<com.tsf.extend.wallpaper.A> list) {
        DigestCache.a aVarA;
        ArrayMap arrayMap = new ArrayMap();
        Iterator<com.tsf.extend.wallpaper.A> it = list.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!TextUtils.isEmpty(strA) && (aVarA = d.a().a(strA)) != null && !TextUtils.isEmpty(aVarA.b)) {
                ConfigConstants aVarC = a.a(strA).c(aVarA.b);
                aVarC.a(1);
                aVarC.b(aVarA.a);
                arrayMap.put(strA, aVarC);
            }
        }
        DigestCache.a().b();
        return arrayMap;
    }

    private ThemeCacheManager(Context context) {
        this.a = null;
        this.a = context;
        com.tsf.extend.wallpaper.c.a().a(context);
    }

    private List<com.tsf.extend.wallpaper.A> a(Map<String, ConfigConstants> map, List<com.tsf.extend.wallpaper.A> list) {
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (com.tsf.extend.wallpaper.A aVar : list) {
                String strA = aVar.a();
                if (!TextUtils.isEmpty(strA) && !map.containsKey(strA)) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
        return list;
    }

    private Map<String, ConfigConstants> b() {
        return this.c;
    }

    private void c() throws Throwable {
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

    public static Map<String, ConfigConstants> a(Context context) throws Throwable {
        ThemeCacheManager cVar = new ThemeCacheManager(context);
        cVar.c();
        cVar.a();
        return cVar.b();
    }

    public void a() {
        z.a(2, new Runnable() { // from class: com.tsf.extend.ThemeCacheManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.extend.wallpaper.d.a().a(ThemeCacheManager.this.c);
            }
        });
    }

    private Map<String, ConfigConstants> b(List<com.tsf.extend.wallpaper.A> list) {
        HashMap map = new HashMap();
        Iterator<com.tsf.extend.wallpaper.A> it = list.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!TextUtils.isEmpty(strA) && v.e(strA)) {
                ConfigConstants aVarC = a.a(strA).c(a.q);
                aVarC.a(2);
                map.put(strA, aVarC);
            }
        }
        return map;
    }
}
