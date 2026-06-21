package com.censivn.C3DEngine.b.c;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {
    private static d b;
    private static ArrayList c = new ArrayList();
    public static boolean a = false;

    public static boolean a() {
        return a;
    }

    public static void b() {
        a = true;
    }

    public static void c() {
        a = false;
    }

    public static void a(d dVar) {
        if (!c.contains(dVar)) {
            c.add(dVar);
            b = dVar;
        }
    }

    public static void b(d dVar) {
        if (c.contains(dVar)) {
            c.remove(dVar);
            if (c.size() == 0) {
                b = null;
            } else {
                b = (d) c.get(c.size() - 1);
            }
        }
    }

    public static void a(final int i, KeyEvent keyEvent) {
        if (a && !com.censivn.C3DEngine.a.h.j()) {
            if (b != null) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.c.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (c.b != null) {
                            if (i == 3) {
                                c.b.a(4, null);
                            } else {
                                c.b.a(i, null);
                            }
                        }
                    }
                });
            } else if (i == 4) {
                com.tsf.shell.manager.action.h.b(100);
            } else if (i == 3) {
                com.tsf.shell.manager.action.h.b(VEasing.Circ.easeOut);
            }
        }
    }

    public static void b(final int i, final KeyEvent keyEvent) {
        if (a && !com.censivn.C3DEngine.a.h.j() && b != null) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.c.2
                @Override // java.lang.Runnable
                public void run() {
                    if (c.b != null) {
                        c.b.b(i, keyEvent);
                    }
                }
            });
        }
    }
}
