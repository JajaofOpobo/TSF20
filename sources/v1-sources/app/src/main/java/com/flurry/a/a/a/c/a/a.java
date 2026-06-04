package com.flurry.a.a.a.c.a;

/* loaded from: classes.dex */
public class a {
    protected final b a;
    protected g[] b = new g[5];
    protected int c;

    public a(g gVar, b bVar) {
        this.a = bVar;
        this.b[0] = gVar;
        this.c = 1;
    }

    private void f() {
        g[] gVarArr = new g[this.b.length + Math.max(this.b.length, 1024)];
        System.arraycopy(this.b, 0, gVarArr, 0, this.b.length);
        this.b = gVarArr;
    }

    public final g a(g gVar) {
        while (true) {
            g[] gVarArr = this.b;
            int i = this.c - 1;
            this.c = i;
            g gVar2 = gVarArr[i];
            if (gVar2 != gVar) {
                p pVar = gVar2.a;
                if (pVar == p.IMPLICIT_ACTION) {
                    g a = this.a.a(gVar, gVar2);
                    if (a != null) {
                        return a;
                    }
                } else {
                    if (pVar == p.TERMINAL) {
                        throw new com.flurry.a.a.a.b("Attempt to process a " + gVar + " when a " + gVar2 + " was expected.");
                    }
                    if (pVar == p.REPEATER && gVar == ((q) gVar2).z) {
                        return gVar;
                    }
                    b(gVar2);
                }
            } else {
                return gVar2;
            }
        }
    }

    public final void a() {
        while (this.c > 1) {
            g gVar = this.b[this.c - 1];
            if (gVar.a == p.IMPLICIT_ACTION) {
                this.c--;
                this.a.a(null, gVar);
            } else if (gVar.a != p.TERMINAL) {
                this.c--;
                b(gVar);
            } else {
                return;
            }
        }
    }

    public final void b() {
        while (this.c > 0) {
            g gVar = this.b[this.c - 1];
            if (gVar.a == p.IMPLICIT_ACTION && ((n) gVar).A) {
                this.c--;
                this.a.a(null, gVar);
            } else {
                return;
            }
        }
    }

    public final void b(g gVar) {
        g[] gVarArr = gVar.b;
        while (this.c + gVarArr.length > this.b.length) {
            f();
        }
        System.arraycopy(gVarArr, 0, this.b, this.c, gVarArr.length);
        this.c = gVarArr.length + this.c;
    }

    public final g c() {
        g[] gVarArr = this.b;
        int i = this.c - 1;
        this.c = i;
        return gVarArr[i];
    }

    public final g d() {
        return this.b[this.c - 1];
    }

    public final void c(g gVar) {
        if (this.c == this.b.length) {
            f();
        }
        g[] gVarArr = this.b;
        int i = this.c;
        this.c = i + 1;
        gVarArr[i] = gVar;
    }

    public final void e() {
        this.c = 1;
    }
}
