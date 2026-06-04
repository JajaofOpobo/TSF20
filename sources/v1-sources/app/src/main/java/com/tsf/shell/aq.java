package com.tsf.shell;

import android.view.KeyEvent;
import com.censivn.C3DEngine.api.tween.VEasing;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class aq {
    private static at b;
    private static ArrayList c = new ArrayList();
    public static boolean a = false;

    public static void a() {
        a = true;
    }

    public static void b() {
        a = false;
    }

    public static void a(at atVar) {
        if (!c.contains(atVar)) {
            c.add(atVar);
            b = atVar;
        }
    }

    public static void b(at atVar) {
        if (c.contains(atVar)) {
            c.remove(atVar);
            if (c.size() == 0) {
                b = null;
            } else {
                b = (at) c.get(c.size() - 1);
            }
        }
    }

    public static void a(int i) {
        if (a && !com.censivn.C3DEngine.b.m.h()) {
            String str = "current callback:" + b;
            if (b != null) {
                com.censivn.C3DEngine.a.a().c(new ar(i));
            } else if (i == 4) {
                com.tsf.shell.action.c.b(100);
            } else if (i == 3) {
                com.tsf.shell.action.c.b(VEasing.Circ.easeOut);
            }
        }
    }

    public static void a(int i, KeyEvent keyEvent) {
        if (a && !com.censivn.C3DEngine.b.m.h()) {
            String str = "current callback:" + b;
            if (b != null) {
                com.censivn.C3DEngine.a.a().c(new as(i, keyEvent));
            }
        }
    }
}
