package com.tsf.shell.manager.r.b;

import com.censivn.C3DEngine.b.f.l;

/* loaded from: classes.dex */
class k extends l {
    final /* synthetic */ j a;
    private com.tsf.shell.e.i.b.e.l b;

    public k(j jVar) {
        this.a = jVar;
    }

    public void a(com.tsf.shell.e.i.b.e.l lVar) {
        this.b = lVar;
    }

    @Override // com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        if (this.b != null) {
            this.b.dispatchDraw();
        }
    }
}
