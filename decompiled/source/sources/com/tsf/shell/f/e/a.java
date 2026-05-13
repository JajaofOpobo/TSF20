package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {
    private static com.censivn.C3DEngine.b.f.j a;
    private static com.censivn.C3DEngine.b.f.k b;
    private static com.censivn.C3DEngine.b.f.k c;
    private static float d;
    private static TextureElement e;
    private static TextureElement f;
    private static TextureElement g;
    private static int h;
    private static int i;
    private static com.tsf.shell.f.i.b j;
    private static b.a k;
    private static q l;
    private static g m;
    private static com.tsf.shell.f.i.b n;
    private static com.tsf.shell.f.i.b o;
    private static ArrayList<com.censivn.C3DEngine.b.f.i> p;
    private static boolean q = false;

    public static void a() {
        l = new q();
        m = new g();
        d = 25.0f * com.censivn.C3DEngine.b.b.a.a;
        k = new C0091a();
        Bitmap a2 = x.a(b.d.alignment_light);
        e = com.censivn.C3DEngine.a.g().a(a2, true);
        a2.recycle();
        Bitmap a3 = x.a(b.d.alignment_unmatch_bg);
        f = com.censivn.C3DEngine.a.g().a(a3, true);
        i = f.id;
        a3.recycle();
        Bitmap a4 = x.a(b.d.alignment_match_bg);
        g = com.censivn.C3DEngine.a.g().a(a4, true);
        h = g.id;
        a4.recycle();
        a = new com.censivn.C3DEngine.b.f.j() { // from class: com.tsf.shell.f.e.a.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
                if (a.j != null) {
                    a.b.position().y = a.j.position().y;
                    a.c.position().x = a.j.position().x;
                }
            }
        };
        a.setAnimationObjectState(true);
        b = a(true);
        c = a(false);
        a.addChild(b);
        a.addChild(c);
    }

    private static com.censivn.C3DEngine.b.f.k a(boolean z) {
        com.censivn.C3DEngine.b.f.k kVar;
        final com.censivn.C3DEngine.b.f.k kVar2 = new com.censivn.C3DEngine.b.f.k(128.0f, 16.0f, false);
        kVar2.useVBO(false);
        kVar2.textures().addElement(e);
        final com.censivn.C3DEngine.b.f.k kVar3 = new com.censivn.C3DEngine.b.f.k(128.0f, 16.0f, false);
        kVar3.useVBO(false);
        kVar3.textures().addElement(e);
        if (z) {
            kVar = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.F, 16.0f, false) { // from class: com.tsf.shell.f.e.a.2
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    float f2 = com.censivn.C3DEngine.b.b.a.F / 2;
                    float f3 = a.j.position().x;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f2) {
                        kVar2.position().x = f3;
                    }
                    if (kVar3.position().x < (-f2)) {
                        kVar3.position().x = f3;
                    }
                }
            };
        } else {
            kVar = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.G, 16.0f, false) { // from class: com.tsf.shell.f.e.a.3
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    float f2 = com.censivn.C3DEngine.b.b.a.G / 2;
                    float f3 = a.j.position().y;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f2) {
                        kVar2.position().x = f3;
                    }
                    if (kVar3.position().x < (-f2)) {
                        kVar3.position().x = f3;
                    }
                }
            };
            kVar.rotation().z = 90.0f;
        }
        if (z) {
            kVar.textures().addElement(f);
        } else {
            kVar.textures().addElement(g);
        }
        kVar.useVBO(false);
        kVar.addChild(kVar3);
        kVar.addChild(kVar2);
        return kVar;
    }

    public static void a(float f2, float f3) {
        com.tsf.shell.f.i.b bVar;
        float f4;
        com.tsf.shell.f.i.b bVar2;
        float f5;
        float f6 = 2.1474836E9f;
        if (p != null) {
            Iterator<com.censivn.C3DEngine.b.f.i> it = p.iterator();
            com.tsf.shell.f.i.b bVar3 = null;
            com.tsf.shell.f.i.b bVar4 = null;
            float f7 = 2.1474836E9f;
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.i next = it.next();
                if ((next instanceof com.tsf.shell.f.i.b) && !(next instanceof com.tsf.shell.f.i.b.c.a)) {
                    bVar = (com.tsf.shell.f.i.b) next;
                    float abs = Math.abs(bVar.position().x - f2);
                    float abs2 = Math.abs(bVar.position().y - f3);
                    if (abs < d && abs < f7) {
                        bVar4 = bVar;
                        f7 = abs;
                    }
                    if (abs2 < d && abs2 < f6) {
                        bVar2 = bVar4;
                        f5 = abs2;
                        f4 = f7;
                        f6 = f5;
                        f7 = f4;
                        bVar4 = bVar2;
                        bVar3 = bVar;
                    }
                }
                bVar = bVar3;
                f4 = f7;
                bVar2 = bVar4;
                f5 = f6;
                f6 = f5;
                f7 = f4;
                bVar4 = bVar2;
                bVar3 = bVar;
            }
            if (bVar4 != null) {
                g.id = h;
                if (bVar4 != n) {
                    if (n != null) {
                        n.F();
                    }
                    n = bVar4;
                    n.E();
                }
                j.position().x = bVar4.position().x;
            } else {
                g.id = i;
                if (n != null) {
                    n.F();
                    n = null;
                }
                j.position().x = f2;
            }
            if (bVar3 != null) {
                f.id = h;
                if (bVar3 != o) {
                    if (o != null) {
                        o.F();
                    }
                    o = bVar3;
                    o.E();
                }
                j.position().y = bVar3.position().y;
                return;
            }
            f.id = i;
            if (o != null) {
                o.F();
                o = null;
            }
            j.position().y = f3;
        }
    }

    public static void a(com.tsf.shell.f.i.b bVar) {
        com.tsf.shell.f.f.g z = bVar.z();
        if (!q && z != null) {
            p = z.R();
            q = true;
            f.id = i;
            g.id = i;
            bVar.c(true);
            j = bVar;
            j.setFocus();
            com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) bVar.parent();
            jVar.addChildAt(a, jVar.getChildIndexOf(bVar));
            com.censivn.C3DEngine.b.c.b.a(m);
            com.tsf.shell.manager.a.b.a(l);
            b.a(com.censivn.C3DEngine.b.b.a.F);
            c.a(com.censivn.C3DEngine.b.b.a.G);
        }
    }

    public static void b() {
        if (q) {
            if (o != null) {
                o.F();
            }
            if (n != null) {
                n.F();
            }
            j.c(false);
            a.removeFromParent();
            com.censivn.C3DEngine.b.c.b.b(m);
            com.tsf.shell.manager.a.b.b(l);
            q = false;
        }
    }

    /* renamed from: com.tsf.shell.f.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0091a implements b.a {
        C0091a() {
        }
    }

    public static void a(int i2, int i3) {
        b.a(com.censivn.C3DEngine.b.b.a.F);
        c.a(com.censivn.C3DEngine.b.b.a.G);
    }
}
