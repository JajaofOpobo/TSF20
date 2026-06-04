package com.censivn.C3DEngine.c.b;

import com.censivn.C3DEngine.api.effects.core.Vector3;
import com.censivn.C3DEngine.c.a.d;
import com.censivn.C3DEngine.c.a.e;

/* loaded from: classes.dex */
public final class b extends d implements com.censivn.C3DEngine.c.b {
    public float c;
    public Vector3 b = new Vector3(0.0f, 1.0f, 0.0f);
    public Vector3 d = new Vector3(0.0f, 0.0f, 0.0f);

    public b(float f) {
        this.c = f;
    }

    @Override // com.censivn.C3DEngine.c.b
    public final void a() {
        this.b.normalize();
        Vector3 vector3 = new Vector3(this.a.f() / 2.0f, this.a.g() / 2.0f, this.a.h() / 2.0f);
        float f = -Vector3.dot(this.b, this.d);
        int size = this.a.a().size();
        for (int i = 0; i < size; i++) {
            e eVar = (e) this.a.a().get(i);
            float dot = ((Vector3.dot(new Vector3(eVar.a(), eVar.b(), eVar.c()), this.b) + f) / vector3.getMagnitude()) * this.c;
            float a = eVar.a();
            float b = eVar.b();
            float c = eVar.c();
            com.censivn.C3DEngine.c.a.b bVar = new com.censivn.C3DEngine.c.a.b();
            bVar.d = a;
            bVar.h = b;
            bVar.l = c;
            float f2 = this.b.x;
            float f3 = this.b.y;
            float f4 = this.b.z;
            com.censivn.C3DEngine.c.a.b bVar2 = new com.censivn.C3DEngine.c.a.b();
            float cos = (float) Math.cos(dot);
            float sin = (float) Math.sin(dot);
            float f5 = 1.0f - cos;
            float f6 = f2 * f3 * f5;
            float f7 = f3 * f4 * f5;
            float f8 = f2 * f4 * f5;
            float f9 = sin * f4;
            float f10 = sin * f3;
            float f11 = sin * f2;
            bVar2.a = (f2 * f2 * f5) + cos;
            bVar2.b = (-f9) + f6;
            bVar2.c = f10 + f8;
            bVar2.d = 0.0f;
            bVar2.e = f9 + f6;
            bVar2.f = (f3 * f3 * f5) + cos;
            bVar2.g = (-f11) + f7;
            bVar2.h = 0.0f;
            bVar2.i = (-f10) + f8;
            bVar2.j = f11 + f7;
            bVar2.k = (f4 * f4 * f5) + cos;
            bVar2.l = 0.0f;
            com.censivn.C3DEngine.c.a.b bVar3 = new com.censivn.C3DEngine.c.a.b();
            float f12 = bVar2.a;
            float f13 = bVar.a;
            float f14 = bVar2.e;
            float f15 = bVar.e;
            float f16 = bVar2.i;
            float f17 = bVar.i;
            float f18 = bVar2.b;
            float f19 = bVar.b;
            float f20 = bVar2.f;
            float f21 = bVar.f;
            float f22 = bVar2.j;
            float f23 = bVar.j;
            float f24 = bVar2.c;
            float f25 = bVar.c;
            float f26 = bVar2.g;
            float f27 = bVar.g;
            float f28 = bVar2.k;
            float f29 = bVar.k;
            float f30 = bVar2.d;
            float f31 = bVar.d;
            float f32 = bVar2.h;
            float f33 = bVar.h;
            float f34 = bVar2.l;
            float f35 = bVar.l;
            bVar3.a = (f12 * f13) + (f18 * f15) + (f24 * f17);
            bVar3.b = (f12 * f19) + (f18 * f21) + (f24 * f23);
            bVar3.c = (f12 * f25) + (f18 * f27) + (f24 * f29);
            bVar3.d = (f12 * f31) + (f18 * f33) + (f24 * f35) + f30;
            bVar3.e = (f14 * f13) + (f20 * f15) + (f26 * f17);
            bVar3.f = (f14 * f19) + (f20 * f21) + (f26 * f23);
            bVar3.g = (f14 * f25) + (f20 * f27) + (f26 * f29);
            bVar3.h = (f14 * f31) + (f20 * f33) + (f26 * f35) + f32;
            bVar3.i = (f16 * f13) + (f22 * f15) + (f28 * f17);
            bVar3.j = (f16 * f19) + (f22 * f21) + (f28 * f23);
            bVar3.k = (f16 * f25) + (f22 * f27) + (f28 * f29);
            bVar3.l = (f16 * f31) + (f22 * f33) + (f28 * f35) + f34;
            eVar.a(bVar3.d);
            eVar.b(bVar3.h);
            eVar.c(bVar3.l);
        }
    }
}
