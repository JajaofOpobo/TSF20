package com.tsf.shell.f.e.g;

import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a extends j {
    private d a;
    private com.censivn.C3DEngine.b.b.a.b b;
    private float c;
    private float e;
    private com.censivn.C3DEngine.b.b.a.d f;
    private float d = com.censivn.C3DEngine.b.b.a.a(20.0f);
    private boolean g = false;

    public a(d dVar, float f) {
        this.a = dVar;
        this.c = f;
    }

    public void a(ArrayList<com.tsf.shell.f.e.g.a.b> arrayList) {
        this.f = new com.censivn.C3DEngine.b.b.a.d();
        this.b = new com.censivn.C3DEngine.b.b.a.b();
        this.f.c(this.b);
        addChild(this.f);
        Iterator<com.tsf.shell.f.e.g.a.b> it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.addChild(it.next().getTitleIcon());
        }
    }

    public void a() {
        this.b.numChildren();
        float maxX = this.b.maxX();
        this.e = maxX;
        if (maxX < com.censivn.C3DEngine.b.b.a.D) {
        }
    }

    public void b() {
        this.f.setAABBPX(0.0f, (-d.MENU_HEIGHT) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, d.MENU_HEIGHT / 2.0f, 0.0f);
        this.f.k();
        this.f.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.f.a(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.e < com.censivn.C3DEngine.b.b.a.D) {
            this.g = false;
            return;
        }
        this.g = true;
        a((com.tsf.shell.f.e.g.a.b) this.a.getCurrentMenuItem(), false);
    }

    public void a(com.tsf.shell.f.e.g.a.b bVar) {
        int numChildren = this.b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            if (((e) this.b.getChildAt(i)) == bVar.getTitleIcon()) {
                a(bVar, true);
                return;
            }
        }
    }

    private void a(com.tsf.shell.f.e.g.a.b bVar, boolean z) {
        if (this.g) {
            float f = (-bVar.getTitleIcon().position().x) + (com.censivn.C3DEngine.b.b.a.D / 2.0f);
            float f2 = 0.0f;
            float f3 = -(this.e - com.censivn.C3DEngine.b.b.a.D);
            if (f <= 0.0f) {
                f2 = f < f3 ? f3 : f;
            }
            this.f.a(f2, z);
        }
    }
}
