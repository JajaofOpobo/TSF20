package com.tsf.shell.e.e.d.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class g {
    public int a;
    public int b;
    public e c;
    public ArrayList d;
    public d e;
    public float f;
    public float g;
    public int h;

    public g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public void a(ArrayList arrayList) {
        this.d = arrayList;
    }

    public boolean c() {
        return this.d != null && this.d.size() > 0;
    }

    public void a(h hVar) {
        if (this.e == null && c()) {
            this.e = new d(hVar);
            f fVar = new f();
            fVar.a = com.censivn.C3DEngine.b.b.a.a(-130.0f);
            fVar.b = com.censivn.C3DEngine.b.b.a.a(128.0f);
            fVar.c = com.censivn.C3DEngine.b.b.a.a(65.0f);
            fVar.d = com.censivn.C3DEngine.b.b.a.a(120.0f);
            fVar.e = 38;
            fVar.f = com.censivn.C3DEngine.b.b.a.a(54.0f);
            this.e.a(this.d, fVar);
        }
    }
}
