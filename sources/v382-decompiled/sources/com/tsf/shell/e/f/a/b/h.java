package com.tsf.shell.e.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends l {
    private int a;
    private int b;
    private int c;
    private ArrayList d;
    private ArrayList e;

    public h(int i, boolean z) {
        super(i, R.drawable.drawer_transition_effect_round, z);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(int i, int i2, int i3, int i4, ArrayList arrayList) {
        int i5;
        this.a = i;
        this.e = arrayList;
        this.b = arrayList.size();
        this.c = i3;
        if (this.d == null) {
            this.d = new ArrayList();
        } else {
            this.d.clear();
        }
        if (i > i2) {
            i5 = (int) ((i2 / 2) - (68.0f * com.censivn.C3DEngine.b.b.a.a));
        } else {
            i5 = (int) ((i / 2) - (68.0f * com.censivn.C3DEngine.b.b.a.a));
        }
        for (int i6 = 1; i6 < this.b + 1; i6++) {
            ArrayList arrayList2 = new ArrayList();
            double d = 6.283185307179586d / i6;
            float f = 360 / i6;
            int i7 = this.c - 1;
            for (int i8 = 0; i8 < i6; i8++) {
                i iVar = new i(this);
                iVar.a = (float) (Math.sin(i7 * d) * i5);
                iVar.b = (float) (Math.cos(i7 * d) * i5);
                iVar.c = 180.0f - (i7 * f);
                arrayList2.add(iVar);
                i7--;
                if (i7 == -1) {
                    i7 = i6 - 1;
                }
            }
            this.d.add(arrayList2);
        }
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar, float f) {
        i iVar;
        Object obj;
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
            ArrayList arrayList = (ArrayList) this.d.get(numChildren - 1);
            for (int i = 0; i < numChildren; i++) {
                com.censivn.C3DEngine.b.f.j childAt = aVar.getChildAt(i);
                if (i >= this.b) {
                    iVar = (i) arrayList.get(this.b - 1);
                    obj = this.e.get(this.b - 1);
                } else {
                    iVar = (i) arrayList.get(i);
                    obj = this.e.get(i);
                }
                Number3d number3d = (Number3d) obj;
                childAt.position().x = number3d.x + ((iVar.a - number3d.x) * f2);
                childAt.position().y = ((iVar.b - number3d.y) * f2) + number3d.y;
                childAt.rotation().z = iVar.c * f2;
            }
        }
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void c(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void d(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void e(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void f(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.censivn.C3DEngine.b.f.l lVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void g(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void h(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void b(com.tsf.shell.e.f.a.a aVar) {
    }
}
