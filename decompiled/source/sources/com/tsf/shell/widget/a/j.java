package com.tsf.shell.widget.a;
/* loaded from: classes.dex */
public class j {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private com.censivn.C3DEngine.b.f.a.b g;
    private com.censivn.C3DEngine.b.f.a.b h;
    private com.censivn.C3DEngine.b.f.a.b i;
    private long j = -1;

    public j(com.censivn.C3DEngine.b.f.a.b bVar, com.censivn.C3DEngine.b.f.a.b bVar2) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = bVar;
        this.h = bVar2;
        this.a = (bVar2.i().x + bVar.i().x) / 2.0f;
        this.b = (bVar2.i().y + bVar.i().y) / 2.0f;
        float f = bVar2.i().x - bVar.i().x;
        float f2 = bVar2.i().y - bVar.i().y;
        this.f = ((float) Math.sqrt((f * f) + (f2 * f2))) / 2.0f;
        this.c = (float) Math.atan2(bVar.i().y - this.b, bVar.i().x - this.a);
        float f3 = this.c;
        this.e = f3;
        this.d = f3;
    }

    public void a(com.censivn.C3DEngine.b.f.a.b bVar) {
        this.i = bVar;
        this.i.i().x = this.a;
        this.i.i().y = this.b;
        this.i.j().z = (float) Math.toDegrees(this.c);
        this.i.h();
    }

    public void a(long j) {
        if (j >= this.j && this.j != -1) {
            float f = this.e - this.d;
            if (Math.abs(f) < 0.01f) {
                float f2 = this.c;
                this.e = f2;
                this.d = f2;
                this.j = -1L;
            } else {
                this.d += 0.05f * f;
            }
            this.i.j().z = (float) Math.toDegrees(this.d);
            this.i.a((float) (Math.abs(f / 3.141592653589793d) * 255.0d));
            this.i.h();
            this.g.i().x = ((float) (Math.cos(this.d) * this.f)) + this.a;
            this.g.i().y = ((float) (Math.sin(this.d) * this.f)) + this.b;
            this.g.h();
            float f3 = (float) (this.d + 3.141592653589793d);
            float sin = (float) (Math.sin(f3) * this.f);
            this.h.i().x = ((float) (Math.cos(f3) * this.f)) + this.a;
            this.h.i().y = sin + this.b;
            this.h.h();
        }
    }

    public void a(int i, long j) {
        this.d = this.c;
        this.e = (float) (this.c - 3.141592653589793d);
        this.j = (i / 16.0f) + j;
    }
}
