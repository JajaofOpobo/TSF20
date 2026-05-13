package com.tsf.extend.base.actstru.model;
/* loaded from: classes.dex */
public class b<T> extends j {
    protected T a;
    protected g<T> b;

    public b(T t, g<T> gVar) {
        this.a = null;
        this.b = null;
        this.a = t;
        this.b = gVar;
    }

    @Override // com.tsf.extend.base.actstru.model.j
    public d a() {
        return this.b.a(this.a);
    }
}
