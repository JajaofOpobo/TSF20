package com.censivn.a;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    private HashMap a = new HashMap();

    public final void a(String str, Object obj, String str2, Object... objArr) {
        if (this.a.containsKey(str)) {
            ((HashMap) this.a.get(str)).put(obj, new c(str2, objArr));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(obj, new c(str2, objArr));
        this.a.put(str, hashMap);
    }

    public final void a(String str) {
        a(str, null);
    }

    public final void a(String str, a... aVarArr) {
        if (this.a.containsKey(str)) {
            for (Map.Entry entry : ((HashMap) this.a.get(str)).entrySet()) {
                Object key = entry.getKey();
                c cVar = (c) entry.getValue();
                if (aVarArr != null) {
                    try {
                        int length = aVarArr.length;
                        Class<?>[] clsArr = new Class[length];
                        for (int i = 0; i < length; i++) {
                            clsArr[i] = aVarArr[i].b;
                        }
                        Object[] objArr = new Object[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            objArr[i2] = aVarArr[i2].a;
                            a aVar = aVarArr[i2];
                            aVar.a = null;
                            aVar.b = null;
                        }
                        key.getClass().getMethod(cVar.a, clsArr).invoke(key, objArr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    int length2 = cVar.b.length;
                    Class<?>[] clsArr2 = new Class[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        clsArr2[i3] = cVar.b[i3].getClass();
                    }
                    key.getClass().getMethod(cVar.a, clsArr2).invoke(key, cVar.b);
                }
            }
        }
    }
}
