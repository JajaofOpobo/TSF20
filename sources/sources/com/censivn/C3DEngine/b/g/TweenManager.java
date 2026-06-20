package com.censivn.C3DEngine.b.g;

import com.censivn.C3DEngine.b.f.IRenderable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TweenManager {
    private static Object a = new Object();
    private static Vector<com.censivn.C3DEngine.b.g.a.AbstractTween> b = new Vector<>();
    private static boolean c = false;
    private static ArrayList<com.censivn.C3DEngine.b.g.a.AbstractTween> d = new ArrayList<>();
    private static ArrayList<com.censivn.C3DEngine.b.g.a.AbstractTween> e = new ArrayList<>();

    public static void a(com.censivn.C3DEngine.b.g.a.AbstractTween cVar) {
        if (C) {
            d.add(cVar);
        } else {
            b.addElement(cVar);
            com.censivn.C3DEngine.C3DEngine.e().k();
        }
    }

    public static void b(com.censivn.C3DEngine.b.g.a.AbstractTween cVar) {
        if (C) {
            cVar.b = true;
            e.add(cVar);
        } else {
            b.removeElement(cVar);
        }
    }

    public static void a() {
        c = true;
        if (b.size() > 0) {
            Enumeration<com.censivn.C3DEngine.b.g.a.AbstractTween> enumerationElements = b.elements();
            while (enumerationElements.hasMoreElements()) {
                com.censivn.C3DEngine.b.g.a.AbstractTween cVarNextElement = enumerationElements.nextElement();
                if (cVarNextElement != null && !cVarNextElement.b) {
                    cVarNextElement.c();
                }
            }
            com.censivn.C3DEngine.C3DEngine.e().j();
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
            Enumeration<com.censivn.C3DEngine.b.g.a.AbstractTween> enumerationElements = b.elements();
            while (enumerationElements.hasMoreElements()) {
                d(enumerationElements.nextElement());
            }
            com.censivn.C3DEngine.C3DEngine.e().j();
        }
    }

    public static void c() {
        if (b.size() > 0) {
            Enumeration<com.censivn.C3DEngine.b.g.a.AbstractTween> enumerationElements = b.elements();
            while (enumerationElements.hasMoreElements()) {
                c(enumerationElements.nextElement());
            }
            com.censivn.C3DEngine.C3DEngine.e().j();
        }
    }

    public static void a(com.censivn.C3DEngine.b.g._b.ITweenTarget aVar, int i, d dVar) {
        final com.censivn.C3DEngine.b.g.a.AbstractTween aVar2;
        if (aVar != null) {
            if (dVar.e() == null) {
                dVar.a(a.o);
            }
            if (aVar instanceof i) {
                aVar2 = new com.censivn.C3DEngine.b.g.a.PropertyTween((IRenderable) aVar, i, dVar);
            } else if (aVar instanceof com.censivn.C3DEngine.b.g._b.TweenTargetWrapper) {
                aVar2 = new com.censivn.C3DEngine.b.g.a.TimedTween((com.censivn.C3DEngine.b.g._b.TweenTargetWrapper) aVar, i, dVar);
            } else if (aVar instanceof com.censivn.C3DEngine.b.f.a.SpriteItemData) {
                aVar2 = new com.censivn.C3DEngine.b.g.a.RenderableTween((com.censivn.C3DEngine.b.f.a.SpriteItemData) aVar, i, dVar);
            } else {
                aVar2 = null;
            }
            if (dVar.q) {
                Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.g.TweenUtils.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (aVar2 instanceof com.censivn.C3DEngine.b.g.a.PropertyTween) {
                            ((com.censivn.C3DEngine.b.g.a.PropertyTween) aVar2).b();
                        } else if (aVar2 instanceof com.censivn.C3DEngine.b.g.a.RenderableTween) {
                            ((com.censivn.C3DEngine.b.g.a.RenderableTween) aVar2).b();
                        }
                        c.a(aVar2);
                    }
                };
                aVar2.a(runnable);
                com.censivn.C3DEngine.C3DEngine.a().b(runnable, dVar.B);
            } else if (i == 0) {
                aVar2.c();
            } else {
                a(aVar2);
            }
        }
    }

    public static void a(com.censivn.C3DEngine.b.g._b.ITweenTarget aVar) {
        com.censivn.C3DEngine.b.g.a.AbstractTween tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null) {
            b(tweenChild);
            if (tweenChild.d() != null) {
                com.censivn.C3DEngine.C3DEngine.a().g(tweenChild.d());
                tweenChild.a(null);
            }
            aVar.setTweenChild(null);
            tweenChild.a().f();
        }
    }

    private static void d(com.censivn.C3DEngine.b.g.a.AbstractTween cVar) {
        if (cVar != null) {
            cVar.e();
        }
    }

    public static void b(com.censivn.C3DEngine.b.g._b.ITweenTarget aVar) {
        com.censivn.C3DEngine.b.g.a.AbstractTween tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null) {
            tweenChild.e();
            b(tweenChild);
        }
    }

    public static void c(com.censivn.C3DEngine.b.g.a.AbstractTween cVar) {
        if (cVar != null) {
            cVar.f();
        }
    }

    public static void c(com.censivn.C3DEngine.b.g._b.ITweenTarget aVar) {
        com.censivn.C3DEngine.b.g.a.AbstractTween tweenChild;
        if (aVar != null && (tweenChild = aVar.getTweenChild()) != null && tweenChild.a == 1) {
            tweenChild.f();
            a(tweenChild);
        }
    }
}
