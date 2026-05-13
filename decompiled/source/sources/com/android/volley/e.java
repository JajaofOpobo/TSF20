package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class e implements o {
    private final Executor a;

    public e(final Handler handler) {
        this.a = new Executor() { // from class: com.android.volley.e.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, n<?> nVar) {
        a(lVar, nVar, null);
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, n<?> nVar, Runnable runnable) {
        lVar.v();
        lVar.a("post-response");
        this.a.execute(new a(lVar, nVar, runnable));
    }

    @Override // com.android.volley.o
    public void a(l<?> lVar, s sVar) {
        lVar.a("post-error");
        this.a.execute(new a(lVar, n.a(sVar), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        private final l a;
        private final n b;
        private final Runnable c;

        public a(l lVar, n nVar, Runnable runnable) {
            this.a = lVar;
            this.b = nVar;
            this.c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a.h()) {
                this.a.b("canceled-at-delivery");
                return;
            }
            if (this.b.a()) {
                this.a.a((l) this.b.a);
            } else {
                this.a.b(this.b.c);
            }
            if (this.b.d) {
                this.a.a("intermediate-response");
            } else {
                this.a.b("done");
            }
            if (this.c != null) {
                this.c.run();
            }
            this.b.a = null;
            this.b.b = null;
        }
    }
}
