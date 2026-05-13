package com.tsf.extend.base.actstru.model;
/* renamed from: com.tsf.extend.base.actstru.model.d */
/* loaded from: classes.dex */
public class C1355d {

    /* renamed from: a */
    private String f4266a = "";

    /* renamed from: b */
    private String f4267b = "";

    /* renamed from: c */
    private C1361i f4268c = null;

    /* renamed from: a */
    public String m8913a() {
        return this.f4267b;
    }

    /* renamed from: a */
    public void m8911a(String str) {
        this.f4266a = str;
    }

    /* renamed from: a */
    public void m8912a(C1361i c1361i) {
        this.f4268c = c1361i;
    }

    /* renamed from: b */
    public C1361i m8910b() {
        return this.f4268c;
    }

    /* renamed from: c */
    public String m8909c() {
        return this.f4266a;
    }

    public String toString() {
        return String.format("(%s :desc '%s' :from '%s' %s)", getClass().getSimpleName() + "@" + hashCode(), m8913a(), m8909c(), m8910b());
    }
}
