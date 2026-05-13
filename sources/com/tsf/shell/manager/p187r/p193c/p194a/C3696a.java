package com.tsf.shell.manager.p187r.p193c.p194a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p030a.C0869e;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.p185p.C3591c;
import com.tsf.shell.manager.p187r.p193c.C3705c;
import com.tsf.shell.manager.p187r.p193c.C3720e;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p154a.C3109c;
import com.tsf.shell.p096f.p153i.p155b.p156a.C3122b;
import com.tsf.shell.p096f.p153i.p155b.p158c.C3134a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;
/* renamed from: com.tsf.shell.manager.r.c.a.a */
/* loaded from: classes.dex */
public class C3696a {

    /* renamed from: a */
    private static ClassLoader f12190a;

    /* renamed from: b */
    private static C3720e f12191b;

    /* renamed from: a */
    public static void m1684a(ClassLoader classLoader) {
        f12190a = classLoader;
    }

    /* renamed from: a */
    public static void m1685a(C3720e c3720e) {
        f12191b = c3720e;
    }

    /* renamed from: com.tsf.shell.manager.r.c.a.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3699a {

        /* renamed from: a */
        private int f12204a = 0;

        /* renamed from: a */
        public abstract void mo1681a(ItemInfo itemInfo);

        /* renamed from: a */
        public abstract void mo1680a(C3112b c3112b, C3343g c3343g);

        /* renamed from: b */
        public void m1678b(C3112b c3112b, C3343g c3343g) {
            this.f12204a++;
            mo1680a(c3112b, c3343g);
        }

        /* renamed from: b */
        public void m1679b(ItemInfo itemInfo) {
            this.f12204a++;
            mo1681a(itemInfo);
        }
    }

    /* renamed from: a */
    public static void m1687a(C3112b c3112b, C3343g c3343g) {
        if (c3343g != null && c3343g.f11052a.equals("com.tsf.shell.widget.music")) {
            C3591c.m1943a(12, 1000);
        }
        c3112b.setMouseEventListener(new C3109c(c3112b));
        if (c3343g.f11056e) {
            if (C3705c.m1670a(c3343g, false)) {
                c3343g.m2799a(c3112b);
            } else {
                f12191b.m1647a(c3112b);
                C2244e.m6020a(C1306b.C1315i.notic_widget_exists);
                return;
            }
        } else if (C3705c.m1670a(c3343g, true)) {
            c3343g.m2799a(c3112b);
        } else {
            f12191b.m1647a(c3112b);
            return;
        }
        f12191b.m1633d(c3112b);
    }

    /* renamed from: a */
    public static void m1688a(ItemInfo itemInfo) {
        f12191b.m1650a(itemInfo);
        C2244e.m6012a(C0853a.m10856d().getString(C1306b.C1315i.notic_load_widget_error_unknow));
    }

    /* renamed from: a */
    public static void m1686a(C3343g c3343g, ItemInfo itemInfo, boolean z, AbstractC3699a abstractC3699a) {
        if (itemInfo.screen == -1) {
            m1688a(itemInfo);
        } else if (c3343g.f11056e) {
            m1682c(c3343g, itemInfo, z, abstractC3699a);
        } else {
            m1683b(c3343g, itemInfo, z, abstractC3699a);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m1683b(final C3343g c3343g, final ItemInfo itemInfo, final boolean z, final AbstractC3699a abstractC3699a) {
        final String str = c3343g.f11052a;
        try {
            Class loadClass = new PathClassLoader(C0853a.m10856d().getPackageManager().getApplicationInfo(str, 0).sourceDir, f12190a).loadClass(c3343g.f11053b);
            final Object newInstance = loadClass.newInstance();
            Context m10856d = C0853a.m10856d();
            C0853a.m10856d();
            C0853a.m10856d();
            final Context createPackageContext = m10856d.createPackageContext(str, 3);
            final Method method = loadClass.getMethod("getWidget", Context.class, Integer.class);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C3112b c3112b = (C3112b) ((VObject3d) method.invoke(newInstance, createPackageContext, Integer.valueOf(itemInfo.f2532id))).getVirtualTarget();
                        if (str.equals("com.tsf.shell.widget.weather")) {
                            c3112b.m3503f(true);
                        }
                        c3112b.position().f2526x = itemInfo.cellX;
                        c3112b.position().f2527y = itemInfo.cellY;
                        c3112b.rotation().f2528z = itemInfo.rotation;
                        c3112b.mo3117a(itemInfo);
                        if (!z) {
                            c3112b.mo3458ac();
                            c3112b.m3514ad();
                        }
                        c3112b.mo3511b_();
                        C3696a.m1687a(c3112b, c3343g);
                        if (abstractC3699a != null) {
                            abstractC3699a.m1678b(c3112b, c3343g);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        C3696a.m1688a(itemInfo);
                        if (abstractC3699a != null) {
                            abstractC3699a.m1679b(itemInfo);
                        }
                    }
                }
            };
            if (C0869e.m10758l()) {
                runnable.run();
            } else {
                C0853a.m10865a().m10583c(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m1688a(itemInfo);
            if (abstractC3699a != null) {
                abstractC3699a.m1679b(itemInfo);
            }
        }
    }

    /* renamed from: c */
    private static void m1682c(final C3343g c3343g, final ItemInfo itemInfo, final boolean z, final AbstractC3699a abstractC3699a) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                C3112b c3112b;
                try {
                    if (C3343g.this.f11053b.equals(C3145b.class.getName())) {
                        c3112b = new C3145b(itemInfo);
                    } else if (C3343g.this.f11053b.equals(C3122b.class.getName())) {
                        c3112b = new C3122b(itemInfo);
                    } else if (!C3343g.this.f11053b.equals(C3134a.class.getName())) {
                        Class<?> loadClass = C3696a.f12190a.loadClass(C3343g.this.f11053b);
                        c3112b = (C3112b) ((VObject3d) loadClass.getMethod("getWidget", Context.class, Integer.class).invoke(loadClass.newInstance(), C0853a.m10856d(), Integer.valueOf(itemInfo.f2532id))).getVirtualTarget();
                        c3112b.mo3117a(itemInfo);
                    } else {
                        c3112b = new C3134a(itemInfo);
                    }
                    if (c3112b != null) {
                        c3112b.position().f2526x = itemInfo.cellX;
                        c3112b.position().f2527y = itemInfo.cellY;
                        c3112b.rotation().f2528z = itemInfo.rotation;
                        if (!z) {
                            c3112b.mo3458ac();
                            c3112b.m3514ad();
                        }
                        c3112b.mo3511b_();
                        C3696a.m1687a(c3112b, C3343g.this);
                        if (abstractC3699a != null) {
                            abstractC3699a.m1678b(c3112b, C3343g.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C3696a.m1688a(itemInfo);
                    if (abstractC3699a != null) {
                        abstractC3699a.m1679b(itemInfo);
                    }
                }
            }
        };
        if (C0869e.m10758l()) {
            runnable.run();
        } else {
            C0853a.m10865a().m10583c(runnable);
        }
    }
}
