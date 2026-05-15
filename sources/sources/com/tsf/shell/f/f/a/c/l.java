package com.tsf.shell.f.f.a.c;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
                com.censivn.C3DEngine.b.f.i iVarA = a(i2);
                a aVar = this.d.get(i2);
                aVar.a.x = b + this.g + (c * i2);
                Number3d number3d = aVar.a;
                float f = (-20.0f) * com.censivn.C3DEngine.b.b.a.c;
                aVar.d = f;
                number3d.y = f;
                iVarA.setAnimationObjectState(true);
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
            com.censivn.C3DEngine.b.f.i iVarA = a(i);
            if (a(iVarA, iVarA.position().x)) {
                iVarA.visible(true);
            } else {
                iVarA.visible(false);
            }
            a aVar = this.d.get(i);
            aVar.a(Double.valueOf(d), 1.0f);
            d -= 0.3490658503988659d;
            if (iVarA.visible() || a(iVarA, aVar.a.x)) {
                iVarA.position().x += (aVar.c - iVarA.position().x) * 0.1f;
                iVarA.position().y += (aVar.d - iVarA.position().y) * 0.1f;
                Number3d number3dScale = iVarA.scale();
                number3dScale.x = ((aVar.b - iVarA.scale().x) * 0.1f) + number3dScale.x;
                iVarA.scale().y = iVarA.scale().x;
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
        float fNumChildren = c * (a().numChildren() - 1);
        if (fNumChildren < com.censivn.C3DEngine.b.b.a.D - com.tsf.shell.manager.o.b.a.T) {
            return (-fNumChildren) / 2.0f;
        }
        return com.censivn.C3DEngine.b.b.a.z + a;
    }

    public void a(com.censivn.C3DEngine.b.f.i iVar) {
        d();
    }

    public void b(com.censivn.C3DEngine.b.f.i iVar) {
        e();
    }

    public class a {
        public float c;
        public float d;
        public float b = 1.0f;
        public Number3d a = new Number3d();

        public a() {
        }

        public void a(Double d, float f) {
            double dSin = Math.sin(d.doubleValue());
            Double.valueOf(d.doubleValue() + 0.03490658503988659d);
            this.b = ((float) ((((double) 0.2f) * dSin) + ((double) (f - 0.2f)))) * l.this.f;
            this.c = (float) (((double) this.a.x) - ((dSin * 10.0d) * ((double) com.censivn.C3DEngine.b.b.a.c)));
        }
    }
}
