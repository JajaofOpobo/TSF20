package com.censivn.C3DEngine.b.g;

import com.censivn.C3DEngine.b.f.i;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
/* loaded from: classes.dex */
public class c {
    private static Object a = new Object();
    private static Vector<com.censivn.C3DEngine.b.g.a.c> b = new Vector<>();
    private static boolean c = false;
    private static ArrayList<com.censivn.C3DEngine.b.g.a.c> d = new ArrayList<>();
    private static ArrayList<com.censivn.C3DEngine.b.g.a.c> e = new ArrayList<>();

    public static void a(com.censivn.C3DEngine.b.g.a.c cVar) {
        if (c) {
            d.add(cVar);
            return;
        }
        b.addElement(cVar);
        com.censivn.C3DEngine.a.e().k();
    }

    public static void b(com.censivn.C3DEngine.b.g.a.c cVar) {
        if (c) {
            cVar.b = true;
            e.add(cVar);
            return;
        }
        b.removeElement(cVar);
    }

    public static void a() {
        c = true;
        if (b.size() > 0) {
            Enumeration<com.censivn.C3DEngine.b.g.a.c> elements = b.elements();
            while (elements.hasMoreElements()) {
                com.censivn.C3DEngine.b.g.a.c nextElement = elements.nextElement();
                if (nextElement != null && !nextElement.b) {
                    nextElement.c();
                }
            }
            com.censivn.C3DEngine.a.e().j();
        }
        c = false;
        while (!d.isEmpty()) {
            a(d.remove(0));
        }
        while (!e.isEmpty()) {
            b(e.remove(0));
        }
    }

    public static void b() {
        if (b.size() > 0) {
            Enumeration<com.censivn.C3DEngine.b.g.a.c> elements = b.elements();
            while (elements.hasMoreElements()) {
                d(elements.nextElement());
            }
            com.censivn.C3DEngine.a.e().j();
        }
    }

    public static void c() {
        if (b.size() > 0) {
            Enumeration<com.censivn.C3DEngine.b.g.a.c> elements = b.elements();
            while (elements.hasMoreElements()) {
                c(elements.nextElement());
            }
            com.censivn.C3DEngine.a.e().j();
        }
    }

    public static void a(com.censivn.C3DEngine.b.g.b.a aVar, int i, d dVar) {
        final com.censivn.C3DEngine.b.g.a.c cVar;
        if (aVar != null) {
            if (dVar.e() == null) {
                dVar.a(a.o);
            }
            if (aVar instanceof i) {
                cVar = new com.censivn.C3DEngine.b.g.a.b((i) aVar, i, dVar);
            } else if (aVar instanceof com.censivn.C3DEngine.b.g.b.b) {
                cVar = new com.censivn.C3DEngine.b.g.a.d((com.censivn.C3DEngine.b.g.b.b) aVar, i, dVar);
            } else if (aVar instanceof com.censivn.C3DEngine.b.f.a.b) {
                cVar = new com.censivn.C3DEngine.b.g.a.a((com.censivn.C3DEngine.b.f.a.b) aVar, i, dVar);
            } else {
                cVar = null;
            }
            if (dVar.q) {
                Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.g.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.censivn.C3DEngine.b.g.a.c.this instanceof com.censivn.C3DEngine.b.g.a.b) {
                            ((com.censivn.C3DEngine.b.g.a.b) com.censivn.C3DEngine.b.g.a.c.this).b();
                        } else if (com.censivn.C3DEngine.b.g.a.c.this instanceof com.censivn.C3DEngine.b.g.a.a) {
                            ((com.censivn.C3DEngine.b.g.a.a) com.censivn.C3DEngine.b.g.a.c.this).b();
                        }
                        c.a(com.censivn.C3DEngine.b.g.a.c.this);
                    }
                };
                cVar.a(runnable);
                com.censivn.C3DEngine.a.a().b(runnable, dVar.B);
            } else if (i == 0) {
                cVar.c();
            } else {
                a(cVar);
            }
        }
    }

    public static void a(com.censivn.C3DEngine.b.g.b.a aVar) {
        com.censivn.C3DEngine.b.g.a.c tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null) {
            b(tweenChild);
            if (tweenChild.d() != null) {
                com.censivn.C3DEngine.a.a().g(tweenChild.d());
                tweenChild.a(null);
            }
            aVar.setTweenChild(null);
            tweenChild.a().f();
        }
    }

    private static void d(com.censivn.C3DEngine.b.g.a.c cVar) {
        if (cVar != null) {
            cVar.e();
        }
    }

    public static void b(com.censivn.C3DEngine.b.g.b.a aVar) {
        com.censivn.C3DEngine.b.g.a.c tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null) {
            tweenChild.e();
            b(tweenChild);
        }
    }

    public static void c(com.censivn.C3DEngine.b.g.a.c cVar) {
        if (cVar != null) {
            cVar.f();
        }
    }

    public static void c(com.censivn.C3DEngine.b.g.b.a aVar) {
        com.censivn.C3DEngine.b.g.a.c tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null && tweenChild.a == 1) {
            tweenChild.f();
            a(tweenChild);
        }
    }
}
