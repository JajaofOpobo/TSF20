package com.censivn.C3DEngine.p031b.p041g;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.p042a.AbstractC1009c;
import com.censivn.C3DEngine.p031b.p041g.p042a.C1007a;
import com.censivn.C3DEngine.p031b.p041g.p042a.C1008b;
import com.censivn.C3DEngine.p031b.p041g.p042a.C1010d;
import com.censivn.C3DEngine.p031b.p041g.p043b.C1013b;
import com.censivn.C3DEngine.p031b.p041g.p043b.InterfaceC1012a;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
/* renamed from: com.censivn.C3DEngine.b.g.c */
/* loaded from: classes.dex */
public class C1014c {

    /* renamed from: a */
    private static Object f3010a = new Object();

    /* renamed from: b */
    private static Vector<AbstractC1009c> f3011b = new Vector<>();

    /* renamed from: c */
    private static boolean f3012c = false;

    /* renamed from: d */
    private static ArrayList<AbstractC1009c> f3013d = new ArrayList<>();

    /* renamed from: e */
    private static ArrayList<AbstractC1009c> f3014e = new ArrayList<>();

    /* renamed from: a */
    public static void m10327a(AbstractC1009c abstractC1009c) {
        if (f3012c) {
            f3013d.add(abstractC1009c);
            return;
        }
        f3011b.addElement(abstractC1009c);
        C0853a.m10855e().m10759k();
    }

    /* renamed from: b */
    public static void m10323b(AbstractC1009c abstractC1009c) {
        if (f3012c) {
            abstractC1009c.f3000b = true;
            f3014e.add(abstractC1009c);
            return;
        }
        f3011b.removeElement(abstractC1009c);
    }

    /* renamed from: a */
    public static void m10328a() {
        f3012c = true;
        if (f3011b.size() > 0) {
            Enumeration<AbstractC1009c> elements = f3011b.elements();
            while (elements.hasMoreElements()) {
                AbstractC1009c nextElement = elements.nextElement();
                if (nextElement != null && !nextElement.f3000b) {
                    nextElement.mo10335c();
                }
            }
            C0853a.m10855e().m10760j();
        }
        f3012c = false;
        while (!f3013d.isEmpty()) {
            m10327a(f3013d.remove(0));
        }
        while (!f3014e.isEmpty()) {
            m10323b(f3014e.remove(0));
        }
    }

    /* renamed from: b */
    public static void m10324b() {
        if (f3011b.size() > 0) {
            Enumeration<AbstractC1009c> elements = f3011b.elements();
            while (elements.hasMoreElements()) {
                m10318d(elements.nextElement());
            }
            C0853a.m10855e().m10760j();
        }
    }

    /* renamed from: c */
    public static void m10321c() {
        if (f3011b.size() > 0) {
            Enumeration<AbstractC1009c> elements = f3011b.elements();
            while (elements.hasMoreElements()) {
                m10320c(elements.nextElement());
            }
            C0853a.m10855e().m10760j();
        }
    }

    /* renamed from: a */
    public static void m10325a(InterfaceC1012a interfaceC1012a, int i, C1017d c1017d) {
        final AbstractC1009c abstractC1009c;
        if (interfaceC1012a != null) {
            if (c1017d.m10304e() == null) {
                c1017d.m10313a(C0986a.f2960o);
            }
            if (interfaceC1012a instanceof C0975i) {
                abstractC1009c = new C1008b((C0975i) interfaceC1012a, i, c1017d);
            } else if (interfaceC1012a instanceof C1013b) {
                abstractC1009c = new C1010d((C1013b) interfaceC1012a, i, c1017d);
            } else if (interfaceC1012a instanceof C0964b) {
                abstractC1009c = new C1007a((C0964b) interfaceC1012a, i, c1017d);
            } else {
                abstractC1009c = null;
            }
            if (c1017d.f3042q) {
                Runnable runnable = new Runnable() { // from class: com.censivn.C3DEngine.b.g.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (AbstractC1009c.this instanceof C1008b) {
                            ((C1008b) AbstractC1009c.this).m10338b();
                        } else if (AbstractC1009c.this instanceof C1007a) {
                            ((C1007a) AbstractC1009c.this).m10340b();
                        }
                        C1014c.m10327a(AbstractC1009c.this);
                    }
                };
                abstractC1009c.mo10336a(runnable);
                C0853a.m10865a().m10584b(runnable, c1017d.f3027B);
            } else if (i == 0) {
                abstractC1009c.mo10335c();
            } else {
                m10327a(abstractC1009c);
            }
        }
    }

    /* renamed from: a */
    public static void m10326a(InterfaceC1012a interfaceC1012a) {
        AbstractC1009c tweenChild;
        if (interfaceC1012a != null && (tweenChild = interfaceC1012a.getTweenChild()) != null) {
            m10323b(tweenChild);
            if (tweenChild.mo10334d() != null) {
                C0853a.m10865a().m10578g(tweenChild.mo10334d());
                tweenChild.mo10336a(null);
            }
            interfaceC1012a.setTweenChild(null);
            tweenChild.mo10337a().m10302f();
        }
    }

    /* renamed from: d */
    private static void m10318d(AbstractC1009c abstractC1009c) {
        if (abstractC1009c != null) {
            abstractC1009c.mo10333e();
        }
    }

    /* renamed from: b */
    public static void m10322b(InterfaceC1012a interfaceC1012a) {
        AbstractC1009c tweenChild;
        if (interfaceC1012a != null && (tweenChild = interfaceC1012a.getTweenChild()) != null) {
            tweenChild.mo10333e();
            m10323b(tweenChild);
        }
    }

    /* renamed from: c */
    public static void m10320c(AbstractC1009c abstractC1009c) {
        if (abstractC1009c != null) {
            abstractC1009c.mo10332f();
        }
    }

    /* renamed from: c */
    public static void m10319c(InterfaceC1012a interfaceC1012a) {
        AbstractC1009c tweenChild;
        if (interfaceC1012a != null && (tweenChild = interfaceC1012a.getTweenChild()) != null && tweenChild.f2999a == 1) {
            tweenChild.mo10332f();
            m10327a(tweenChild);
        }
    }
}
