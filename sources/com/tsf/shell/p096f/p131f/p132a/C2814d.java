package com.tsf.shell.p096f.p131f.p132a;

import android.content.ComponentName;
import android.os.AsyncTask;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3142a;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.plugin.classification.C3777d;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.d */
/* loaded from: classes.dex */
public class C2814d {

    /* renamed from: a */
    private ArrayList<C2816b> f9183a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.f.f.a.d$b */
    /* loaded from: classes.dex */
    public class C2816b {

        /* renamed from: a */
        ComponentName f9184a;

        /* renamed from: b */
        ComponentName[] f9185b;

        /* renamed from: c */
        String f9186c;

        C2816b() {
        }
    }

    /* renamed from: com.tsf.shell.f.f.a.d$a */
    /* loaded from: classes.dex */
    public static class C2815a implements C3777d.InterfaceC3781d {
        @Override // com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
        /* renamed from: a */
        public void mo1510a(C3777d.C3778a c3778a) {
        }

        @Override // com.tsf.shell.plugin.classification.C3777d.InterfaceC3781d
        /* renamed from: a */
        public void mo1511a() {
        }
    }

    /* renamed from: a */
    public void m4607a() {
        this.f9183a.clear();
        Iterator<C3112b> it = C3359a.f11109w.m2707d().m4815a().iterator();
        while (it.hasNext()) {
            C3112b next = it.next();
            C2816b c2816b = new C2816b();
            if (next instanceof C3145b) {
                c2816b.f9186c = next.m3534K().title;
                c2816b.f9185b = ((C3145b) next).m3374aI();
            } else {
                c2816b.f9184a = ((C3222g) next).m3106bd().f11169b;
            }
            this.f9183a.add(c2816b);
        }
    }

    /* renamed from: b */
    public void m4602b() {
        ArrayList<C3222g> m2736d = C3359a.f11109w.m2716a().m2736d();
        ArrayList<C3222g> arrayList = new ArrayList<>();
        Iterator<C3222g> it = m2736d.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (!((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                arrayList.add(next);
            }
            if (next.m3534K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof C3142a)) {
                    ((C3142a) next.getMouseEventListener()).m3418a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.m3136g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
                next.rotation().setAll(0.0f, 0.0f, 0.0f);
            }
        }
        C3359a.f11109w.m2707d().m4809b();
        Iterator<C2816b> it2 = this.f9183a.iterator();
        while (it2.hasNext()) {
            C2816b next2 = it2.next();
            if (next2.f9185b != null) {
                ArrayList<AbstractC3208b> arrayList2 = new ArrayList<>();
                for (ComponentName componentName : next2.f9185b) {
                    m4606a(componentName, arrayList, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    C3359a.f11094h.m4019t().m4484a(next2.f9186c, arrayList2, false);
                }
            } else {
                Iterator<C3222g> it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C3222g next3 = it3.next();
                        if (next3.m3106bd().f11169b.equals(next2.f9184a)) {
                            C3359a.f11109w.m2707d().m4813a(next3);
                            arrayList.remove(next3);
                            break;
                        }
                    }
                }
            }
        }
        Iterator<C3222g> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C3359a.f11109w.m2707d().m4813a(it4.next());
        }
        C3359a.f11094h.m4019t().m4480aD();
    }

    /* renamed from: a */
    public AsyncTask m4605a(C2815a c2815a) {
        ArrayList arrayList = new ArrayList();
        Iterator<C3222g> it = C3359a.f11109w.m2716a().m2736d().iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (!((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                arrayList.add(next.m3106bd().f11169b.getPackageName());
            }
        }
        return C3777d.m1522a(C0853a.m10856d(), arrayList, c2815a);
    }

    /* renamed from: c */
    public void m4601c() {
        ArrayList<C3222g> m2736d = C3359a.f11109w.m2716a().m2736d();
        ArrayList arrayList = new ArrayList();
        Iterator<C3222g> it = m2736d.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (!((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                arrayList.add(next);
            }
            if (next.m3534K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof C3142a)) {
                    ((C3142a) next.getMouseEventListener()).m3418a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.m3136g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        C3359a.f11109w.m2707d().m4809b();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C3359a.f11109w.m2707d().m4813a((C3222g) it2.next());
        }
        C3359a.f11094h.m4019t().m4480aD();
        C3359a.f11094h.m4019t().m4452ao().m4807c();
        C3359a.f11094h.m4019t().m4452ao().m4806d();
    }

    /* renamed from: a */
    public void m4604a(C3777d.C3778a c3778a) {
        C3777d.C3779b[] c3779bArr;
        ArrayList<C3222g> m2736d = C3359a.f11109w.m2716a().m2736d();
        ArrayList<C3222g> arrayList = new ArrayList<>();
        Iterator<C3222g> it = m2736d.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (!((LauncherShortcutAppInfo) next.m3534K()).isHide) {
                arrayList.add(next);
            }
            if (next.m3534K().container != -1) {
                if (next.getMouseEventListener() != null && (next.getMouseEventListener() instanceof C3142a)) {
                    ((C3142a) next.getMouseEventListener()).m3418a();
                    next.mouseEnabled(true);
                }
                next.visible(true);
                next.alpha(255.0f);
                next.m3136g(1.0f);
                next.scale().setAll(1.0f, 1.0f, 1.0f);
            }
        }
        C3359a.f11109w.m2707d().m4809b();
        for (C3777d.C3779b c3779b : c3778a.f12390b) {
            ArrayList<AbstractC3208b> arrayList2 = new ArrayList<>();
            Iterator<String> it2 = c3779b.f12392b.iterator();
            while (it2.hasNext()) {
                m4603a(it2.next(), arrayList, arrayList2);
            }
            if (!arrayList2.isEmpty()) {
                C3359a.f11094h.m4019t().m4484a(c3779b.f12391a, arrayList2, true);
            }
        }
        ArrayList<AbstractC3208b> arrayList3 = new ArrayList<>();
        Iterator<C3222g> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C3222g next2 = it3.next();
            if (next2.m3106bd().m2699c()) {
                arrayList3.add(next2);
            }
        }
        Iterator<AbstractC3208b> it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList.remove(it4.next());
        }
        if (!arrayList3.isEmpty()) {
            C3359a.f11094h.m4019t().m4484a(C4189x.m588c(C1306b.C1315i.text_system), arrayList3, true);
        }
        Iterator<C3222g> it5 = arrayList.iterator();
        while (it5.hasNext()) {
            C3359a.f11109w.m2707d().m4813a(it5.next());
        }
        C3359a.f11094h.m4019t().m4480aD();
        C3359a.f11094h.m4019t().m4452ao().m4807c();
        C3359a.f11094h.m4019t().m4452ao().m4806d();
    }

    /* renamed from: a */
    private void m4603a(String str, ArrayList<C3222g> arrayList, ArrayList<AbstractC3208b> arrayList2) {
        Iterator<C3222g> it = arrayList.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (next.m3106bd().f11169b.getPackageName().equals(str)) {
                arrayList2.add(next);
            }
        }
        Iterator<AbstractC3208b> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
    }

    /* renamed from: a */
    private void m4606a(ComponentName componentName, ArrayList<C3222g> arrayList, ArrayList<AbstractC3208b> arrayList2) {
        Iterator<C3222g> it = arrayList.iterator();
        while (it.hasNext()) {
            C3222g next = it.next();
            if (next.m3106bd().f11169b.equals(componentName)) {
                arrayList2.add(next);
            }
        }
        Iterator<AbstractC3208b> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
    }

    /* renamed from: d */
    public void m4600d() {
        m4607a();
    }

    /* renamed from: e */
    public void m4599e() {
        m4602b();
    }
}
