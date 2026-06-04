package com.flurry.a.b.a.d.b.b;

/* loaded from: classes.dex */
public final class be extends bw {
    @Override // com.flurry.a.b.a.d.w
    public final /* synthetic */ Object a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.p pVar) {
        com.flurry.a.b.a.o e = jVar.e();
        if (e != com.flurry.a.b.a.o.START_OBJECT) {
            throw pVar.a(this.q, e);
        }
        String str = "";
        String str2 = "";
        String str3 = "";
        int i = -1;
        while (true) {
            com.flurry.a.b.a.o c = jVar.c();
            if (c == com.flurry.a.b.a.o.END_OBJECT) {
                return new StackTraceElement(str, str2, str3, i);
            }
            String g = jVar.g();
            if ("className".equals(g)) {
                str = jVar.k();
            } else if ("fileName".equals(g)) {
                str3 = jVar.k();
            } else if ("lineNumber".equals(g)) {
                if (!c.c()) {
                    throw com.flurry.a.b.a.d.y.a(jVar, "Non-numeric token (" + c + ") for property 'lineNumber'");
                }
                i = jVar.t();
            } else if ("methodName".equals(g)) {
                str2 = jVar.k();
            } else if (!"nativeMethod".equals(g)) {
                a(jVar, pVar, this.q, g);
            }
        }
    }

    public be() {
        super(StackTraceElement.class);
    }
}
