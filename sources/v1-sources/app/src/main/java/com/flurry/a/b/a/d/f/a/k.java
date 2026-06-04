package com.flurry.a.b.a.d.f.a;

/* loaded from: classes.dex */
public final class k extends j {
    protected final String a;
    protected final String b;

    protected k(com.flurry.a.b.a.g.a aVar, com.flurry.a.b.a.d.h.k kVar) {
        super(aVar, kVar);
        String name = aVar.p().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.a = "";
            this.b = ".";
        } else {
            this.b = name.substring(0, lastIndexOf + 1);
            this.a = name.substring(0, lastIndexOf);
        }
    }

    @Override // com.flurry.a.b.a.d.f.a.j, com.flurry.a.b.a.d.f.c
    public final String a(Object obj) {
        String name = obj.getClass().getName();
        if (name.startsWith(this.b)) {
            return name.substring(this.b.length() - 1);
        }
        return name;
    }

    @Override // com.flurry.a.b.a.d.f.a.j, com.flurry.a.b.a.d.f.c
    public final com.flurry.a.b.a.g.a a(String str) {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(str.length() + this.a.length());
            if (this.a.length() == 0) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.a).append(str);
            }
            str = sb.toString();
        }
        return super.a(str);
    }
}
