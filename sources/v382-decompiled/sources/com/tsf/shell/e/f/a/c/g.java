package com.tsf.shell.e.f.a.c;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends j {
    private com.censivn.C3DEngine.b.h.e.b g;
    private com.censivn.C3DEngine.b.f.o h;
    private float i;

    public g(com.tsf.shell.e.f.a.m mVar, com.tsf.shell.e.f.a.j jVar) {
        super(mVar, jVar, R.drawable.drawer_hide, x.c(R.string.text_hide));
        float f = 0.8f * (com.tsf.shell.manager.o.b.c.U / com.tsf.shell.manager.o.b.a.U);
        this.i = com.tsf.shell.manager.o.b.a.U * f;
        this.g = new com.censivn.C3DEngine.b.h.e.b(com.censivn.C3DEngine.b.b.a.D, this.i, com.tsf.shell.manager.o.b.a.U * f, 30.0f * com.censivn.C3DEngine.b.b.a.c * f, 10.0f * com.censivn.C3DEngine.b.b.a.c * f, f) { // from class: com.tsf.shell.e.f.a.c.g.1
            @Override // com.censivn.C3DEngine.b.h.e.b
            public void a(int i) {
                if (i > 0) {
                    com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.f.a.c.g.1.1
                        @Override // com.censivn.C3DEngine.b.g.x
                        public void a() {
                            g.this.h.visible(false);
                            g.this.h.a();
                        }
                    };
                    xVar.h(com.censivn.C3DEngine.b.b.a.a(-150.0f));
                    xVar.a(0);
                    w.a(g.this.h);
                    w.a(g.this.h, 300, xVar);
                    return;
                }
                com.censivn.C3DEngine.b.g.x xVar2 = new com.censivn.C3DEngine.b.g.x();
                xVar2.h(0.0f);
                xVar2.a(255);
                w.a(g.this.h);
                w.a(g.this.h, 300, xVar2);
                g.this.h.visible(true);
            }

            @Override // com.censivn.C3DEngine.b.h.e.b
            public void b(com.censivn.C3DEngine.b.f.j jVar2) {
                com.tsf.shell.e.i.e eVar = jVar2 instanceof com.tsf.shell.e.i.e ? (com.tsf.shell.e.i.e) jVar2 : null;
                if (eVar != null && eVar.K() != null) {
                    LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) eVar.K();
                    launcherShortcutAppInfo.isHide = false;
                    com.tsf.shell.manager.a.w.c().a(launcherShortcutAppInfo, 64);
                }
            }
        };
        addChild(this.g);
        this.h = new com.censivn.C3DEngine.b.f.o();
        this.h.c(R.string.notic_hide_app);
        this.h.d(38);
        this.h.e(-1);
        com.tsf.shell.manager.o.c.a(this.h, com.tsf.shell.manager.o.c.h);
        addChild(this.h);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(int i, int i2, int i3, int i4) {
        this.g.a(i, (-this.i) / 2.0f, i3, this.i / 2.0f);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void b() {
        this.h.a();
    }

    public void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.g.d((com.tsf.shell.e.i.c) it.next());
        }
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void c(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.b.b().c(eVar, motionEvent);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void d(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        this.b.b().d(eVar, motionEvent);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void a(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.b.b().a(eVar, motionEvent, motionEvent2);
    }

    @Override // com.tsf.shell.e.f.a.c.j
    public void e(com.tsf.shell.e.i.e eVar, MotionEvent motionEvent) {
        if ((eVar.parent() instanceof com.tsf.shell.e.f.a.a) && (eVar instanceof com.tsf.shell.e.i.b.e.b)) {
            this.a.c((com.tsf.shell.e.i.c) eVar);
            this.g.d(eVar);
            if (eVar.K() != null) {
                LauncherShortcutAppInfo launcherShortcutAppInfo = (LauncherShortcutAppInfo) eVar.K();
                launcherShortcutAppInfo.isHide = true;
                com.tsf.shell.manager.a.w.c().a(launcherShortcutAppInfo, 68);
                return;
            }
            return;
        }
        if (eVar.parent() == this.g.l()) {
            eVar.visible(true);
            eVar.scale().setAll(1.0f, 1.0f, 1.0f);
            Number3d.TEMPNUMBER3D.reset();
            Number3d localToGlobal = eVar.localToGlobal(Number3d.TEMPNUMBER3D);
            this.g.removeChild(eVar);
            com.tsf.shell.e.f.a.a ap = this.a.ap();
            eVar.position().setAllFrom(ap.globalToLocal(localToGlobal));
            ap.addChildAt(eVar, 0);
            this.a.a(eVar, ap, 0);
            this.a.ao().c();
        }
    }
}
