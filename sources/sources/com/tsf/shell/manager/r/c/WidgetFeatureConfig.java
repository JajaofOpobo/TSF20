package com.tsf.shell.manager.r.c;

import com.tsf.shell.f.e._g.a.MenuActionHandler;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetFeatureConfig {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static a.C0095a e;
    public static a.C0095a f;

    public WidgetFeatureConfig() {
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
        c = com.tsf.shell.manager.b.ConfigManager.ay();
        a = com.tsf.shell.manager.b.ConfigManager.u(b);
    }

    public void a(boolean z) {
        c = z;
        com.tsf.shell.manager.b.ConfigManager.y(z);
        if (f != null) {
            f.a();
        }
    }

    public void b(boolean z) {
        a = z;
        com.tsf.shell.manager.b.ConfigManager.v(z);
        if (e != null) {
            e.a();
        }
        com.tsf.shell.f.b.ShellKeyEventHandler();
    }

    public void a(final Runnable runnable) {
        com.tsf.shell.e.a(b.i.notic_widget_animation_enable, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetFeatureConfig.1
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.A.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.WidgetFeatureConfig.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.app.WidgetManager.b().a(true);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }, runnable);
    }
}
