package com.censivn.C3DEngine.a;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.utils.l;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class g implements com.censivn.C3DEngine.b.f.f, com.censivn.C3DEngine.d.a {
    private com.censivn.C3DEngine.f.b b;
    private com.censivn.C3DEngine.f.c c;
    private boolean d;
    private ArrayList<i> a = new ArrayList<>();
    private Color4 e = new Color4(255, 255, 255, 255);
    private float g = 0.0f;
    private float f = 10.0f;
    private boolean h = false;

    public void a() {
        a(this);
        this.a = new ArrayList<>();
        this.b = new com.censivn.C3DEngine.f.b();
        this.c = new com.censivn.C3DEngine.f.c(0, 0, 0, 255, this);
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public void addChild(i iVar) {
        if (!e.l()) {
            l.a(this, "scene addChild is worng thread:" + iVar);
        }
        if (!this.a.contains(iVar)) {
            this.a.add(iVar);
            iVar.parent(this);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public boolean removeChild(i iVar) {
        if (!e.l()) {
            l.a(this, "scene removeChild is worng thread:" + iVar);
        }
        boolean remove = this.a.remove(iVar);
        if (remove) {
            iVar.parent(null);
        }
        return remove;
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public i getChildAt(int i) {
        return this.a.get(i);
    }

    @Override // com.censivn.C3DEngine.b.f.f
    public int numChildren() {
        return this.a.size();
    }

    public com.censivn.C3DEngine.f.b b() {
        return this.b;
    }

    public void a(boolean z) {
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<i> d() {
        return this.a;
    }

    private void a(com.censivn.C3DEngine.b.f.f fVar) {
        for (int numChildren = fVar.numChildren() - 1; numChildren >= 0; numChildren--) {
            i childAt = fVar.getChildAt(numChildren);
            childAt.destroy();
            if (childAt instanceof j) {
                a((j) childAt);
            }
        }
    }

    @Override // com.censivn.C3DEngine.d.a
    public void e() {
    }
}
