package com.tsf.shell.f.i.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;
import com.censivn.C3DEngine.b.f.i;
import com.tsf.b;
import com.tsf.shell.f.e.s;
import com.tsf.shell.f.f.n;
import com.tsf.shell.manager.action.f;
import com.tsf.shell.manager.d.a;
import com.tsf.shell.utils.w;
import com.tsf.shell.utils.x;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends com.censivn.C3DEngine.b.d.a {
    public static n a;
    public float b;
    public float d;
    boolean e;
    boolean f;
    private com.tsf.shell.f.i.b g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private com.censivn.C3DEngine.b.d.a p;
    private a.C0127a q;
    private float[] r;

    public c(com.tsf.shell.f.i.b bVar) {
        super(bVar);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.r = new float[]{0.0f, 0.0f};
        this.e = false;
        this.f = true;
        this.g = bVar;
        this.q = new a.C0127a();
    }

    private void d() {
        this.b = this.c.position().x;
        this.d = this.c.position().y;
    }

    public void a(float f, float f2) {
        this.b = f;
        this.d = f2;
    }

    private float l(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        if (motionEvent.getY(0) - motionEvent.getY(1) > 0.0f) {
            return ((float) (Math.atan(x / r1) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(x / r1) / 0.017453292519943295d);
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void c(MotionEvent motionEvent) {
        float f;
        float f2;
        LauncherShortcutStandardInfo launcherShortcutStandardInfo;
        super.c(motionEvent);
        com.tsf.shell.f.i.b bVar = (com.tsf.shell.f.i.b) this.c;
        if (com.tsf.shell.manager.a.A.a()) {
            if (bVar == null || !bVar.O()) {
                com.tsf.shell.manager.a.h.d.a(bVar);
                com.tsf.shell.manager.a.h.a(bVar);
                com.tsf.shell.f.e.g.d.onTempleteHide();
                if (com.tsf.shell.manager.a.h.F() != -1) {
                    com.tsf.shell.manager.a.h.a().b();
                }
                if (bVar.A() != null && (bVar instanceof com.tsf.shell.f.i.c)) {
                    com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) bVar;
                    if (cVar.A().e()) {
                        ArrayList<com.tsf.shell.f.i.c> arrayListI = cVar.A().i();
                        arrayListI.remove(bVar);
                        cVar.rotation().z = 0.0f;
                        if (arrayListI.size() > 0) {
                            cVar.ah();
                            cVar.b(arrayListI);
                        }
                    }
                    cVar.A().g();
                }
                com.tsf.shell.manager.a.j.a((i) bVar, true);
                f.a();
                this.n = false;
                this.o = false;
                com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d();
                dVar.l(bVar.d);
                dVar.m(bVar.d);
                com.censivn.C3DEngine.b.g.c.a(this.c);
                com.censivn.C3DEngine.b.g.c.a(this.c, 500, dVar);
                bVar.n_();
                com.tsf.shell.f.i.a aVarA = bVar.A();
                if (aVarA != null) {
                    aVarA.a(bVar);
                }
                bVar.B();
                if (motionEvent == null) {
                    this.n = true;
                } else {
                    w.a();
                }
                d();
                if (motionEvent != null) {
                    x.a(motionEvent, this.r);
                    f = this.r[0];
                    f2 = this.r[1];
                } else {
                    f = bVar.position().x;
                    f2 = bVar.position().y;
                }
                if (motionEvent != null && (this.c instanceof com.tsf.shell.f.e.f) && !this.g.D()) {
                    com.tsf.shell.f.e.f fVar = (com.tsf.shell.f.e.f) this.c;
                    if (fVar.o()) {
                        com.tsf.shell.f.e.f fVarA = fVar.a((int) f, (int) f2);
                        if (fVarA != null) {
                            fVar.f(fVarA);
                        } else {
                            fVar.p();
                        }
                    }
                }
                b(true);
                if (!bVar.D()) {
                    com.tsf.shell.manager.a.h.b().b();
                    com.tsf.shell.manager.a.n.a((i) bVar);
                    if (com.tsf.shell.manager.a.h.d.b()) {
                        com.tsf.shell.manager.a.p.a(bVar, f, f2, true, 0, 1);
                        return;
                    }
                    if (bVar == null || bVar.K() == null || bVar.K().title == null || !bVar.K().title.equals(x.c(b.i.panda))) {
                        ItemInfo itemInfoK = bVar.K();
                        if (!(itemInfoK instanceof LauncherShortcutStandardInfo) || (launcherShortcutStandardInfo = (LauncherShortcutStandardInfo) itemInfoK) == null || launcherShortcutStandardInfo.intent == null || launcherShortcutStandardInfo.intent.getIntExtra("action", -1) != 19) {
                            com.tsf.shell.manager.a.p.a(bVar, f, f2, true, 0, 2, 1);
                        }
                    }
                }
            }
        }
    }

    private void b(boolean z) {
        this.l = z;
    }

    public boolean a() {
        return this.l;
    }

    public void a(boolean z) {
        this.m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r2 = 1
            r3 = 0
            super.d(r7)
            com.censivn.C3DEngine.b.f.i r0 = r6.c
            com.tsf.shell.f.i.b r0 = (com.tsf.shell.f.i.b) r0
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.a.h
            com.tsf.shell.manager.f.a r1 = r1.a()
            r1.d()
            com.tsf.shell.manager.h.a r1 = com.tsf.shell.manager.a.A
            boolean r1 = r1.a()
            if (r1 == 0) goto L22
            if (r0 == 0) goto L26
            boolean r1 = r0.O()
            if (r1 == 0) goto L26
        L22:
            r0.P()
        L25:
            return
        L26:
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.a.h
            com.tsf.shell.f.f.c.a r1 = r1.d
            r1.b(r0)
            com.tsf.shell.f.e.g.d.onTempleteShow()
            boolean r1 = r6.m
            if (r1 == 0) goto L55
            r6.m = r3
            r6.b()
            com.tsf.shell.f.f.n r0 = com.tsf.shell.f.i.a.c.a
            r0.x()
        L3e:
            r6.b(r3)
            com.tsf.shell.f.e.e.c r0 = com.tsf.shell.manager.a.p
            r0.c()
            com.tsf.shell.f.f.n r0 = com.tsf.shell.manager.a.h
            com.tsf.shell.f.e.e.a r0 = r0.b()
            r0.c()
            com.tsf.shell.manager.m.b r0 = com.tsf.shell.manager.a.n
            r0.e()
            goto L25
        L55:
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.a.h
            r1.d()
            com.censivn.C3DEngine.b.f.i r1 = r6.c
            boolean r1 = r1 instanceof com.tsf.shell.f.e.f
            if (r1 == 0) goto Lc6
            com.tsf.shell.f.i.b r1 = r6.g
            boolean r1 = r1.D()
            if (r1 != 0) goto Lc6
            com.censivn.C3DEngine.b.f.i r1 = r6.c
            com.tsf.shell.f.e.f r1 = (com.tsf.shell.f.e.f) r1
            boolean r4 = r6.n
            if (r4 != 0) goto L76
            com.tsf.shell.f.e.f r4 = r1.n()
            if (r4 == 0) goto Lc6
        L76:
            boolean r4 = r1.o()
            if (r4 == 0) goto Lc6
            float[] r4 = com.tsf.shell.utils.x.a(r7)
            r5 = r4[r3]
            int r5 = (int) r5
            r4 = r4[r2]
            int r4 = (int) r4
            com.tsf.shell.f.e.f r4 = r1.a(r5, r4)
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto Lbc
            com.tsf.shell.manager.f.d r2 = com.tsf.shell.manager.a.j
            r2.b(r0)
            r1.g(r4)
            com.tsf.shell.f.i.b r1 = r6.g
            r1.m_()
            com.tsf.shell.f.i.b r1 = r6.g
            r1.c()
            r1 = r3
        La3:
            if (r1 == 0) goto L3e
            com.tsf.shell.manager.f.d r1 = com.tsf.shell.manager.a.j
            r1.b(r0)
            com.tsf.shell.f.f.n r1 = com.tsf.shell.manager.a.h
            com.tsf.shell.f.f.g r1 = r1.n()
            if (r1 == 0) goto Lb8
            r0.removeFromParent()
            r1.a(r0)
        Lb8:
            r6.b()
            goto L3e
        Lbc:
            com.tsf.shell.manager.f.d r4 = com.tsf.shell.manager.a.j
            r4.b(r0)
            r1.p()
            r1 = r2
            goto La3
        Lc6:
            r1 = r2
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.a.c.d(android.view.MotionEvent):void");
    }

    public void b() {
        if (com.tsf.shell.manager.a.h.d.b()) {
            a(com.tsf.shell.manager.a.h.d.a(), true);
        } else {
            c();
        }
    }

    public void c() {
        a((float[]) null, false);
    }

    public void a(float[] fArr, boolean z) {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i.a.c.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a() {
                c.this.g.c();
            }
        };
        if (fArr == null) {
            fArr = com.tsf.shell.manager.r.a.a(this.g, this.g.position().x, this.g.position().y);
        }
        if (fArr[0] != this.g.position().x || fArr[1] != this.g.position().y) {
            dVar.f(fArr[0]);
            dVar.h(fArr[1]);
            if (this.g.Y()) {
                s.a(fArr[0] - this.g.position().x, fArr[1] - this.g.position().y);
            }
        }
        if (z) {
            dVar.e(0.0f);
        }
        dVar.l(1.0f);
        dVar.m(1.0f);
        dVar.a(com.censivn.C3DEngine.b.g.a.a);
        com.censivn.C3DEngine.b.g.c.a(this.c);
        com.censivn.C3DEngine.b.g.c.a(this.g, 380, dVar);
        this.g.m_();
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.l) {
            if (this.g.D()) {
                com.tsf.shell.f.e.a.a((int) (this.b + (motionEvent2.getX() - motionEvent.getX())), (int) (this.d - (motionEvent2.getY() - motionEvent.getY())));
            } else if (this.n) {
                this.c.position().x = (int) (this.b + (motionEvent2.getX() - motionEvent.getX()));
                this.c.position().y = (int) (this.d - (motionEvent2.getY() - motionEvent.getY()));
                float[] fArrA = x.a(motionEvent2, this.r);
                com.tsf.shell.manager.a.p.a(fArrA[0], fArrA[1]);
            } else if (x.b(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY()) > 15.0f) {
                this.n = true;
                this.g.ab();
            }
            if (motionEvent2.getPointerCount() == 2) {
                if (this.g.M()) {
                    if (!this.o) {
                        this.o = true;
                        this.g.aa();
                        com.tsf.shell.manager.a.p.c();
                    }
                    this.g.rotation().z = this.k - (this.j - l(motionEvent2));
                    return;
                }
                return;
            }
            if (this.m) {
                a.a(motionEvent2.getX(), motionEvent2.getY(), this.h, this.i);
                return;
            } else {
                if (this.n && (this.c instanceof com.tsf.shell.f.e.f)) {
                    this.q.a((com.tsf.shell.f.e.f) this.c, motionEvent2);
                    return;
                }
                return;
            }
        }
        if (this.p != null && this.g.Q()) {
            this.p.a(motionEvent, motionEvent2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    @Override // com.censivn.C3DEngine.b.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 0
            r4 = 1
            r2 = 0
            super.e(r6)
            r5.e = r2
            float r0 = r6.getX()
            r5.h = r0
            float r0 = r6.getY()
            r5.i = r0
            com.tsf.shell.f.i.b r0 = r5.g
            boolean r0 = r0 instanceof com.tsf.shell.f.i.c
            if (r0 == 0) goto L5a
            com.tsf.shell.f.i.b r0 = r5.g
            com.tsf.shell.f.i.c r0 = (com.tsf.shell.f.i.c) r0
            com.tsf.shell.f.i.a r3 = r0.A()
            if (r3 == 0) goto L5a
            com.tsf.shell.f.i.a r0 = r0.A()
            boolean r0 = r0.e()
        L2c:
            if (r0 != 0) goto L58
            float[] r0 = com.tsf.shell.utils.x.a(r6)
            com.censivn.C3DEngine.b.f.i r3 = r5.c
            r2 = r0[r2]
            r0 = r0[r4]
            com.censivn.C3DEngine.b.f.i r0 = r3.getHittingTarget(r2, r0, r4)
        L3c:
            if (r0 == 0) goto L55
            com.censivn.C3DEngine.b.d.a r0 = r0.getMouseEventListener()
            r5.p = r0
            com.censivn.C3DEngine.b.d.a r0 = r5.p
            r0.e(r6)
        L49:
            com.tsf.shell.f.i.b r0 = r5.g
            boolean r0 = r0.R()
            if (r0 != 0) goto L54
            com.tsf.shell.manager.action.f.a(r6)
        L54:
            return
        L55:
            r5.p = r1
            goto L49
        L58:
            r0 = r1
            goto L3c
        L5a:
            r0 = r2
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.i.a.c.e(android.view.MotionEvent):void");
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void i(MotionEvent motionEvent) {
        if (!this.g.Q()) {
            com.tsf.shell.manager.a.h.s().b(motionEvent);
        }
        if (this.p != null) {
            this.p.i(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void j(MotionEvent motionEvent) {
        if (!this.g.Q()) {
            com.tsf.shell.manager.a.h.s().c(motionEvent);
        }
        this.j = l(motionEvent);
        this.k = this.c.rotation().z;
        if (this.p != null) {
            this.p.j(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent) {
        if (this.g instanceof com.tsf.shell.f.i.c) {
            com.tsf.shell.f.i.c cVar = (com.tsf.shell.f.i.c) this.g;
            if (cVar.A() != null && cVar.A().e()) {
                cVar.ap();
                return;
            }
        }
        if (this.g instanceof com.tsf.shell.f.i.b.e.b) {
            ((com.tsf.shell.f.i.b.e.b) this.g).l();
        }
        if (this.p != null) {
            this.p.a(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.b(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void g(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.g(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.g.c) {
            if (!this.g.Q()) {
                com.tsf.shell.manager.a.h.s().d(motionEvent, motionEvent2, f, f2);
                boolean zF = com.tsf.shell.manager.a.h.s().f();
                this.e = com.tsf.shell.manager.a.h.s().g();
                if (zF && !this.e && this.p != null) {
                    this.p.a(motionEvent, motionEvent2, f, f2);
                    return;
                }
                return;
            }
            if (this.p != null) {
                this.p.a(motionEvent, motionEvent2, f, f2);
            }
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void f(MotionEvent motionEvent) {
        if (this.p != null) {
            this.p.f(motionEvent);
        }
        if (!this.g.c && !this.g.Q()) {
            com.tsf.shell.manager.a.h.s().d(motionEvent);
        }
    }

    @Override // com.censivn.C3DEngine.b.d.a
    public void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.g.c && !this.g.Q()) {
            com.tsf.shell.manager.a.h.s().a(motionEvent, motionEvent2, f, f2);
        }
        if (this.p != null && !this.e) {
            this.p.b(motionEvent, motionEvent2, f, f2);
        }
    }
}
