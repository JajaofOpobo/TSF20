package com.tsf.shell.manager.c.a.a;

/* loaded from: classes.dex */
public class d {
    public com.tsf.shell.e.h.a.a.a.d a;
    public b b;
    public String c;
    public String d;

    public d(String str, String str2, b bVar) {
        this.b = bVar;
        this.c = str;
        this.d = str2;
    }

    public void a(com.tsf.shell.e.h.a.a.a.d dVar) {
        this.a = dVar;
    }

    public void a() {
        this.a = null;
    }

    public void b() {
        this.c = null;
        this.d = null;
        this.a = null;
        this.b = null;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.c;
    }

    public com.tsf.shell.e.h.a.a.a.d e() {
        return this.a;
    }

    public void f() {
        if (this.b != null) {
            this.b.a(this);
        }
    }
}
