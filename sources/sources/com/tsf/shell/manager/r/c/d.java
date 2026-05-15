package com.tsf.shell.manager.r.c;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.censivn.C3DEngine.b.c.b;
import com.censivn.C3DEngine.b.c.e;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.b;
import com.tsf.shell.f.e.h;
import com.tsf.shell.f.e.m;
import com.tsf.shell.f.e.n;
import com.tsf.shell.manager.n.a;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d implements b.a, e.a, h.a, n.a {
    private static a e;
    private j a;
    private h b;
    private String c;
    private String d;
    private boolean f;
    private a.C0133a g;
    private ArrayList<com.tsf.shell.f.i.b> h;
    private boolean i = false;
    private boolean j = false;

    public class a implements Comparator<i> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            float f = (com.censivn.C3DEngine.b.b.a.I - (iVar.position().y * com.censivn.C3DEngine.b.b.a.F)) + iVar.position().x + com.censivn.C3DEngine.b.b.a.H;
            float f2 = (com.censivn.C3DEngine.b.b.a.I - (iVar2.position().y * com.censivn.C3DEngine.b.b.a.F)) + iVar2.position().x + com.censivn.C3DEngine.b.b.a.H;
            if (f > f2) {
                return 1;
            }
            if (f < f2) {
                return -1;
            }
            return 0;
        }
    }

    public d() {
        if (e == null) {
            e = new a();
        }
        this.d = com.censivn.C3DEngine.a.d().getString(b.i.line_picker_back_to_select);
        this.c = com.censivn.C3DEngine.a.d().getString(b.i.notic_function_unavailable);
        this.a = new j() { // from class: com.tsf.shell.manager.r.c.d.1
            @Override // com.censivn.C3DEngine.b.f.i
            public void onDrawStart() {
            }

            @Override // com.censivn.C3DEngine.b.f.i
            public void onKillFocus() {
                d.this.c();
            }
        };
        this.b = new h();
        this.b.a(this.a);
        this.b.a(this);
        this.b.a(true);
        this.a.setMouseEventListener(new com.censivn.C3DEngine.b.d.a(this.a) { // from class: com.tsf.shell.manager.r.c.d.2
            boolean a = false;

            @Override // com.censivn.C3DEngine.b.d.a
            public void e(MotionEvent motionEvent) {
                com.tsf.shell.manager.action.f.a();
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!d.this.b.a()) {
                    d.this.b.a(motionEvent, motionEvent2);
                    return;
                }
                if (!this.a) {
                    final MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    final MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent2);
                    final float[] fArrA = x.a(motionEvent);
                    this.a = true;
                    com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.d.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tsf.shell.f.f.g gVarN = com.tsf.shell.manager.a.h.n();
                            d.this.a.removeFromParent();
                            gVarN.a(d.this.a);
                            d.this.a.position().x = fArrA[0];
                            d.this.a.position().y = fArrA[1];
                            d.this.b.a(motionEventObtain, motionEventObtain2);
                        }
                    });
                }
            }

            @Override // com.censivn.C3DEngine.b.d.a
            public void f(MotionEvent motionEvent) {
                d.this.b.a(motionEvent);
                d.this.c();
                this.a = false;
            }
        });
    }

    public boolean a() {
        return this.f;
    }

    public void b() {
        if (!this.f) {
            this.g = com.tsf.shell.manager.a.q.a(this.g, x.c(b.i.notic_line_picker_notic));
            this.f = true;
            this.a.position().x = 0.0f;
            this.a.position().y = 0.0f;
            this.a.removeFromParent();
            com.censivn.C3DEngine.b.c.b.a(this);
            com.tsf.shell.manager.a.j.a(this.a);
            this.a.setFocus();
            this.a.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
            com.tsf.shell.manager.a.b.a(this);
            e();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void a(int i, KeyEvent keyEvent) {
        if (i == 4) {
            c();
        }
    }

    @Override // com.censivn.C3DEngine.b.c.b.a
    public void b(int i, KeyEvent keyEvent) {
    }

    public void c() {
        if (this.f) {
            com.tsf.shell.manager.a.q.b(this.g);
            this.f = false;
            com.censivn.C3DEngine.b.c.b.b(this);
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
    @Override // com.tsf.shell.f.e.h.a
    public void a(m mVar) {
        if (this.h == null) {
            this.h = new ArrayList<>();
        }
        if (mVar instanceof com.tsf.shell.f.i.b.e.b) {
            com.tsf.shell.f.i.b.e.b bVar = (com.tsf.shell.f.i.b.e.b) mVar;
            if (bVar.ao()) {
                bVar.ar();
            }
            com.tsf.shell.f.i.b bVar2 = (com.tsf.shell.f.i.b) mVar;
            this.i = true;
            bVar2.setDefaultColor(h.a);
            this.h.add(bVar2);
            return;
        }
        if (mVar instanceof com.tsf.shell.f.i.b.d.b) {
            com.tsf.shell.f.i.b bVar3 = (com.tsf.shell.f.i.b) mVar;
            this.i = true;
            bVar3.setDefaultColor(h.a);
            this.h.add(bVar3);
        }
    }

    @Override // com.tsf.shell.f.e.h.a
    public void f() {
        Iterator<com.tsf.shell.f.i.b> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        this.h.clear();
    }

    @Override // com.tsf.shell.f.e.h.a
    public n l_() {
        return new n(this.a, this);
    }

    @Override // com.tsf.shell.f.e.n.a
    public void a(int i) {
        int i2 = 1;
        ArrayList<com.tsf.shell.f.i.b> arrayList = new ArrayList<>();
        for (com.tsf.shell.f.i.b bVar : this.h) {
            if (!bVar.hasDestroyed()) {
                arrayList.add(bVar);
            }
        }
        this.h.clear();
        Iterator<com.tsf.shell.f.i.b> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().clearDefaultColor();
        }
        switch (i) {
            case 0:
                if (arrayList.size() > 1 && arrayList.get(0).z() != null) {
                    com.censivn.C3DEngine.b.h.b.c cVar = new com.censivn.C3DEngine.b.h.b.c(arrayList.get(0).z(), true);
                    Collections.sort(arrayList, e);
                    cVar.c();
                    cVar.a(arrayList);
                } else {
                    com.tsf.shell.e.a(b.i.notic_arrangement_error);
                }
                break;
            case 1:
                com.tsf.shell.e.a(this.c);
                break;
            case 2:
                final ArrayList arrayList2 = (ArrayList) arrayList.clone();
                com.tsf.shell.e.a(b.i.pop_menu_delete_notic, b.i.public_action_ok, b.i.public_action_cancel, new Runnable() { // from class: com.tsf.shell.manager.r.c.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.manager.r.c.d.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    g.a((com.tsf.shell.f.i.b) it2.next(), (Runnable) null);
                                }
                            }
                        });
                    }
                }, (Runnable) null);
                break;
            case 3:
                final ArrayList arrayList3 = new ArrayList();
                for (com.tsf.shell.f.i.b bVar2 : arrayList) {
                    if (bVar2 instanceof com.tsf.shell.f.i.b.e.b) {
                        arrayList3.add((com.tsf.shell.f.i.b.e.b) bVar2);
                    }
                }
                if (arrayList3.size() > 0) {
                    float f = ((com.tsf.shell.f.i.b.e.b) arrayList3.get(0)).position().x;
                    float f2 = ((com.tsf.shell.f.i.b.e.b) arrayList3.get(0)).position().y;
                    Iterator it2 = arrayList3.iterator();
                    float f3 = f;
                    while (true) {
                        float f4 = f2;
                        if (it2.hasNext()) {
                            com.tsf.shell.f.i.b.e.b bVar3 = (com.tsf.shell.f.i.b.e.b) it2.next();
                            f3 = (f3 + bVar3.position().x) / 2.0f;
                            f2 = (bVar3.position().y + f4) / 2.0f;
                        } else {
                            final com.tsf.shell.f.i.b.d.b bVarA = com.tsf.shell.f.i.b.d.b.a(com.tsf.shell.manager.a.h.F(), (int) f3, (int) f4);
                            RenderRunnable renderRunnable = new RenderRunnable(2, i2) { // from class: com.tsf.shell.manager.r.c.d.4
                                @Override // com.censivn.C3DEngine.api.message.RenderRunnable, java.lang.Runnable
                                public void run() {
                                    bVarA.c(arrayList3);
                                }
                            };
                            renderRunnable.autoInvalidate = true;
                            com.censivn.C3DEngine.a.a().a(renderRunnable);
                        }
                    }
                }
                break;
            case 4:
                for (com.tsf.shell.f.i.b bVar4 : arrayList) {
                    if (bVar4 instanceof com.tsf.shell.f.i.c) {
                        ((com.tsf.shell.f.i.c) bVar4).ap();
                    }
                }
                break;
        }
        arrayList.clear();
    }

    @Override // com.censivn.C3DEngine.b.c.e.a
    public void a(int i, int i2, int i3, int i4) {
        this.a.setAABBPX(com.censivn.C3DEngine.b.b.a.z, com.censivn.C3DEngine.b.b.a.C, 0.0f, com.censivn.C3DEngine.b.b.a.A, com.censivn.C3DEngine.b.b.a.B, 0.0f);
    }
}
