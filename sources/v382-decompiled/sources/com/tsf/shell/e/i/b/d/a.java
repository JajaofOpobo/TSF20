package com.tsf.shell.e.i.b.d;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.utils.n;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends com.censivn.C3DEngine.b.d.a {
    private static float[] l = {0.0f, 0.0f};
    private b a;
    private com.censivn.C3DEngine.b.d.a b;
    private boolean d;
    private com.tsf.shell.manager.d.b e;
    private boolean f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private int m;
    private float n;
    private float o;
    private boolean p;
    private Runnable q;

    public a(com.censivn.C3DEngine.b.f.j jVar, b bVar) {
        super(jVar);
        this.d = false;
        this.k = false;
        this.m = -1;
        this.p = false;
        this.a = bVar;
        this.b = jVar.getMouseEventListener();
        this.e = new com.tsf.shell.manager.d.b() { // from class: com.tsf.shell.e.i.b.d.a.1
            @Override // com.tsf.shell.manager.d.b
            public boolean a(com.tsf.shell.e.e.g gVar) {
                return gVar instanceof com.tsf.shell.e.e.e.g;
            }
        };
    }

    public boolean a() {
        this.a = null;
        this.c.setMouseEventListener(this.b);
        if (this.f) {
            ((com.tsf.shell.e.i.b.e.b) this.c).ah();
            this.b.c(null);
            com.censivn.C3DEngine.a.h.d().e();
            com.censivn.C3DEngine.a.h.d().a(this.b, true);
        }
        this.b = null;
        return this.f;
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        super.c(motionEvent);
        this.k = false;
        l = x.a(motionEvent, l);
        this.i = motionEvent.getX();
        this.j = motionEvent.getY();
        if (this.a.aV() == b.a) {
            com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.c;
            if (com.tsf.shell.manager.a.A.a() && bVar.aC()) {
                this.m = this.a.aF().a(this.c);
                this.a.aO();
                this.a.aF().c(true);
                if (bVar.A().e()) {
                    ArrayList i = bVar.A().i();
                    bVar.rotation().z = 0.0f;
                    int size = i.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) i.get(i2);
                        if (bVar2 != bVar) {
                            bVar2.g(1.0f);
                            bVar.a((com.tsf.shell.e.i.e) bVar2);
                            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
                            w.a(bVar2);
                            xVar.l(1.0f);
                            xVar.m(1.0f);
                            w.a(bVar2, 300, xVar);
                        }
                    }
                    bVar.A().g();
                    this.a.n(false);
                }
                com.tsf.shell.utils.w.a();
                this.f = true;
                Number3d.TEMPNUMBER3D2.reset();
                Number3d localToGlobal = this.c.localToGlobal(Number3d.TEMPNUMBER3D2);
                localToGlobal.y += this.a.aF().m();
                this.c.position().setAllFrom(localToGlobal);
                this.a.aF().a((com.tsf.shell.e.i.b.e.b) this.c);
                com.tsf.shell.manager.a.j.a(this.c);
                b();
                com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
                xVar2.l(bVar.d);
                xVar2.m(bVar.d);
                xVar2.n(1.0f);
                w.a(this.c);
                w.a(this.c, 500, xVar2);
                this.c.setAnimationObjectState(true);
                if (this.a.aC()) {
                    if (!bVar.as()) {
                        com.tsf.shell.manager.a.h.t().a((com.tsf.shell.e.i.c) bVar, false, l[0], l[1]);
                        return;
                    }
                    return;
                }
                com.tsf.shell.manager.a.p.a(bVar, l[0], l[1], true, 0);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.aF().a(motionEvent, motionEvent2, f, f2);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.a.aF().a(f2);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        this.a.aF().a(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(MotionEvent motionEvent) {
        boolean z = true;
        com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.c;
        bVar.setAnimationObjectState(false);
        super.d(motionEvent);
        if (this.a.aV() == b.a && this.f) {
            this.a.aF().c(false);
            this.f = false;
            if (!this.d) {
                if ((this.k || bVar.n() != null) && bVar.o()) {
                    float[] a = x.a(motionEvent);
                    com.tsf.shell.e.e.g a2 = bVar.a((int) a[0], (int) a[1]);
                    if (bVar.h(a2)) {
                        bVar.g(a2);
                        if (!z) {
                            this.a.aF().n();
                        } else {
                            com.tsf.shell.manager.a.j.b(bVar);
                            this.a.aF().globalToLocal(this.c.position()).y -= this.a.aF().m();
                            w.a(this.c);
                            int b = this.a.aF().b(bVar);
                            if (bVar.as()) {
                                ArrayList aw = bVar.aw();
                                int size = aw == null ? 0 : aw.size();
                                if (size > 0) {
                                    if (b != -1) {
                                        for (int i = 0; i < size; i++) {
                                            com.tsf.shell.e.i.b.e.b bVar2 = (com.tsf.shell.e.i.b.e.b) aw.get(i);
                                            bVar2.position().x = bVar.position().x + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                                            bVar2.position().y = bVar.position().y + (com.tsf.shell.e.i.b.e.b.j * (i + 1));
                                            bVar2.removeFromParent();
                                            this.a.aF().addChildAt(bVar2, b);
                                        }
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("restoreShortcut index error", Integer.toString(b));
                                        n.a("EVENT_ISSUSE_FOLDER_ITEM_MOUSE_EVENT", hashMap);
                                    }
                                }
                            } else if (!this.k) {
                                bVar.ai();
                            }
                            this.a.n(false);
                        }
                        this.a.aJ();
                    } else {
                        bVar.p();
                    }
                }
                z = false;
                if (!z) {
                }
                this.a.aJ();
            }
            com.tsf.shell.manager.a.p.c();
            this.a.aP();
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.f) {
            if (!this.k) {
                if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                    this.k = true;
                    if (this.c instanceof com.tsf.shell.e.i.c) {
                        ((com.tsf.shell.e.i.c) this.c).ab();
                        return;
                    }
                    return;
                }
                return;
            }
            final float[] a = x.a(motionEvent2, l);
            if (!this.d) {
                this.e.a((com.tsf.shell.e.e.g) this.c, motionEvent2);
            }
            this.n = motionEvent2.getX();
            this.o = motionEvent2.getY();
            this.c.position().x = (int) (this.g + (motionEvent2.getX() - this.i));
            this.c.position().y = (int) (this.h - (motionEvent2.getY() - this.j));
            if (this.q == null) {
                this.q = new Runnable() { // from class: com.tsf.shell.e.i.b.d.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.p = false;
                        if (!a.this.d) {
                            com.tsf.shell.manager.a.p.a(a[0], a[1]);
                            int b = a.this.a.b(a.this.n, a.this.o);
                            if (b == -2) {
                                a.this.d = true;
                                a.this.a.aF().c(false);
                                a.this.a.a((com.tsf.shell.e.i.b.e.b) a.this.c);
                                return;
                            }
                            if (a.this.m != b) {
                                switch (b) {
                                    case -4:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(true);
                                        return;
                                    case -3:
                                        a.this.a.aF();
                                        g.a(true);
                                        a.this.a.aF();
                                        g.b(false);
                                        return;
                                    case -2:
                                    default:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(false);
                                        a.this.a.aF();
                                        g.a();
                                        a.this.a.aF().k();
                                        break;
                                    case ItemInfo.NO_ID /* -1 */:
                                        a.this.a.aF();
                                        g.a(false);
                                        a.this.a.aF();
                                        g.b(false);
                                        a.this.a.aF();
                                        g.a();
                                        return;
                                }
                            }
                            if (a.this.a.aF().a(a.this.c, a.this.m, b)) {
                                a.this.m = b;
                            }
                        }
                    }
                };
            }
            if (!this.p) {
                this.p = true;
                com.censivn.C3DEngine.a.a().b(this.q);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void e(MotionEvent motionEvent) {
        if (this.c.parent() instanceof g) {
            g gVar = (g) this.c.parent();
            Number3d.TEMPNUMBER3D2.reset();
            Number3d.TEMPNUMBER3D3.reset();
            this.c.localToGlobal(Number3d.TEMPNUMBER3D2);
            Number3d number3d = Number3d.TEMPNUMBER3D2;
            number3d.y = gVar.m() + number3d.y;
            ((com.tsf.shell.e.i.b.e.b) this.c).a(Number3d.TEMPNUMBER3D2, Number3d.TEMPNUMBER3D3);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (this.c instanceof com.tsf.shell.e.i.e) {
            com.tsf.shell.e.i.e eVar = (com.tsf.shell.e.i.e) this.c;
            if (eVar.A().e()) {
                eVar.ap();
                return;
            }
        }
        ((com.tsf.shell.e.i.b.e.b) this.c).l();
    }

    public void b() {
        a(this.c.position().x, this.c.position().y);
    }

    public void a(float f, float f2) {
        this.g = f;
        this.h = f2;
    }
}
