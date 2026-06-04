package com.tsf.shell.workspace3D.k.b;

import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.shell.theme.inside.ThemeShellDescription;
import com.tsf.shell.workspace3D.bf;

/* loaded from: classes.dex */
final class an extends com.censivn.C3DEngine.b.l {
    public boolean a;
    final /* synthetic */ ai c;
    private am d;
    private com.tsf.shell.workspace3D.g.b.i e;
    private com.tsf.shell.workspace3D.k.al f;
    private com.tsf.shell.workspace3D.k.al g;
    private float h;
    private float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(ai aiVar, com.censivn.C3DEngine.b.r rVar) {
        super(rVar);
        this.c = aiVar;
    }

    public final void a(am amVar) {
        this.d = amVar;
        this.e = amVar.i();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void c(MotionEvent motionEvent) {
        com.tsf.shell.workspace3D.k.al alVar;
        super.c(motionEvent);
        if (com.tsf.shell.workspace3D.z.a() && (alVar = (com.tsf.shell.workspace3D.k.al) this.d.a(motionEvent)) != null && !(alVar instanceof com.tsf.shell.setting.e)) {
            com.tsf.shell.g.h.a();
            this.f = alVar;
            this.g = new com.tsf.shell.workspace3D.k.al();
            this.a = true;
            this.g.O.z().c(this.f.O.z().a(0).textureElement);
            this.g.L().setAllFrom(this.f.c(new Number3d()));
            bf.m().a((com.tsf.shell.workspace3D.k.j) this.g, false);
            float f = this.g.L().x;
            float f2 = this.g.L().y;
            this.h = f;
            this.i = f2;
            com.censivn.C3DEngine.g.u uVar = new com.censivn.C3DEngine.g.u();
            uVar.j(1.2f);
            uVar.k(1.2f);
            uVar.l(1.2f);
            com.censivn.C3DEngine.g.s.a(this.g);
            com.censivn.C3DEngine.g.s.a(this.g, ThemeShellDescription.PAGE_PREVIEW_SELECT, uVar);
            this.d.a_(true);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void e(MotionEvent motionEvent) {
        com.tsf.shell.action.c.a();
        this.e.a(motionEvent);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void f(MotionEvent motionEvent) {
        this.e.n();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void g(MotionEvent motionEvent) {
        this.e.m();
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        com.tsf.shell.workspace3D.k.al alVar = (com.tsf.shell.workspace3D.k.al) this.d.a(motionEvent);
        if (alVar != null) {
            if (alVar instanceof com.tsf.shell.setting.e) {
                com.tsf.shell.setting.e eVar = (com.tsf.shell.setting.e) alVar;
                if (eVar.aw() != null) {
                    eVar.aw().a(motionEvent);
                    return;
                }
                return;
            }
            this.d.a(alVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void d(MotionEvent motionEvent) {
        super.d(motionEvent);
        if (this.a) {
            this.d.a_(false);
            this.a = false;
            am amVar = this.d;
            com.tsf.shell.workspace3D.k.al alVar = this.f;
            amVar.a(motionEvent.getX(), motionEvent.getY());
            bf.m().d();
            ao aoVar = new ao(this);
            aoVar.j(1.0f);
            aoVar.k(1.0f);
            aoVar.l(1.0f);
            aoVar.a(0);
            com.censivn.C3DEngine.g.s.a(this.g);
            com.censivn.C3DEngine.g.s.a(this.g, 300, aoVar);
            bf.m().a(this.g);
            this.d.a(this.f, this.g.L().x, this.g.L().y);
        }
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        super.a(motionEvent, motionEvent2);
        if (this.a) {
            this.g.L().x = (int) (this.h + (motionEvent2.getX() - motionEvent.getX()));
            this.g.L().y = (int) (this.i - (motionEvent2.getY() - motionEvent.getY()));
            am amVar = this.d;
            com.tsf.shell.workspace3D.k.al alVar = this.g;
            amVar.a(motionEvent2.getX(), motionEvent2.getY());
            return;
        }
        this.e.a(motionEvent, motionEvent2);
    }

    @Override // com.censivn.C3DEngine.b.l
    public final void b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.e.g(f2);
    }
}
