package com.censivn.C3DEngine.b.e;

/* loaded from: classes.dex */
public class g extends com.censivn.C3DEngine.b.f.l {
    private com.censivn.C3DEngine.b.b.d a;
    private int c = 0;
    private com.censivn.C3DEngine.b.b.c b = new com.censivn.C3DEngine.b.b.c();

    public g() {
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

    public void a(i iVar) {
        this.b.addChild(iVar);
        iVar.getLayoutParams().c = com.censivn.C3DEngine.b.b.a.a(30.0f);
        iVar.getLayoutParams().d = com.censivn.C3DEngine.b.b.a.a(30.0f);
        iVar.a(this);
    }

    public void a(i iVar, float f) {
        this.b.addChild(iVar);
        iVar.getLayoutParams().c = f;
        iVar.getLayoutParams().d = f;
    }

    public void a(boolean z) {
        this.a.c();
        if (z) {
            this.b.c();
        }
        int numChildren = this.b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.censivn.C3DEngine.b.f.j childAt = this.b.getChildAt(i);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                float alpha = iVar.alpha();
                iVar.alpha(0.0f);
                iVar.dispatchDraw();
                iVar.alpha(alpha);
                iVar.f();
            }
        }
    }

    public void a() {
        int numChildren = this.b.numChildren();
        for (int i = 0; i < numChildren; i++) {
            com.censivn.C3DEngine.b.f.j childAt = this.b.getChildAt(i);
            if (childAt instanceof i) {
                ((i) childAt).g();
            }
        }
    }
}
