package com.tsf.shell.f.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class ItemPageTransition extends 
    protected B a;

    public i(int i, int i2, boolean z) {
        super(i, i2, z);
        this.a = new B();
        this.a.useVBO(false);
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.f.f.PageTransitionEffect
    public void a(float f, float f2) {
        if (this.a != null) {
            this.a.a(TransitionRenderer);
            this.a.b(f2);
        }
    }
}
