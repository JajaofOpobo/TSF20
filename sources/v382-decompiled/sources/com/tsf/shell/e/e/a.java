package com.tsf.shell.e.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a {
    private static com.censivn.C3DEngine.b.f.l a;
    private static com.censivn.C3DEngine.b.f.m b;
    private static com.censivn.C3DEngine.b.f.m c;
    private static float d;
    private static TextureElement e;
    private static TextureElement f;
    private static TextureElement g;
    private static int h;
    private static int i;
    private static com.tsf.shell.e.i.c j;
    private static com.tsf.shell.e.i.d k;
    private static u l;
    private static h m;
    private static com.tsf.shell.e.i.c n;
    private static com.tsf.shell.e.i.c o;
    private static ArrayList p;
    private static boolean q = false;

    public static void a() {
        l = new u();
        m = new h();
        d = 25.0f * com.censivn.C3DEngine.b.b.a.a;
        k = new b();
        Bitmap a2 = com.tsf.shell.utils.x.a(R.drawable.alignment_light);
        e = com.censivn.C3DEngine.a.g().a(a2, true);
        a2.recycle();
        Bitmap a3 = com.tsf.shell.utils.x.a(R.drawable.alignment_unmatch_bg);
        f = com.censivn.C3DEngine.a.g().a(a3, true);
        i = f.id;
        a3.recycle();
        Bitmap a4 = com.tsf.shell.utils.x.a(R.drawable.alignment_match_bg);
        g = com.censivn.C3DEngine.a.g().a(a4, true);
        h = g.id;
        a4.recycle();
        a = new com.censivn.C3DEngine.b.f.l() { // from class: com.tsf.shell.e.e.a.1
            @Override // com.censivn.C3DEngine.b.f.j
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

    private static com.censivn.C3DEngine.b.f.m a(boolean z) {
        com.censivn.C3DEngine.b.f.m mVar;
        float f2 = 16.0f;
        boolean z2 = false;
        final com.censivn.C3DEngine.b.f.m mVar2 = new com.censivn.C3DEngine.b.f.m(128.0f, 16.0f, false);
        mVar2.useVBO(false);
        mVar2.textures().addElement(e);
        final com.censivn.C3DEngine.b.f.m mVar3 = new com.censivn.C3DEngine.b.f.m(128.0f, 16.0f, false);
        mVar3.useVBO(false);
        mVar3.textures().addElement(e);
        if (z) {
            mVar = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.F, f2, z2) { // from class: com.tsf.shell.e.e.a.2
                @Override // com.censivn.C3DEngine.b.f.j
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.a.F / 2;
                    float f4 = a.j.position().x;
                    mVar2.position().x += 5.0f;
                    mVar3.position().x -= 5.0f;
                    if (mVar2.position().x > f3) {
                        mVar2.position().x = f4;
                    }
                    if (mVar3.position().x < (-f3)) {
                        mVar3.position().x = f4;
                    }
                }
            };
        } else {
            mVar = new com.censivn.C3DEngine.b.f.m(com.censivn.C3DEngine.b.b.a.G, f2, z2) { // from class: com.tsf.shell.e.e.a.3
                @Override // com.censivn.C3DEngine.b.f.j
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.a.G / 2;
                    float f4 = a.j.position().y;
                    mVar2.position().x += 5.0f;
                    mVar3.position().x -= 5.0f;
                    if (mVar2.position().x > f3) {
                        mVar2.position().x = f4;
                    }
                    if (mVar3.position().x < (-f3)) {
                        mVar3.position().x = f4;
                    }
                }
            };
            mVar.rotation().z = 90.0f;
        }
        if (z) {
            mVar.textures().addElement(f);
        } else {
            mVar.textures().addElement(g);
        }
        mVar.useVBO(false);
        mVar.addChild(mVar3);
        mVar.addChild(mVar2);
        return mVar;
    }

    public static void a(float f2, float f3) {
        if (p != null) {
            Iterator it = p.iterator();
            com.tsf.shell.e.i.c cVar = null;
            com.tsf.shell.e.i.c cVar2 = null;
            float f4 = 2.1474836E9f;
            float f5 = 2.1474836E9f;
            while (it.hasNext()) {
                com.censivn.C3DEngine.b.f.j jVar = (com.censivn.C3DEngine.b.f.j) it.next();
                if ((jVar instanceof com.tsf.shell.e.i.c) && !(jVar instanceof com.tsf.shell.e.i.b.c.a)) {
                    com.tsf.shell.e.i.c cVar3 = (com.tsf.shell.e.i.c) jVar;
                    float abs = Math.abs(cVar3.position().x - f2);
                    float abs2 = Math.abs(cVar3.position().y - f3);
                    if (abs < d && abs < f5) {
                        cVar2 = cVar3;
                        f5 = abs;
                    }
                    if (abs2 < d && abs2 < f4) {
                        cVar = cVar3;
                        f4 = abs2;
                    }
                }
            }
            if (cVar2 != null) {
                g.id = h;
                if (cVar2 != n) {
                    if (n != null) {
                        n.F();
                    }
                    n = cVar2;
                    n.E();
                }
                j.position().x = cVar2.position().x;
            } else {
                g.id = i;
                if (n != null) {
                    n.F();
                    n = null;
                }
                j.position().x = f2;
            }
            if (cVar != null) {
                f.id = h;
                if (cVar != o) {
                    if (o != null) {
                        o.F();
                    }
                    o = cVar;
                    o.E();
                }
                j.position().y = cVar.position().y;
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

    public static void a(com.tsf.shell.e.i.c cVar) {
        com.tsf.shell.e.f.g z = cVar.z();
        if (!q && z != null) {
            p = z.R();
            q = true;
            f.id = i;
            g.id = i;
            cVar.c(true);
            j = cVar;
            j.setFocus();
            com.censivn.C3DEngine.b.f.l lVar = (com.censivn.C3DEngine.b.f.l) cVar.parent();
            lVar.addChildAt(a, lVar.getChildIndexOf(cVar));
            com.censivn.C3DEngine.b.c.c.a(m);
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
            com.censivn.C3DEngine.b.c.c.b(m);
            com.tsf.shell.manager.a.b.b(l);
            q = false;
        }
    }

    public static void a(int i2, int i3) {
        b.a(com.censivn.C3DEngine.b.b.a.F);
        c.a(com.censivn.C3DEngine.b.b.a.G);
    }
}
