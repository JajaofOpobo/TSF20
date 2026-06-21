package com.tsf.shell.manager.r.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutStandardInfo;

/* loaded from: classes.dex */
class i extends g {
    protected com.tsf.shell.e.i.b.e.b b;
    public int c;
    final /* synthetic */ f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(f fVar) {
        super(fVar);
        this.d = fVar;
        this.c = -1;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public com.tsf.shell.e.i.b.e.b a(com.censivn.C3DEngine.b.f.j jVar) {
        if (this.b == null) {
            this.b = com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.c);
        }
        if (((LauncherShortcutStandardInfo) this.b.K()).texture.id == 0) {
            this.b.aA();
        }
        return this.b;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void a(MotionEvent motionEvent, g gVar, com.censivn.C3DEngine.b.f.j jVar) {
        jVar.getMouseEventListener().c(motionEvent);
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void a(g gVar) {
        com.tsf.shell.e.i.b.e.b a = com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.a);
        a.position().y = this.d.b.getScreenFreeSpaceCenter();
        com.tsf.shell.manager.a.h.n().a(a);
        a.ah();
        a.K().onUpdatePhoto(null, null);
        a.ad();
    }

    @Override // com.tsf.shell.manager.r.b.g
    public boolean b(MotionEvent motionEvent, g gVar, com.censivn.C3DEngine.b.f.j jVar) {
        ((com.tsf.shell.e.i.b.e.b) jVar).ah();
        ((com.tsf.shell.e.i.b.e.b) jVar).K().onUpdatePhoto(null, null);
        ((com.tsf.shell.e.i.b.e.b) jVar).getMouseEventListener().d(motionEvent);
        return true;
    }

    @Override // com.tsf.shell.manager.r.b.g
    public com.censivn.C3DEngine.b.f.j a() {
        return com.tsf.shell.manager.l.a.a(this.c, com.tsf.shell.manager.o.b.a);
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void b() {
        com.tsf.shell.e.i.b.e.b a = com.tsf.shell.manager.l.a.a(this.c, this.d.b.b().b());
        a.K().onUpdatePhoto(null, null);
        this.d.b.b().a(a);
    }

    @Override // com.tsf.shell.manager.r.b.g
    public void c() {
        if (this.b != null && this.b.K() != null) {
            com.censivn.C3DEngine.a.g().a(((LauncherShortcutStandardInfo) this.b.K()).texture);
            this.b.aD();
        }
    }
}
