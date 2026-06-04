package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends f {
    protected ArrayList c;

    public a(l lVar) {
        super(lVar);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean a() {
        return true;
    }

    @Override // com.flurry.a.b.a.h
    public final int p() {
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    @Override // com.flurry.a.b.a.h
    public final Iterator q() {
        return this.c == null ? g.a() : this.c.iterator();
    }

    @Override // com.flurry.a.b.a.h
    public final com.flurry.a.b.a.h a(String str) {
        return null;
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.b();
        if (this.c != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((b) ((com.flurry.a.b.a.h) it.next())).a(eVar, awVar);
            }
        }
        eVar.c();
    }

    @Override // com.flurry.a.b.a.d.ab
    public final void a(com.flurry.a.b.a.e eVar, aw awVar, az azVar) {
        azVar.c(this, eVar);
        if (this.c != null) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((b) ((com.flurry.a.b.a.h) it.next())).a(eVar, awVar);
            }
        }
        azVar.f(this, eVar);
    }

    public final void a(com.flurry.a.b.a.h hVar) {
        if (hVar == null) {
            hVar = s();
        }
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(hVar);
    }

    @Override // com.flurry.a.b.a.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            a aVar = (a) obj;
            if (this.c == null || this.c.size() == 0) {
                return aVar.p() == 0;
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            if (aVar.p() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!((com.flurry.a.b.a.h) aVar.c.get(i)).equals(arrayList.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == null) {
            return 1;
        }
        int size = this.c.size();
        Iterator it = this.c.iterator();
        while (true) {
            int i = size;
            if (it.hasNext()) {
                com.flurry.a.b.a.h hVar = (com.flurry.a.b.a.h) it.next();
                size = hVar != null ? hVar.hashCode() ^ i : i;
            } else {
                return i;
            }
        }
    }

    @Override // com.flurry.a.b.a.h
    public final String toString() {
        StringBuilder sb = new StringBuilder((p() << 4) + 16);
        sb.append('[');
        if (this.c != null) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(((com.flurry.a.b.a.h) this.c.get(i)).toString());
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
