package com.tsf.extend.wallpaper;

import com.tsf.extend.theme.ao;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class l {
    private static l b;
    private boolean f;
    private Vector<com.tsf.extend.theme.k> d = new Vector<>();
    private k[] e = new k[2];
    private LinkedBlockingQueue<com.tsf.extend.theme.k> a = new LinkedBlockingQueue<>(5);
    private List<SoftReference<a>> c = new ArrayList();

    public interface a {
        void a(com.tsf.extend.theme.k kVar);

        void a(com.tsf.extend.theme.k kVar, float f);

        void a(com.tsf.extend.theme.k kVar, com.tsf.extend.theme.b bVar);

        void b(com.tsf.extend.theme.k kVar);

        void c(com.tsf.extend.theme.k kVar);
    }

    private l() {
    }

    public static l a() {
        if (b == null) {
            b = new l();
        }
        return b;
    }

    private void b() {
        if (!this.f) {
            c();
            int length = this.e.length;
            for (int i = 0; i < length; i++) {
                this.e[i] = new k(this.a);
                this.e[i].start();
            }
            this.f = true;
        }
    }

    private void c() {
        for (k kVar : this.e) {
            if (kVar != null) {
                kVar.interrupt();
                kVar.a(true);
            }
        }
        this.f = false;
    }

    public boolean a(com.tsf.extend.theme.k kVar) {
        if (kVar == null) {
            return false;
        }
        boolean zOffer = this.a.offer(kVar);
        if (zOffer) {
            b();
            return zOffer;
        }
        return zOffer;
    }

    public void a(a aVar) {
        SoftReference<a> softReference = new SoftReference<>(aVar);
        if (this.c != null) {
            this.c.add(softReference);
        }
    }

    public void b(a aVar) {
        if (this.c != null) {
            for (SoftReference<a> softReference : this.c) {
                if (aVar == softReference.get()) {
                    this.c.remove(softReference);
                    return;
                }
            }
        }
    }

    public void b(final com.tsf.extend.theme.k kVar) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.1
            @Override // java.lang.Runnable
            public void run() {
                l.this.d.add(kVar);
                Iterator it = l.this.c.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((SoftReference) it.next()).get();
                    if (aVar != null) {
                        aVar.a(kVar);
                    }
                }
            }
        });
    }

    public void a(final com.tsf.extend.theme.k kVar, final float f) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = l.this.c.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((SoftReference) it.next()).get();
                    if (aVar != null) {
                        aVar.a(kVar, f);
                    }
                }
            }
        });
    }

    public void a(final com.tsf.extend.theme.k kVar, final com.tsf.extend.theme.b bVar) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.3
            @Override // java.lang.Runnable
            public void run() {
                ao.b().h();
                Iterator it = l.this.c.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((SoftReference) it.next()).get();
                    if (aVar != null) {
                        aVar.a(kVar, bVar);
                    }
                }
                kVar.e(false);
                l.this.d.remove(kVar);
            }
        });
    }

    public void c(final com.tsf.extend.theme.k kVar) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.4
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = l.this.c.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((SoftReference) it.next()).get();
                    if (aVar != null) {
                        aVar.b(kVar);
                    }
                }
                kVar.e(false);
                l.this.d.remove(kVar);
            }
        });
    }

    public void d(final com.tsf.extend.theme.k kVar) {
        com.tsf.extend.base.j.z.a(0, new Runnable() { // from class: com.tsf.extend.wallpaper.l.5
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = l.this.c.iterator();
                while (it.hasNext()) {
                    a aVar = (a) ((SoftReference) it.next()).get();
                    if (aVar != null) {
                        aVar.c(kVar);
                    }
                }
                kVar.e(false);
                l.this.d.remove(kVar);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r1 = r6.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r0 = r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r0.H() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0.h() != r7.h()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tsf.extend.theme.k e(com.tsf.extend.theme.k r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.LinkedBlockingQueue<com.tsf.extend.theme.k> r0 = r6.a     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L7:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L27
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4e
            com.tsf.extend.theme.k r0 = (com.tsf.extend.theme.k) r0     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r0.H()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L7
            long r2 = r0.h()     // Catch: java.lang.Throwable -> L4e
            long r4 = r7.h()     // Catch: java.lang.Throwable -> L4e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L7
        L25:
            monitor-exit(r6)
            return r0
        L27:
            java.util.Vector<com.tsf.extend.theme.k> r0 = r6.d     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L2d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4e
            com.tsf.extend.theme.k r0 = (com.tsf.extend.theme.k) r0     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r0.H()     // Catch: java.lang.Throwable -> L4e
            if (r2 != 0) goto L2d
            long r2 = r0.h()     // Catch: java.lang.Throwable -> L4e
            long r4 = r7.h()     // Catch: java.lang.Throwable -> L4e
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
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.wallpaper.l.e(com.tsf.extend.theme.k):com.tsf.extend.theme.k");
    }
}
