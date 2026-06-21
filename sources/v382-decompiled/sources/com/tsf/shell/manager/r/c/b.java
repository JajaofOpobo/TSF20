package com.tsf.shell.manager.r.c;

import com.tsf.shell.R;
import com.tsf.shell.k;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes.dex */
public class b {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static com.tsf.shell.e.e.g.a.b e;
    public static com.tsf.shell.e.e.g.a.b f;

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
        c = com.tsf.shell.manager.b.g.aw();
        a = com.tsf.shell.manager.b.g.t(b);
    }

    public void a(boolean z) {
        c = z;
        com.tsf.shell.manager.b.g.x(z);
        if (f != null) {
            f.a();
        }
    }

    public void b(boolean z) {
        a = z;
        com.tsf.shell.manager.b.g.u(z);
        if (e != null) {
            e.a();
        }
        com.tsf.shell.e.b.a();
    }

    public void a(final Runnable runnable) {
        k.a(R.string.notic_widget_animation_enable, R.string.public_action_ok, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1
            @Override // java.lang.Runnable
            public void run() {
                final Runnable runnable2 = runnable;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.a.i.b().a(true);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        }, runnable);
    }
}
