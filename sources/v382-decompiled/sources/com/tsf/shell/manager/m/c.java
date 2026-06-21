package com.tsf.shell.manager.m;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.manager.b.g;
import com.tsf.shell.utils.h;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c implements k, com.tsf.shell.e.i.b {
    public static float a = com.censivn.C3DEngine.b.b.a.a(300.0f);
    public static float b = com.censivn.C3DEngine.b.b.a.a(190.0f);
    private l c;
    private d d;
    private a e;
    private e f;
    private com.tsf.shell.e.i.b.e.b h;
    private com.tsf.shell.manager.f.c i;
    private com.tsf.shell.e.i.a j;
    private float m;
    private Runnable r;
    private boolean g = false;
    private int k = 1;
    private boolean l = true;
    private float n = 0.5f;
    private float o = 0.5f;
    private boolean p = false;
    private boolean q = false;
    private boolean s = false;

    public float a() {
        return this.n;
    }

    public float c() {
        return this.o;
    }

    public void a(float f) {
        this.n = f;
        f();
    }

    public void b(float f) {
        this.o = f;
        f();
    }

    public int d() {
        return this.k;
    }

    public void a(boolean z) {
        this.l = z;
    }

    public void b(boolean z) {
        this.l = false;
        if (!this.g) {
            this.q = true;
            this.f.mouseEnabled(false);
            if (z) {
                x xVar = new x() { // from class: com.tsf.shell.manager.m.c.1
                    @Override // com.censivn.C3DEngine.b.g.x
                    public void a() {
                        c.this.f.visible(false);
                        c.this.f.c();
                    }
                };
                xVar.f(r());
                w.a(this.f);
                w.a(this.f, 600, xVar);
                return;
            }
            this.f.position().x = r();
            this.f.visible(false);
        }
    }

    public void a(j jVar) {
        if (this.l && !b(jVar)) {
            this.f.b_();
        }
    }

    public void e() {
        this.f.b();
    }

    public void a(int i, boolean z) {
        this.k = i == 0 ? 0 : 1;
        g();
        if (z) {
            g.b(this.k);
        }
    }

    public void f() {
        this.m = com.censivn.C3DEngine.b.b.a.O ? this.n : this.o;
        this.f.position().y = (com.censivn.C3DEngine.b.b.a.B - b) - (((com.censivn.C3DEngine.b.b.a.B - com.censivn.C3DEngine.b.b.a.C) - (2.0f * b)) * this.m);
    }

    public void g() {
        this.f.position().x = r();
        this.f.a(q(), false);
        this.d.position().x = s();
    }

    public void h() {
        g.c(this.n);
        g.d(this.o);
    }

    public void a(l lVar) {
        this.n = g.j();
        this.n = this.n > 1.0f ? 0.4f : this.n;
        this.n = this.n < 0.0f ? 0.4f : this.n;
        this.o = g.k();
        this.o = this.o > 1.0f ? 0.4f : this.o;
        this.o = this.o >= 0.0f ? this.o : 0.4f;
        this.k = g.i() == 0 ? 0 : 1;
        com.tsf.shell.manager.a.b.a(this);
        this.j = new com.tsf.shell.e.i.a(this, this) { // from class: com.tsf.shell.manager.m.c.3
            @Override // com.tsf.shell.e.i.a
            public void a(com.tsf.shell.e.i.c cVar) {
            }
        };
        this.h = new com.tsf.shell.e.i.b.e.j();
        this.c = new l();
        this.e = new a(this) { // from class: com.tsf.shell.manager.m.c.4
            @Override // com.censivn.C3DEngine.b.b.a.c, com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.g
            public void addChild(j jVar) {
                super.a(jVar, true);
            }
        };
        this.e.a(com.censivn.C3DEngine.b.b.a.a(60.0f));
        this.e.b(com.censivn.C3DEngine.b.b.a.a(10.0f));
        this.d = new d(this, this.e);
        this.e.a((com.censivn.C3DEngine.b.b.a.e) this.d);
        this.d.visible(false);
        this.d.a(this.e);
        lVar.addChild(this.c);
        this.f = new e(this) { // from class: com.tsf.shell.manager.m.c.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.tsf.shell.manager.m.e, com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
            public boolean a(com.tsf.shell.e.e.g gVar, float f, float f2) {
                return c.this.b((j) gVar);
            }

            @Override // com.tsf.shell.manager.m.e, com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
            public void a(com.tsf.shell.e.e.g gVar) {
                if (!c.this.g) {
                    com.tsf.shell.manager.a.h.b().c();
                    com.tsf.shell.manager.a.p.c();
                    c.this.c(false);
                    c.this.e.a(gVar);
                    b();
                }
            }

            @Override // com.tsf.shell.manager.m.e, com.tsf.shell.e.e.e.h, com.tsf.shell.e.e.g
            public boolean b(com.tsf.shell.e.e.g gVar) {
                return gVar instanceof com.tsf.shell.e.i.b.e.b;
            }
        };
        this.c.addChild(this.f);
        this.c.addChild(this.d);
        this.i = new com.tsf.shell.manager.f.c() { // from class: com.tsf.shell.manager.m.c.6
            @Override // com.tsf.shell.manager.f.c
            public void a() {
                if (c.this.e.v()) {
                    return;
                }
                c.this.t();
            }
        };
        p();
        g();
        if (!g.h()) {
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(j jVar) {
        boolean z;
        if (this.q) {
            return true;
        }
        if (!this.l) {
            z = false;
        } else if (jVar instanceof com.tsf.shell.e.i.b.e.b) {
            Iterator it = ((com.tsf.shell.e.i.b.e.b) jVar).av().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (!(((com.tsf.shell.e.i.e) it.next()) instanceof com.tsf.shell.e.i.b.e.b)) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
        }
        return z;
    }

    public void i() {
        if (this.l && !this.q) {
            this.q = true;
            this.f.mouseEnabled(false);
            x xVar = new x() { // from class: com.tsf.shell.manager.m.c.7
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    c.this.f.visible(false);
                }
            };
            if (this.k == 0) {
                xVar.f(com.censivn.C3DEngine.b.b.a.z - com.censivn.C3DEngine.b.b.a.a(30.0f));
            } else {
                xVar.f(com.censivn.C3DEngine.b.b.a.A + com.censivn.C3DEngine.b.b.a.a(30.0f));
            }
            w.a(this.f);
            w.a(this.f, 350, xVar);
        }
    }

    public void j() {
        if (this.l && this.q) {
            this.q = false;
            this.f.visible(true);
            x xVar = new x() { // from class: com.tsf.shell.manager.m.c.8
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    c.this.f.mouseEnabled(true);
                }
            };
            xVar.f(r());
            w.a(this.f);
            w.a(this.f, 350, xVar);
        }
    }

    public l k() {
        return this.c;
    }

    @Override // com.tsf.shell.e.i.b
    public ArrayList b() {
        return this.e.children();
    }

    public void a(com.tsf.shell.e.i.c cVar, boolean z) {
        cVar.a(this.j);
        if (z) {
            cVar.K().onUpdateContainer(-5);
        }
    }

    private void p() {
        this.f.position().x = r();
        this.d.setAABBPX((-a) / 2.0f, -com.censivn.C3DEngine.b.b.a.E, 0.0f, a / 2.0f, 0.0f, 0.0f);
        this.d.position().y = com.censivn.C3DEngine.b.b.a.B;
        this.d.position().x = s();
        this.d.h();
        f();
    }

    private int q() {
        return this.g ? this.k == 0 ? 180 : 0 : this.k == 0 ? 0 : 180;
    }

    private float r() {
        if (this.g) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.a.z + a;
            }
            return com.censivn.C3DEngine.b.b.a.A - a;
        }
        if (this.l) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.a.z + com.censivn.C3DEngine.b.b.a.a(30.0f);
            }
            return com.censivn.C3DEngine.b.b.a.A - com.censivn.C3DEngine.b.b.a.a(30.0f);
        }
        if (this.k == 0) {
            return com.censivn.C3DEngine.b.b.a.z - com.censivn.C3DEngine.b.b.a.a(60.0f);
        }
        return com.censivn.C3DEngine.b.b.a.A + com.censivn.C3DEngine.b.b.a.a(60.0f);
    }

    private float s() {
        if (this.g) {
            if (this.k == 0) {
                return com.censivn.C3DEngine.b.b.a.z + (a / 2.0f);
            }
            return com.censivn.C3DEngine.b.b.a.A - (a / 2.0f);
        }
        if (this.k == 0) {
            return com.censivn.C3DEngine.b.b.a.z - (a / 2.0f);
        }
        return com.censivn.C3DEngine.b.b.a.A + (a / 2.0f);
    }

    public void l() {
        if (this.g) {
            t();
        } else {
            c(true);
        }
    }

    public boolean m() {
        return this.p;
    }

    public void c(boolean z) {
        if (!com.tsf.shell.manager.a.h.s().a()) {
            this.p = !z;
            if (!this.g) {
                this.g = true;
                com.tsf.shell.manager.a.e.a(this.i, ItemInfo.APP_INTENT, (Runnable) null);
                com.tsf.shell.manager.a.o.k();
                this.f.visible(true);
                x xVar = new x();
                xVar.f(r());
                xVar.a(com.censivn.C3DEngine.b.g.a.e);
                w.a(this.f);
                w.a(this.f, 500, xVar);
                this.f.a(q(), true);
                x xVar2 = new x();
                xVar2.f(s());
                xVar2.a(com.censivn.C3DEngine.b.g.a.a);
                w.a(this.d);
                w.a(this.d, 500, xVar2);
                this.d.visible(true);
                this.d.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        a((Runnable) null);
    }

    public void a(Runnable runnable) {
        if (this.g) {
            this.g = false;
            com.tsf.shell.manager.a.e.a(runnable, true);
            com.tsf.shell.manager.a.o.i();
            x xVar = new x() { // from class: com.tsf.shell.manager.m.c.9
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    if (!c.this.l) {
                        c.this.f.visible(false);
                    }
                    if (c.this.d != null) {
                        c.this.d.k();
                    }
                }
            };
            xVar.f(r());
            xVar.a(com.censivn.C3DEngine.b.g.a.e);
            w.a(this.f);
            w.a(this.f, 500, xVar);
            this.f.a(q(), true);
            x xVar2 = new x() { // from class: com.tsf.shell.manager.m.c.10
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    c.this.d.visible(false);
                }
            };
            xVar2.f(s());
            w.a(this.d);
            w.a(this.d, 300, xVar2);
        }
    }

    public void a(ArrayList arrayList, String str) {
        Iterator it = h.a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.b a2 = com.tsf.shell.manager.l.a.a((ItemInfo) it.next(), true);
            a((com.tsf.shell.e.i.c) a2, false);
            this.e.addChild(a2);
        }
        this.e.a();
    }

    public static String n() {
        Cursor query = com.censivn.C3DEngine.a.d().getContentResolver().query(com.tsf.shell.w.a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    public void o() {
        if (this.r == null) {
            u();
        }
        if (!this.s) {
            this.s = true;
            com.censivn.C3DEngine.a.a().c(this.r);
        }
    }

    private void u() {
        this.r = new Runnable() { // from class: com.tsf.shell.manager.m.c.2
            @Override // java.lang.Runnable
            public void run() {
                c.this.s = false;
                Iterator it = c.this.e.children().iterator();
                final String str = "";
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    if (jVar instanceof com.tsf.shell.e.i.c) {
                        str = String.valueOf(str) + ((com.tsf.shell.e.i.c) jVar).K().id + ",";
                    }
                }
                com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.m.c.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ContentResolver contentResolver = com.censivn.C3DEngine.a.d().getContentResolver();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("child", str);
                        contentResolver.update(ContentUris.withAppendedId(com.tsf.shell.w.a, 1L), contentValues, null, null);
                        contentValues.clear();
                    }
                });
            }
        };
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        p();
    }
}
