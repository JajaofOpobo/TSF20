package com.flurry.a.b.a.d.f.a;

import com.flurry.a.b.a.d.ay;
import com.flurry.a.b.a.d.w;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class o extends ay {
    protected final com.flurry.a.b.a.d.f.c b;
    protected final com.flurry.a.b.a.g.a c;
    protected final com.flurry.a.b.a.d.f d;
    protected final com.flurry.a.b.a.g.a e;
    protected final HashMap f = new HashMap();
    protected w g;

    protected o(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f.c cVar, com.flurry.a.b.a.d.f fVar, Class cls) {
        this.c = aVar;
        this.b = cVar;
        this.d = fVar;
        if (cls == null) {
            this.e = null;
        } else {
            this.e = aVar.g(cls);
        }
    }

    public final String c() {
        return this.c.p().getName();
    }

    @Override // com.flurry.a.b.a.d.ay
    public String b() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[').append(getClass().getName());
        sb.append("; base-type:").append(this.c);
        sb.append("; id-resolver: ").append(this.b);
        sb.append(']');
        return sb.toString();
    }

    protected final w a(com.flurry.a.b.a.d.p pVar, String str) {
        w wVar;
        synchronized (this.f) {
            wVar = (w) this.f.get(str);
            if (wVar == null) {
                com.flurry.a.b.a.g.a a = this.b.a(str);
                if (a == null) {
                    if (this.e == null) {
                        throw pVar.a(this.c, str);
                    }
                    wVar = a(pVar);
                } else {
                    if (this.c != null && this.c.getClass() == a.getClass()) {
                        a = this.c.f(a.p());
                    }
                    wVar = pVar.b().a(pVar.a(), a, this.d);
                }
                this.f.put(str, wVar);
            }
        }
        return wVar;
    }

    protected final w a(com.flurry.a.b.a.d.p pVar) {
        w wVar;
        if (this.e == null) {
            return null;
        }
        synchronized (this.e) {
            if (this.g == null) {
                this.g = pVar.b().a(pVar.a(), this.e, this.d);
            }
            wVar = this.g;
        }
        return wVar;
    }
}
