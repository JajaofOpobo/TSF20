package com.flurry.a.b.a.d.g.b;

import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class n extends e implements com.flurry.a.b.a.d.ar {
    protected static final com.flurry.a.b.a.g.a a = com.flurry.a.b.a.d.h.k.b();
    protected final com.flurry.a.b.a.d.f b;
    protected final HashSet c;
    protected final boolean d;
    protected final com.flurry.a.b.a.g.a e;
    protected final com.flurry.a.b.a.g.a f;
    protected com.flurry.a.b.a.d.ac g;
    protected com.flurry.a.b.a.d.ac h;
    protected final com.flurry.a.b.a.d.az i;
    protected com.flurry.a.b.a.d.g.a.d j;

    @Override // com.flurry.a.b.a.d.g.b.v, com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        Map map = (Map) obj;
        eVar.d();
        if (!map.isEmpty()) {
            if (this.h != null) {
                a(map, eVar, awVar, this.h);
            } else {
                a(map, eVar, awVar);
            }
        }
        eVar.e();
    }

    @Override // com.flurry.a.b.a.d.ac
    public final /* synthetic */ void a(Object obj, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.az azVar) {
        Map map = (Map) obj;
        azVar.b(map, eVar);
        if (!map.isEmpty()) {
            if (this.h != null) {
                a(map, eVar, awVar, this.h);
            } else {
                a(map, eVar, awVar);
            }
        }
        azVar.e(map, eVar);
    }

    protected n() {
        this(null, null, null, false, null, null, null, null);
    }

    private n(HashSet hashSet, com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.g.a aVar2, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.ac acVar, com.flurry.a.b.a.d.ac acVar2, com.flurry.a.b.a.d.f fVar) {
        super(Map.class, (byte) 0);
        this.b = fVar;
        this.c = hashSet;
        this.e = aVar;
        this.f = aVar2;
        this.d = z;
        this.i = azVar;
        this.g = acVar;
        this.h = acVar2;
        this.j = com.flurry.a.b.a.d.g.a.d.a();
    }

    @Override // com.flurry.a.b.a.d.g.b.e
    public final e a(com.flurry.a.b.a.d.az azVar) {
        n nVar = new n(this.c, this.e, this.f, this.d, azVar, this.g, this.h, this.b);
        if (this.h != null) {
            nVar.h = this.h;
        }
        return nVar;
    }

    public static n a(String[] strArr, com.flurry.a.b.a.g.a aVar, boolean z, com.flurry.a.b.a.d.az azVar, com.flurry.a.b.a.d.f fVar, com.flurry.a.b.a.d.ac acVar, com.flurry.a.b.a.d.ac acVar2) {
        HashSet hashSet;
        com.flurry.a.b.a.g.a k;
        com.flurry.a.b.a.g.a g;
        boolean z2;
        boolean z3 = false;
        if (strArr == null || strArr.length == 0) {
            hashSet = null;
        } else {
            hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
        }
        if (aVar == null) {
            k = a;
            g = k;
        } else {
            k = aVar.k();
            g = aVar.g();
        }
        if (z) {
            z2 = z;
        } else {
            if (g != null && g.u()) {
                z3 = true;
            }
            z2 = z3;
        }
        return new n(hashSet, k, g, z2, azVar, acVar, acVar2, fVar);
    }

    public final void a(Map map, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar) {
        boolean z;
        com.flurry.a.b.a.d.g.a.d dVar;
        com.flurry.a.b.a.d.ac acVar;
        com.flurry.a.b.a.d.ac acVar2;
        com.flurry.a.b.a.d.ac acVar3;
        if (this.i != null) {
            com.flurry.a.b.a.d.ac acVar4 = this.g;
            HashSet hashSet = this.c;
            z = awVar.a(com.flurry.a.b.a.d.at.WRITE_NULL_MAP_VALUES) ? false : true;
            Class<?> cls = null;
            com.flurry.a.b.a.d.ac acVar5 = null;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                if (key == null) {
                    awVar.c().a(null, eVar, awVar);
                } else if (!z || value != null) {
                    if (hashSet == null || !hashSet.contains(key)) {
                        acVar4.a(key, eVar, awVar);
                    }
                }
                if (value == null) {
                    awVar.a(eVar);
                } else {
                    Class<?> cls2 = value.getClass();
                    if (cls2 == cls) {
                        cls2 = cls;
                        acVar3 = acVar5;
                    } else {
                        acVar5 = awVar.a(cls2, this.b);
                        acVar3 = acVar5;
                    }
                    try {
                        acVar5.a(value, eVar, awVar, this.i);
                        acVar5 = acVar3;
                        cls = cls2;
                    } catch (Exception e) {
                        a(awVar, e, map, new StringBuilder().append(key).toString());
                        acVar5 = acVar3;
                        cls = cls2;
                    }
                }
            }
            return;
        }
        com.flurry.a.b.a.d.ac acVar6 = this.g;
        HashSet hashSet2 = this.c;
        z = awVar.a(com.flurry.a.b.a.d.at.WRITE_NULL_MAP_VALUES) ? false : true;
        com.flurry.a.b.a.d.g.a.d dVar2 = this.j;
        com.flurry.a.b.a.d.g.a.d dVar3 = dVar2;
        for (Map.Entry entry2 : map.entrySet()) {
            Object value2 = entry2.getValue();
            Object key2 = entry2.getKey();
            if (key2 == null) {
                awVar.c().a(null, eVar, awVar);
            } else if (!z || value2 != null) {
                if (hashSet2 == null || !hashSet2.contains(key2)) {
                    acVar6.a(key2, eVar, awVar);
                }
            }
            if (value2 == null) {
                awVar.a(eVar);
            } else {
                Class<?> cls3 = value2.getClass();
                com.flurry.a.b.a.d.ac a2 = dVar3.a(cls3);
                if (a2 == null) {
                    if (this.f.e()) {
                        com.flurry.a.b.a.d.g.a.h a3 = dVar3.a(awVar.a(this.f, cls3), awVar, this.b);
                        if (dVar3 != a3.b) {
                            this.j = a3.b;
                        }
                        acVar2 = a3.a;
                    } else {
                        com.flurry.a.b.a.d.g.a.h a4 = dVar3.a(cls3, awVar, this.b);
                        if (dVar3 != a4.b) {
                            this.j = a4.b;
                        }
                        acVar2 = a4.a;
                    }
                    com.flurry.a.b.a.d.ac acVar7 = acVar2;
                    dVar = this.j;
                    acVar = acVar7;
                } else {
                    dVar = dVar3;
                    acVar = a2;
                }
                try {
                    acVar.a(value2, eVar, awVar);
                    dVar3 = dVar;
                } catch (Exception e2) {
                    a(awVar, e2, map, new StringBuilder().append(key2).toString());
                    dVar3 = dVar;
                }
            }
        }
    }

    private void a(Map map, com.flurry.a.b.a.e eVar, com.flurry.a.b.a.d.aw awVar, com.flurry.a.b.a.d.ac acVar) {
        com.flurry.a.b.a.d.ac acVar2 = this.g;
        HashSet hashSet = this.c;
        com.flurry.a.b.a.d.az azVar = this.i;
        boolean z = !awVar.a(com.flurry.a.b.a.d.at.WRITE_NULL_MAP_VALUES);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (key == null) {
                awVar.c().a(null, eVar, awVar);
            } else if (!z || value != null) {
                if (hashSet == null || !hashSet.contains(key)) {
                    acVar2.a(key, eVar, awVar);
                }
            }
            if (value == null) {
                awVar.a(eVar);
            } else if (azVar == null) {
                try {
                    acVar.a(value, eVar, awVar);
                } catch (Exception e) {
                    a(awVar, e, map, new StringBuilder().append(key).toString());
                }
            } else {
                acVar.a(value, eVar, awVar, azVar);
            }
        }
    }

    @Override // com.flurry.a.b.a.d.ar
    public final void a(com.flurry.a.b.a.d.aw awVar) {
        if (this.d && this.h == null) {
            this.h = awVar.a(this.f, this.b);
        }
        if (this.g == null) {
            com.flurry.a.b.a.g.a aVar = this.e;
            com.flurry.a.b.a.d.f fVar = this.b;
            this.g = awVar.a(aVar);
        }
    }
}
