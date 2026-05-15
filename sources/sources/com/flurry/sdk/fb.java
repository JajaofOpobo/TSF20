package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class fb {
    private static final String a = fb.class.getSimpleName();
    private final dt<a> b = new dt<>();
    private long c = 1000;
    private boolean d = true;
    private boolean e = false;
    private ff f = new ff() { // from class: com.flurry.sdk.fb.1
        @Override // com.flurry.sdk.ff
        public void a() {
            try {
                Iterator it = fb.this.f().iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(fb.this);
                }
            } catch (Throwable th) {
                eo.a(6, fb.a, "", th);
            }
            if (fb.this.d && fb.this.e) {
                Cdo.a().a(fb.this.f, fb.this.c);
            }
        }
    };

    public interface a {
        void a(fb fbVar);
    }

    public void a(long j) {
        this.c = j;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public synchronized void a() {
        if (!this.e) {
            Cdo.a().a(this.f, this.c);
            this.e = true;
        }
    }

    public synchronized void b() {
        if (this.e) {
            Cdo.a().b(this.f);
            this.e = false;
        }
    }

    public synchronized boolean c() {
        return this.e;
    }

    public synchronized void a(a aVar) {
        this.b.a(aVar);
    }

    public synchronized boolean b(a aVar) {
        return this.b.b(aVar);
    }

    public synchronized int d() {
        return this.b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized List<a> f() {
        return this.b.a();
    }
}
