package com.flurry.android;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class ar {
    private s a;

    ar(s sVar) {
        this.a = sVar;
    }

    final List a(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dl dlVar = (dl) it.next();
            ae aeVar = new ae();
            aeVar.a(Long.valueOf(dlVar.c()));
            aeVar.a(dlVar.b());
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
            synchronized (dlVar) {
                for (cg cgVar : dlVar.d()) {
                    if (cgVar.b()) {
                        ad adVar = new ad();
                        adVar.a(cgVar.a());
                        adVar.a(Long.valueOf(cgVar.c()));
                        Map d = cgVar.d();
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : d.entrySet()) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                        adVar.a(hashMap);
                        copyOnWriteArrayList2.add(adVar);
                    }
                }
            }
            aeVar.a(copyOnWriteArrayList2);
            copyOnWriteArrayList.add(aeVar);
        }
        this.a.a(list);
        return copyOnWriteArrayList;
    }
}
