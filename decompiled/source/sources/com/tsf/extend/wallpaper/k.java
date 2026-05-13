package com.tsf.extend.wallpaper;

import com.tsf.extend.theme.diy.e;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public class k extends Thread {
    private LinkedBlockingQueue<com.tsf.extend.theme.k> a;
    private boolean b = false;

    public k(LinkedBlockingQueue<com.tsf.extend.theme.k> linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        final com.tsf.extend.theme.k kVar;
        while (!this.b) {
            try {
                kVar = this.a.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.b = true;
                kVar = null;
            }
            if (kVar.H()) {
                l.a().d(kVar);
            } else {
                com.tsf.extend.theme.diy.e.a(com.tsf.extend.h.b(), kVar, new e.c() { // from class: com.tsf.extend.wallpaper.k.1
                    @Override // com.tsf.extend.theme.diy.e.c
                    public boolean a() {
                        return kVar.H();
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void b() {
                        l.a().b(kVar);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(float f) {
                        l.a().a(kVar, f);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(com.tsf.extend.theme.b bVar) {
                        l.a().a(kVar, bVar);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(boolean z) {
                        if (z) {
                            l.a().d(kVar);
                        } else {
                            l.a().c(kVar);
                        }
                    }
                });
            }
        }
    }

    public void a(boolean z) {
        this.b = z;
    }
}
