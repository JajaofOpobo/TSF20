package com.tsf.extend.wallpaper;

import com.tsf.extend.C1547h;
import com.tsf.extend.theme.C1703b;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.diy.C1821e;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.tsf.extend.wallpaper.k */
/* loaded from: classes.dex */
public class C2085k extends Thread {

    /* renamed from: a */
    private LinkedBlockingQueue<C1848k> f6826a;

    /* renamed from: b */
    private boolean f6827b = false;

    public C2085k(LinkedBlockingQueue<C1848k> linkedBlockingQueue) {
        this.f6826a = linkedBlockingQueue;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        final C1848k c1848k;
        while (!this.f6827b) {
            try {
                c1848k = this.f6826a.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
                this.f6827b = true;
                c1848k = null;
            }
            if (c1848k.m7324H()) {
                C2087l.m6470a().m6458d(c1848k);
            } else {
                C1821e.m7400a(C1547h.m8290b(), c1848k, new C1821e.InterfaceC1830c() { // from class: com.tsf.extend.wallpaper.k.1
                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1830c
                    /* renamed from: a */
                    public boolean mo6475a() {
                        return c1848k.m7324H();
                    }

                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1830c
                    /* renamed from: b */
                    public void mo6471b() {
                        C2087l.m6470a().m6463b(c1848k);
                    }

                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1830c
                    /* renamed from: a */
                    public void mo6474a(float f) {
                        C2087l.m6470a().m6468a(c1848k, f);
                    }

                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1830c
                    /* renamed from: a */
                    public void mo6473a(C1703b c1703b) {
                        C2087l.m6470a().m6467a(c1848k, c1703b);
                    }

                    @Override // com.tsf.extend.theme.diy.C1821e.InterfaceC1830c
                    /* renamed from: a */
                    public void mo6472a(boolean z) {
                        if (z) {
                            C2087l.m6470a().m6458d(c1848k);
                        } else {
                            C2087l.m6470a().m6459c(c1848k);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void m6476a(boolean z) {
        this.f6827b = z;
    }
}
