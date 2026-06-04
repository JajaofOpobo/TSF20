package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.r;
import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements l {
    private static int a;
    private static int b;
    private static int c;
    private static ArrayList d;
    private static ArrayList e;
    private com.tsf.shell.workspace3D.h.a.e f;

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(int i, int i2, int i3, ArrayList arrayList) {
        int i4;
        a = i;
        e = arrayList;
        b = arrayList.size();
        c = i3;
        if (d == null) {
            d = new ArrayList();
        } else {
            d.clear();
        }
        if (i > i2) {
            i4 = (int) ((i2 / 2) - (68.0f * com.censivn.C3DEngine.a.a));
        } else {
            i4 = (int) ((i / 2) - (68.0f * com.censivn.C3DEngine.a.a));
        }
        int i5 = 1;
        while (true) {
            int i6 = i5;
            if (i6 < b + 1) {
                ArrayList arrayList2 = new ArrayList();
                double d2 = 6.283185307179586d / i6;
                float f = 360 / i6;
                int i7 = c - 1;
                for (int i8 = 0; i8 < i6; i8++) {
                    j jVar = new j(this);
                    jVar.a = (float) (Math.sin(i7 * d2) * i4);
                    jVar.b = (float) (Math.cos(i7 * d2) * i4);
                    jVar.c = 180.0f - (i7 * f);
                    arrayList2.add(jVar);
                    i7--;
                    if (i7 == -1) {
                        i7 = i6 - 1;
                    }
                }
                d.add(arrayList2);
                i5 = i6 + 1;
            } else {
                return;
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(com.tsf.shell.workspace3D.h.a.e eVar) {
        this.f = eVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(float f) {
        j jVar;
        Object obj;
        int aB = this.f.aB();
        this.f.L().x = a * f;
        if (Math.abs(f) > 0.5d) {
            this.f.M().z = (-(f - 0.5f)) * 2.0f * 180.0f;
        } else {
            this.f.M().z = 0.0f;
        }
        float abs = Math.abs(f * 2.0f);
        float f2 = abs > 1.0f ? 1.0f : abs;
        if (aB != 0) {
            ArrayList arrayList = (ArrayList) d.get(aB - 1);
            for (int i = 0; i < aB; i++) {
                r d2 = this.f.d(i);
                if (i >= b) {
                    jVar = (j) arrayList.get(b - 1);
                    obj = e.get(b - 1);
                } else {
                    jVar = (j) arrayList.get(i);
                    obj = e.get(i);
                }
                Number3d number3d = (Number3d) obj;
                d2.L().x = number3d.x + ((jVar.a - number3d.x) * f2);
                d2.L().y = ((jVar.b - number3d.y) * f2) + number3d.y;
                d2.M().z = jVar.c * f2;
            }
        }
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final l a() {
        return new i();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void b() {
        this.f = null;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void c() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void d() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void e() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(v vVar) {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void f() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void g() {
    }
}
