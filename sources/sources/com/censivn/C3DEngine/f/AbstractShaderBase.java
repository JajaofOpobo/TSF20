package com.censivn.C3DEngine.f;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class AbstractShaderBase {
    protected com.censivn.C3DEngine.d.AnimationCallback a;
    protected boolean b;

    public AbstractShaderBase(com.censivn.C3DEngine.d.AnimationCallback aVar) {
        this.a = aVar;
    }

    public void a() {
        this.b = true;
        if (this.a != null) {
            this.a.e();
        }
    }
}
