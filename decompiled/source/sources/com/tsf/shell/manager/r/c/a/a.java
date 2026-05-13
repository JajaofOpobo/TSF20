package com.tsf.shell.manager.r.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import com.tsf.shell.f.i.c.g;
import com.tsf.shell.manager.p.c;
import com.tsf.shell.manager.r.c.e;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {
    private static ClassLoader a;
    private static e b;

    public static void a(ClassLoader classLoader) {
        a = classLoader;
    }

    public static void a(e eVar) {
        b = eVar;
    }

    /* renamed from: com.tsf.shell.manager.r.c.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0146a {
        private int a = 0;

        public abstract void a(ItemInfo itemInfo);

        public abstract void a(com.tsf.shell.f.i.b bVar, g gVar);

        public void b(com.tsf.shell.f.i.b bVar, g gVar) {
            this.a++;
            a(bVar, gVar);
        }

        public void b(ItemInfo itemInfo) {
            this.a++;
            a(itemInfo);
        }
    }

    public static void a(com.tsf.shell.f.i.b bVar, g gVar) {
        if (gVar != null && gVar.a.equals("com.tsf.shell.widget.music")) {
            c.a(12, 1000);
        }
        bVar.setMouseEventListener(new com.tsf.shell.f.i.a.c(bVar));
        if (gVar.e) {
            if (com.tsf.shell.manager.r.c.c.a(gVar, false)) {
                gVar.a(bVar);
            } else {
                b.a(bVar);
                com.tsf.shell.e.a(b.i.notic_widget_exists);
                return;
            }
        } else if (com.tsf.shell.manager.r.c.c.a(gVar, true)) {
            gVar.a(bVar);
        } else {
            b.a(bVar);
            return;
        }
        b.d(bVar);
    }

    public static void a(ItemInfo itemInfo) {
        b.a(itemInfo);
        com.tsf.shell.e.a(com.censivn.C3DEngine.a.d().getString(b.i.notic_load_widget_error_unknow));
    }

    public static void a(g gVar, ItemInfo itemInfo, boolean z, AbstractC0146a abstractC0146a) {
        if (itemInfo.screen == -1) {
            a(itemInfo);
        } else if (gVar.e) {
            c(gVar, itemInfo, z, abstractC0146a);
        } else {
            b(gVar, itemInfo, z, abstractC0146a);
        }
    }

    @SuppressLint({"NewApi"})
    private static void b(final g gVar, final ItemInfo itemInfo, final boolean z, final AbstractC0146a abstractC0146a) {
        final String str = gVar.a;
        try {
            Class loadClass = new PathClassLoader(com.censivn.C3DEngine.a.d().getPackageManager().getApplicationInfo(str, 0).sourceDir, a).loadClass(gVar.b);
            final Object newInstance = loadClass.newInstance();
            Context d = com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            final Context createPackageContext = d.createPackageContext(str, 3);
            final Method method = loadClass.getMethod("getWidget", Context.class, Integer.class);
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) ((VObject3d) method.invoke(newInstance, createPackageContext, Integer.valueOf(itemInfo.id))).getVirtualTarget();
                        if (str.equals("com.tsf.shell.widget.weather")) {
                            bVar.f(true);
                        }
                        bVar.position().x = itemInfo.cellX;
                        bVar.position().y = itemInfo.cellY;
                        bVar.rotation().z = itemInfo.rotation;
                        bVar.a(itemInfo);
                        if (!z) {
                            bVar.ac();
                            bVar.ad();
                        }
                        bVar.b_();
                        a.a(bVar, gVar);
                        if (abstractC0146a != null) {
                            abstractC0146a.b(bVar, gVar);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        a.a(itemInfo);
                        if (abstractC0146a != null) {
                            abstractC0146a.b(itemInfo);
                        }
                    }
                }
            };
            if (com.censivn.C3DEngine.a.e.l()) {
                runnable.run();
            } else {
                com.censivn.C3DEngine.a.a().c(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a(itemInfo);
            if (abstractC0146a != null) {
                abstractC0146a.b(itemInfo);
            }
        }
    }

    private static void c(final g gVar, final ItemInfo itemInfo, final boolean z, final AbstractC0146a abstractC0146a) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.i.b bVar;
                try {
                    if (g.this.b.equals(com.tsf.shell.f.i.b.d.b.class.getName())) {
                        bVar = new com.tsf.shell.f.i.b.d.b(itemInfo);
                    } else if (g.this.b.equals(com.tsf.shell.f.i.b.a.b.class.getName())) {
                        bVar = new com.tsf.shell.f.i.b.a.b(itemInfo);
                    } else if (!g.this.b.equals(com.tsf.shell.f.i.b.c.a.class.getName())) {
                        Class<?> loadClass = a.a.loadClass(g.this.b);
                        bVar = (com.tsf.shell.f.i.b) ((VObject3d) loadClass.getMethod("getWidget", Context.class, Integer.class).invoke(loadClass.newInstance(), com.censivn.C3DEngine.a.d(), Integer.valueOf(itemInfo.id))).getVirtualTarget();
                        bVar.a(itemInfo);
                    } else {
                        bVar = new com.tsf.shell.f.i.b.c.a(itemInfo);
                    }
                    if (bVar != null) {
                        bVar.position().x = itemInfo.cellX;
                        bVar.position().y = itemInfo.cellY;
                        bVar.rotation().z = itemInfo.rotation;
                        if (!z) {
                            bVar.ac();
                            bVar.ad();
                        }
                        bVar.b_();
                        a.a(bVar, g.this);
                        if (abstractC0146a != null) {
                            abstractC0146a.b(bVar, g.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    a.a(itemInfo);
                    if (abstractC0146a != null) {
                        abstractC0146a.b(itemInfo);
                    }
                }
            }
        };
        if (com.censivn.C3DEngine.a.e.l()) {
            runnable.run();
        } else {
            com.censivn.C3DEngine.a.a().c(runnable);
        }
    }
}
