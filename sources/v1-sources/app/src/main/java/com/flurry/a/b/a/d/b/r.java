package com.flurry.a.b.a.d.b;

import com.flurry.a.b.a.d.y;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes.dex */
public final class r extends com.flurry.a.b.a.d.p {
    protected com.flurry.a.b.a.j c;
    protected final com.flurry.a.b.a.d.s d;
    protected final com.flurry.a.b.a.d.v e;
    protected com.flurry.a.b.a.d.i.b f;
    protected com.flurry.a.b.a.d.i.t g;
    protected DateFormat h;

    public r(com.flurry.a.b.a.d.n nVar, com.flurry.a.b.a.j jVar, com.flurry.a.b.a.d.s sVar, com.flurry.a.b.a.d.v vVar) {
        super(nVar);
        this.c = jVar;
        this.d = sVar;
        this.e = vVar;
    }

    @Override // com.flurry.a.b.a.d.p
    public final com.flurry.a.b.a.d.s b() {
        return this.d;
    }

    @Override // com.flurry.a.b.a.d.p
    public final com.flurry.a.b.a.j d() {
        return this.c;
    }

    @Override // com.flurry.a.b.a.d.p
    public final Object a(Object obj) {
        if (this.e == null) {
            throw new IllegalStateException("No 'injectableValues' configured, can not inject value with id [" + obj + "]");
        }
        return this.e.a();
    }

    @Override // com.flurry.a.b.a.d.p
    public final com.flurry.a.b.a.d.i.t g() {
        com.flurry.a.b.a.d.i.t tVar = this.g;
        if (tVar == null) {
            return new com.flurry.a.b.a.d.i.t();
        }
        this.g = null;
        return tVar;
    }

    @Override // com.flurry.a.b.a.d.p
    public final void a(com.flurry.a.b.a.d.i.t tVar) {
        if (this.g == null || tVar.b() >= this.g.b()) {
            this.g = tVar;
        }
    }

    @Override // com.flurry.a.b.a.d.p
    public final com.flurry.a.b.a.d.i.b h() {
        if (this.f == null) {
            this.f = new com.flurry.a.b.a.d.i.b();
        }
        return this.f;
    }

    @Override // com.flurry.a.b.a.d.p
    public final Date a(String str) {
        try {
            if (this.h == null) {
                this.h = (DateFormat) this.a.o().clone();
            }
            return this.h.parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override // com.flurry.a.b.a.d.p
    public final Calendar a(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    @Override // com.flurry.a.b.a.d.p
    public final boolean a(com.flurry.a.b.a.j jVar) {
        com.flurry.a.b.a.d.i.s f = this.a.f();
        if (f != null) {
            com.flurry.a.b.a.j jVar2 = this.c;
            this.c = jVar;
            while (f != null) {
                try {
                    f.b();
                    f = f.a();
                } finally {
                    this.c = jVar2;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.flurry.a.b.a.d.p
    public final y b(Class cls) {
        return a(cls, this.c.e());
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(Class cls, com.flurry.a.b.a.o oVar) {
        return y.a(this.c, "Can not deserialize instance of " + c(cls) + " out of " + oVar + " token");
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(Class cls, Throwable th) {
        return y.a(this.c, "Can not construct instance of " + cls.getName() + ", problem: " + th.getMessage(), th);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(Class cls, String str) {
        return y.a(this.c, "Can not construct instance of " + cls.getName() + ", problem: " + str);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y b(Class cls, String str) {
        return y.a(this.c, "Can not construct instance of " + cls.getName() + " from String value '" + i() + "': " + str);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y c(Class cls, String str) {
        return y.a(this.c, "Can not construct instance of " + cls.getName() + " from number value (" + i() + "): " + str);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(Class cls, String str, String str2) {
        return y.a(this.c, "Can not construct Map key of type " + cls.getName() + " from String \"" + c(str) + "\": " + str2);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(com.flurry.a.b.a.j jVar, com.flurry.a.b.a.o oVar, String str) {
        return y.a(jVar, "Unexpected token (" + jVar.e() + "), expected " + oVar + ": " + str);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(Object obj, String str) {
        return com.flurry.a.b.a.d.c.a.a(this.c, obj, str);
    }

    @Override // com.flurry.a.b.a.d.p
    public final y a(com.flurry.a.b.a.g.a aVar, String str) {
        return y.a(this.c, "Could not resolve type id '" + str + "' into a subtype of " + aVar);
    }

    private String c(Class cls) {
        return cls.isArray() ? c(cls.getComponentType()) + "[]" : cls.getName();
    }

    private String i() {
        try {
            return c(this.c.k());
        } catch (Exception e) {
            return "[N/A]";
        }
    }

    private static String c(String str) {
        if (str.length() > 500) {
            return str.substring(0, ThemeShellDescription.PAGE_PREVIEW_SELECT) + "]...[" + str.substring(str.length() - 500);
        }
        return str;
    }
}
