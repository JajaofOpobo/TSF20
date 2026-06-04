package com.tsf.shell.workspace3D.g;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import com.tsf.shell.bd;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {
    private static com.censivn.C3DEngine.b.v a;
    private static com.censivn.C3DEngine.e.b b;
    private static com.censivn.C3DEngine.e.b c;
    private static float d;
    private static TextureElement e;
    private static TextureElement f;
    private static TextureElement g;
    private static int h;
    private static int i;
    private static com.tsf.shell.workspace3D.k.j j;
    private static com.tsf.shell.workspace3D.k.n k;
    private static ai l;
    private static h m;
    private static com.tsf.shell.workspace3D.k.j n;
    private static com.tsf.shell.workspace3D.k.j o;
    private static boolean p = false;

    public static void a() {
        l = new ai();
        m = new h();
        d = 25.0f * com.censivn.C3DEngine.a.a;
        k = new e();
        Bitmap a2 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.alignment_light);
        e = com.censivn.C3DEngine.a.f().a(a2, true);
        a2.recycle();
        Bitmap a3 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.alignment_unmatch_bg);
        TextureElement a4 = com.censivn.C3DEngine.a.f().a(a3, true);
        f = a4;
        i = a4.id;
        a3.recycle();
        Bitmap a5 = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.alignment_match_bg);
        TextureElement a6 = com.censivn.C3DEngine.a.f().a(a5, true);
        g = a6;
        h = a6.id;
        a5.recycle();
        b bVar = new b();
        a = bVar;
        bVar.a_(true);
        b = a(true);
        c = a(false);
        a.d(b);
        a.d(c);
    }

    private static com.censivn.C3DEngine.e.b a(boolean z) {
        com.censivn.C3DEngine.e.b dVar;
        com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(128.0f, 16.0f, (byte) 0);
        bVar.c((Boolean) false);
        bVar.z().c(e);
        com.censivn.C3DEngine.e.b bVar2 = new com.censivn.C3DEngine.e.b(128.0f, 16.0f, (byte) 0);
        bVar2.c((Boolean) false);
        bVar2.z().c(e);
        if (z) {
            dVar = new c(com.censivn.C3DEngine.a.l, bVar, bVar2);
        } else {
            dVar = new d(com.censivn.C3DEngine.a.m, bVar, bVar2);
            dVar.M().z = 90.0f;
        }
        if (z) {
            dVar.z().c(f);
        } else {
            dVar.z().c(g);
        }
        dVar.c((Boolean) false);
        dVar.d(bVar2);
        dVar.d(bVar);
        return dVar;
    }

    public static void a(float f2, float f3) {
        Iterator it = j.bc().aZ().iterator();
        com.tsf.shell.workspace3D.k.j jVar = null;
        com.tsf.shell.workspace3D.k.j jVar2 = null;
        float f4 = 2.1474836E9f;
        float f5 = 2.1474836E9f;
        while (it.hasNext()) {
            com.censivn.C3DEngine.b.r rVar = (com.censivn.C3DEngine.b.r) it.next();
            if ((rVar instanceof com.tsf.shell.workspace3D.k.j) && !(rVar instanceof com.tsf.shell.workspace3D.k.c.a.h)) {
                com.tsf.shell.workspace3D.k.j jVar3 = (com.tsf.shell.workspace3D.k.j) rVar;
                float abs = Math.abs(jVar3.L().x - f2);
                float abs2 = Math.abs(jVar3.L().y - f3);
                if (abs < d && abs < f5) {
                    jVar2 = jVar3;
                    f5 = abs;
                }
                if (abs2 < d && abs2 < f4) {
                    jVar = jVar3;
                    f4 = abs2;
                }
            }
        }
        if (jVar2 != null) {
            g.id = h;
            if (jVar2 != n) {
                if (n != null) {
                    n.aM();
                }
                n = jVar2;
                jVar2.h_();
            }
            j.L().x = jVar2.L().x;
        } else {
            g.id = i;
            if (n != null) {
                n.aM();
                n = null;
            }
            j.L().x = f2;
        }
        if (jVar != null) {
            f.id = h;
            if (jVar != o) {
                if (o != null) {
                    o.aM();
                }
                o = jVar;
                jVar.h_();
            }
            j.L().y = jVar.L().y;
            return;
        }
        f.id = i;
        if (o != null) {
            o.aM();
            o = null;
        }
        j.L().y = f3;
    }

    public static void a(com.tsf.shell.workspace3D.k.j jVar) {
        if (!p) {
            p = true;
            f.id = i;
            g.id = i;
            jVar.k(true);
            j = jVar;
            jVar.az();
            com.censivn.C3DEngine.b.v vVar = (com.censivn.C3DEngine.b.v) jVar.P();
            vVar.a(a, vVar.f(jVar));
            com.tsf.shell.aq.a(m);
            bd.a(l);
            b.a_(com.censivn.C3DEngine.a.l);
            c.a_(com.censivn.C3DEngine.a.m);
        }
    }

    public static void b() {
        if (p) {
            if (o != null) {
                o.aM();
            }
            if (n != null) {
                n.aM();
            }
            j.k(false);
            a.Q();
            com.tsf.shell.aq.b(m);
            bd.b(l);
            p = false;
        }
    }

    public static void c() {
        b.a_(com.censivn.C3DEngine.a.l);
        c.a_(com.censivn.C3DEngine.a.m);
    }
}
