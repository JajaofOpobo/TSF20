package com.censivn.C3DEngine.b;

import com.censivn.C3DEngine.api.element.Color4;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ab implements com.censivn.C3DEngine.d.a, com.censivn.C3DEngine.d.b {
    private com.censivn.C3DEngine.i.b c;
    private com.censivn.C3DEngine.i.c d;
    private boolean e;
    private boolean f;
    private ArrayList a = new ArrayList();
    private j b = new j();
    private Color4 g = new Color4(255, 255, 255, 255);
    private float i = 0.0f;
    private float h = 10.0f;
    private com.censivn.C3DEngine.i.e j = com.censivn.C3DEngine.i.e.LINEAR;
    private boolean k = false;

    public final void a() {
        a(this);
        this.a = new ArrayList();
        this.c = new com.censivn.C3DEngine.i.b();
        this.d = new com.censivn.C3DEngine.i.c(this);
        this.b = new j();
        this.e = true;
    }

    @Override // com.censivn.C3DEngine.d.b
    public final void d(r rVar) {
        if (!this.a.contains(rVar)) {
            this.a.add(rVar);
            rVar.a((com.censivn.C3DEngine.d.b) this);
            rVar.a(this);
        }
    }

    @Override // com.censivn.C3DEngine.d.b
    public final boolean e(r rVar) {
        rVar.a((com.censivn.C3DEngine.d.b) null);
        rVar.a((ab) null);
        return this.a.remove(rVar);
    }

    @Override // com.censivn.C3DEngine.d.b
    public final r d(int i) {
        return (r) this.a.get(i);
    }

    @Override // com.censivn.C3DEngine.d.b
    public final int aB() {
        return this.a.size();
    }

    public final com.censivn.C3DEngine.i.b b() {
        return this.c;
    }

    public final void c() {
        this.f = true;
    }

    final ArrayList d() {
        return this.a;
    }

    private void a(com.censivn.C3DEngine.d.b bVar) {
        for (int aB = bVar.aB() - 1; aB >= 0; aB--) {
            r d = bVar.d(aB);
            d.H();
            if (d instanceof v) {
                a((v) d);
            }
        }
    }
}
