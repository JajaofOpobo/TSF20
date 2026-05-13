package com.tsf.shell.f.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class l {
    private static float a;
    private static float b;
    private static float c;
    private float f;
    private float g;
    private double e = 0.0d;
    private ArrayList<a> d = new ArrayList<>();

    public com.censivn.C3DEngine.b.f.i a(int i) {
        return null;
    }

    public com.censivn.C3DEngine.b.f.j a() {
        return null;
    }

    public l(c cVar, float f) {
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
                com.censivn.C3DEngine.b.f.i a2 = a(i2);
                a aVar = this.d.get(i2);
                aVar.a.x = b + this.g + (c * i2);
                Number3d number3d = aVar.a;
                float f = (-20.0f) * com.censivn.C3DEngine.b.b.a.c;
                aVar.d = f;
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
            com.censivn.C3DEngine.b.f.i a2 = a(i);
            if (a(a2, a2.position().x)) {
                a2.visible(true);
            } else {
                a2.visible(false);
            }
            a aVar = this.d.get(i);
            aVar.a(Double.valueOf(d), 1.0f);
            d -= 0.3490658503988659d;
            if (a2.visible() || a(a2, aVar.a.x)) {
                a2.position().x += (aVar.c - a2.position().x) * 0.1f;
                a2.position().y += (aVar.d - a2.position().y) * 0.1f;
                Number3d scale = a2.scale();
                scale.x = ((aVar.b - a2.scale().x) * 0.1f) + scale.x;
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
        this.d.add(new a());
    }

    private void e() {
        this.d.remove(this.d.size() - 1);
    }

    private boolean a(com.censivn.C3DEngine.b.f.i iVar, float f) {
        return (iVar.minX() + f) + a().position().x <= ((float) com.censivn.C3DEngine.b.b.a.A) && (iVar.maxX() + f) + a().position().x >= ((float) com.censivn.C3DEngine.b.b.a.z);
    }

    private float f() {
        float numChildren = c * (a().numChildren() - 1);
        if (numChildren < com.censivn.C3DEngine.b.b.a.D - com.tsf.shell.manager.o.b.a.T) {
            return (-numChildren) / 2.0f;
        }
        return com.censivn.C3DEngine.b.b.a.z + a;
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        d();
    }

    public void b(com.censivn.C3DEngine.b.f.i iVar) {
        e();
    }

    /* loaded from: classes.dex */
    public class a {
        public float c;
        public float d;
        public float b = 1.0f;
        public Number3d a = new Number3d();

        public a() {
        }

        public void a(Double d, float f) {
            double sin = Math.sin(d.doubleValue());
            Double.valueOf(d.doubleValue() + 0.03490658503988659d);
            this.b = ((float) ((0.2f * sin) + (f - 0.2f))) * l.this.f;
            this.c = (float) (this.a.x - ((sin * 10.0d) * com.censivn.C3DEngine.b.b.a.c));
        }
    }
}
