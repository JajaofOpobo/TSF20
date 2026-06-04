package com.flurry.a.b.a.d.e;

import com.flurry.a.b.a.d.ah;
import com.flurry.a.b.a.d.an;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class u {
    protected final ah a;
    protected final boolean b;
    protected final com.flurry.a.b.a.g.a c;
    protected final b d;
    protected final x e;
    protected final com.flurry.a.b.a.d.b f;
    protected final LinkedHashMap g = new LinkedHashMap();
    protected LinkedList h = null;
    protected LinkedList i = null;
    protected LinkedList j = null;
    protected LinkedList k = null;
    protected Set l;
    protected Set m;
    protected LinkedHashMap n;

    protected u(ah ahVar, boolean z, com.flurry.a.b.a.g.a aVar, b bVar) {
        this.a = ahVar;
        this.b = z;
        this.c = aVar;
        this.d = bVar;
        this.f = ahVar.b() ? this.a.a() : null;
        if (this.f == null) {
            this.e = this.a.e();
        } else {
            this.e = this.f.a(bVar, this.a.e());
        }
    }

    public final ah a() {
        return this.a;
    }

    public final com.flurry.a.b.a.g.a b() {
        return this.c;
    }

    public final b c() {
        return this.d;
    }

    public final List d() {
        return new ArrayList(this.g.values());
    }

    public final Map e() {
        return this.n;
    }

    public final f f() {
        if (this.k == null) {
            return null;
        }
        if (this.k.size() > 1) {
            a("Multiple value properties defined (" + this.k.get(0) + " vs " + this.k.get(1) + ")");
        }
        return (f) this.k.get(0);
    }

    public final f g() {
        if (this.i == null) {
            return null;
        }
        if (this.i.size() > 1) {
            a("Multiple 'any-getters' defined (" + this.i.get(0) + " vs " + this.i.get(1) + ")");
        }
        return (f) this.i.getFirst();
    }

    public final f h() {
        if (this.j == null) {
            return null;
        }
        if (this.j.size() > 1) {
            a("Multiple 'any-setters' defined (" + this.j.get(0) + " vs " + this.j.get(1) + ")");
        }
        return (f) this.j.getFirst();
    }

    public final Set i() {
        return this.l;
    }

    public final Set j() {
        return this.m;
    }

    public final u k() {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        boolean z2;
        this.g.clear();
        com.flurry.a.b.a.d.b bVar = this.f;
        for (d dVar : this.d.l()) {
            String b = dVar.b();
            String b2 = bVar == null ? null : this.b ? bVar.b(dVar) : bVar.c(dVar);
            String str5 = "".equals(b2) ? b : b2;
            boolean z3 = str5 != null;
            b(b).a(dVar, str5, !z3 ? this.e.a(dVar) : z3, bVar != null && bVar.c((e) dVar));
        }
        com.flurry.a.b.a.d.b bVar2 = this.f;
        for (f fVar : this.d.k()) {
            int f = fVar.f();
            if (f == 0) {
                if (bVar2 != null) {
                    if (bVar2.f(fVar)) {
                        if (this.i == null) {
                            this.i = new LinkedList();
                        }
                        this.i.add(fVar);
                    } else if (bVar2.c(fVar)) {
                        if (this.k == null) {
                            this.k = new LinkedList();
                        }
                        this.k.add(fVar);
                    }
                }
                String b3 = bVar2 == null ? null : bVar2.b(fVar);
                if (b3 == null) {
                    str = com.flurry.a.b.a.d.i.k.a(fVar, fVar.b());
                    if (str == null) {
                        str = com.flurry.a.b.a.d.i.k.b(fVar, fVar.b());
                        if (str != null) {
                            str2 = b3;
                            z = this.e.b(fVar);
                        }
                    } else {
                        str2 = b3;
                        z = this.e.a(fVar);
                    }
                } else {
                    String b4 = fVar.b();
                    String b5 = com.flurry.a.b.a.d.i.k.b(fVar, b4);
                    if (b5 == null) {
                        b5 = com.flurry.a.b.a.d.i.k.a(fVar, b4);
                    }
                    if (b5 == null) {
                        b5 = fVar.b();
                    }
                    if (b3.length() == 0) {
                        b3 = b5;
                    }
                    str = b5;
                    str2 = b3;
                    z = true;
                }
                b(str).a(fVar, str2, z, bVar2 == null ? false : bVar2.c((e) fVar));
            } else if (f == 1) {
                String d = bVar2 == null ? null : bVar2.d(fVar);
                if (d == null) {
                    str3 = com.flurry.a.b.a.d.i.k.a(fVar);
                    if (str3 != null) {
                        str4 = d;
                        z2 = this.e.c(fVar);
                    }
                } else {
                    String a = com.flurry.a.b.a.d.i.k.a(fVar);
                    if (a == null) {
                        a = fVar.b();
                    }
                    if (d.length() == 0) {
                        d = a;
                    }
                    str3 = a;
                    str4 = d;
                    z2 = true;
                }
                b(str3).b(fVar, str4, z2, bVar2 == null ? false : bVar2.c((e) fVar));
            } else if (f == 2 && bVar2 != null && bVar2.e(fVar)) {
                if (this.j == null) {
                    this.j = new LinkedList();
                }
                this.j.add(fVar);
            }
        }
        m();
        n();
        o();
        p();
        an j = this.a.j();
        if (j != null) {
            a(j);
        }
        Iterator it = this.g.values().iterator();
        while (it.hasNext()) {
            ((v) it.next()).o();
        }
        Iterator it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            ((v) it2.next()).a(this.b);
        }
        l();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.TreeMap] */
    private void l() {
        boolean booleanValue;
        LinkedHashMap linkedHashMap;
        String str;
        com.flurry.a.b.a.d.b a = this.a.a();
        Boolean i = a.i(this.d);
        if (i == null) {
            booleanValue = this.a.d();
        } else {
            booleanValue = i.booleanValue();
        }
        String[] h = a.h(this.d);
        if (booleanValue || this.h != null || h != null) {
            int size = this.g.size();
            if (booleanValue) {
                linkedHashMap = new TreeMap();
            } else {
                linkedHashMap = new LinkedHashMap(size + size);
            }
            for (v vVar : this.g.values()) {
                linkedHashMap.put(vVar.a(), vVar);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(size + size);
            if (h != null) {
                for (String str2 : h) {
                    v vVar2 = (v) linkedHashMap.get(str2);
                    if (vVar2 == null) {
                        for (v vVar3 : this.g.values()) {
                            if (str2.equals(vVar3.k())) {
                                str = vVar3.a();
                                vVar2 = vVar3;
                                break;
                            }
                        }
                    }
                    str = str2;
                    if (vVar2 != null) {
                        linkedHashMap2.put(str, vVar2);
                    }
                }
            }
            if (this.h != null) {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    v vVar4 = (v) it.next();
                    linkedHashMap2.put(vVar4.a(), vVar4);
                }
            }
            linkedHashMap2.putAll(linkedHashMap);
            this.g.clear();
            this.g.putAll(linkedHashMap2);
        }
    }

    private void m() {
        com.flurry.a.b.a.d.b bVar = this.f;
        if (bVar != null) {
            for (c cVar : this.d.i()) {
                if (this.h == null) {
                    this.h = new LinkedList();
                }
                int f = cVar.f();
                for (int i = 0; i < f; i++) {
                    h b = cVar.b(i);
                    String a = bVar.a(b);
                    if (a != null) {
                        v b2 = b(a);
                        b2.a(b, a);
                        this.h.add(b2);
                    }
                }
            }
            for (f fVar : this.d.j()) {
                if (this.h == null) {
                    this.h = new LinkedList();
                }
                int f2 = fVar.f();
                for (int i2 = 0; i2 < f2; i2++) {
                    h b3 = fVar.b(i2);
                    String a2 = bVar.a(b3);
                    if (a2 != null) {
                        v b4 = b(a2);
                        b4.a(b3, a2);
                        this.h.add(b4);
                    }
                }
            }
        }
    }

    private void n() {
        com.flurry.a.b.a.d.b bVar = this.f;
        if (bVar != null) {
            for (e eVar : this.d.l()) {
                a(bVar.d(eVar), eVar);
            }
            for (f fVar : this.d.k()) {
                if (fVar.f() == 1) {
                    a(bVar.d((e) fVar), fVar);
                }
            }
        }
    }

    private void a(Object obj, e eVar) {
        if (obj != null) {
            if (this.n == null) {
                this.n = new LinkedHashMap();
            }
            if (((e) this.n.put(obj, eVar)) != null) {
                throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(obj) + "' (of type " + (obj == null ? "[null]" : obj.getClass().getName()) + ")");
            }
        }
    }

    private void o() {
        Iterator it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            v vVar = (v) ((Map.Entry) it.next()).getValue();
            if (!vVar.q()) {
                it.remove();
            } else {
                if (vVar.r()) {
                    if (!this.b) {
                        String a = vVar.a();
                        this.l = a(this.l, a);
                        if (vVar.s()) {
                            this.m = a(this.m, a);
                        }
                    }
                    if (!vVar.p()) {
                        it.remove();
                    } else {
                        vVar.m();
                    }
                }
                vVar.n();
            }
        }
    }

    private void p() {
        Iterator it = this.g.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            v vVar = (v) ((Map.Entry) it.next()).getValue();
            String t = vVar.t();
            if (t != null) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(vVar.a(t));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                v vVar2 = (v) it2.next();
                String a = vVar2.a();
                v vVar3 = (v) this.g.get(a);
                if (vVar3 == null) {
                    this.g.put(a, vVar2);
                } else {
                    vVar3.a(vVar2);
                }
            }
        }
    }

    private void a(an anVar) {
        String b;
        v[] vVarArr = (v[]) this.g.values().toArray(new v[this.g.size()]);
        this.g.clear();
        for (v vVar : vVarArr) {
            String a = vVar.a();
            if (this.b) {
                if (vVar.b()) {
                    ah ahVar = this.a;
                    vVar.f();
                    b = anVar.b(a);
                } else {
                    if (vVar.d()) {
                        ah ahVar2 = this.a;
                        vVar.h();
                        b = anVar.a(a);
                    }
                    b = a;
                }
            } else if (vVar.c()) {
                ah ahVar3 = this.a;
                vVar.g();
                b = anVar.c(a);
            } else if (vVar.e()) {
                ah ahVar4 = this.a;
                vVar.l();
                b = anVar.d(a);
            } else if (vVar.d()) {
                ah ahVar5 = this.a;
                vVar.h();
                b = anVar.a(a);
            } else {
                if (vVar.b()) {
                    ah ahVar6 = this.a;
                    vVar.f();
                    b = anVar.b(a);
                }
                b = a;
            }
            if (!b.equals(vVar.a())) {
                vVar = vVar.a(b);
            }
            v vVar2 = (v) this.g.get(b);
            if (vVar2 == null) {
                this.g.put(b, vVar);
            } else {
                vVar2.a(vVar);
            }
        }
    }

    private void a(String str) {
        throw new IllegalArgumentException("Problem with definition of " + this.d + ": " + str);
    }

    private v b(String str) {
        v vVar = (v) this.g.get(str);
        if (vVar == null) {
            v vVar2 = new v(str);
            this.g.put(str, vVar2);
            return vVar2;
        }
        return vVar;
    }

    private static Set a(Set set, String str) {
        if (set == null) {
            set = new HashSet();
        }
        set.add(str);
        return set;
    }
}
