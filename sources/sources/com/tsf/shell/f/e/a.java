package com.tsf.shell.f.e;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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
        Bitmap bitmapA = x.a(b.d.alignment_light);
        e = com.censivn.C3DEngine.a.g().a(bitmapA, true);
        bitmapA.recycle();
        Bitmap bitmapA2 = x.a(b.d.alignment_unmatch_bg);
        f = com.censivn.C3DEngine.a.g().a(bitmapA2, true);
        i = f.id;
        bitmapA2.recycle();
        Bitmap bitmapA3 = x.a(b.d.alignment_match_bg);
        g = com.censivn.C3DEngine.a.g().a(bitmapA3, true);
        h = g.id;
        bitmapA3.recycle();
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
        float f2 = 16.0f;
        boolean z2 = false;
        final com.censivn.C3DEngine.b.f.k kVar2 = new com.censivn.C3DEngine.b.f.k(128.0f, 16.0f, false);
        kVar2.useVBO(false);
        kVar2.textures().addElement(e);
        final com.censivn.C3DEngine.b.f.k kVar3 = new com.censivn.C3DEngine.b.f.k(128.0f, 16.0f, false);
        kVar3.useVBO(false);
        kVar3.textures().addElement(e);
        if (z) {
            kVar = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.F, f2, z2) { // from class: com.tsf.shell.f.e.a.2
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.a.F / 2;
                    float f4 = a.j.position().x;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f3) {
                        kVar2.position().x = f4;
                    }
                    if (kVar3.position().x < (-f3)) {
                        kVar3.position().x = f4;
                    }
                }
            };
        } else {
            kVar = new com.censivn.C3DEngine.b.f.k(com.censivn.C3DEngine.b.b.a.G, f2, z2) { // from class: com.tsf.shell.f.e.a.3
                @Override // com.censivn.C3DEngine.b.f.i
                public void onDrawStart() {
                    float f3 = com.censivn.C3DEngine.b.b.a.G / 2;
                    float f4 = a.j.position().y;
                    kVar2.position().x += 5.0f;
                    kVar3.position().x -= 5.0f;
                    if (kVar2.position().x > f3) {
                        kVar2.position().x = f4;
                    }
                    if (kVar3.position().x < (-f3)) {
                        kVar3.position().x = f4;
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

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6 A[PHI: r2 r5
  0x00e6: PHI (r2v6 com.tsf.shell.f.i.b) = (r2v1 com.tsf.shell.f.i.b), (r2v1 com.tsf.shell.f.i.b), (r2v10 com.tsf.shell.f.i.b), (r2v10 com.tsf.shell.f.i.b) binds: [B:9:0x001f, B:11:0x0023, B:18:0x004d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x00e6: PHI (r5v2 float) = (r5v1 float), (r5v1 float), (r5v4 float), (r5v4 float) binds: [B:9:0x001f, B:11:0x0023, B:18:0x004d, B:20:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(float r10, float r11) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.e.a.a(float, float):void");
    }

    public static void a(com.tsf.shell.f.i.b bVar) {
        com.tsf.shell.f.f.g gVarZ = bVar.z();
        if (!q && gVarZ != null) {
            p = gVarZ.R();
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

    /* JADX INFO: renamed from: com.tsf.shell.f.e.a$a, reason: collision with other inner class name */
    static class C0091a implements b.a {
        C0091a() {
        }
    }

    public static void a(int i2, int i3) {
        b.a(com.censivn.C3DEngine.b.b.a.F);
        c.a(com.censivn.C3DEngine.b.b.a.G);
    }
}
