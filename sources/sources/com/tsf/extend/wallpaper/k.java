package com.tsf.extend.wallpaper;

import com.tsf.extend.theme.diy.e;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class k extends Thread {
    private LinkedBlockingQueue<com.tsf.extend.theme.k> a;
    private boolean b = false;

    public k(LinkedBlockingQueue<com.tsf.extend.theme.k> linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        final com.tsf.extend.theme.k kVarTake;
        while (!this.b) {
            try {
                kVarTake = this.a.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.b = true;
                kVarTake = null;
            }
            if (kVarTake.H()) {
                l.a().d(kVarTake);
            } else {
                com.tsf.extend.theme.diy.e.a(com.tsf.extend.h.b(), kVarTake, new e.c() { // from class: com.tsf.extend.wallpaper.k.1
                    @Override // com.tsf.extend.theme.diy.e.c
                    public boolean a() {
                        return kVarTake.H();
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void b() {
                        l.a().b(kVarTake);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(float f) {
                        l.a().a(kVarTake, f);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(com.tsf.extend.theme.b bVar) {
                        l.a().a(kVarTake, bVar);
                    }

                    @Override // com.tsf.extend.theme.diy.e.c
                    public void a(boolean z) {
                        if (z) {
                            l.a().d(kVarTake);
                        } else {
                            l.a().c(kVarTake);
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
