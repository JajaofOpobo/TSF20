package com.censivn.C3DEngine.c.a;
/* loaded from: classes.dex */
public class b {
    public float a = 1.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 1.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 1.0f;
    public float l = 0.0f;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = 1.0f;

    public static b a(float f, float f2, float f3) {
        b bVar = new b();
        bVar.d = f;
        bVar.h = f2;
        bVar.l = f3;
        return bVar;
    }

    public static b a(float f, float f2, float f3, float f4) {
        return a(f, f2, f3, f4, null);
    }

    public static b a(float f, float f2, float f3, float f4, b bVar) {
        if (bVar == null) {
            bVar = new b();
        }
        float cos = (float) Math.cos(f4);
        float sin = (float) Math.sin(f4);
        float f5 = 1.0f - cos;
        float f6 = f * f2 * f5;
        float f7 = f2 * f3 * f5;
        float f8 = f * f3 * f5;
        float f9 = sin * f3;
        float f10 = sin * f2;
        float f11 = sin * f;
        bVar.a = (f * f * f5) + cos;
        bVar.b = (-f9) + f6;
        bVar.c = f10 + f8;
        bVar.d = 0.0f;
        bVar.e = f6 + f9;
        bVar.f = (f2 * f2 * f5) + cos;
        bVar.g = (-f11) + f7;
        bVar.h = 0.0f;
        bVar.i = (-f10) + f8;
        bVar.j = f11 + f7;
        bVar.k = cos + (f3 * f3 * f5);
        bVar.l = 0.0f;
        return bVar;
    }

    public void a(b bVar, b bVar2) {
        float f = bVar.a;
        float f2 = bVar2.a;
        float f3 = bVar.e;
        float f4 = bVar2.e;
        float f5 = bVar.i;
        float f6 = bVar2.i;
        float f7 = bVar.b;
        float f8 = bVar2.b;
        float f9 = bVar.f;
        float f10 = bVar2.f;
        float f11 = bVar.j;
        float f12 = bVar2.j;
        float f13 = bVar.c;
        float f14 = bVar2.c;
        float f15 = bVar.g;
        float f16 = bVar2.g;
        float f17 = bVar.k;
        float f18 = bVar2.k;
        float f19 = bVar.d;
        float f20 = bVar2.d;
        float f21 = bVar.h;
        float f22 = bVar2.h;
        float f23 = bVar.l;
        float f24 = bVar2.l;
        this.a = (f * f2) + (f7 * f4) + (f13 * f6);
        this.b = (f * f8) + (f7 * f10) + (f13 * f12);
        this.c = (f * f14) + (f7 * f16) + (f13 * f18);
        this.d = (f * f20) + (f7 * f22) + (f13 * f24) + f19;
        this.e = (f3 * f2) + (f9 * f4) + (f15 * f6);
        this.f = (f3 * f8) + (f9 * f10) + (f15 * f12);
        this.g = (f3 * f14) + (f9 * f16) + (f15 * f18);
        this.h = (f3 * f20) + (f9 * f22) + (f15 * f24) + f21;
        this.i = (f5 * f2) + (f11 * f4) + (f17 * f6);
        this.j = (f5 * f8) + (f11 * f10) + (f17 * f12);
        this.k = (f5 * f14) + (f11 * f16) + (f17 * f18);
        this.l = (f5 * f20) + (f11 * f22) + (f17 * f24) + f23;
    }

    public static b b(b bVar, b bVar2) {
        b bVar3 = new b();
        bVar3.a(bVar, bVar2);
        return bVar3;
    }
}
