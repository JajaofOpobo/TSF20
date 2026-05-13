package com.tsf.shell.f.f.a;

import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.b;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b {
    private com.tsf.shell.manager.a.e a;
    private boolean c = false;
    private boolean d = false;
    private ArrayList<com.tsf.shell.f.i.b> b = new ArrayList<>();

    public b(com.tsf.shell.manager.a.e eVar) {
        this.a = eVar;
    }

    public ArrayList<com.tsf.shell.f.i.b> a() {
        return this.b;
    }

    public void a(com.tsf.shell.f.i.b bVar) {
        this.b.add(bVar);
    }

    public void a(com.tsf.shell.f.i.b bVar, int i) {
        this.b.add(i, bVar);
    }

    public boolean b(com.tsf.shell.f.i.b bVar) {
        return this.b.remove(bVar);
    }

    public void b() {
        Iterator<com.tsf.shell.f.i.b> it = this.b.iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b next = it.next();
            if (next instanceof com.tsf.shell.f.i.b.d.b) {
                com.tsf.shell.f.i.b.d.b bVar = (com.tsf.shell.f.i.b.d.b) next;
                com.tsf.shell.manager.a.w.c().a(bVar.K());
                bVar.g();
                bVar.destroy();
            }
        }
        this.b.clear();
    }

    public void a(com.tsf.shell.f.i.b bVar, com.tsf.shell.f.i.b bVar2) {
        this.b.set(this.b.indexOf(bVar), bVar2);
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
            Runnable runnable = new Runnable() { // from class: com.tsf.shell.f.f.a.b.1
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
        com.tsf.shell.e.a(b.i.notic_save_settings, b.i.public_action_ok, b.i.public_action_restore, new Runnable() { // from class: com.tsf.shell.f.f.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.b.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.h();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
            }
        }, new Runnable() { // from class: com.tsf.shell.f.f.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.f.f.a.b.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tsf.shell.manager.a.h.t().am().e();
                        b.this.h();
                        if (runnable != null) {
                            runnable.run();
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
            ItemInfo K = this.b.get(i).K();
            K.index = i;
            this.a.c().a(K, 143);
        }
        this.c = false;
    }
}
