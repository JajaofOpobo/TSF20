package com.tsf.shell.f.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.b;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends i {
    private com.censivn.C3DEngine.b.h.e.b g;
    private com.censivn.C3DEngine.b.f.m h;
    private float i;

    public f(com.tsf.shell.f.f.a.h hVar, com.tsf.shell.f.f.a.f fVar) {
        super(hVar, fVar, b.d.drawer_hide, x.c(b.i.text_hide));
        float f = 0.8f * (com.tsf.shell.manager.o.b.c.U / com.tsf.shell.manager.o.b.a.U);
        this.i = com.tsf.shell.manager.o.b.a.U * f;
        this.g = new com.censivn.C3DEngine.b.h.e.b(com.censivn.C3DEngine.b.b.a.D, this.i, com.tsf.shell.manager.o.b.a.U * f, 30.0f * com.censivn.C3DEngine.b.b.a.c * f, 10.0f * com.censivn.C3DEngine.b.b.a.c * f, f) { // from class: com.tsf.shell.f.f.a.c.f.1
            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(int i) {
                if (i > 0) {
                    com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.f.a.c.f.1.1
                        @Override // com.censivn.C3DEngine.b.g.d
                        public void a() {
                            f.this.h.visible(false);
                            f.this.h.a();
                        }
                    };
                    dVar.h(com.censivn.C3DEngine.b.b.a.a(-150.0f));
                    dVar.a(0);
                    com.censivn.C3DEngine.b.g.c.a(f.this.h);
                    com.censivn.C3DEngine.b.g.c.a(f.this.h, 300, dVar);
                    return;
                }
                com.censivn.C3DEngine.b.g.d dVar2 = new com.censivn.C3DEngine.b.g.d();
                dVar2.h(0.0f);
                dVar2.a(255);
                com.censivn.C3DEngine.b.g.c.a(f.this.h);
                com.censivn.C3DEngine.b.g.c.a(f.this.h, 300, dVar2);
                f.this.h.visible(true);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void b(com.censivn.C3DEngine.b.f.i iVar) {
                com.tsf.shell.f.i.c cVar = iVar instanceof com.tsf.shell.f.i.c ? (com.tsf.shell.f.i.c) iVar : null;
                if (cVar != null && cVar.K() != null) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) cVar.K();
                    launcherShortcutAppInfo.isHide = false;
                    com.tsf.shell.manager.a.w.c().a(launcherShortcutAppInfo, 64);
                }
            }
        };
        addChild(this.g);
        this.h = new com.censivn.C3DEngine.b.f.m();
        this.h.c(b.i.notic_hide_app);
        this.h.d(38);
        this.h.e(-1);
        com.tsf.shell.manager.o.c.a(this.h, com.tsf.shell.manager.o.c.h);
        addChild(this.h);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.i) / 2.0f, i3, this.i / 2.0f);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void b() {
        this.h.a();
    }

    public void a(ArrayList<com.tsf.shell.f.i.b> arrayList) {
        Iterator<com.tsf.shell.f.i.b> it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.d(it.next());
        }
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void c(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.b.b().c(cVar, motionEvent);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void d(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        this.b.b().d(cVar, motionEvent);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void a(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.b.b().a(cVar, motionEvent, motionEvent2);
    }

    @Override // com.tsf.shell.f.f.a.c.i
    public void e(com.tsf.shell.f.i.c cVar, MotionEvent motionEvent) {
        if ((cVar.parent() instanceof com.tsf.shell.f.f.a.a) && (cVar instanceof com.tsf.shell.f.i.b.e.b)) {
            this.a.c((com.tsf.shell.f.i.b) cVar);
            this.g.d(cVar);
            if (cVar.K() != null) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) cVar.K();
                launcherShortcutAppInfo.isHide = true;
                com.tsf.shell.manager.a.w.c().a(launcherShortcutAppInfo, 68);
                return;
            }
            return;
        }
        if (cVar.parent() == this.g.l()) {
            cVar.visible(true);
            cVar.scale().setAll(1.0f, 1.0f, 1.0f);
            Number3d.TEMPNUMBER3D.reset();
            Number3d number3dLocalToGlobal = cVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.g.removeChild(cVar);
            com.tsf.shell.f.f.a.a aVarAp = this.a.ap();
            cVar.position().setAllFrom(aVarAp.globalToLocal(number3dLocalToGlobal));
            aVarAp.addChildAt(cVar, 0);
            this.a.a(cVar, aVarAp, 0);
            this.a.ao().c();
        }
    }
}
