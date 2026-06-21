package com.censivn.C3DEngine.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m {
    protected ArrayList a;
    protected int b;
    protected ArrayList c;
    protected ArrayList d;
    protected ArrayList e;
    public String f;

    public m() {
        this.b = 0;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = "";
        this.a = new ArrayList();
    }

    public m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.b = 0;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = "";
        this.a = new ArrayList();
    }

    public com.censivn.C3DEngine.b.f.j a(HashMap hashMap, d dVar) {
        com.censivn.C3DEngine.b.f.l lVar = new com.censivn.C3DEngine.b.f.l(this.b * 3, this.b);
        lVar.name(this.f);
        a(lVar, hashMap, dVar);
        return lVar;
    }

    private void a(com.censivn.C3DEngine.b.f.j jVar, HashMap hashMap, d dVar) {
        int size = this.a.size();
        boolean c = dVar.c();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            n nVar = (n) this.a.get(i);
            b b = dVar.b(nVar.h);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= nVar.e) {
                    break;
                }
                Number3d number3d = (Number3d) this.c.get(nVar.b[i4]);
                Uv m6clone = nVar.f ? ((Uv) this.d.get(nVar.c[i4])).m6clone() : new Uv();
                Number3d number3d2 = nVar.g ? (Number3d) this.e.get(nVar.d[i4]) : new Number3d();
                c cVar = (c) hashMap.get(nVar.h);
                Color4 color4 = new Color4(255, 255, 0, 255);
                if (cVar != null && cVar.c != null) {
                    color4.r = cVar.c.r;
                    color4.g = cVar.c.g;
                    color4.b = cVar.c.b;
                    color4.a = cVar.c.a;
                }
                if (c && b != null) {
                    m6clone.u = b.d + (m6clone.u * b.f);
                    m6clone.v = (b.e + ((m6clone.v + 1.0f) * b.g)) - 1.0f;
                }
                m6clone.v = 1.0f + m6clone.v;
                jVar.vertices().addVertex(number3d, m6clone, number3d2, color4);
                i3 = i4 + 1;
            }
            if (nVar.e == 3) {
                jVar.faces().add(new com.censivn.C3DEngine.f.d(i2, i2 + 1, i2 + 2));
            } else if (nVar.e == 4) {
                jVar.faces().add(new com.censivn.C3DEngine.f.d(i2, i2 + 1, i2 + 3));
                jVar.faces().add(new com.censivn.C3DEngine.f.d(i2 + 1, i2 + 2, i2 + 3));
            }
            i++;
            i2 += nVar.e;
        }
        if (c) {
            jVar.textures().addElement(dVar.e());
        }
        a();
    }

    public void a(n nVar) {
        Number3d number3d = (Number3d) this.c.get(nVar.b[0]);
        Number3d number3d2 = (Number3d) this.c.get(nVar.b[1]);
        Number3d number3d3 = (Number3d) this.c.get(nVar.b[2]);
        Number3d subtract = Number3d.subtract(number3d2, number3d);
        Number3d subtract2 = Number3d.subtract(number3d3, number3d);
        Number3d number3d4 = new Number3d();
        number3d4.x = (subtract.y * subtract2.z) - (subtract.z * subtract2.y);
        number3d4.y = -((subtract2.z * subtract.x) - (subtract2.x * subtract.z));
        number3d4.z = (subtract.x * subtract2.y) - (subtract2.x * subtract.y);
        double sqrt = Math.sqrt((number3d4.x * number3d4.x) + (number3d4.y * number3d4.y) + (number3d4.z * number3d4.z));
        number3d4.x = (float) (number3d4.x / sqrt);
        number3d4.y = (float) (number3d4.y / sqrt);
        number3d4.z = (float) (number3d4.z / sqrt);
        this.e.add(number3d4);
        int size = this.e.size() - 1;
        nVar.d = new int[3];
        nVar.d[0] = size;
        nVar.d[1] = size;
        nVar.d[2] = size;
        nVar.g = true;
    }

    protected void a() {
        this.a.clear();
    }
}
