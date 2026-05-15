package com.tsf.extend.theme;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ac extends com.tsf.extend.base.a.b {
    private String a;

    public ac(String str) {
        this.a = str;
    }

    @Override // com.tsf.extend.base.a.a
    protected String b() {
        return "https://cml.ksmobile.com/";
    }

    @Override // com.tsf.extend.base.a.a
    protected String c() {
        return this.a;
    }

    public void e() {
        b("115");
        f();
        c("31");
    }

    protected void b(String str) {
        a("pos", str);
    }

    protected void f() {
        a("vga", com.tsf.extend.base.j.p.e());
    }

    protected void c(String str) {
        a("count", str);
    }
}
