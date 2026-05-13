package com.tsf.shell.manager.bind;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.LauncherAppWidgetInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p187r.p193c.p194a.C3696a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p161c.C3343g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.bind.b */
/* loaded from: classes.dex */
public class C3445b {

    /* renamed from: a */
    public static C3457d f11405a = new C3457d();

    /* renamed from: b */
    public static C3457d f11406b = new C3457d();

    /* renamed from: c */
    private InterfaceC3456c f11407c;

    /* renamed from: a */
    public static void m2354a(final ItemInfo itemInfo, final boolean z) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3208b m2146a = C3519a.m2146a(ItemInfo.this, z);
                if (m2146a != null) {
                    C3519a.m2145a(m2146a);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m2348a(ArrayList<ItemInfo> arrayList, final Runnable runnable, final Runnable runnable2) {
        int m4121F = C3359a.f11094h.m4121F();
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<ItemInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ItemInfo next = it.next();
            if (next instanceof LauncherShortcut3DInfo) {
                m2354a(next, true);
            } else if (next.screen == m4121F || next.container != -1) {
                arrayList3.add(next);
            } else {
                arrayList2.add(next);
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
            m2349a(arrayList2, runnable2);
            return;
        }
        m2349a(arrayList3, new Runnable() { // from class: com.tsf.shell.manager.bind.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (runnable != null) {
                    runnable.run();
                }
                C3445b.m2349a(arrayList2, runnable2);
            }
        });
    }

    /* renamed from: a */
    public static void m2349a(final ArrayList<ItemInfo> arrayList, final Runnable runnable) {
        if (arrayList.size() > 0) {
            final C3696a.AbstractC3699a abstractC3699a = new C3696a.AbstractC3699a() { // from class: com.tsf.shell.manager.bind.b.3
                @Override // com.tsf.shell.manager.p187r.p193c.p194a.C3696a.AbstractC3699a
                /* renamed from: a */
                public void mo1680a(C3112b c3112b, C3343g c3343g) {
                    C3445b.m2349a(arrayList, runnable);
                }

                @Override // com.tsf.shell.manager.p187r.p193c.p194a.C3696a.AbstractC3699a
                /* renamed from: a */
                public void mo1681a(ItemInfo itemInfo) {
                    C3445b.m2349a(arrayList, runnable);
                }
            };
            C0853a.m10865a().m10581d(new Runnable() { // from class: com.tsf.shell.manager.bind.b.4
                @Override // java.lang.Runnable
                public void run() {
                    C3359a.f11095i.m1649a((ItemInfo) arrayList.remove(0), abstractC3699a);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m2351a(InterfaceC3456c interfaceC3456c) {
        this.f11407c = interfaceC3456c;
    }

    /* renamed from: a */
    public void m2353a(final LauncherAppWidgetInfo launcherAppWidgetInfo) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.5
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.manager.bind.b.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3445b.this.f11407c.mo2340a(launcherAppWidgetInfo);
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public void m2350a(ArrayList<C3377f> arrayList) {
        this.f11407c.mo2339a(arrayList);
    }

    /* renamed from: a */
    public void m2345a(ArrayList<C3377f> arrayList, boolean z) {
        this.f11407c.mo2336a(arrayList, z);
    }

    /* renamed from: b */
    public void m2344b(ArrayList<C3377f> arrayList) {
        this.f11407c.mo2335b(arrayList);
    }

    /* renamed from: b */
    public void m2342b(ArrayList<C3377f> arrayList, boolean z) {
        this.f11407c.mo2333b(arrayList, z);
    }

    /* renamed from: a */
    public void m2346a(final ArrayList<ItemInfo> arrayList, final ArrayList<String> arrayList2) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.6
            @Override // java.lang.Runnable
            public void run() {
                C3445b.this.f11407c.mo2337a(arrayList, arrayList2);
            }
        });
    }

    /* renamed from: a */
    public void m2347a(final ArrayList<ItemInfo> arrayList, final String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.7
            @Override // java.lang.Runnable
            public void run() {
                C3445b.this.f11407c.mo2332c(arrayList, str);
            }
        });
    }

    /* renamed from: b */
    public void m2343b(final ArrayList<ItemInfo> arrayList, final String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.8
            @Override // java.lang.Runnable
            public void run() {
                C3445b.this.f11407c.mo2334b(arrayList, str);
            }
        });
    }

    /* renamed from: c */
    public void m2341c(final ArrayList<ItemInfo> arrayList, final String str) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.bind.b.9
            @Override // java.lang.Runnable
            public void run() {
                C3445b.this.f11407c.mo2338a(arrayList, str);
            }
        });
    }
}
