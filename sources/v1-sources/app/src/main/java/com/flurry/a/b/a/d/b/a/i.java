package com.flurry.a.b.a.d.b.a;

import com.flurry.a.b.a.d.b.v;
import com.flurry.a.b.a.d.w;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {
    protected final v a;
    protected final HashMap b = new HashMap();
    protected Object[] c;
    protected final com.flurry.a.b.a.d.b.k[] d;

    public i(v vVar) {
        Object obj;
        com.flurry.a.b.a.d.b.k[] kVarArr = null;
        this.a = vVar;
        com.flurry.a.b.a.d.b.k[] k = vVar.k();
        int length = k.length;
        Object[] objArr = null;
        for (int i = 0; i < length; i++) {
            com.flurry.a.b.a.d.b.k kVar = k[i];
            this.b.put(kVar.c(), kVar);
            if (kVar.a().t()) {
                objArr = objArr == null ? new Object[length] : objArr;
                Class p = kVar.a().p();
                if (p == Integer.TYPE) {
                    obj = 0;
                } else if (p == Long.TYPE) {
                    obj = 0L;
                } else if (p == Boolean.TYPE) {
                    obj = Boolean.FALSE;
                } else if (p == Double.TYPE) {
                    obj = Double.valueOf(0.0d);
                } else if (p == Float.TYPE) {
                    obj = Float.valueOf(0.0f);
                } else if (p == Byte.TYPE) {
                    obj = (byte) 0;
                } else if (p == Short.TYPE) {
                    obj = (short) 0;
                } else {
                    if (p != Character.TYPE) {
                        throw new IllegalArgumentException("Class " + p.getName() + " is not a primitive type");
                    }
                    obj = (char) 0;
                }
                objArr[i] = obj;
            }
            if (kVar.j() != null) {
                kVarArr = kVarArr == null ? new com.flurry.a.b.a.d.b.k[length] : kVarArr;
                kVarArr[i] = kVar;
            }
        }
        this.c = objArr;
        this.d = kVarArr;
    }

    public final Collection a() {
        return this.b.values();
    }

    public final com.flurry.a.b.a.d.b.k a(String str) {
        return (com.flurry.a.b.a.d.b.k) this.b.get(str);
    }

    public final void a(com.flurry.a.b.a.d.b.k kVar, w wVar) {
        com.flurry.a.b.a.d.b.k a = kVar.a(wVar);
        this.b.put(a.c(), a);
        Object b = wVar.b();
        if (b != null) {
            if (this.c == null) {
                this.c = new Object[this.b.size()];
            }
            this.c[a.i()] = b;
        }
    }

    public final n a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        n nVar = new n(jVar, pVar, this.b.size());
        if (this.d != null) {
            com.flurry.a.b.a.d.b.k[] kVarArr = this.d;
            int length = kVarArr.length;
            for (int i = 0; i < length; i++) {
                com.flurry.a.b.a.d.b.k kVar = kVarArr[i];
                if (kVar != null) {
                    nVar.c[i] = nVar.b.a(kVar.j());
                }
            }
        }
        return nVar;
    }

    public final Object a(n nVar) {
        Object obj;
        v vVar = this.a;
        Object[] objArr = this.c;
        if (objArr != null) {
            int length = nVar.c.length;
            for (int i = 0; i < length; i++) {
                if (nVar.c[i] == null && (obj = objArr[i]) != null) {
                    nVar.c[i] = obj;
                }
            }
        }
        Object a = vVar.a(nVar.c);
        for (j a2 = nVar.a(); a2 != null; a2 = a2.a) {
            a2.a(a);
        }
        return a;
    }
}
