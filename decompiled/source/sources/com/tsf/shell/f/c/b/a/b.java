package com.tsf.shell.f.c.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.shell.f.c.b.a.a;
import com.tsf.shell.f.c.b.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements a {
    private a.C0084a a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private int i;
    private e j;
    private com.tsf.shell.manager.o.a k;

    public b(e eVar, com.tsf.shell.manager.o.a aVar) {
        this.j = eVar;
        this.k = aVar;
        this.b = aVar.H;
        this.c = aVar.H / 2.0f;
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public void a(i iVar) {
        iVar.setAABBPX((-this.d) / 2.0f, -com.censivn.C3DEngine.b.b.a.g, 0.0f, this.d / 2.0f, com.censivn.C3DEngine.b.b.a.h + (com.censivn.C3DEngine.b.b.a.g / 2.0f), 0.0f);
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public void a(float f, float f2, float f3, float f4) {
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        float f5 = (f - f2) - f3;
        int i = 1;
        while (true) {
            float a = f5 / a(i);
            if (a > 0.4f) {
                this.h = a;
                this.i = i;
                i++;
            } else {
                c();
                return;
            }
        }
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public void a(ArrayList<com.tsf.shell.f.c.b.b> arrayList, int i) {
        float a = a(i);
        float f = (this.d - this.e) - this.f;
        float f2 = f / a;
        if (f2 > 0.93f) {
            f2 = 0.93f;
        }
        float f3 = f2 < this.h ? this.h : f2;
        float f4 = com.tsf.shell.f.i.b.d.b.l.c().folder.nameTextFormat.auto ? -this.k.Y : (-(com.tsf.shell.f.i.b.d.b.m.f + com.tsf.shell.f.i.b.d.b.m.h)) / 2.0f;
        float f5 = -this.k.Y;
        if (f3 == 0.93f) {
            float f6 = f / i;
            float f7 = f6 / 2.0f;
            float f8 = ((-this.d) / 2.0f) + this.e + f7;
            for (int i2 = 0; i2 < i; i2++) {
                com.tsf.shell.f.c.b.b bVar = arrayList.get(i2);
                bVar.c = f8;
                bVar.a = f8;
                bVar.b = f5;
                bVar.d = f4;
                bVar.h = (bVar.a - this.c) - f7;
                bVar.g = bVar.a + this.c + f7;
                bVar.e = 0.0f;
                bVar.k = 255.0f;
                bVar.f = f3;
                bVar.j = false;
                f8 = bVar.a + f6;
            }
            return;
        }
        float f9 = this.g * f3;
        float f10 = f9 / 2.0f;
        int i3 = (i / this.i) + 1;
        int i4 = i % this.i == 0 ? i3 - 1 : i3;
        for (int i5 = 0; i5 < i4; i5++) {
            float f11 = (this.d * i5) + ((-this.d) / 2.0f) + this.e;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = (this.i * i5) + i6;
                if (i7 > i - 1) {
                    break;
                }
                com.tsf.shell.f.c.b.b bVar2 = arrayList.get(i7);
                float f12 = f11 + (this.c * f3);
                bVar2.c = f12;
                bVar2.a = f12;
                bVar2.b = f5 * f3;
                bVar2.d = f4 * f3;
                bVar2.h = (bVar2.a - (this.c * f3)) - f10;
                bVar2.g = bVar2.a + (this.c * f3) + f10;
                bVar2.e = 0.0f;
                if (i5 > 0) {
                    bVar2.k = 0.0f;
                } else {
                    bVar2.k = 255.0f;
                }
                bVar2.f = f3;
                bVar2.f = f3;
                bVar2.j = false;
                f11 = bVar2.a + (this.c * f3) + f9;
            }
        }
    }

    public float a(int i) {
        return (i * this.b) + ((i - 1) * this.g);
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public int a() {
        return this.i;
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public a.b a(Number3d number3d, ArrayList<com.tsf.shell.f.c.b.b> arrayList, int i) {
        a.b bVar = a.b.c;
        float f = number3d.x;
        int size = arrayList.size();
        if (i == -1) {
            for (int i2 = 0; i2 < size; i2++) {
                if (f < arrayList.get(i2).a) {
                    bVar.a = i2;
                    a(number3d, arrayList, bVar);
                    return bVar;
                }
            }
            bVar.a = size;
            a(number3d, arrayList, bVar);
            return bVar;
        }
        for (int i3 = 0; i3 < size; i3++) {
            com.tsf.shell.f.c.b.b bVar2 = arrayList.get(i3);
            if (i != i3 && f <= bVar2.a) {
                if (i3 > i) {
                    bVar.a = i3 - 1;
                    a(number3d, arrayList, bVar);
                    return bVar;
                } else {
                    bVar.a = i3;
                    a(number3d, arrayList, bVar);
                    return bVar;
                }
            }
        }
        bVar.a = size - 1;
        a(number3d, arrayList, bVar);
        return bVar;
    }

    private void a(Number3d number3d, ArrayList<com.tsf.shell.f.c.b.b> arrayList, a.b bVar) {
        int size = arrayList.size();
        float f = number3d.x;
        bVar.b = 0;
        for (int i = 0; i < size; i++) {
            com.tsf.shell.f.c.b.b bVar2 = arrayList.get(i);
            if (f >= bVar2.h && f <= bVar2.g) {
                bVar.b = i;
            }
        }
    }

    private void c() {
        if (this.a == null) {
            this.a = new a.C0084a();
        }
        this.a.e = 0.0f;
        this.a.f = com.censivn.C3DEngine.b.b.a.g / 2;
        this.a.i = 0.0f;
        this.a.j = (-com.censivn.C3DEngine.b.b.a.g) / 2;
        this.a.g = 0.0f;
        this.a.h = com.censivn.C3DEngine.b.b.a.g + com.censivn.C3DEngine.b.b.a.h;
        this.a.k = 0.0f;
        this.a.l = com.censivn.C3DEngine.b.b.a.h;
        if (this.j.e()) {
            float a = 0.0f - com.censivn.C3DEngine.b.b.a.a(135.0f);
            this.a.a = 0.0f;
            this.a.b = a;
            this.a.c = 0.0f;
            this.a.d = (a - com.censivn.C3DEngine.b.b.a.g) - (com.censivn.C3DEngine.b.b.a.h * 2.0f);
            return;
        }
        this.a.a = 0.0f;
        this.a.b = com.censivn.C3DEngine.b.b.a.C;
        this.a.c = 0.0f;
        this.a.d = (com.censivn.C3DEngine.b.b.a.C - com.censivn.C3DEngine.b.b.a.g) - (com.censivn.C3DEngine.b.b.a.h * 2.0f);
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public a.C0084a b() {
        if (this.a == null) {
            c();
        }
        return this.a;
    }

    @Override // com.tsf.shell.f.c.b.a.a
    public void a(Number3d number3d) {
        number3d.y = (com.censivn.C3DEngine.b.b.a.C + (com.censivn.C3DEngine.b.b.a.g / 2.0f)) - this.k.Y;
    }
}
