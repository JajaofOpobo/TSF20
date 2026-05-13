package android.support.p013v7.view;

import android.support.p002v4.view.C0363bb;
import android.support.p002v4.view.C0381bg;
import android.support.p002v4.view.InterfaceC0380bf;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: android.support.v7.view.h */
/* loaded from: classes.dex */
public class C0617h {

    /* renamed from: c */
    private Interpolator f1443c;

    /* renamed from: d */
    private InterfaceC0380bf f1444d;

    /* renamed from: e */
    private boolean f1445e;

    /* renamed from: b */
    private long f1442b = -1;

    /* renamed from: f */
    private final C0381bg f1446f = new C0381bg() { // from class: android.support.v7.view.h.1

        /* renamed from: b */
        private boolean f1448b = false;

        /* renamed from: c */
        private int f1449c = 0;

        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: a */
        public void mo11265a(View view) {
            if (!this.f1448b) {
                this.f1448b = true;
                if (C0617h.this.f1444d != null) {
                    C0617h.this.f1444d.mo11265a(null);
                }
            }
        }

        /* renamed from: a */
        void m11815a() {
            this.f1449c = 0;
            this.f1448b = false;
            C0617h.this.m11817c();
        }

        @Override // android.support.p002v4.view.C0381bg, android.support.p002v4.view.InterfaceC0380bf
        /* renamed from: b */
        public void mo11264b(View view) {
            int i = this.f1449c + 1;
            this.f1449c = i;
            if (i == C0617h.this.f1441a.size()) {
                if (C0617h.this.f1444d != null) {
                    C0617h.this.f1444d.mo11264b(null);
                }
                m11815a();
            }
        }
    };

    /* renamed from: a */
    private final ArrayList<C0363bb> f1441a = new ArrayList<>();

    /* renamed from: a */
    public C0617h m11824a(C0363bb c0363bb) {
        if (!this.f1445e) {
            this.f1441a.add(c0363bb);
        }
        return this;
    }

    /* renamed from: a */
    public C0617h m11823a(C0363bb c0363bb, C0363bb c0363bb2) {
        this.f1441a.add(c0363bb);
        c0363bb2.m12700b(c0363bb.m12711a());
        this.f1441a.add(c0363bb2);
        return this;
    }

    /* renamed from: a */
    public void m11826a() {
        if (!this.f1445e) {
            Iterator<C0363bb> it = this.f1441a.iterator();
            while (it.hasNext()) {
                C0363bb next = it.next();
                if (this.f1442b >= 0) {
                    next.m12709a(this.f1442b);
                }
                if (this.f1443c != null) {
                    next.m12703a(this.f1443c);
                }
                if (this.f1444d != null) {
                    next.m12705a(this.f1446f);
                }
                next.m12697c();
            }
            this.f1445e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m11817c() {
        this.f1445e = false;
    }

    /* renamed from: b */
    public void m11819b() {
        if (this.f1445e) {
            Iterator<C0363bb> it = this.f1441a.iterator();
            while (it.hasNext()) {
                it.next().m12702b();
            }
            this.f1445e = false;
        }
    }

    /* renamed from: a */
    public C0617h m11825a(long j) {
        if (!this.f1445e) {
            this.f1442b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0617h m11820a(Interpolator interpolator) {
        if (!this.f1445e) {
            this.f1443c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0617h m11822a(InterfaceC0380bf interfaceC0380bf) {
        if (!this.f1445e) {
            this.f1444d = interfaceC0380bf;
        }
        return this;
    }
}
