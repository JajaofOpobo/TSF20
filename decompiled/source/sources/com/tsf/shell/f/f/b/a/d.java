package com.tsf.shell.f.f.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.f.d.e.a;
import com.tsf.shell.f.f.a.h;
import com.tsf.shell.f.f.g;
import com.tsf.shell.f.f.i;
import com.tsf.shell.f.f.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends i implements a.InterfaceC0090a {
    private com.tsf.shell.f.d.e.a b;

    public d(int i, boolean z) {
        super(i, 0, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(int i) {
        return (float) (i - ((i * 2) * Math.random()));
    }

    @Override // com.tsf.shell.f.f.l
    public void a(g gVar, float f) {
    }

    @Override // com.tsf.shell.f.f.l
    public boolean a(g gVar, com.censivn.C3DEngine.b.f.b.a aVar) {
        return false;
    }

    @Override // com.tsf.shell.f.f.l
    public void a(g gVar, boolean z) {
        if (gVar.t() == -1) {
            final h hVar = (h) gVar;
            hVar.aB();
            if (z) {
                hVar.c((Runnable) null, false);
                b(hVar.ap().children(), false, null);
            }
            hVar.b((Runnable) null, z);
            a(hVar.ap().children(), z, new Runnable() { // from class: com.tsf.shell.f.f.b.a.d.1
                @Override // java.lang.Runnable
                public void run() {
                    hVar.aO();
                }
            });
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(g gVar, boolean z) {
        if (gVar.t() == -1) {
            h hVar = (h) gVar;
            hVar.c((Runnable) null, true);
            b(hVar.ap().children(), z, null);
        }
    }

    @Override // com.tsf.shell.f.f.l
    public void b(g gVar, float f) {
        if (gVar.t() == -1) {
            gVar.dispatchDraw();
            return;
        }
        j.a j = gVar.j();
        this.a.alpha((1.0f - Math.abs(f)) * 255.0f);
        this.a.position().y = com.censivn.C3DEngine.b.b.a.a(400.0f) * f;
        this.a.textures().clear();
        this.a.textures().addElement(j.b);
        this.a.dispatchDraw();
    }

    public static void a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, boolean z2, Runnable runnable) {
        com.censivn.C3DEngine.b.f.i iVar = arrayList.size() > 0 ? arrayList.get((int) (Math.random() * arrayList.size())) : null;
        com.censivn.C3DEngine.b.g.d dVar = null;
        for (int i = 0; i < arrayList.size(); i++) {
            com.censivn.C3DEngine.b.f.i iVar2 = arrayList.get(i);
            com.censivn.C3DEngine.b.g.c.a(iVar2);
            if (iVar2 instanceof com.tsf.shell.f.i.b) {
                Number3d number3d = h.E.get(i);
                if (z) {
                    com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                    if (z2) {
                        if (iVar2 == iVar) {
                            dVar2.b(350);
                            dVar = dVar2;
                        } else {
                            dVar2.b((int) (Math.random() * 300.0d));
                        }
                    }
                    dVar2.f(number3d.x);
                    dVar2.h(number3d.y);
                    dVar2.e(0.0f);
                    dVar2.l(1.0f);
                    dVar2.m(1.0f);
                    dVar2.c(0.0f);
                    dVar2.d(0.0f);
                    dVar2.a(255);
                    dVar2.a(com.censivn.C3DEngine.b.g.a.a);
                    com.censivn.C3DEngine.b.g.c.a(iVar2, 450, dVar2);
                    if (com.tsf.shell.manager.a.v.d.b().b()) {
                        dVar2 = dVar;
                    }
                    dVar = dVar2;
                } else {
                    iVar2.position().x = number3d.x;
                    iVar2.position().y = number3d.y;
                    iVar2.rotation().x = 0.0f;
                    iVar2.rotation().y = 0.0f;
                    iVar2.rotation().z = 0.0f;
                    iVar2.scale().x = 1.0f;
                    iVar2.scale().y = 1.0f;
                    iVar2.alpha(255.0f);
                }
            }
        }
        if (dVar != null) {
            dVar.a(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public void a(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, Runnable runnable) {
    }

    public void b(ArrayList<com.censivn.C3DEngine.b.f.i> arrayList, boolean z, Runnable runnable) {
    }

    public com.censivn.C3DEngine.b.f.i o() {
        if (this.b == null) {
            this.b = new com.tsf.shell.f.d.e.a(this) { // from class: com.tsf.shell.f.f.b.a.d.2
                @Override // com.tsf.shell.f.g.a.h, com.censivn.C3DEngine.b.f.j
                public void onDrawChildEnd() {
                    super.onDrawChildEnd();
                    com.tsf.shell.manager.i.a.a(d.this, com.censivn.C3DEngine.b.b.a.a(20.0f));
                }
            };
        }
        return this.b;
    }

    public boolean p() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[SYNTHETIC] */
    @Override // com.tsf.shell.f.d.e.a.InterfaceC0090a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.censivn.C3DEngine.b.f.a.a r13, java.lang.Runnable r14) {
        /*
            r12 = this;
            r11 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r2 = 0
            double r0 = java.lang.Math.random()
            int r3 = r13.a()
            double r4 = (double) r3
            double r0 = r0 * r4
            int r0 = (int) r0
            com.censivn.C3DEngine.b.f.a.b r4 = r13.a(r0)
            r0 = 0
            r3 = r0
            r0 = r2
        L16:
            int r1 = r13.a()
            if (r3 >= r1) goto L7c
            com.censivn.C3DEngine.b.f.a.b r5 = r13.a(r3)
            com.censivn.C3DEngine.b.g.d r2 = new com.censivn.C3DEngine.b.g.d
            r2.<init>()
            boolean r1 = r12.p()
            if (r1 == 0) goto L7a
            if (r5 != r4) goto L6c
            r0 = 300(0x12c, float:4.2E-43)
            r2.b(r0)
            r1 = r2
        L33:
            java.util.ArrayList<com.censivn.C3DEngine.api.element.Number3d> r0 = com.tsf.shell.f.d.e.a.a
            java.lang.Object r0 = r0.get(r3)
            com.censivn.C3DEngine.api.element.Number3d r0 = (com.censivn.C3DEngine.api.element.Number3d) r0
            float r6 = r0.x
            r2.f(r6)
            float r0 = r0.y
            r2.h(r0)
            r2.l(r11)
            r2.m(r11)
            r2.d(r10)
            r2.e(r10)
            r2.c(r10)
            com.censivn.C3DEngine.b.g.b r0 = com.censivn.C3DEngine.b.g.a.a
            r2.a(r0)
            com.censivn.C3DEngine.b.g.c.a(r5)
            r0 = 500(0x1f4, float:7.0E-43)
            com.censivn.C3DEngine.b.g.c.a(r5, r0, r2)
            boolean r0 = r12.p()
            if (r0 != 0) goto L8b
        L67:
            int r0 = r3 + 1
            r3 = r0
            r0 = r2
            goto L16
        L6c:
            double r6 = java.lang.Math.random()
            r8 = 4643985272004935680(0x4072c00000000000, double:300.0)
            double r6 = r6 * r8
            int r1 = (int) r6
            r2.b(r1)
        L7a:
            r1 = r0
            goto L33
        L7c:
            if (r0 == 0) goto L85
            r0.a(r14)
            r0.b(r14)
        L84:
            return
        L85:
            if (r14 == 0) goto L84
            r14.run()
            goto L84
        L8b:
            r2 = r1
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.f.f.b.a.d.b(com.censivn.C3DEngine.b.f.a.a, java.lang.Runnable):void");
    }

    public void a(com.censivn.C3DEngine.b.f.a.a aVar, Runnable runnable) {
    }
}
