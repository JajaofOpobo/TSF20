package com.tsf.shell.e.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n {
    private static float a;
    private static float b;
    private static float c;
    private float f;
    private float g;
    private double e = 0.0d;
    private ArrayList d = new ArrayList();

    public com.censivn.C3DEngine.b.f.j a(int i) {
        return null;
    }

    public com.censivn.C3DEngine.b.f.l a() {
        return null;
    }

    public n(c cVar, float f) {
        this.f = f;
        c = com.tsf.shell.manager.o.b.a.T / 5.0f;
        a = (com.tsf.shell.manager.o.b.a.T / 4.0f) * 3.0f;
        b = 0.0f;
    }

    public void a(float f) {
        this.g = f;
    }

    public void b() {
        b = f();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.d.size()) {
                com.censivn.C3DEngine.b.f.j a2 = a(i2);
                o oVar = (o) this.d.get(i2);
                oVar.a.x = b + this.g + (c * i2);
                Number3d number3d = oVar.a;
                float f = (-20.0f) * com.censivn.C3DEngine.b.b.a.c;
                oVar.d = f;
                number3d.y = f;
                a2.setAnimationObjectState(true);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void c() {
        int size = this.d.size();
        double d = this.e;
        for (int i = 0; i < size; i++) {
            com.censivn.C3DEngine.b.f.j a2 = a(i);
            if (a(a2, a2.position().x)) {
                a2.visible(true);
            } else {
                a2.visible(false);
            }
            o oVar = (o) this.d.get(i);
            oVar.a(Double.valueOf(d), 1.0f);
            d -= 0.3490658503988659d;
            if (a2.visible() || a(a2, oVar.a.x)) {
                a2.position().x += (oVar.c - a2.position().x) * 0.1f;
                a2.position().y += (oVar.d - a2.position().y) * 0.1f;
                Number3d scale = a2.scale();
                scale.x = ((oVar.b - a2.scale().x) * 0.1f) + scale.x;
                a2.scale().y = a2.scale().x;
            }
        }
        this.e += 0.08726646259971647d;
        int size2 = this.d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((size2 - i2) - 1).dispatchDraw();
        }
    }

    private void d() {
        this.d.add(new o(this));
    }

    private void e() {
        this.d.remove(this.d.size() - 1);
    }

    private boolean a(com.censivn.C3DEngine.b.f.j jVar, float f) {
        return (jVar.minX() + f) + a().position().x <= ((float) com.censivn.C3DEngine.b.b.a.A) && (jVar.maxX() + f) + a().position().x >= ((float) com.censivn.C3DEngine.b.b.a.z);
    }

    private float f() {
        float numChildren = c * (a().numChildren() - 1);
        if (numChildren < com.censivn.C3DEngine.b.b.a.D - com.tsf.shell.manager.o.b.a.T) {
            return (-numChildren) / 2.0f;
        }
        return com.censivn.C3DEngine.b.b.a.z + a;
    }

    public void a(com.censivn.C3DEngine.b.f.j jVar) {
        d();
    }

    public void b(com.censivn.C3DEngine.b.f.j jVar) {
        e();
    }
}
