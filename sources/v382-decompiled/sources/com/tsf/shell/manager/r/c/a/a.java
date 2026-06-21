package com.tsf.shell.manager.r.c.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;
import com.tsf.shell.e.i.c.i;
import com.tsf.shell.k;
import com.tsf.shell.manager.r.c.g;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {
    private static ClassLoader a;
    private static g b;

    public static void a(ClassLoader classLoader) {
        a = classLoader;
    }

    public static void a(g gVar) {
        b = gVar;
    }

    public static void a(com.tsf.shell.e.i.c cVar, i iVar) {
        if (iVar != null && iVar.a.equals("com.tsf.shell.widget.music")) {
            com.tsf.shell.manager.p.c.a(12, 1000);
        }
        cVar.setMouseEventListener(new com.tsf.shell.e.i.a.c(cVar));
        if (iVar.e) {
            if (com.tsf.shell.manager.r.c.c.a(iVar, false)) {
                iVar.a(cVar);
            } else {
                b.a(cVar);
                k.a(R.string.notic_widget_exists);
                return;
            }
        } else if (com.tsf.shell.manager.r.c.c.a(iVar, true)) {
            iVar.a(cVar);
        } else {
            b.a(cVar);
            return;
        }
        b.c(cVar);
    }

    public static void a(ItemInfo itemInfo) {
        b.a(itemInfo);
        k.a(com.censivn.C3DEngine.a.d().getString(R.string.notic_load_widget_error_unknow));
    }

    public static void a(i iVar, ItemInfo itemInfo, boolean z, b bVar) {
        if (itemInfo.screen == -1) {
            a(itemInfo);
        } else if (iVar.e) {
            c(iVar, itemInfo, z, bVar);
        } else {
            b(iVar, itemInfo, z, bVar);
        }
    }

    @SuppressLint({"NewApi"})
    private static void b(final i iVar, final ItemInfo itemInfo, final boolean z, final b bVar) {
        final String str = iVar.a;
        try {
            Class loadClass = new PathClassLoader(com.censivn.C3DEngine.a.d().getPackageManager().getApplicationInfo(str, 0).sourceDir, a).loadClass(iVar.b);
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
                        com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) ((VObject3d) method.invoke(newInstance, createPackageContext, Integer.valueOf(itemInfo.id))).getVirtualTarget();
                        if (str.equals("com.tsf.shell.widget.weather")) {
                            cVar.f(true);
                        }
                        cVar.position().x = itemInfo.cellX;
                        cVar.position().y = itemInfo.cellY;
                        cVar.rotation().z = itemInfo.rotation;
                        cVar.a(itemInfo);
                        if (!z) {
                            cVar.ac();
                            cVar.ad();
                        }
                        cVar.a_();
                        a.a(cVar, iVar);
                        if (bVar != null) {
                            bVar.b(cVar, iVar);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        a.a(itemInfo);
                        if (bVar != null) {
                            bVar.b(itemInfo);
                        }
                    }
                }
            };
            if (com.censivn.C3DEngine.a.i.l()) {
                runnable.run();
            } else {
                com.censivn.C3DEngine.a.a().c(runnable);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a(itemInfo);
            if (bVar != null) {
                bVar.b(itemInfo);
            }
        }
    }

    private static void c(final i iVar, final ItemInfo itemInfo, final boolean z, final b bVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.manager.r.c.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.e.i.c cVar;
                try {
                    if (i.this.b.equals(com.tsf.shell.e.i.b.d.b.class.getName())) {
                        cVar = new com.tsf.shell.e.i.b.d.b(itemInfo);
                    } else if (i.this.b.equals(com.tsf.shell.e.i.b.a.b.class.getName())) {
                        cVar = new com.tsf.shell.e.i.b.a.b(itemInfo);
                    } else if (!i.this.b.equals(com.tsf.shell.e.i.b.c.a.class.getName())) {
                        Class<?> loadClass = a.a.loadClass(i.this.b);
                        cVar = (com.tsf.shell.e.i.c) ((VObject3d) loadClass.getMethod("getWidget", Context.class, Integer.class).invoke(loadClass.newInstance(), com.censivn.C3DEngine.a.d(), Integer.valueOf(itemInfo.id))).getVirtualTarget();
                        cVar.a(itemInfo);
                    } else {
                        cVar = new com.tsf.shell.e.i.b.c.a(itemInfo);
                    }
                    if (cVar != null) {
                        cVar.position().x = itemInfo.cellX;
                        cVar.position().y = itemInfo.cellY;
                        cVar.rotation().z = itemInfo.rotation;
                        if (!z) {
                            cVar.ac();
                            cVar.ad();
                        }
                        cVar.a_();
                        a.a(cVar, i.this);
                        if (bVar != null) {
                            bVar.b(cVar, i.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    a.a(itemInfo);
                    if (bVar != null) {
                        bVar.b(itemInfo);
                    }
                }
            }
        };
        if (com.censivn.C3DEngine.a.i.l()) {
            runnable.run();
        } else {
            com.censivn.C3DEngine.a.a().c(runnable);
        }
    }
}
