package com.tsf.shell.e.e.g;

import com.censivn.C3DEngine.b.f.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends l {
    private e a;
    private com.censivn.C3DEngine.b.b.a.b b;
    private float c;
    private float e;
    private com.censivn.C3DEngine.b.b.a.d f;
    private float d = com.censivn.C3DEngine.b.b.a.a(20.0f);
    private boolean g = false;

    public a(e eVar, float f) {
        this.a = eVar;
        this.c = f;
    }

    public void a(ArrayList arrayList) {
        this.f = new com.censivn.C3DEngine.b.b.a.d();
        this.b = new com.censivn.C3DEngine.b.b.a.b();
        this.f.c(this.b);
        addChild(this.f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.addChild(((com.tsf.shell.e.e.g.a.d) it.next()).getTitleIcon());
        }
    }

    public void a() {
        this.b.numChildren();
        this.e = this.b.maxX();
        int i = com.censivn.C3DEngine.b.b.a.D;
    }

    public void b() {
        this.f.setAABBPX(0.0f, (-e.MENU_HEIGHT) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.a.D, e.MENU_HEIGHT / 2.0f, 0.0f);
        this.f.k();
        this.f.position().x = com.censivn.C3DEngine.b.b.a.z;
        this.f.a(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.e < com.censivn.C3DEngine.b.b.a.D) {
            this.g = false;
        } else {
            this.g = true;
            a((com.tsf.shell.e.e.g.a.d) this.a.getCurrentMenuItem(), false);
        }
    }

    public void a(com.tsf.shell.e.e.g.a.d dVar) {
        int numChildren = this.b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            if (((h) this.b.getChildAt(i)) == dVar.getTitleIcon()) {
                a(dVar, true);
                return;
            }
        }
    }

    private void a(com.tsf.shell.e.e.g.a.d dVar, boolean z) {
        if (this.g) {
            float f = (-dVar.getTitleIcon().position().x) + (com.censivn.C3DEngine.b.b.a.D / 2.0f);
            float f2 = 0.0f;
            float f3 = -(this.e - com.censivn.C3DEngine.b.b.a.D);
            if (f <= 0.0f) {
                f2 = f < f3 ? f3 : f;
            }
            this.f.a(f2, z);
        }
    }
}
