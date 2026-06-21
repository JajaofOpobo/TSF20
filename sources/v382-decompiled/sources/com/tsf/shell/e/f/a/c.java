package com.tsf.shell.e.f.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    private com.tsf.shell.manager.a.h a;
    private boolean c = false;
    private boolean d = false;
    private ArrayList b = new ArrayList();

    public c(com.tsf.shell.manager.a.h hVar) {
        this.a = hVar;
    }

    public ArrayList a() {
        return this.b;
    }

    public void a(com.tsf.shell.e.i.c cVar) {
        this.b.add(cVar);
    }

    public void a(com.tsf.shell.e.i.c cVar, int i) {
        this.b.add(i, cVar);
    }

    public boolean b(com.tsf.shell.e.i.c cVar) {
        return this.b.remove(cVar);
    }

    public void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
            if (cVar instanceof com.tsf.shell.e.i.b.d.b) {
                com.tsf.shell.e.i.b.d.b bVar = (com.tsf.shell.e.i.b.d.b) cVar;
                com.tsf.shell.manager.a.w.c().a(bVar.K());
                bVar.g();
                bVar.destroy();
            }
        }
        this.b.clear();
    }

    public void a(com.tsf.shell.e.i.c cVar, com.tsf.shell.e.i.c cVar2) {
        this.b.set(this.b.indexOf(cVar), cVar2);
    }

    public void c() {
        this.c = true;
    }

    public void d() {
        this.c = true;
        this.d = true;
    }

    public void e() {
        this.c = false;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        if (this.c) {
            this.c = false;
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.f.a.c.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tsf.shell.manager.a.h.t().ak();
                }
            };
            if (!this.d) {
                h();
                runnable.run();
            } else {
                a(runnable);
            }
            this.d = false;
            return false;
        }
        return true;
    }

    public void a(final Runnable runnable) {
        com.tsf.shell.k.a(R.string.notic_save_settings, R.string.public_action_ok, R.string.public_action_restore, new Runnable() { // from class: com.tsf.shell.e.f.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                final Runnable runnable2 = runnable;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.c.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c.this.h();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        }, new Runnable() { // from class: com.tsf.shell.e.f.a.c.3
            @Override // java.lang.Runnable
            public void run() {
                final Runnable runnable2 = runnable;
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.e.f.a.c.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.a.h.t().am().e();
                        c.this.h();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ItemInfo K = ((com.tsf.shell.e.i.c) this.b.get(i)).K();
            K.index = i;
            this.a.c().a(K, 143);
        }
        this.c = false;
    }
}
