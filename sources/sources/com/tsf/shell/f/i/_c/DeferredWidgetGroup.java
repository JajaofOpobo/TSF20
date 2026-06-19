package com.tsf.shell.f.i._c;

import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.tsf.shell.f.i._c.a.ITextureCallback;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DeferredWidgetGroup extends WidgetGroupBase {
    private j k;
    private k l;
    private float m;
    private float n;
    private float o;
    private boolean p = true;
    private Runnable q = new Runnable() { // from class: com.tsf.shell.f.i._c.DeferredWidgetGroup.1
        @Override // java.lang.Runnable
        public void run() {
            b.this.r = null;
            if (b.this.l != null) {
                b.this.l.b();
            }
        }
    };
    private Runnable r;

    public DeferredWidgetGroup(float f, float f2, float f3) {
        this.m = 1.0f;
        this.m = f;
        this.n = f2;
        this.o = f3;
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase, com.tsf.shell.f.i._c.WidgetLabelProvider
    public void b() {
        if (!this.p) {
            this.p = true;
            if (this.l != null) {
                this.l.d();
            }
        }
        super.b();
    }

    private void c(boolean z) {
        if (this.p) {
            this.p = false;
            if (this.l != null) {
                this.l.a(z);
            }
        }
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase
    public void c() {
        if (this.r != null) {
            com.censivn.C3DEngine.A.a().g(this.r);
            this.r = null;
        }
        if (this.l != null) {
            this.l.c();
        }
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase
    public void d() {
        if (this.l != null && this.r == null) {
            this.r = this.q;
            com.censivn.C3DEngine.A.a().b(this.r, 500L);
        }
    }

    @Override // com.tsf.shell.f.i._c.WidgetGroupBase
    public i a(boolean z) {
        if (this.k == null) {
            this.k = d(z);
            this.p = false;
        } else {
            c(z);
        }
        return this.k;
    }

    private j d(boolean z) {
        j jVar = new j();
        this.l = g_();
        j jVar2 = (j) ((VObject3dContainer) this.l).getVirtualTarget();
        jVar2.scale().setAll(this.m, this.m, 1.0f);
        jVar2.position().setAll(this.n, this.o, 0.0f);
        jVar.addChild(jVar2);
        c(z);
        return jVar;
    }

    public k g_() {
        return null;
    }
}
