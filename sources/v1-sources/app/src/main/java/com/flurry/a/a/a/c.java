package com.flurry.a.a.a;

import com.flurry.a.b.a.d.am;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c {
    static final com.flurry.a.b.a.c a = new com.flurry.a.b.a.c();
    static final am b = new am(a);
    static final Map e;
    private static final Set g;
    private static final Set h;
    private static final ThreadLocal i;
    private static final ThreadLocal j;
    private static ThreadLocal k;
    z c = new z(g);
    int d = Integer.MIN_VALUE;
    private final ad f;

    static /* synthetic */ String g(String str) {
        if (((Boolean) k.get()).booleanValue()) {
            int length = str.length();
            if (length == 0) {
                throw new af("Empty name");
            }
            char charAt = str.charAt(0);
            if (!Character.isLetter(charAt) && charAt != '_') {
                throw new af("Illegal initial character: " + str);
            }
            for (int i2 = 1; i2 < length; i2++) {
                char charAt2 = str.charAt(i2);
                if (!Character.isLetterOrDigit(charAt2) && charAt2 != '_') {
                    throw new af("Illegal character in: " + str);
                }
            }
        }
        return str;
    }

    static {
        a.a(com.flurry.a.b.a.k.ALLOW_COMMENTS);
        a.a((com.flurry.a.b.a.p) b);
        HashSet hashSet = new HashSet();
        g = hashSet;
        Collections.addAll(hashSet, "doc", "fields", "items", "name", "namespace", "size", "symbols", "values", "type");
        HashSet hashSet2 = new HashSet();
        h = hashSet2;
        Collections.addAll(hashSet2, "default", "doc", "name", "order", "type");
        i = new d();
        j = new e();
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("string", ad.STRING);
        e.put("bytes", ad.BYTES);
        e.put("int", ad.INT);
        e.put("long", ad.LONG);
        e.put("float", ad.FLOAT);
        e.put("double", ad.DOUBLE);
        e.put("boolean", ad.BOOLEAN);
        e.put("null", ad.NULL);
        k = new f();
    }

    c(ad adVar) {
        this.f = adVar;
    }

    public static c a(ad adVar) {
        switch (g.a[adVar.ordinal()]) {
            case 1:
                return new ac();
            case 2:
                return new j();
            case 3:
                return new q();
            case 4:
                return new s();
            case 5:
                return new p();
            case 6:
                return new k();
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return new i();
            case ThemeParser.TYPE_FOLDER /* 8 */:
                return new x();
            default:
                throw new a("Can't create a: " + adVar);
        }
    }

    public final synchronized String a(String str) {
        return (String) this.c.get(str);
    }

    public synchronized void a(String str, String str2) {
        this.c.a(str, str2);
        this.d = Integer.MIN_VALUE;
    }

    public static c a(c cVar) {
        return new h(cVar);
    }

    public static c b(c cVar) {
        return new t(cVar);
    }

    public final ad a() {
        return this.f;
    }

    public m b(String str) {
        throw new a("Not a record: " + this);
    }

    public List b() {
        throw new a("Not a record: " + this);
    }

    public void a(List list) {
        throw new a("Not a record: " + this);
    }

    public List c() {
        throw new a("Not an enum: " + this);
    }

    public int c(String str) {
        throw new a("Not an enum: " + this);
    }

    public String d() {
        String str;
        str = this.f.o;
        return str;
    }

    public String e() {
        return null;
    }

    public String f() {
        throw new a("Not a named type: " + this);
    }

    public String g() {
        return d();
    }

    public void d(String str) {
        throw new a("Not a named type: " + this);
    }

    public boolean h() {
        throw new a("Not a record: " + this);
    }

    public c i() {
        throw new a("Not an array: " + this);
    }

    public c j() {
        throw new a("Not a map: " + this);
    }

    public List k() {
        throw new a("Not a union: " + this);
    }

    public Integer e(String str) {
        throw new a("Not a union: " + this);
    }

    public int l() {
        throw new a("Not fixed: " + this);
    }

    public String toString() {
        return a(false);
    }

    public final String a(boolean z) {
        try {
            StringWriter stringWriter = new StringWriter();
            com.flurry.a.b.a.e a2 = a.a((Writer) stringWriter);
            if (z) {
                a2.a();
            }
            a(new w(), a2);
            a2.g();
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    void a(w wVar, com.flurry.a.b.a.e eVar) {
        if (this.c.size() == 0) {
            eVar.b(d());
            return;
        }
        eVar.d();
        eVar.a("type", d());
        this.c.a(eVar);
        eVar.e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f != cVar.f) {
            return false;
        }
        return c(cVar) && this.c.equals(cVar.c);
    }

    public final int hashCode() {
        if (this.d == Integer.MIN_VALUE) {
            this.d = m();
        }
        return this.d;
    }

    int m() {
        return this.f.hashCode() + this.c.hashCode();
    }

    final boolean c(c cVar) {
        return this.d == cVar.d || this.d == Integer.MIN_VALUE || cVar.d == Integer.MIN_VALUE;
    }

    public static c f(String str) {
        return new y().a(str);
    }

    static c a(com.flurry.a.b.a.h hVar, w wVar) {
        String str;
        String str2;
        String str3;
        String str4;
        c cVar;
        Set a2;
        u uVar = null;
        if (hVar.e()) {
            c cVar2 = wVar.get((Object) hVar.h());
            if (cVar2 == null) {
                throw new af("Undefined name: " + hVar);
            }
            return cVar2;
        }
        if (hVar.b()) {
            String a3 = a(hVar, "type", "No type");
            if (a3.equals("record") || a3.equals("error") || a3.equals("enum") || a3.equals("fixed")) {
                String a4 = a(hVar, "namespace");
                String a5 = a(hVar, "doc");
                if (a4 == null) {
                    a4 = wVar.a();
                }
                u uVar2 = new u(a(hVar, "name", "No name in schema"), a4);
                str = uVar2.b;
                if (str != null) {
                    String a6 = wVar.a();
                    str4 = uVar2.b;
                    wVar.a(str4);
                    str2 = a6;
                    uVar = uVar2;
                    str3 = a5;
                } else {
                    str2 = null;
                    uVar = uVar2;
                    str3 = a5;
                }
            } else {
                str2 = null;
                str3 = null;
            }
            if (e.containsKey(a3)) {
                cVar = a((ad) e.get(a3));
            } else if (a3.equals("record") || a3.equals("error")) {
                ArrayList arrayList = new ArrayList();
                aa aaVar = new aa(uVar, str3, a3.equals("error"));
                if (uVar != null) {
                    wVar.a((c) aaVar);
                }
                com.flurry.a.b.a.h a7 = hVar.a("fields");
                if (a7 == null || !a7.a()) {
                    throw new af("Record has no fields: " + hVar);
                }
                Iterator it = a7.iterator();
                while (it.hasNext()) {
                    com.flurry.a.b.a.h hVar2 = (com.flurry.a.b.a.h) it.next();
                    String a8 = a(hVar2, "name", "No field name");
                    String a9 = a(hVar2, "doc");
                    com.flurry.a.b.a.h a10 = hVar2.a("type");
                    if (a10 == null) {
                        throw new af("No field type: " + hVar2);
                    }
                    if (a10.e() && wVar.get((Object) a10.h()) == null) {
                        throw new af(a10 + " is not a defined name. The type of the \"" + a8 + "\" field must be a defined name or a {\"type\": ...} expression.");
                    }
                    c a11 = a(a10, wVar);
                    n nVar = n.ASCENDING;
                    com.flurry.a.b.a.h a12 = hVar2.a("order");
                    if (a12 != null) {
                        nVar = n.valueOf(a12.h().toUpperCase());
                    }
                    com.flurry.a.b.a.h a13 = hVar2.a("default");
                    if (a13 != null && ((ad.FLOAT.equals(a11.f) || ad.DOUBLE.equals(a11.f)) && a13.e())) {
                        a13 = new com.flurry.a.b.a.e.j(Double.valueOf(a13.h()).doubleValue());
                    }
                    m mVar = new m(a8, a11, a9, a13, nVar);
                    Iterator r = hVar2.r();
                    while (r.hasNext()) {
                        String str5 = (String) r.next();
                        String h2 = hVar2.a(str5).h();
                        if (!h.contains(str5) && h2 != null) {
                            mVar.a(str5, h2);
                        }
                    }
                    mVar.g = a(hVar2);
                    arrayList.add(mVar);
                }
                aaVar.a(arrayList);
                cVar = aaVar;
            } else if (a3.equals("enum")) {
                com.flurry.a.b.a.h a14 = hVar.a("symbols");
                if (a14 == null || !a14.a()) {
                    throw new af("Enum has no symbols: " + hVar);
                }
                r rVar = new r();
                Iterator it2 = a14.iterator();
                while (it2.hasNext()) {
                    rVar.add(((com.flurry.a.b.a.h) it2.next()).h());
                }
                l lVar = new l(uVar, str3, rVar);
                if (uVar != null) {
                    wVar.a((c) lVar);
                }
                cVar = lVar;
            } else if (a3.equals("array")) {
                com.flurry.a.b.a.h a15 = hVar.a("items");
                if (a15 == null) {
                    throw new af("Array has no items type: " + hVar);
                }
                cVar = new h(a(a15, wVar));
            } else if (a3.equals("map")) {
                com.flurry.a.b.a.h a16 = hVar.a("values");
                if (a16 == null) {
                    throw new af("Map has no values type: " + hVar);
                }
                cVar = new t(a(a16, wVar));
            } else if (a3.equals("fixed")) {
                com.flurry.a.b.a.h a17 = hVar.a("size");
                if (a17 == null || !a17.d()) {
                    throw new af("Invalid or no size: " + hVar);
                }
                o oVar = new o(uVar, str3, a17.j());
                if (uVar != null) {
                    wVar.a((c) oVar);
                }
                cVar = oVar;
            } else {
                throw new af("Type not supported: " + a3);
            }
            Iterator r2 = hVar.r();
            while (r2.hasNext()) {
                String str6 = (String) r2.next();
                String h3 = hVar.a(str6).h();
                if (!g.contains(str6) && h3 != null) {
                    cVar.a(str6, h3);
                }
            }
            if (str2 != null) {
                wVar.a(str2);
            }
            if (!(cVar instanceof v) || (a2 = a(hVar)) == null) {
                return cVar;
            }
            Iterator it3 = a2.iterator();
            while (it3.hasNext()) {
                cVar.d((String) it3.next());
            }
            return cVar;
        }
        if (hVar.a()) {
            r rVar2 = new r(hVar.p());
            Iterator it4 = hVar.iterator();
            while (it4.hasNext()) {
                rVar2.add(a((com.flurry.a.b.a.h) it4.next(), wVar));
            }
            return new ae(rVar2);
        }
        throw new af("Schema not yet supported: " + hVar);
    }

    private static Set a(com.flurry.a.b.a.h hVar) {
        com.flurry.a.b.a.h a2 = hVar.a("aliases");
        if (a2 == null) {
            return null;
        }
        if (!a2.a()) {
            throw new af("aliases not an array: " + hVar);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            com.flurry.a.b.a.h hVar2 = (com.flurry.a.b.a.h) it.next();
            if (!hVar2.e()) {
                throw new af("alias not a string: " + hVar2);
            }
            linkedHashSet.add(hVar2.h());
        }
        return linkedHashSet;
    }

    private static String a(com.flurry.a.b.a.h hVar, String str, String str2) {
        String a2 = a(hVar, str);
        if (a2 == null) {
            throw new af(str2 + ": " + hVar);
        }
        return a2;
    }

    private static String a(com.flurry.a.b.a.h hVar, String str) {
        com.flurry.a.b.a.h a2 = hVar.a(str);
        if (a2 != null) {
            return a2.h();
        }
        return null;
    }

    public static c a(c cVar, c cVar2) {
        if (cVar != cVar2) {
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            HashMap hashMap = new HashMap(1);
            HashMap hashMap2 = new HashMap(1);
            b(cVar2, identityHashMap, hashMap, hashMap2);
            if (hashMap.size() != 0 || hashMap2.size() != 0) {
                identityHashMap.clear();
                return a(cVar, identityHashMap, hashMap, hashMap2);
            }
            return cVar;
        }
        return cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static c a(c cVar, Map map, Map map2, Map map3) {
        String str;
        c oVar;
        String str2;
        String str3;
        c cVar2;
        String str4;
        String str5;
        com.flurry.a.b.a.h hVar;
        n nVar;
        z zVar;
        z zVar2;
        String str6;
        u uVar = cVar instanceof v ? ((v) cVar).f : null;
        switch (g.a[cVar.f.ordinal()]) {
            case 9:
                if (map.containsKey(cVar)) {
                    return (c) map.get(cVar);
                }
                u uVar2 = map2.containsKey(uVar) ? (u) map2.get(uVar) : uVar;
                str3 = uVar2.c;
                aa aaVar = new aa(new u(str3, null), cVar.e(), cVar.h());
                map.put(cVar, aaVar);
                ArrayList arrayList = new ArrayList();
                for (m mVar : cVar.b()) {
                    cVar2 = mVar.c;
                    c a2 = a(cVar2, map, map2, map3);
                    str4 = mVar.a;
                    Map map4 = (Map) map3.get(uVar2);
                    if (map4 != null && (str6 = (String) map4.get(str4)) != null) {
                        str4 = str6;
                    }
                    str5 = mVar.d;
                    hVar = mVar.e;
                    nVar = mVar.f;
                    m mVar2 = new m(str4, a2, str5, hVar, nVar);
                    zVar = mVar2.h;
                    zVar2 = mVar.h;
                    zVar.putAll(zVar2);
                    arrayList.add(mVar2);
                }
                aaVar.a(arrayList);
                oVar = aaVar;
                break;
                break;
            case 10:
                if (map2.containsKey(uVar)) {
                    str2 = ((u) map2.get(uVar)).c;
                    oVar = new l(new u(str2, null), cVar.e(), new r(cVar.c()));
                    break;
                }
                oVar = cVar;
                break;
            case 11:
                c a3 = a(cVar.i(), map, map2, map3);
                if (a3 != cVar.i()) {
                    oVar = a(a3);
                    break;
                }
                oVar = cVar;
                break;
            case 12:
                c a4 = a(cVar.j(), map, map2, map3);
                if (a4 != cVar.j()) {
                    oVar = b(a4);
                    break;
                }
                oVar = cVar;
                break;
            case 13:
                ArrayList arrayList2 = new ArrayList();
                Iterator it = cVar.k().iterator();
                while (it.hasNext()) {
                    arrayList2.add(a((c) it.next(), map, map2, map3));
                }
                oVar = new ae(new r(arrayList2));
                break;
            case 14:
                if (map2.containsKey(uVar)) {
                    str = ((u) map2.get(uVar)).c;
                    oVar = new o(new u(str, null), cVar.e(), cVar.l());
                    break;
                }
                oVar = cVar;
                break;
            default:
                oVar = cVar;
                break;
        }
        if (oVar != cVar) {
            oVar.c.putAll(cVar.c);
            return oVar;
        }
        return oVar;
    }

    private static void b(c cVar, Map map, Map map2, Map map3) {
        Set set;
        c cVar2;
        Set<String> set2;
        String str;
        c cVar3 = cVar;
        while (true) {
            if (cVar3 instanceof v) {
                v vVar = (v) cVar3;
                if (vVar.h != null) {
                    Iterator it = vVar.h.iterator();
                    while (it.hasNext()) {
                        map2.put((u) it.next(), vVar.f);
                    }
                }
            }
            switch (g.a[cVar3.f.ordinal()]) {
                case 9:
                    if (!map.containsKey(cVar3)) {
                        map.put(cVar3, cVar3);
                        aa aaVar = (aa) cVar3;
                        for (m mVar : cVar3.b()) {
                            set = mVar.g;
                            if (set != null) {
                                set2 = mVar.g;
                                for (String str2 : set2) {
                                    Map map4 = (Map) map3.get(aaVar.f);
                                    if (map4 == null) {
                                        u uVar = aaVar.f;
                                        map4 = new HashMap();
                                        map3.put(uVar, map4);
                                    }
                                    str = mVar.a;
                                    map4.put(str2, str);
                                }
                            }
                            cVar2 = mVar.c;
                            b(cVar2, map, map2, map3);
                        }
                        if (aaVar.h != null && map3.containsKey(aaVar.f)) {
                            Iterator it2 = aaVar.h.iterator();
                            while (it2.hasNext()) {
                                map3.put((u) it2.next(), map3.get(aaVar.f));
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 10:
                default:
                    return;
                case 11:
                    cVar3 = cVar3.i();
                    break;
                case 12:
                    cVar3 = cVar3.j();
                    break;
                case 13:
                    Iterator it3 = cVar3.k().iterator();
                    while (it3.hasNext()) {
                        b((c) it3.next(), map, map2, map3);
                    }
                    return;
            }
        }
    }
}
