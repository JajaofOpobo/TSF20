package com.censivn.C3DEngine.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.e.a;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class g {
    protected ArrayList<h> a;
    protected int b;
    protected ArrayList<Number3d> c;
    protected ArrayList<Uv> d;
    protected ArrayList<Number3d> e;
    public String f;

    public g() {
        this.b = 0;
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = "";
        this.a = new ArrayList<>();
    }

    public g(ArrayList<Number3d> arrayList, ArrayList<Uv> arrayList2, ArrayList<Number3d> arrayList3) {
        this.b = 0;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = "";
        this.a = new ArrayList<>();
    }

    public com.censivn.C3DEngine.b.f.i a(HashMap<String, a.b> hashMap, a.c cVar) {
        j jVar = new j(this.b * 3, this.b);
        jVar.name(this.f);
        a(jVar, hashMap, cVar);
        return jVar;
    }

    private void a(com.censivn.C3DEngine.b.f.i iVar, HashMap<String, a.b> hashMap, a.c cVar) {
        int size = this.a.size();
        boolean c = cVar.c();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            h hVar = this.a.get(i);
            a.C0039a b = cVar.b(hVar.h);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= hVar.e) {
                    break;
                }
                Number3d number3d = this.c.get(hVar.b[i4]);
                Uv m6clone = hVar.f ? this.d.get(hVar.c[i4]).m6clone() : new Uv();
                Number3d number3d2 = hVar.g ? this.e.get(hVar.d[i4]) : new Number3d();
                a.b bVar = hashMap.get(hVar.h);
                Color4 color4 = new Color4(255, 255, 0, 255);
                if (bVar != null && bVar.c != null) {
                    color4.r = bVar.c.r;
                    color4.g = bVar.c.g;
                    color4.b = bVar.c.b;
                    color4.a = bVar.c.a;
                }
                if (c && b != null) {
                    m6clone.u = b.d + (m6clone.u * b.f);
                    m6clone.v = (b.e + ((m6clone.v + 1.0f) * b.g)) - 1.0f;
                }
                m6clone.v = 1.0f + m6clone.v;
                iVar.vertices().addVertex(number3d, m6clone, number3d2, color4);
                i3 = i4 + 1;
            }
            if (hVar.e == 3) {
                iVar.faces().add(new com.censivn.C3DEngine.f.d(i2, i2 + 1, i2 + 2));
            } else if (hVar.e == 4) {
                iVar.faces().add(new com.censivn.C3DEngine.f.d(i2, i2 + 1, i2 + 3));
                iVar.faces().add(new com.censivn.C3DEngine.f.d(i2 + 1, i2 + 2, i2 + 3));
            }
            i++;
            i2 += hVar.e;
        }
        if (c) {
            iVar.textures().addElement(cVar.e());
        }
        a();
    }

    public void a(h hVar) {
        Number3d number3d = this.c.get(hVar.b[0]);
        Number3d subtract = Number3d.subtract(this.c.get(hVar.b[1]), number3d);
        Number3d subtract2 = Number3d.subtract(this.c.get(hVar.b[2]), number3d);
        Number3d number3d2 = new Number3d();
        number3d2.x = (subtract.y * subtract2.z) - (subtract.z * subtract2.y);
        number3d2.y = -((subtract2.z * subtract.x) - (subtract2.x * subtract.z));
        number3d2.z = (subtract.x * subtract2.y) - (subtract2.x * subtract.y);
        double sqrt = Math.sqrt((number3d2.x * number3d2.x) + (number3d2.y * number3d2.y) + (number3d2.z * number3d2.z));
        number3d2.x = (float) (number3d2.x / sqrt);
        number3d2.y = (float) (number3d2.y / sqrt);
        number3d2.z = (float) (number3d2.z / sqrt);
        this.e.add(number3d2);
        int size = this.e.size() - 1;
        hVar.d = new int[3];
        hVar.d[0] = size;
        hVar.d[1] = size;
        hVar.d[2] = size;
        hVar.g = true;
    }

    protected void a() {
        this.a.clear();
    }
}
