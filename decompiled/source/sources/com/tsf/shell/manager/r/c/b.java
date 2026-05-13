package com.tsf.shell.manager.r.c;

import com.tsf.b;
import com.tsf.shell.f.e.g.a.a;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class b {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static a.C0095a e;
    public static a.C0095a f;

    public b() {
        Date date;
        Date date2 = new Date(System.currentTimeMillis());
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-01");
        } catch (Exception e2) {
            e2.printStackTrace();
            date = null;
        }
        if (date == null) {
            b = false;
        } else {
            b = date2.before(date);
        }
        c = com.tsf.shell.manager.b.e.ay();
        a = com.tsf.shell.manager.b.e.u(b);
    }

    public void a(boolean z) {
        c = z;
        com.tsf.shell.manager.b.e.y(z);
        if (f != null) {
            f.a();
        }
    }

    public void b(boolean z) {
        a = z;
        com.tsf.shell.manager.b.e.v(z);
        if (e != null) {
            e.a();
        }
        com.tsf.shell.f.b.a();
    }

    public void a(final Runnable runnable) {
        com.tsf.shell.e.a(b.i.notic_widget_animation_enable, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.a.i.b().a(true);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }, runnable);
    }
}
