package com.flurry.a.b.a.d.g.a;

import com.flurry.a.b.a.d.ac;
import com.flurry.a.b.a.d.ar;
import com.flurry.a.b.a.d.aw;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l {
    private HashMap a = new HashMap(64);
    private k b = null;

    public final k a() {
        k kVar;
        synchronized (this) {
            kVar = this.b;
            if (kVar == null) {
                kVar = k.a(this.a);
                this.b = kVar;
            }
        }
        return kVar.a();
    }

    public final ac a(Class cls) {
        ac acVar;
        synchronized (this) {
            acVar = (ac) this.a.get(new m(cls, false));
        }
        return acVar;
    }

    public final ac a(com.flurry.a.b.a.g.a aVar) {
        ac acVar;
        synchronized (this) {
            acVar = (ac) this.a.get(new m(aVar, false));
        }
        return acVar;
    }

    public final ac b(com.flurry.a.b.a.g.a aVar) {
        ac acVar;
        synchronized (this) {
            acVar = (ac) this.a.get(new m(aVar, true));
        }
        return acVar;
    }

    public final ac b(Class cls) {
        ac acVar;
        synchronized (this) {
            acVar = (ac) this.a.get(new m(cls, true));
        }
        return acVar;
    }

    public final void a(Class cls, ac acVar) {
        synchronized (this) {
            if (this.a.put(new m(cls, true), acVar) == null) {
                this.b = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Class cls, ac acVar, aw awVar) {
        synchronized (this) {
            if (this.a.put(new m(cls, false), acVar) == null) {
                this.b = null;
            }
            if (acVar instanceof ar) {
                ((ar) acVar).a(awVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.flurry.a.b.a.g.a aVar, ac acVar, aw awVar) {
        synchronized (this) {
            if (this.a.put(new m(aVar, false), acVar) == null) {
                this.b = null;
            }
            if (acVar instanceof ar) {
                ((ar) acVar).a(awVar);
            }
        }
    }
}
