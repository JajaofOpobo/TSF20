package com.flurry.a.a.a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class z extends LinkedHashMap {
    private Set a;

    public z(Set set) {
        super(1);
        this.a = set;
    }

    public final void a(String str, String str2) {
        if (this.a.contains(str)) {
            throw new a("Can't set reserved property: " + str);
        }
        if (str2 == null) {
            throw new a("Can't set a property to null: " + str);
        }
        String str3 = (String) get(str);
        if (str3 == null) {
            put(str, str2);
        } else if (!str3.equals(str2)) {
            throw new a("Can't overwrite property: " + str);
        }
    }

    public final void a(com.flurry.a.b.a.e eVar) {
        for (Map.Entry entry : entrySet()) {
            eVar.a((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
