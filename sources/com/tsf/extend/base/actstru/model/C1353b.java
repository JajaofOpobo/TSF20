package com.tsf.extend.base.actstru.model;
/* renamed from: com.tsf.extend.base.actstru.model.b */
/* loaded from: classes.dex */
public class C1353b<T> extends CallableC1362j {

    /* renamed from: a */
    protected T f4261a;

    /* renamed from: b */
    protected InterfaceC1359g<T> f4262b;

    public C1353b(T t, InterfaceC1359g<T> interfaceC1359g) {
        this.f4261a = null;
        this.f4262b = null;
        this.f4261a = t;
        this.f4262b = interfaceC1359g;
    }

    @Override // com.tsf.extend.base.actstru.model.CallableC1362j
    /* renamed from: a */
    public C1355d mo8891a() {
        return this.f4262b.mo8881a(this.f4261a);
    }
}
