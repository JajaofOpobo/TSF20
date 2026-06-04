package com.flurry.a.a.a.c.a;

/* loaded from: classes.dex */
public class e extends a {
    static final /* synthetic */ boolean d;
    private final f e;

    static {
        d = !e.class.desiredAssertionStatus();
    }

    public e(g gVar, b bVar, f fVar) {
        super(gVar, bVar);
        this.e = fVar;
    }

    private void a(int i) {
        while (i < this.c) {
            g gVar = this.b[this.c - 1];
            if (gVar.a != p.TERMINAL) {
                if (gVar.a == p.IMPLICIT_ACTION || gVar.a == p.EXPLICIT_ACTION) {
                    this.e.s();
                } else {
                    this.c--;
                    b(gVar);
                }
            } else {
                this.e.t();
            }
        }
    }

    public final void f() {
        int i = this.c;
        g[] gVarArr = this.b;
        int i2 = this.c - 1;
        this.c = i2;
        g gVar = gVarArr[i2];
        if (!d && gVar.a != p.REPEATER) {
            throw new AssertionError();
        }
        b(gVar);
        a(i);
    }

    public final void d(g gVar) {
        int i = this.c;
        c(gVar);
        a(i);
    }
}
