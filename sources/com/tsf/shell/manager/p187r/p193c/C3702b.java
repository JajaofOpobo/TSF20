package com.tsf.shell.manager.p187r.p193c;

import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.C2279b;
import com.tsf.shell.p096f.p118e.p127g.p128a.C2574a;
import java.text.SimpleDateFormat;
import java.util.Date;
/* renamed from: com.tsf.shell.manager.r.c.b */
/* loaded from: classes.dex */
public class C3702b {

    /* renamed from: a */
    public static boolean f12209a = false;

    /* renamed from: b */
    public static boolean f12210b = false;

    /* renamed from: c */
    public static boolean f12211c = false;

    /* renamed from: d */
    public static boolean f12212d = false;

    /* renamed from: e */
    public static C2574a.C2575a f12213e;

    /* renamed from: f */
    public static C2574a.C2575a f12214f;

    public C3702b() {
        Date date;
        Date date2 = new Date(System.currentTimeMillis());
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse("2015-01-01");
        } catch (Exception e) {
            e.printStackTrace();
            date = null;
        }
        if (date == null) {
            f12210b = false;
        } else {
            f12210b = date2.before(date);
        }
        f12211c = C3430e.m2500ay();
        f12209a = C3430e.m2417u(f12210b);
    }

    /* renamed from: a */
    public void m1674a(boolean z) {
        f12211c = z;
        C3430e.m2408y(z);
        if (f12214f != null) {
            f12214f.m5245a();
        }
    }

    /* renamed from: b */
    public void m1673b(boolean z) {
        f12209a = z;
        C3430e.m2414v(z);
        if (f12213e != null) {
            f12213e.m5245a();
        }
        C2279b.m5964a();
    }

    /* renamed from: a */
    public void m1675a(final Runnable runnable) {
        C2244e.m6019a(C1306b.C1315i.notic_widget_animation_enable, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.r.c.b.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3359a.f11095i.m1640b().m1674a(true);
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }, runnable);
    }
}
