package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class h extends k {
    private int a;
    private int b;
    private int c;
    private ArrayList<ArrayList<a>> d;
    private ArrayList<Number3d> e;

    public h(int i, boolean z) {
        super(i, b.d.drawer_transition_effect_round, z);
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5;
        this.a = i;
        this.e = arrayList;
        this.b = arrayList.size();
        this.c = i3;
        if (this.d == null) {
            this.d = new ArrayList<>();
        } else {
            this.d.clear();
        }
        if (i > i2) {
            i5 = (int) ((i2 / 2) - (68.0f * com.censivn.C3DEngine.b.b.a.a));
        } else {
            i5 = (int) ((i / 2) - (68.0f * com.censivn.C3DEngine.b.b.a.a));
        }
        for (int i6 = 1; i6 < this.b + 1; i6++) {
            ArrayList<a> arrayList2 = new ArrayList<>();
            double d = 6.283185307179586d / i6;
            float f = 360 / i6;
            int i7 = this.c - 1;
            for (int i8 = 0; i8 < i6; i8++) {
                a aVar = new a();
                aVar.a = (float) (Math.sin(i7 * d) * i5);
                aVar.b = (float) (Math.cos(i7 * d) * i5);
                aVar.c = 180.0f - (i7 * f);
                arrayList2.add(aVar);
                i7--;
                if (i7 == -1) {
                    i7 = i6 - 1;
                }
            }
            this.d.add(arrayList2);
        }
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.tsf.shell.f.f.a.a aVar, float f) {
        a aVar2;
        Number3d number3d;
        int numChildren = aVar.numChildren();
        aVar.position().x = this.a * f;
        if (Math.abs(f) > 0.5d) {
            aVar.rotation().z = (-(f - 0.5f)) * 2.0f * 180.0f;
        } else {
            aVar.rotation().z = 0.0f;
        }
        float abs = Math.abs(f * 2.0f);
        float f2 = abs > 1.0f ? 1.0f : abs;
        if (numChildren != 0) {
            ArrayList<a> arrayList = this.d.get(numChildren - 1);
            for (int i = 0; i < numChildren; i++) {
                com.censivn.C3DEngine.b.f.i childAt = aVar.getChildAt(i);
                if (i >= this.b) {
                    aVar2 = arrayList.get(this.b - 1);
                    number3d = this.e.get(this.b - 1);
                } else {
                    aVar2 = arrayList.get(i);
                    number3d = this.e.get(i);
                }
                Number3d number3d2 = number3d;
                childAt.position().x = number3d2.x + ((aVar2.a - number3d2.x) * f2);
                childAt.position().y = ((aVar2.b - number3d2.y) * f2) + number3d2.y;
                childAt.rotation().z = aVar2.c * f2;
            }
        }
    }

    /* loaded from: classes.dex */
    class a {
        float a;
        float b;
        float c;

        a() {
        }
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void c(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void d(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void e(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void f(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.censivn.C3DEngine.b.f.j jVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void g(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void h(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void a(com.tsf.shell.f.f.a.a aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.k
    public void b(com.tsf.shell.f.f.a.a aVar) {
    }
}
