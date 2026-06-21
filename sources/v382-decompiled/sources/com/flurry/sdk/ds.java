package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ds {
    private final Map a = new HashMap();
    private int b;

    public void a() {
        this.a.clear();
    }

    public List a(Object obj) {
        if (obj == null) {
            return Collections.emptyList();
        }
        List a = a(obj, false);
        if (a == null) {
            return Collections.emptyList();
        }
        return a;
    }

    public void a(Object obj, Object obj2) {
        if (obj != null) {
            a(obj, true).add(obj2);
        }
    }

    public void a(ds dsVar) {
        if (dsVar != null) {
            for (Map.Entry entry : dsVar.a.entrySet()) {
                this.a.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        List a;
        boolean z = false;
        if (obj != null && (a = a(obj, false)) != null) {
            z = a.remove(obj2);
            if (a.size() == 0) {
                this.a.remove(obj);
            }
        }
        return z;
    }

    public boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((List) this.a.remove(obj)) != null;
    }

    public Collection b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.a.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), it.next()));
            }
        }
        return arrayList;
    }

    public Set c() {
        return this.a.keySet();
    }

    private List a(Object obj, boolean z) {
        List list = (List) this.a.get(obj);
        if (z && list == null) {
            if (this.b > 0) {
                list = new ArrayList(this.b);
            } else {
                list = new ArrayList();
            }
            this.a.put(obj, list);
        }
        return list;
    }
}
