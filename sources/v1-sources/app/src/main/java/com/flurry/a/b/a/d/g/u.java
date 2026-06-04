package com.flurry.a.b.a.d.g;

import com.flurry.a.b.a.d.at;
import com.flurry.a.b.a.d.au;
import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;
import com.flurry.a.b.a.d.g.b.as;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public final class u extends aw {
    public static final com.flurry.a.b.a.d.ac d = new com.flurry.a.b.a.d.g.a.a("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final com.flurry.a.b.a.d.ac e = new as();
    public static final com.flurry.a.b.a.d.ac f = new com.flurry.a.b.a.d.g.a.n();
    protected final au g;
    protected final com.flurry.a.b.a.d.g.a.l h;
    protected final com.flurry.a.b.a.d.i.y i;
    protected com.flurry.a.b.a.d.ac j;
    protected com.flurry.a.b.a.d.ac k;
    protected com.flurry.a.b.a.d.ac l;
    protected com.flurry.a.b.a.d.ac m;
    protected final com.flurry.a.b.a.d.g.a.k n;
    protected DateFormat o;

    public u() {
        super(null);
        this.j = f;
        this.l = com.flurry.a.b.a.d.g.b.p.a;
        this.m = d;
        this.g = null;
        this.h = new com.flurry.a.b.a.d.g.a.l();
        this.n = null;
        this.i = new com.flurry.a.b.a.d.i.y();
    }

    private u(com.flurry.a.b.a.d.as asVar, u uVar, au auVar) {
        super(asVar);
        this.j = f;
        this.l = com.flurry.a.b.a.d.g.b.p.a;
        this.m = d;
        if (asVar == null) {
            throw new NullPointerException();
        }
        this.g = auVar;
        this.h = uVar.h;
        this.j = uVar.j;
        this.k = uVar.k;
        this.l = uVar.l;
        this.m = uVar.m;
        this.i = uVar.i;
        this.n = this.h.a();
    }

    @Override // com.flurry.a.b.a.d.aw
    public final void a(com.flurry.a.b.a.d.as asVar, com.flurry.a.b.a.e eVar, Object obj, au auVar) {
        com.flurry.a.b.a.d.ac b;
        boolean a;
        if (auVar == null) {
            throw new IllegalArgumentException("Can not pass null serializerFactory");
        }
        u uVar = new u(asVar, this, auVar);
        if (uVar.getClass() != getClass()) {
            throw new IllegalStateException("Broken serializer provider: createInstance returned instance of type " + uVar.getClass() + "; blueprint of type " + getClass());
        }
        if (obj == null) {
            b = uVar.l;
            a = false;
        } else {
            b = uVar.b(obj.getClass(), (com.flurry.a.b.a.d.f) null);
            a = uVar.b.a(at.WRAP_ROOT_VALUE);
            if (a) {
                eVar.d();
                eVar.a(uVar.i.a(obj.getClass(), uVar.b));
            }
        }
        try {
            b.a(obj, eVar, uVar);
            if (a) {
                eVar.e();
            }
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            String message = e3.getMessage();
            if (message == null) {
                message = "[no message for " + e3.getClass().getName() + "]";
            }
            throw new com.flurry.a.b.a.d.y(message, e3);
        }
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac a(Class cls, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.ac b = this.n.b(cls);
        return (b == null && (b = this.h.a(cls)) == null && (b = this.h.a(this.b.e(cls))) == null && (b = c(cls, fVar)) == null) ? this.j : a(b);
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.ac b = this.n.b(aVar);
        if (b != null || (b = this.h.a(aVar)) != null || (b = c(aVar, fVar)) != null) {
            return a(b);
        }
        aVar.p();
        return this.j;
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac b(Class cls, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.ac a = this.n.a(cls);
        if (a == null && (a = this.h.b(cls)) == null) {
            com.flurry.a.b.a.d.ac a2 = a(cls, fVar);
            az b = this.g.b(this.b, this.b.e(cls), fVar);
            a = b != null ? new v(b, a2) : a2;
            this.h.a(cls, a);
        }
        return a;
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac b(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        com.flurry.a.b.a.d.ac a = this.n.a(aVar);
        if (a == null) {
            com.flurry.a.b.a.d.ac b = this.h.b(aVar);
            if (b == null) {
                com.flurry.a.b.a.d.ac a2 = a(aVar, fVar);
                az b2 = this.g.b(this.b, aVar, fVar);
                return b2 != null ? new v(b2, a2) : a2;
            }
            return b;
        }
        return a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.g.a aVar) {
        com.flurry.a.b.a.d.ac a = this.g.a(this.b, aVar);
        com.flurry.a.b.a.d.ac acVar = a;
        if (a == null) {
            if (this.k == null) {
                acVar = com.flurry.a.b.a.d.g.b.at.a(aVar);
            } else {
                acVar = this.k;
            }
        }
        if (acVar instanceof com.flurry.a.b.a.d.m) {
            com.flurry.a.b.a.d.as asVar = this.b;
            return ((com.flurry.a.b.a.d.m) acVar).a();
        }
        return acVar;
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac c() {
        return this.m;
    }

    @Override // com.flurry.a.b.a.d.aw
    public final com.flurry.a.b.a.d.ac d() {
        return this.l;
    }

    @Override // com.flurry.a.b.a.d.aw
    public final void a(long j, com.flurry.a.b.a.e eVar) {
        if (a(at.WRITE_DATES_AS_TIMESTAMPS)) {
            eVar.a(j);
            return;
        }
        if (this.o == null) {
            this.o = (DateFormat) this.b.o().clone();
        }
        eVar.b(this.o.format(new Date(j)));
    }

    @Override // com.flurry.a.b.a.d.aw
    public final void a(Date date, com.flurry.a.b.a.e eVar) {
        if (a(at.WRITE_DATES_AS_TIMESTAMPS)) {
            eVar.a(date.getTime());
            return;
        }
        if (this.o == null) {
            this.o = (DateFormat) this.b.o().clone();
        }
        eVar.b(this.o.format(date));
    }

    @Override // com.flurry.a.b.a.d.aw
    public final void b(long j, com.flurry.a.b.a.e eVar) {
        if (a(at.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            eVar.a(String.valueOf(j));
            return;
        }
        if (this.o == null) {
            this.o = (DateFormat) this.b.o().clone();
        }
        eVar.a(this.o.format(new Date(j)));
    }

    @Override // com.flurry.a.b.a.d.aw
    public final void b(Date date, com.flurry.a.b.a.e eVar) {
        if (a(at.WRITE_DATE_KEYS_AS_TIMESTAMPS)) {
            eVar.a(String.valueOf(date.getTime()));
            return;
        }
        if (this.o == null) {
            this.o = (DateFormat) this.b.o().clone();
        }
        eVar.a(this.o.format(date));
    }

    private com.flurry.a.b.a.d.ac c(Class cls, com.flurry.a.b.a.d.f fVar) {
        try {
            com.flurry.a.b.a.d.ac d2 = d(this.b.e(cls), fVar);
            if (d2 != null) {
                this.h.a(cls, d2, this);
            }
            return d2;
        } catch (IllegalArgumentException e2) {
            throw new com.flurry.a.b.a.d.y(e2.getMessage(), null, e2);
        }
    }

    private com.flurry.a.b.a.d.ac c(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        try {
            com.flurry.a.b.a.d.ac d2 = d(aVar, fVar);
            if (d2 != null) {
                this.h.a(aVar, d2, this);
            }
            return d2;
        } catch (IllegalArgumentException e2) {
            throw new com.flurry.a.b.a.d.y(e2.getMessage(), null, e2);
        }
    }

    private com.flurry.a.b.a.d.ac d(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.f fVar) {
        return this.g.a(this.b, aVar, fVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private com.flurry.a.b.a.d.ac a(com.flurry.a.b.a.d.ac r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.flurry.a.b.a.d.m
            if (r0 != 0) goto L5
        L4:
            return r3
        L5:
            r0 = r3
            com.flurry.a.b.a.d.m r0 = (com.flurry.a.b.a.d.m) r0
            com.flurry.a.b.a.d.as r1 = r2.b
            com.flurry.a.b.a.d.ac r1 = r0.a()
            if (r1 == r3) goto L1c
            boolean r0 = r1 instanceof com.flurry.a.b.a.d.ar
            if (r0 == 0) goto L1a
            r0 = r1
            com.flurry.a.b.a.d.ar r0 = (com.flurry.a.b.a.d.ar) r0
            r0.a(r2)
        L1a:
            r3 = r1
            goto L4
        L1c:
            r1 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.a.b.a.d.g.u.a(com.flurry.a.b.a.d.ac):com.flurry.a.b.a.d.ac");
    }
}
