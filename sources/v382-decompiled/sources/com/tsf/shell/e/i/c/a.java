package com.tsf.shell.e.i.c;

import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
public class a extends i {
    private l k;
    private com.tsf.shell.e.i.b.a.a l;

    public a() {
        b(true);
    }

    @Override // com.tsf.shell.e.i.c.i, com.tsf.shell.e.i.c.g
    public void b() {
        if (this.l != null) {
            this.l.g();
        }
    }

    @Override // com.tsf.shell.e.i.c.i
    public j a(boolean z) {
        if (this.k == null) {
            this.k = p();
        } else {
            this.l.f();
        }
        return this.k;
    }

    private l p() {
        l lVar = new l() { // from class: com.tsf.shell.e.i.c.a.1
            int a = 0;
            double b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
                rotation().y = (-19.0f) + (((float) Math.sin(this.b * this.a)) * 19.0f);
                this.a += 2;
            }
        };
        this.l = new com.tsf.shell.e.i.b.a.a(false);
        this.l.scale().setAll(0.54f, 0.54f, 0.54f);
        this.l.setAnimationObjectState(true);
        lVar.addChild(this.l);
        return lVar;
    }
}
