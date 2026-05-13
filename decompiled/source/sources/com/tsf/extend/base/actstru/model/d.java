package com.tsf.extend.base.actstru.model;
/* loaded from: classes.dex */
public class d {
    private String a = "";
    private String b = "";
    private i c = null;

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(i iVar) {
        this.c = iVar;
    }

    public i b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        return String.format("(%s :desc '%s' :from '%s' %s)", getClass().getSimpleName() + "@" + hashCode(), a(), c(), b());
    }
}
