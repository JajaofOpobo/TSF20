package com.tsf.shell.manager.bind;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.e.i.c.i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b {
    public static h a = new h();
    public static h b = new h();
    private c c;

    public static void a(final ItemInfo itemInfo, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.e.i.b.e.b a2 = com.tsf.shell.manager.l.a.a(ItemInfo.this, z);
                if (a2 != null) {
                    com.tsf.shell.manager.l.a.a(a2);
                }
            }
        });
    }

    public static void a(ArrayList arrayList, final Runnable runnable, final Runnable runnable2) {
        int F = com.tsf.shell.manager.a.h.F();
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo itemInfo = (ItemInfo) it.next();
            if (itemInfo instanceof LauncherShortcut3DInfo) {
                a(itemInfo, true);
            } else if (itemInfo.screen == F || itemInfo.container != -1) {
                arrayList3.add(itemInfo);
            } else {
                arrayList2.add(itemInfo);
            }
        }
        if (arrayList3.isEmpty()) {
            if (runnable != null) {
                runnable.run();
            }
            if (arrayList2.isEmpty()) {
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            }
            a(arrayList2, runnable2);
            return;
        }
        a(arrayList3, new Runnable() { // from class: com.tsf.shell.manager.bind.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
                b.a(arrayList2, runnable2);
            }
        });
    }

    public static void a(final ArrayList arrayList, final Runnable runnable) {
        if (arrayList.size() > 0) {
            final com.tsf.shell.manager.r.c.a.b bVar = new com.tsf.shell.manager.r.c.a.b() { // from class: com.tsf.shell.manager.bind.b.3
                @Override // com.tsf.shell.manager.r.c.a.b
                public void a(com.tsf.shell.e.i.c cVar, i iVar) {
                    b.a(arrayList, runnable);
                }

                @Override // com.tsf.shell.manager.r.c.a.b
                public void a(ItemInfo itemInfo) {
                    b.a(arrayList, runnable);
                }
            };
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.bind.b.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.i.a((ItemInfo) arrayList.remove(0), bVar);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(c cVar) {
        this.c = cVar;
    }

    public void a(final LauncherAppWidgetInfo launcherAppWidgetInfo) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.5
            @Override // java.lang.Runnable
            public void run() {
                final LauncherAppWidgetInfo launcherAppWidgetInfo2 = launcherAppWidgetInfo;
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.bind.b.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.c.a(launcherAppWidgetInfo2);
                    }
                });
            }
        });
    }

    public void a(ArrayList arrayList) {
        this.c.a(arrayList);
    }

    public void a(ArrayList arrayList, boolean z) {
        this.c.a(arrayList, z);
    }

    public void b(ArrayList arrayList) {
        this.c.b(arrayList);
    }

    public void b(ArrayList arrayList, boolean z) {
        this.c.b(arrayList, z);
    }

    public void a(final ArrayList arrayList, final ArrayList arrayList2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.6
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(arrayList, arrayList2);
            }
        });
    }

    public void a(final ArrayList arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.c(arrayList, str);
            }
        });
    }

    public void b(final ArrayList arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.8
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.b(arrayList, str);
            }
        });
    }

    public void c(final ArrayList arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.9
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(arrayList, str);
            }
        });
    }
}
