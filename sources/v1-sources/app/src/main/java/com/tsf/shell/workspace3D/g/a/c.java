package com.tsf.shell.workspace3D.g.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.l;
import com.censivn.C3DEngine.b.v;
import com.censivn.C3DEngine.g.s;
import com.tsf.shell.aq;
import com.tsf.shell.bd;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.g.b.n;
import com.tsf.shell.workspace3D.k.ah;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {
    private static v a;
    private static com.censivn.C3DEngine.e.b b;
    private static TextureElement c;
    private static boolean d;
    private static n e;
    private static b f;
    private static i g;
    private static float i;
    private static float j;
    private static float m;
    private static float n;
    private static a o;
    private static ArrayList p;
    private static boolean h = true;
    private static boolean k = false;
    private static boolean l = false;

    public static void a(a aVar, v vVar, ArrayList arrayList, float f2) {
        if (p != null) {
            p.clear();
        }
        j = f2;
        p = new ArrayList();
        ArrayList arrayList2 = (ArrayList) bf.j().p().bu().clone();
        if (arrayList != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ah ahVar = (ah) it.next();
                if (!arrayList.contains(ahVar)) {
                    p.add(ahVar);
                }
            }
            arrayList.clear();
            arrayList2.clear();
        } else {
            p = arrayList2;
        }
        o = aVar;
        if (d) {
            e.j();
            e.k();
        } else {
            f = new b();
            g = new i();
            a = new d();
            Bitmap bitmap = ThemeManager.getInstance().getCurrentThemeDescription().shell.getBitmap(ThemeShellDescription.APP_ADDER_BG);
            c = com.censivn.C3DEngine.a.f().a(bitmap, true);
            bitmap.recycle();
            com.censivn.C3DEngine.e.b bVar = new com.censivn.C3DEngine.e.b(com.censivn.C3DEngine.a.j, 308.0f * com.censivn.C3DEngine.a.b, (byte) 0);
            b = bVar;
            bVar.z().c(c);
            a.d(b);
            e = new e(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.b * (-80.0f), com.censivn.C3DEngine.a.b * 80.0f, 152.0f * com.censivn.C3DEngine.a.b);
            a.d(e);
            a.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.b * (-80.0f), 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.b * 80.0f);
            a.a((l) new f(a));
            d = true;
        }
        if (a.P() == null) {
            a.L().y = n - (300.0f * com.censivn.C3DEngine.a.b);
        } else {
            a.Q();
        }
        vVar.d(a);
        m();
        h = true;
        a.e(false);
        a.az();
        l = true;
        i = n + f2;
        aq.a(f);
        bd.a(g);
        g gVar = new g();
        gVar.h(i);
        s.a(a);
        s.a(a, ThemeShellDescription.PAGE_PREVIEW_SELECT, gVar);
    }

    public static void a() {
        if (l) {
            aq.b(f);
            bd.b(g);
            l = false;
            o.d();
            a.e(false);
            h hVar = new h();
            hVar.h(n - (300.0f * com.censivn.C3DEngine.a.b));
            s.a(a);
            s.a(a, ThemeShellDescription.PAGE_PREVIEW_SELECT, hVar);
        }
    }

    private static void m() {
        a.b(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.b * (-80.0f), 0.0f, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.b * 80.0f);
        b.a_(com.censivn.C3DEngine.a.j);
        e.a(com.censivn.C3DEngine.a.e, com.censivn.C3DEngine.a.f, com.censivn.C3DEngine.a.b * (-80.0f), com.censivn.C3DEngine.a.b * 80.0f);
        if (a.P() != null) {
            float f2 = ((v) a.P()).d(new Number3d(0.0f, 0.0f, 0.0f)).y;
            m = com.censivn.C3DEngine.a.g + f2;
            float f3 = f2 + com.censivn.C3DEngine.a.h;
            n = f3;
            i = f3 + j;
            if (l) {
                a.L().y = i;
            }
        }
    }

    public static void b() {
        m();
    }
}
