package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public abstract class bf extends com.flurry.a.b.a.d.ae {
    protected final Class a;

    protected abstract Object b(String str, com.flurry.a.b.a.d.p pVar);

    protected bf(Class cls) {
        this.a = cls;
    }

    @Override // com.flurry.a.b.a.d.ae
    public final Object a(String str, com.flurry.a.b.a.d.p pVar) {
        if (str == null) {
            return null;
        }
        try {
            Object b = b(str, pVar);
            if (b != null) {
                return b;
            }
            throw pVar.a(this.a, str, "not a valid representation");
        } catch (Exception e) {
            throw pVar.a(this.a, str, "not a valid representation: " + e.getMessage());
        }
    }

    public final Class a() {
        return this.a;
    }
}
