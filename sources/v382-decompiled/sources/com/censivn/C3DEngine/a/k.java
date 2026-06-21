package com.censivn.C3DEngine.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.utils.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k implements com.censivn.C3DEngine.b.f.g, com.censivn.C3DEngine.d.a {
    private com.censivn.C3DEngine.f.b b;
    private com.censivn.C3DEngine.f.c c;
    private boolean d;
    private ArrayList a = new ArrayList();
    private Color4 e = new Color4(255, 255, 255, 255);
    private float g = 0.0f;
    private float f = 10.0f;
    private boolean h = false;

    public void a() {
        a(this);
        this.a = new ArrayList();
        this.b = new com.censivn.C3DEngine.f.b();
        this.c = new com.censivn.C3DEngine.f.c(0, 0, 0, 255, this);
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public void addChild(com.censivn.C3DEngine.b.f.j jVar) {
        if (!i.l()) {
            m.a(this, "scene addChild is worng thread:" + jVar);
        }
        if (!this.a.contains(jVar)) {
            this.a.add(jVar);
            jVar.parent(this);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public boolean removeChild(com.censivn.C3DEngine.b.f.j jVar) {
        if (!i.l()) {
            m.a(this, "scene removeChild is worng thread:" + jVar);
        }
        boolean remove = this.a.remove(jVar);
        if (remove) {
            jVar.parent(null);
        }
        return remove;
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public com.censivn.C3DEngine.b.f.j getChildAt(int i) {
        return (com.censivn.C3DEngine.b.f.j) this.a.get(i);
    }

    @Override // com.censivn.C3DEngine.b.f.g
    public int numChildren() {
        return this.a.size();
    }

    public com.censivn.C3DEngine.f.b b() {
        return this.b;
    }

    public void a(boolean z) {
        this.d = z;
    }

    void c() {
        a();
    }

    ArrayList d() {
        return this.a;
    }

    private void a(com.censivn.C3DEngine.b.f.g gVar) {
        for (int numChildren = gVar.numChildren() - 1; numChildren >= 0; numChildren--) {
            com.censivn.C3DEngine.b.f.j childAt = gVar.getChildAt(numChildren);
            childAt.destroy();
            if (childAt instanceof l) {
                a((l) childAt);
            }
        }
    }

    @Override // com.censivn.C3DEngine.d.a
    public void e() {
    }
}
