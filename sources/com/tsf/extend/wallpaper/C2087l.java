package com.tsf.extend.wallpaper;

import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.theme.C1696ao;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1848k;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.tsf.extend.wallpaper.l */
/* loaded from: classes.dex */
public class C2087l {

    /* renamed from: b */
    private static C2087l f6830b;

    /* renamed from: f */
    private boolean f6835f;

    /* renamed from: d */
    private Vector<C1848k> f6833d = new Vector<>();

    /* renamed from: e */
    private C2085k[] f6834e = new C2085k[2];

    /* renamed from: a */
    private LinkedBlockingQueue<C1848k> f6831a = new LinkedBlockingQueue<>(5);

    /* renamed from: c */
    private List<SoftReference<InterfaceC2093a>> f6832c = new ArrayList();

    /* renamed from: com.tsf.extend.wallpaper.l$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2093a {
        /* renamed from: a */
        void mo6456a(C1848k c1848k);

        /* renamed from: a */
        void mo6455a(C1848k c1848k, float f);

        /* renamed from: a */
        void mo6454a(C1848k c1848k, C1703b c1703b);

        /* renamed from: b */
        void mo6453b(C1848k c1848k);

        /* renamed from: c */
        void mo6452c(C1848k c1848k);
    }

    private C2087l() {
    }

    /* renamed from: a */
    public static C2087l m6470a() {
        if (f6830b == null) {
            f6830b = new C2087l();
        }
        return f6830b;
    }

    /* renamed from: b */
    private void m6464b() {
        if (!this.f6835f) {
            m6460c();
            int length = this.f6834e.length;
            for (int i = 0; i < length; i++) {
                this.f6834e[i] = new C2085k(this.f6831a);
                this.f6834e[i].start();
            }
            this.f6835f = true;
        }
    }

    /* renamed from: c */
    private void m6460c() {
        C2085k[] c2085kArr;
        for (C2085k c2085k : this.f6834e) {
            if (c2085k != null) {
                c2085k.interrupt();
                c2085k.m6476a(true);
            }
        }
        this.f6835f = false;
    }

    /* renamed from: a */
    public boolean m6469a(C1848k c1848k) {
        if (c1848k != null) {
            boolean offer = this.f6831a.offer(c1848k);
            if (offer) {
                m6464b();
                return offer;
            }
            return offer;
        }
        return false;
    }

    /* renamed from: a */
    public void m6466a(InterfaceC2093a interfaceC2093a) {
        SoftReference<InterfaceC2093a> softReference = new SoftReference<>(interfaceC2093a);
        if (this.f6832c != null) {
            this.f6832c.add(softReference);
        }
    }

    /* renamed from: b */
    public void m6462b(InterfaceC2093a interfaceC2093a) {
        if (this.f6832c != null) {
            for (SoftReference<InterfaceC2093a> softReference : this.f6832c) {
                if (interfaceC2093a == softReference.get()) {
                    this.f6832c.remove(softReference);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m6463b(final C1848k c1848k) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.1
            @Override // java.lang.Runnable
            public void run() {
                C2087l.this.f6833d.add(c1848k);
                for (SoftReference softReference : C2087l.this.f6832c) {
                    InterfaceC2093a interfaceC2093a = (InterfaceC2093a) softReference.get();
                    if (interfaceC2093a != null) {
                        interfaceC2093a.mo6456a(c1848k);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void m6468a(final C1848k c1848k, final float f) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.2
            @Override // java.lang.Runnable
            public void run() {
                for (SoftReference softReference : C2087l.this.f6832c) {
                    InterfaceC2093a interfaceC2093a = (InterfaceC2093a) softReference.get();
                    if (interfaceC2093a != null) {
                        interfaceC2093a.mo6455a(c1848k, f);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void m6467a(final C1848k c1848k, final C1703b c1703b) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.3
            @Override // java.lang.Runnable
            public void run() {
                C1696ao.m7774b().m7768h();
                for (SoftReference softReference : C2087l.this.f6832c) {
                    InterfaceC2093a interfaceC2093a = (InterfaceC2093a) softReference.get();
                    if (interfaceC2093a != null) {
                        interfaceC2093a.mo6454a(c1848k, c1703b);
                    }
                }
                c1848k.m7303e(false);
                C2087l.this.f6833d.remove(c1848k);
            }
        });
    }

    /* renamed from: c */
    public void m6459c(final C1848k c1848k) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.4
            @Override // java.lang.Runnable
            public void run() {
                for (SoftReference softReference : C2087l.this.f6832c) {
                    InterfaceC2093a interfaceC2093a = (InterfaceC2093a) softReference.get();
                    if (interfaceC2093a != null) {
                        interfaceC2093a.mo6453b(c1848k);
                    }
                }
                c1848k.m7303e(false);
                C2087l.this.f6833d.remove(c1848k);
            }
        });
    }

    /* renamed from: d */
    public void m6458d(final C1848k c1848k) {
        C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.5
            @Override // java.lang.Runnable
            public void run() {
                for (SoftReference softReference : C2087l.this.f6832c) {
                    InterfaceC2093a interfaceC2093a = (InterfaceC2093a) softReference.get();
                    if (interfaceC2093a != null) {
                        interfaceC2093a.mo6452c(c1848k);
                    }
                }
                c1848k.m7303e(false);
                C2087l.this.f6833d.remove(c1848k);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        r1 = r6.f6833d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r1.hasNext() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r0 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r0.m7324H() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r0.m7297h() != r7.m7297h()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = null;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tsf.extend.theme.C1848k m6457e(com.tsf.extend.theme.C1848k r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.LinkedBlockingQueue<com.tsf.extend.theme.k> r0 = r6.f6831a     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4e
            com.tsf.extend.theme.k r0 = (com.tsf.extend.theme.C1848k) r0     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r0.m7324H()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L7
            long r2 = r0.m7297h()     // Catch: java.lang.Throwable -> L4e
            long r4 = r7.m7297h()     // Catch: java.lang.Throwable -> L4e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
        L25:
            monitor-exit(r6)
            return r0
        L27:
            java.util.Vector<com.tsf.extend.theme.k> r0 = r6.f6833d     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L2d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4e
            com.tsf.extend.theme.k r0 = (com.tsf.extend.theme.C1848k) r0     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r0.m7324H()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L2d
            long r2 = r0.m7297h()     // Catch: java.lang.Throwable -> L4e
            long r4 = r7.m7297h()     // Catch: java.lang.Throwable -> L4e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2d
            goto L25
        L4c:
            r0 = 0
            goto L25
        L4e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.C2087l.m6457e(com.tsf.extend.theme.k):com.tsf.extend.theme.k");
    }
}
