package com.tsf.shell.manager.p166a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.p096f.p131f.p132a.C2728b;
import com.tsf.shell.p096f.p131f.p132a.C2862h;
import com.tsf.shell.p096f.p131f.p132a.p139d.C2817a;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.manager.a.e */
/* loaded from: classes.dex */
public class C3372e {

    /* renamed from: a */
    public static String f11149a = "0";

    /* renamed from: b */
    public static String f11150b = "1";

    /* renamed from: c */
    public static String f11151c = "2";

    /* renamed from: d */
    public static String f11152d = "3";

    /* renamed from: g */
    private C2862h f11155g;

    /* renamed from: e */
    private C3364c f11153e = new C3364c(this);

    /* renamed from: f */
    private C2817a f11154f = new C2817a(this);

    /* renamed from: h */
    private C3366d f11156h = new C3366d(this);

    /* renamed from: i */
    private C2728b f11157i = new C2728b(this);

    /* renamed from: a */
    public C3364c m2716a() {
        return this.f11153e;
    }

    /* renamed from: b */
    public C2817a m2712b() {
        return this.f11154f;
    }

    /* renamed from: c */
    public C3366d m2708c() {
        return this.f11156h;
    }

    /* renamed from: d */
    public C2728b m2707d() {
        return this.f11157i;
    }

    /* renamed from: a */
    public void m2714a(final ArrayList<C3377f> arrayList) {
        this.f11155g = C3359a.f11094h.m4019t();
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.a.e.1
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<C3222g> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3222g c3222g = new C3222g(null, (C3377f) it.next(), true);
                    c3222g.setMouseEventListener(C3372e.this.f11155g.m4406f(c3222g));
                    arrayList2.add(c3222g);
                }
                C3372e.this.f11153e.m2741a(arrayList2);
            }
        });
    }

    /* renamed from: a */
    public void m2713a(final ArrayList<C3377f> arrayList, final boolean z) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.a.e.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3377f c3377f = (C3377f) it.next();
                    c3377f.m2697e();
                    if (C3372e.this.f11153e.m2742a(c3377f) == null) {
                        C3222g c3222g = new C3222g(new LauncherShortcutAppInfo(), c3377f, true);
                        c3222g.setMouseEventListener(C3372e.this.f11155g.m4406f(c3222g));
                        C3372e.this.f11153e.m2745a(c3222g, z);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m2709b(final ArrayList<C3377f> arrayList, final boolean z) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.a.e.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    C3359a.f11098l.m1866a(arrayList);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3377f c3377f = (C3377f) it.next();
                    c3377f.m2698d();
                    C3222g m2742a = C3372e.this.f11153e.m2742a(c3377f);
                    if (m2742a != null) {
                        m2742a.mo3055g();
                        m2742a.destroy();
                        C3372e.this.f11153e.m2739b(m2742a, z);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void m2710b(final ArrayList<C3377f> arrayList) {
        C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.a.e.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3377f c3377f = (C3377f) it.next();
                    c3377f.m2697e();
                    C3372e.this.f11153e.m2746a(C3372e.this.f11153e.m2742a(c3377f));
                }
            }
        });
    }
}
