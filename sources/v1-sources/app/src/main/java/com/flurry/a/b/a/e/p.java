package com.flurry.a.b.a.e;

import com.flurry.a.b.a.d.aw;
import com.flurry.a.b.a.d.az;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class p extends f {
    protected LinkedHashMap c;

    public p(l lVar) {
        super(lVar);
        this.c = null;
    }

    @Override // com.flurry.a.b.a.h
    public final boolean b() {
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
        return this.c == null ? g.a() : this.c.values().iterator();
    }

    @Override // com.flurry.a.b.a.h
    public final com.flurry.a.b.a.h a(String str) {
        if (this.c != null) {
            return (com.flurry.a.b.a.h) this.c.get(str);
        }
        return null;
    }

    @Override // com.flurry.a.b.a.h
    public final Iterator r() {
        return this.c == null ? h.a() : this.c.keySet().iterator();
    }

    @Override // com.flurry.a.b.a.e.b, com.flurry.a.b.a.d.aa
    public final void a(com.flurry.a.b.a.e eVar, aw awVar) {
        eVar.d();
        if (this.c != null) {
            for (Map.Entry entry : this.c.entrySet()) {
                eVar.a((String) entry.getKey());
                ((b) entry.getValue()).a(eVar, awVar);
            }
        }
        eVar.e();
    }

    @Override // com.flurry.a.b.a.d.ab
    public final void a(com.flurry.a.b.a.e eVar, aw awVar, az azVar) {
        azVar.b(this, eVar);
        if (this.c != null) {
            for (Map.Entry entry : this.c.entrySet()) {
                eVar.a((String) entry.getKey());
                ((b) entry.getValue()).a(eVar, awVar);
            }
        }
        azVar.e(this, eVar);
    }

    public final com.flurry.a.b.a.h a(String str, com.flurry.a.b.a.h hVar) {
        if (hVar == null) {
            hVar = s();
        }
        if (this.c == null) {
            this.c = new LinkedHashMap();
        }
        return (com.flurry.a.b.a.h) this.c.put(str, hVar);
    }

    @Override // com.flurry.a.b.a.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            p pVar = (p) obj;
            if (pVar.p() != p()) {
                return false;
            }
            if (this.c != null) {
                for (Map.Entry entry : this.c.entrySet()) {
                    String str = (String) entry.getKey();
                    com.flurry.a.b.a.h hVar = (com.flurry.a.b.a.h) entry.getValue();
                    com.flurry.a.b.a.h a = pVar.a(str);
                    if (a == null || !a.equals(hVar)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.c == null) {
            return -1;
        }
        return this.c.hashCode();
    }

    @Override // com.flurry.a.b.a.h
    public String toString() {
        StringBuilder sb = new StringBuilder((p() << 4) + 32);
        sb.append("{");
        if (this.c != null) {
            int i = 0;
            for (Map.Entry entry : this.c.entrySet()) {
                if (i > 0) {
                    sb.append(",");
                }
                r.a(sb, (String) entry.getKey());
                sb.append(':');
                sb.append(((com.flurry.a.b.a.h) entry.getValue()).toString());
                i++;
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
