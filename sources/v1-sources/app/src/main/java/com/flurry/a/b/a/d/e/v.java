package com.flurry.a.b.a.d.e;

/* loaded from: classes.dex */
public final class v extends com.flurry.a.b.a.d.h implements Comparable {
    protected final String a;
    protected final String b;
    protected w c;
    protected w d;
    protected w e;
    protected w f;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        v vVar = (v) obj;
        if (this.d != null) {
            if (vVar.d == null) {
                return -1;
            }
        } else if (vVar.d != null) {
            return 1;
        }
        return this.a.compareTo(vVar.a);
    }

    public v(String str) {
        this.b = str;
        this.a = str;
    }

    private v(v vVar, String str) {
        this.b = vVar.b;
        this.a = str;
        this.c = vVar.c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f = vVar.f;
    }

    public final v a(String str) {
        return new v(this, str);
    }

    @Override // com.flurry.a.b.a.d.h
    public final String a() {
        return this.a;
    }

    public final String k() {
        return this.b;
    }

    @Override // com.flurry.a.b.a.d.h
    public final boolean b() {
        return this.e != null;
    }

    @Override // com.flurry.a.b.a.d.h
    public final boolean c() {
        return this.f != null;
    }

    @Override // com.flurry.a.b.a.d.h
    public final boolean d() {
        return this.c != null;
    }

    @Override // com.flurry.a.b.a.d.h
    public final boolean e() {
        return this.d != null;
    }

    @Override // com.flurry.a.b.a.d.h
    public final e i() {
        f f = f();
        if (f == null) {
            return h();
        }
        return f;
    }

    @Override // com.flurry.a.b.a.d.h
    public final e j() {
        h l = l();
        if (l == null) {
            f g = g();
            if (g == null) {
                return h();
            }
            return g;
        }
        return l;
    }

    @Override // com.flurry.a.b.a.d.h
    public final f f() {
        if (this.e == null) {
            return null;
        }
        f fVar = (f) this.e.a;
        w wVar = this.e.b;
        f fVar2 = fVar;
        while (wVar != null) {
            f fVar3 = (f) wVar.a;
            Class<?> i = fVar2.i();
            Class<?> i2 = fVar3.i();
            if (i != i2) {
                if (!i.isAssignableFrom(i2)) {
                    if (i2.isAssignableFrom(i)) {
                        fVar3 = fVar2;
                    }
                }
                wVar = wVar.b;
                fVar2 = fVar3;
            }
            throw new IllegalArgumentException("Conflicting getter definitions for property \"" + this.a + "\": " + fVar2.n() + " vs " + fVar3.n());
        }
        return fVar2;
    }

    @Override // com.flurry.a.b.a.d.h
    public final f g() {
        if (this.f == null) {
            return null;
        }
        f fVar = (f) this.f.a;
        w wVar = this.f.b;
        f fVar2 = fVar;
        while (wVar != null) {
            f fVar3 = (f) wVar.a;
            Class<?> i = fVar2.i();
            Class<?> i2 = fVar3.i();
            if (i != i2) {
                if (!i.isAssignableFrom(i2)) {
                    if (i2.isAssignableFrom(i)) {
                        fVar3 = fVar2;
                    }
                }
                wVar = wVar.b;
                fVar2 = fVar3;
            }
            throw new IllegalArgumentException("Conflicting setter definitions for property \"" + this.a + "\": " + fVar2.n() + " vs " + fVar3.n());
        }
        return fVar2;
    }

    @Override // com.flurry.a.b.a.d.h
    public final d h() {
        if (this.c == null) {
            return null;
        }
        d dVar = (d) this.c.a;
        w wVar = this.c.b;
        d dVar2 = dVar;
        while (wVar != null) {
            d dVar3 = (d) wVar.a;
            Class<?> i = dVar2.i();
            Class<?> i2 = dVar3.i();
            if (i != i2) {
                if (!i.isAssignableFrom(i2)) {
                    if (i2.isAssignableFrom(i)) {
                        dVar3 = dVar2;
                    }
                }
                wVar = wVar.b;
                dVar2 = dVar3;
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + this.a + "\": " + dVar2.f() + " vs " + dVar3.f());
        }
        return dVar2;
    }

    public final h l() {
        if (this.d == null) {
            return null;
        }
        w wVar = this.d;
        do {
            w wVar2 = wVar;
            if (((h) wVar2.a).f() instanceof c) {
                return (h) wVar2.a;
            }
            wVar = wVar2.b;
        } while (wVar != null);
        return (h) this.d.a;
    }

    public final void a(d dVar, String str, boolean z, boolean z2) {
        this.c = new w(dVar, this.c, str, z, z2);
    }

    public final void a(h hVar, String str) {
        this.d = new w(hVar, this.d, str, true, false);
    }

    public final void a(f fVar, String str, boolean z, boolean z2) {
        this.e = new w(fVar, this.e, str, z, z2);
    }

    public final void b(f fVar, String str, boolean z, boolean z2) {
        this.f = new w(fVar, this.f, str, z, z2);
    }

    public final void a(v vVar) {
        this.c = a(this.c, vVar.c);
        this.d = a(this.d, vVar.d);
        this.e = a(this.e, vVar.e);
        this.f = a(this.f, vVar.f);
    }

    private static w a(w wVar, w wVar2) {
        w b;
        if (wVar != null) {
            if (wVar2 == null) {
                return wVar;
            }
            b = wVar.b(wVar2);
            return b;
        }
        return wVar2;
    }

    public final void m() {
        this.c = a(this.c);
        this.e = a(this.e);
        this.f = a(this.f);
        this.d = a(this.d);
    }

    public final void n() {
        this.e = b(this.e);
        this.d = b(this.d);
        if (this.e == null) {
            this.c = b(this.c);
            this.f = b(this.f);
        }
    }

    public final void o() {
        this.c = c(this.c);
        this.e = c(this.e);
        this.f = c(this.f);
        this.d = c(this.d);
    }

    public final void a(boolean z) {
        if (z) {
            if (this.e != null) {
                this.e = this.e.a(((f) this.e.a).a(a(0, this.e, this.c, this.d, this.f)));
                return;
            } else {
                if (this.c != null) {
                    this.c = this.c.a(((d) this.c.a).a(a(0, this.c, this.d, this.f)));
                    return;
                }
                return;
            }
        }
        if (this.d != null) {
            this.d = this.d.a(((h) this.d.a).a(a(0, this.d, this.f, this.c, this.e)));
        } else if (this.f != null) {
            this.f = this.f.a(((f) this.f.a).a(a(0, this.f, this.c, this.e)));
        } else if (this.c != null) {
            this.c = this.c.a(((d) this.c.a).a(a(0, this.c, this.e)));
        }
    }

    private j a(int i, w... wVarArr) {
        j k = ((e) wVarArr[i].a).k();
        for (int i2 = i + 1; i2 < wVarArr.length; i2++) {
            if (wVarArr[i2] != null) {
                return j.a(k, a(i2, wVarArr));
            }
        }
        return k;
    }

    private static w a(w wVar) {
        return wVar == null ? wVar : wVar.a();
    }

    private static w b(w wVar) {
        return wVar == null ? wVar : wVar.b();
    }

    private static w c(w wVar) {
        return wVar == null ? wVar : wVar.c();
    }

    public final boolean p() {
        return d(this.c) || d(this.e) || d(this.f) || d(this.d);
    }

    private static boolean d(w wVar) {
        while (wVar != null) {
            if (wVar.c == null || wVar.c.length() <= 0) {
                wVar = wVar.b;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        return e(this.c) || e(this.e) || e(this.f) || e(this.d);
    }

    private static boolean e(w wVar) {
        while (wVar != null) {
            if (!wVar.d) {
                wVar = wVar.b;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean r() {
        return f(this.c) || f(this.e) || f(this.f) || f(this.d);
    }

    public final boolean s() {
        return f(this.c) || f(this.f) || f(this.d);
    }

    private static boolean f(w wVar) {
        while (wVar != null) {
            if (!wVar.e) {
                wVar = wVar.b;
            } else {
                return true;
            }
        }
        return false;
    }

    public final String t() {
        w b = b(this.d, b(this.f, b(this.e, b(this.c, null))));
        if (b == null) {
            return null;
        }
        return b.c;
    }

    private w b(w wVar, w wVar2) {
        w wVar3 = wVar2;
        for (w wVar4 = wVar; wVar4 != null; wVar4 = wVar4.b) {
            String str = wVar4.c;
            if (str != null && !str.equals(this.a)) {
                if (wVar3 == null) {
                    wVar3 = wVar4;
                } else if (!str.equals(wVar3.c)) {
                    throw new IllegalStateException("Conflicting property name definitions: '" + wVar3.c + "' (for " + wVar3.a + ") vs '" + wVar4.c + "' (for " + wVar4.a + ")");
                }
            }
        }
        return wVar3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[Property '").append(this.a).append("'; ctors: ").append(this.d).append(", field(s): ").append(this.c).append(", getter(s): ").append(this.e).append(", setter(s): ").append(this.f);
        sb.append("]");
        return sb.toString();
    }
}
