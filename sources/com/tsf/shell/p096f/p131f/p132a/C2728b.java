package com.tsf.shell.p096f.p131f.p132a;

import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.C1306b;
import com.tsf.shell.C2244e;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p166a.C3372e;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p159d.C3145b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.a.b */
/* loaded from: classes.dex */
public class C2728b {

    /* renamed from: a */
    private C3372e f8967a;

    /* renamed from: c */
    private boolean f8969c = false;

    /* renamed from: d */
    private boolean f8970d = false;

    /* renamed from: b */
    private ArrayList<C3112b> f8968b = new ArrayList<>();

    public C2728b(C3372e c3372e) {
        this.f8967a = c3372e;
    }

    /* renamed from: a */
    public ArrayList<C3112b> m4815a() {
        return this.f8968b;
    }

    /* renamed from: a */
    public void m4813a(C3112b c3112b) {
        this.f8968b.add(c3112b);
    }

    /* renamed from: a */
    public void m4812a(C3112b c3112b, int i) {
        this.f8968b.add(i, c3112b);
    }

    /* renamed from: b */
    public boolean m4808b(C3112b c3112b) {
        return this.f8968b.remove(c3112b);
    }

    /* renamed from: b */
    public void m4809b() {
        Iterator<C3112b> it = this.f8968b.iterator();
        while (it.hasNext()) {
            C3112b next = it.next();
            if (next instanceof C3145b) {
                C3145b c3145b = (C3145b) next;
                C3359a.f11109w.m2708c().m2734a(c3145b.m3534K());
                c3145b.mo3055g();
                c3145b.destroy();
            }
        }
        this.f8968b.clear();
    }

    /* renamed from: a */
    public void m4811a(C3112b c3112b, C3112b c3112b2) {
        this.f8968b.set(this.f8968b.indexOf(c3112b), c3112b2);
    }

    /* renamed from: c */
    public void m4807c() {
        this.f8969c = true;
    }

    /* renamed from: d */
    public void m4806d() {
        this.f8969c = true;
        this.f8970d = true;
    }

    /* renamed from: e */
    public void m4805e() {
        this.f8969c = false;
    }

    /* renamed from: f */
    public boolean m4804f() {
        return this.f8969c;
    }

    /* renamed from: g */
    public boolean m4803g() {
        if (this.f8969c) {
            this.f8969c = false;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C3359a.f11094h.m4019t().m4456ak();
                }
            };
            if (!this.f8970d) {
                m4802h();
                runnable.run();
            } else {
                m4810a(runnable);
            }
            this.f8970d = false;
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m4810a(final Runnable runnable) {
        C2244e.m6019a(C1306b.C1315i.notic_save_settings, C1306b.C1315i.public_action_ok, C1306b.C1315i.public_action_restore, new Runnable() { // from class: com.tsf.shell.f.f.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C2728b.this.m4802h();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }, new Runnable() { // from class: com.tsf.shell.f.f.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.f.f.a.b.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C3359a.f11094h.m4019t().m4454am().m4599e();
                        C2728b.this.m4802h();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m4802h() {
        int size = this.f8968b.size();
        for (int i = 0; i < size; i++) {
            ItemInfo m3534K = this.f8968b.get(i).m3534K();
            m3534K.index = i;
            this.f8967a.m2708c().m2733a(m3534K, 143);
        }
        this.f8969c = false;
    }
}
