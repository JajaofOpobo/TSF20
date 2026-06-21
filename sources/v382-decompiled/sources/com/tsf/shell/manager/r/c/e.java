package com.tsf.shell.manager.r.c;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.c.k;
import com.censivn.C3DEngine.b.f.l;
import com.tsf.shell.R;
import com.tsf.shell.e.e.j;
import com.tsf.shell.e.e.p;
import com.tsf.shell.e.e.q;
import com.tsf.shell.e.e.r;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements com.censivn.C3DEngine.b.c.d, k, j, r {
    private static f e;
    private l a;
    private com.tsf.shell.e.e.i b;
    private String c;
    private String d;
    private boolean f;
    private com.tsf.shell.manager.n.b g;
    private ArrayList h;
    private boolean i = false;
    private boolean j = false;

    public e() {
        if (e == null) {
            e = new f(this);
        }
        this.d = com.censivn.C3DEngine.a.d().getString(R.string.line_picker_back_to_select);
        this.c = com.censivn.C3DEngine.a.d().getString(R.string.notic_function_unavailable);
        this.a = new l() { // from class: com.tsf.shell.manager.r.c.e.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawStart() {
            }

            @Override // com.censivn.C3DEngine.b.f.j
            public void onKillFocus() {
                e.this.c();
            }
        };
        this.b = new com.tsf.shell.e.e.i();
        this.b.a(this.a);
        this.b.a(this);
        this.b.a(true);
        this.a.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.a) { // from class: com.tsf.shell.manager.r.c.e.2
            boolean a = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                com.tsf.shell.manager.action.h.a();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!e.this.b.a()) {
                    e.this.b.a(motionEvent, motionEvent2);
                    return;
                }
                if (!this.a) {
                    final MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    final MotionEvent obtain2 = MotionEvent.obtain(motionEvent2);
                    final float[] a = x.a(motionEvent);
                    this.a = true;
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.e.f.g n = com.tsf.shell.manager.a.h.n();
                            e.this.a.removeFromParent();
                            n.a(e.this.a);
                            e.this.a.position().x = a[0];
                            e.this.a.position().y = a[1];
                            e.this.b.a(obtain, obtain2);
                        }
                    });
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                e.this.b.a(motionEvent);
                e.this.c();
                this.a = false;
            }
        });
    }

    public boolean a() {
        return this.f;
    }

    public void b() {
        if (!this.f) {
            this.g = com.tsf.shell.manager.a.q.a(this.g, x.c(R.string.notic_line_picker_notic));
            this.f = true;
            this.a.position().x = 0.0f;
            this.a.position().y = 0.0f;
            this.a.removeFromParent();
            com.censivn.C3DEngine.b.c.c.a(this);
            com.tsf.shell.manager.a.j.a(this.a);
            this.a.setFocus();
            this.a.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
            com.tsf.shell.manager.a.b.a(this);
            e();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.d
    public void b(int i, KeyEvent keyEvent) {
    }

    public void c() {
        if (this.f) {
            com.tsf.shell.manager.a.q.b(this.g);
            this.f = false;
            com.censivn.C3DEngine.b.c.c.b(this);
            this.a.removeFromParent();
            com.tsf.shell.manager.a.b.b(this);
            d();
        }
    }

    public void d() {
    }

    public void e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tsf.shell.e.e.j
    public void a(p pVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        if (pVar instanceof com.tsf.shell.e.i.b.e.b) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) pVar;
            if (bVar.ao()) {
                bVar.ar();
            }
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) pVar;
            this.i = true;
            cVar.setDefaultColor(com.tsf.shell.e.e.i.a);
            this.h.add(cVar);
            return;
        }
        if (pVar instanceof com.tsf.shell.e.i.b.d.b) {
            com.tsf.shell.e.i.c cVar2 = (com.tsf.shell.e.i.c) pVar;
            this.i = true;
            cVar2.setDefaultColor(com.tsf.shell.e.e.i.a);
            this.h.add(cVar2);
        }
    }

    @Override // com.tsf.shell.e.e.j
    public void f() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((com.tsf.shell.e.i.c) it.next()).clearDefaultColor();
        }
        this.h.clear();
    }

    @Override // com.tsf.shell.e.e.j
    public q j_() {
        return new q(this.a, this);
    }

    @Override // com.tsf.shell.e.e.r
    public void a(int i) {
        int i2 = 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.c cVar = (com.tsf.shell.e.i.c) it.next();
            if (!cVar.hasDestroyed()) {
                arrayList.add(cVar);
            }
        }
        this.h.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((com.tsf.shell.e.i.c) it2.next()).clearDefaultColor();
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1 && ((com.tsf.shell.e.i.c) arrayList.get(0)).z() != null) {
                    com.censivn.C3DEngine.b.h.b.c cVar2 = new com.censivn.C3DEngine.b.h.b.c(((com.tsf.shell.e.i.c) arrayList.get(0)).z(), true);
                    Collections.sort(arrayList, e);
                    cVar2.c();
                    cVar2.a(arrayList);
                    break;
                } else {
                    com.tsf.shell.k.a(R.string.notic_arrangement_error);
                    break;
                }
            case 1:
                com.tsf.shell.k.a(this.c);
                break;
            case 2:
                final ArrayList arrayList2 = (ArrayList) arrayList.clone();
                com.tsf.shell.k.a(R.string.pop_menu_delete_notic, R.string.public_action_ok, R.string.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.e.3
                    @Override // java.lang.Runnable
                    public void run() {
                        final ArrayList arrayList3 = arrayList2;
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.e.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    i.a((com.tsf.shell.e.i.c) it3.next(), (Runnable) null);
                                }
                            }
                        });
                    }
                }, (Runnable) null);
                break;
            case 3:
                final ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    com.tsf.shell.e.i.c cVar3 = (com.tsf.shell.e.i.c) it3.next();
                    if (cVar3 instanceof com.tsf.shell.e.i.b.e.b) {
                        arrayList3.add((com.tsf.shell.e.i.b.e.b) cVar3);
                    }
                }
                if (arrayList3.size() > 0) {
                    float f = ((com.tsf.shell.e.i.b.e.b) arrayList3.get(0)).position().x;
                    float f2 = ((com.tsf.shell.e.i.b.e.b) arrayList3.get(0)).position().y;
                    Iterator it4 = arrayList3.iterator();
                    float f3 = f;
                    while (true) {
                        float f4 = f2;
                        if (it4.hasNext()) {
                            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) it4.next();
                            f3 = (f3 + bVar.position().x) / 2.0f;
                            f2 = (bVar.position().y + f4) / 2.0f;
                        } else {
                            final com.tsf.shell.e.i.b.d.b a = com.tsf.shell.e.i.b.d.b.a(com.tsf.shell.manager.a.h.F(), (int) f3, (int) f4);
                            RenderRunnable renderRunnable = new RenderRunnable(2, i2) { // from class: com.tsf.shell.manager.r.c.e.4
                                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                                public void run() {
                                    a.c(arrayList3);
                                }
                            };
                            renderRunnable.autoInvalidate = true;
                            com.censivn.C3DEngine.a.a().a(renderRunnable);
                            break;
                        }
                    }
                }
                break;
            case 4:
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    com.tsf.shell.e.i.c cVar4 = (com.tsf.shell.e.i.c) it5.next();
                    if (cVar4 instanceof com.tsf.shell.e.i.e) {
                        ((com.tsf.shell.e.i.e) cVar4).ap();
                    }
                }
                break;
        }
        arrayList.clear();
    }

    @Override // com.censivn.C3DEngine.b.c.k
    public void a(int i, int i2, int i3, int i4) {
        this.a.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
    }
}
