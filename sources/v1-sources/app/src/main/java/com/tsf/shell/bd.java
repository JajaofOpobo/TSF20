package com.tsf.shell;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class bd {
    private static boolean c;
    private static RenderRunnable e;
    private static int a = com.tsf.shell.a.t.T();
    private static ArrayList b = new ArrayList();
    private static boolean d = false;

    public static void a(bj bjVar) {
        if (!b.contains(bjVar)) {
            b.add(bjVar);
        }
    }

    public static void b(bj bjVar) {
        if (b.contains(bjVar)) {
            b.remove(bjVar);
        }
    }

    public static void a(Activity activity, boolean z, boolean z2) {
        if (activity != null) {
            if (com.tsf.shell.g.c.b()) {
                View decorView = activity.getWindow().getDecorView();
                d = z;
                if (z) {
                    decorView.setSystemUiVisibility(4096);
                } else {
                    decorView.setSystemUiVisibility(1024);
                }
            }
            if (z2) {
                com.tsf.shell.a.t.d(Boolean.valueOf(z));
            }
        }
    }

    public static void a(boolean z) {
        if (c != z) {
            if (z) {
                WindowManager.LayoutParams attributes = Home.d().getWindow().getAttributes();
                attributes.flags |= 1024;
                Home.d().getWindow().setAttributes(attributes);
                c = true;
            } else {
                WindowManager.LayoutParams attributes2 = Home.d().getWindow().getAttributes();
                attributes2.flags &= -1025;
                Home.d().getWindow().setAttributes(attributes2);
                c = false;
            }
            com.tsf.shell.a.t.e(Boolean.valueOf(c ? false : true));
            com.censivn.C3DEngine.a.a().c(new be());
        }
    }

    public static boolean a() {
        return ((Build.VERSION.SDK_INT < 14 && Build.VERSION.SDK_INT > 10) || c) ? false : true;
    }

    public static void b() {
        bf bfVar = new bf();
        com.censivn.C3DEngine.a.a();
        com.censivn.C3DEngine.b.w.a(bfVar);
    }

    public static void a(int i, int i2, int i3, int i4) {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((bj) it.next()).b_(i, i2, i3, i4);
        }
    }

    public static void a(int i) {
        if (i.a().b()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                ((bj) it.next()).p_();
            }
        } else {
            i.a().a(new bg(i));
        }
    }

    public static void b(int i) {
        if (a != i) {
            com.tsf.shell.a.t.n(i);
            a = i;
            if (e == null) {
                e = new bh();
            }
            if (!i.a().b()) {
                i.a().b(new bi());
            } else {
                com.censivn.C3DEngine.a.a().a(e);
            }
        }
    }

    public static int c() {
        return a;
    }

    public static void a(Activity activity) {
        if (!com.tsf.shell.a.t.w()) {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.flags |= 1024;
            activity.getWindow().setAttributes(attributes);
            c = true;
        }
        if (com.tsf.shell.a.t.v()) {
            a(activity, true, false);
        }
    }
}
