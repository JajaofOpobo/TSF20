package com.censivn.C3DEngine.g;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes.dex */
public final class s {
    private static Object a = new Object();
    private static Vector b = new Vector();
    private static boolean c = false;
    private static ArrayList d = new ArrayList();
    private static ArrayList e = new ArrayList();

    public static void a(com.censivn.C3DEngine.g.a.c cVar) {
        if (c) {
            d.add(cVar);
        } else {
            b.addElement(cVar);
            com.censivn.C3DEngine.a.TouchDispatcher().h();
        }
    }

    public static void b(com.censivn.C3DEngine.g.a.c cVar) {
        if (c) {
            e.add(cVar);
        } else {
            b.removeElement(cVar);
        }
    }

    public static void a() {
        c = true;
        if (b.size() > 0) {
            Enumeration elements = b.elements();
            while (elements.hasMoreElements()) {
                com.censivn.C3DEngine.g.a.c cVar = (com.censivn.C3DEngine.g.a.c) elements.nextElement();
                if (cVar != null) {
                    cVar.c();
                }
            }
            com.censivn.C3DEngine.a.TouchDispatcher().g();
        }
        c = false;
        while (!d.isEmpty()) {
            a((com.censivn.C3DEngine.g.a.c) d.remove(0));
        }
        while (!e.isEmpty()) {
            b((com.censivn.C3DEngine.g.a.c) e.remove(0));
        }
    }

    public static void b() {
        if (b.size() > 0) {
            Enumeration elements = b.elements();
            while (elements.hasMoreElements()) {
                com.censivn.C3DEngine.g.a.c cVar = (com.censivn.C3DEngine.g.a.c) elements.nextElement();
                if (cVar != null) {
                    cVar.h();
                }
            }
            com.censivn.C3DEngine.a.TouchDispatcher().g();
        }
    }

    public static void c() {
        if (b.size() > 0) {
            Enumeration elements = b.elements();
            while (elements.hasMoreElements()) {
                com.censivn.C3DEngine.g.a.c cVar = (com.censivn.C3DEngine.g.a.c) elements.nextElement();
                if (cVar != null) {
                    cVar.i();
                }
            }
            com.censivn.C3DEngine.a.TouchDispatcher().g();
        }
    }

    public static void a(com.censivn.C3DEngine.g.b.a aVar, int i, u uVar) {
        com.censivn.C3DEngine.g.a.c cVar;
        if (aVar != null) {
            if (uVar.c() == null) {
                uVar.a(a.l);
            }
            if (aVar instanceof com.censivn.C3DEngine.b.r) {
                cVar = new com.censivn.C3DEngine.g.a.b((com.censivn.C3DEngine.b.r) aVar, i, uVar);
            } else if (aVar instanceof com.censivn.C3DEngine.g.b.b) {
                cVar = new com.censivn.C3DEngine.g.a.d((com.censivn.C3DEngine.g.b.b) aVar, i, uVar);
            } else if (aVar instanceof com.censivn.C3DEngine.e.a.c) {
                cVar = new com.censivn.C3DEngine.g.a.a((com.censivn.C3DEngine.e.a.c) aVar, i, uVar);
            } else {
                cVar = null;
            }
            if (uVar.l) {
                com.censivn.C3DEngine.a.RendererImpl().postDelayed(new t(cVar), uVar.w);
            } else if (i == 0) {
                cVar.c();
            } else {
                a(cVar);
            }
        }
    }

    public static void a(com.censivn.C3DEngine.g.b.a aVar) {
        com.censivn.C3DEngine.g.a.c ay;
        if (aVar != null && (ay = aVar.ay()) != null) {
            b(ay);
            if (ay.e() != null) {
                ay.e().removeCallbacks(ay.g());
                ay.d();
                ay.f();
            }
            aVar.a(null);
        }
    }

    public static void b(com.censivn.C3DEngine.g.b.a aVar) {
        com.censivn.C3DEngine.g.a.c ay;
        if (aVar != null && (ay = aVar.ay()) != null) {
            ay.h();
            b(ay);
        }
    }

    public static void c(com.censivn.C3DEngine.g.b.a aVar) {
        com.censivn.C3DEngine.g.a.c ay;
        if (aVar != null && (ay = aVar.ay()) != null) {
            ay.i();
            a(ay);
        }
    }
}
