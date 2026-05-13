package com.censivn.C3DEngine.f;
/* loaded from: classes.dex */
public abstract class a {
    protected com.censivn.C3DEngine.d.a a;
    protected boolean b;

    public a(com.censivn.C3DEngine.d.a aVar) {
        this.a = aVar;
    }

    public void a() {
        this.b = true;
        if (this.a != null) {
            this.a.e();
        }
    }
}
