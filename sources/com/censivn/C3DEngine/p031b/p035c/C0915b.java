package com.censivn.C3DEngine.p031b.p035c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p030a.C0864d;
import com.tsf.shell.manager.action.C3398f;
import java.util.ArrayList;
/* renamed from: com.censivn.C3DEngine.b.c.b */
/* loaded from: classes.dex */
public class C0915b {

    /* renamed from: b */
    private static InterfaceC0918a f2696b;

    /* renamed from: c */
    private static ArrayList<InterfaceC0918a> f2697c = new ArrayList<>();

    /* renamed from: a */
    public static boolean f2695a = false;

    /* renamed from: com.censivn.C3DEngine.b.c.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0918a {
        /* renamed from: a */
        void mo727a(int i, KeyEvent keyEvent);

        /* renamed from: b */
        void mo726b(int i, KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m10599a() {
        return f2695a;
    }

    /* renamed from: b */
    public static void m10596b() {
        f2695a = true;
    }

    /* renamed from: c */
    public static void m10593c() {
        f2695a = false;
    }

    /* renamed from: a */
    public static void m10597a(InterfaceC0918a interfaceC0918a) {
        if (!f2697c.contains(interfaceC0918a)) {
            f2697c.add(interfaceC0918a);
            f2696b = interfaceC0918a;
        }
    }

    /* renamed from: b */
    public static void m10594b(InterfaceC0918a interfaceC0918a) {
        if (f2697c.contains(interfaceC0918a)) {
            f2697c.remove(interfaceC0918a);
            if (f2697c.size() == 0) {
                f2696b = null;
            } else {
                f2696b = f2697c.get(f2697c.size() - 1);
            }
        }
    }

    /* renamed from: a */
    public static void m10598a(final int i, KeyEvent keyEvent) {
        if (f2695a && !C0864d.m10790j()) {
            if (f2696b != null) {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C0915b.f2696b != null) {
                            if (i == 3) {
                                C0915b.f2696b.mo727a(4, null);
                            } else {
                                C0915b.f2696b.mo727a(i, null);
                            }
                        }
                    }
                });
            } else if (i == 4) {
                C3398f.m2641b(100);
            } else if (i == 3) {
                C3398f.m2641b(101);
            }
        }
    }

    /* renamed from: b */
    public static void m10595b(final int i, final KeyEvent keyEvent) {
        if (f2695a && !C0864d.m10790j() && f2696b != null) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.b.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C0915b.f2696b != null) {
                        C0915b.f2696b.mo726b(i, keyEvent);
                    }
                }
            });
        }
    }
}
