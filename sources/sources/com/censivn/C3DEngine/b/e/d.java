package com.censivn.C3DEngine.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends com.censivn.C3DEngine.b.f.j {
    private com.censivn.C3DEngine.b.b.d a;
    private int c = 0;
    private com.censivn.C3DEngine.b.b.c b = new com.censivn.C3DEngine.b.b.c();

    public d() {
        this.b.b(true);
        this.b.a((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)), 0);
        this.b.a(1);
        this.a = new com.censivn.C3DEngine.b.b.d(this.b);
        this.a.a(com.censivn.C3DEngine.b.b.a.D, com.censivn.C3DEngine.b.b.a.E - (com.censivn.C3DEngine.b.b.a.B - this.a.position().y));
        addChild(this.a);
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(float f) {
        this.b.a((int) (com.censivn.C3DEngine.b.b.a.D - com.censivn.C3DEngine.b.b.a.a(70.0f)), 0);
        this.a.a(com.censivn.C3DEngine.b.b.a.D, f);
    }

    public void a(f fVar) {
        this.b.addChild(fVar);
        fVar.getLayoutParams().c = com.censivn.C3DEngine.b.b.a.a(30.0f);
        fVar.getLayoutParams().d = com.censivn.C3DEngine.b.b.a.a(30.0f);
        fVar.a(this);
    }

    public void a(f fVar, float f) {
        this.b.addChild(fVar);
        fVar.getLayoutParams().c = f;
        fVar.getLayoutParams().d = f;
    }

    public void a(boolean z) {
        this.a.c();
        if (z) {
            this.b.c();
        }
        int iNumChildren = this.b.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            com.censivn.C3DEngine.b.f.i childAt = this.b.getChildAt(i);
            if (childAt instanceof f) {
                f fVar = (f) childAt;
                float fAlpha = fVar.alpha();
                fVar.alpha(0.0f);
                fVar.dispatchDraw();
                fVar.alpha(fAlpha);
                fVar.f();
            }
        }
    }

    public void a() {
        int iNumChildren = this.b.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            com.censivn.C3DEngine.b.f.i childAt = this.b.getChildAt(i);
            if (childAt instanceof f) {
                ((f) childAt).g();
            }
        }
    }
}
