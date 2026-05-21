package com.tsf.shell.manager.bind;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.f.i.c.g;
import com.tsf.shell.manager.a.f;
import com.tsf.shell.manager.r.c.a.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b {
    public static d a = new d();
    public static d b = new d();
    private c c;

    public static void a(final ItemInfo itemInfo, final boolean z) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.1
            @Override // java.lang.Runnable
            public void run() {
                com.tsf.shell.f.i.b.e.b bVarA = com.tsf.shell.manager.l.a.a(itemInfo, z);
                if (bVarA != null) {
                    com.tsf.shell.manager.l.a.a(bVarA);
                }
            }
        });
    }

    public static void a(ArrayList<ItemInfo> arrayList, final Runnable runnable, final Runnable runnable2) {
        int iF = com.tsf.shell.manager.a.h.F();
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ItemInfo itemInfo : arrayList) {
            if (itemInfo instanceof LauncherShortcut3DInfo) {
                a(itemInfo, true);
            } else if (itemInfo.screen == iF || itemInfo.container != -1) {
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
            a((ArrayList<ItemInfo>) arrayList2, runnable2);
            return;
        }
        a((ArrayList<ItemInfo>) arrayList3, new Runnable() { // from class: com.tsf.shell.manager.bind.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
                b.a((ArrayList<ItemInfo>) arrayList2, runnable2);
            }
        });
    }

    public static void a(final ArrayList<ItemInfo> arrayList, final Runnable runnable) {
        if (arrayList.size() > 0) {
            final a.AbstractC0146a abstractC0146a = new a.AbstractC0146a() { // from class: com.tsf.shell.manager.bind.b.3
                @Override // com.tsf.shell.manager.r.c.a.a.AbstractC0146a
                public void a(com.tsf.shell.f.i.b bVar, g gVar) {
                    b.a((ArrayList<ItemInfo>) arrayList, runnable);
                }

                @Override // com.tsf.shell.manager.r.c.a.a.AbstractC0146a
                public void a(ItemInfo itemInfo) {
                    b.a((ArrayList<ItemInfo>) arrayList, runnable);
                }
            };
            com.censivn.C3DEngine.a.a().d(new Runnable() { // from class: com.tsf.shell.manager.bind.b.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.i.a((ItemInfo) arrayList.remove(0), abstractC0146a);
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
                com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.manager.bind.b.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.c.a(launcherAppWidgetInfo);
                    }
                });
            }
        });
    }

    public void a(ArrayList<f> arrayList) {
        this.c.a(arrayList);
    }

    public void a(ArrayList<f> arrayList, boolean z) {
        this.c.a(arrayList, z);
    }

    public void b(ArrayList<f> arrayList) {
        this.c.b(arrayList);
    }

    public void b(ArrayList<f> arrayList, boolean z) {
        this.c.b(arrayList, z);
    }

    public void a(final ArrayList<ItemInfo> arrayList, final ArrayList<String> arrayList2) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.6
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(arrayList, arrayList2);
            }
        });
    }

    public void a(final ArrayList<ItemInfo> arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.c(arrayList, str);
            }
        });
    }

    public void b(final ArrayList<ItemInfo> arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.8
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.b(arrayList, str);
            }
        });
    }

    public void c(final ArrayList<ItemInfo> arrayList, final String str) {
        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.9
            @Override // java.lang.Runnable
            public void run() {
                b.this.c.a(arrayList, str);
            }
        });
    }
}
