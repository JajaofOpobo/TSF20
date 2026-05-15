package com.censivn.C3DEngine.b.c;

import android.view.KeyEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    private static a b;
    private static ArrayList<a> c = new ArrayList<>();
    public static boolean a = false;

    public interface a {
        void a(int i, KeyEvent keyEvent);

        void b(int i, KeyEvent keyEvent);
    }

    public static boolean a() {
        return a;
    }

    public static void b() {
        a = true;
    }

    public static void c() {
        a = false;
    }

    public static void a(a aVar) {
        if (!c.contains(aVar)) {
            c.add(aVar);
            b = aVar;
        }
    }

    public static void b(a aVar) {
        if (c.contains(aVar)) {
            c.remove(aVar);
            if (c.size() == 0) {
                b = null;
            } else {
                b = c.get(c.size() - 1);
            }
        }
    }

    public static void a(final int i, KeyEvent keyEvent) {
        if (a && !com.censivn.C3DEngine.a.d.j()) {
            if (b != null) {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (b.b != null) {
                            if (i == 3) {
                                b.b.a(4, null);
                            } else {
                                b.b.a(i, null);
                            }
                        }
                    }
                });
            } else if (i == 4) {
                com.tsf.shell.manager.action.f.b(100);
            } else if (i == 3) {
                com.tsf.shell.manager.action.f.b(101);
            }
        }
    }

    public static void b(final int i, final KeyEvent keyEvent) {
        if (a && !com.censivn.C3DEngine.a.d.j() && b != null) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.censivn.C3DEngine.b.c.b.2
                @Override // java.lang.Runnable
                public void run() {
                    if (b.b != null) {
                        b.b.b(i, keyEvent);
                    }
                }
            });
        }
    }
}
