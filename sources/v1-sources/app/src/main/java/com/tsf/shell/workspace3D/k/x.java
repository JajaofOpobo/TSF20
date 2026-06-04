package com.tsf.shell.workspace3D.k;

import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import com.tsf.shell.bm;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class x implements Runnable {
    final /* synthetic */ t a;
    private final /* synthetic */ Method b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ LauncherItem3DInfo d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ y f;
    private final /* synthetic */ s g;

    x(t tVar, Method method, Object obj, LauncherItem3DInfo launcherItem3DInfo, boolean z, y yVar, s sVar) {
        this.a = tVar;
        this.b = method;
        this.c = obj;
        this.d = launcherItem3DInfo;
        this.e = z;
        this.f = yVar;
        this.g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            j jVar = (j) this.b.invoke(this.c, com.censivn.C3DEngine.a.c());
            jVar.L().x = this.d.cellX;
            jVar.L().y = this.d.cellY;
            jVar.M().z = this.d.rotation;
            this.d.setTarget(jVar);
            jVar.a(this.d);
            jVar.br();
            if (!this.e) {
                jVar.i_();
                bm.a(this.d);
            }
            if (this.f != null) {
                this.f.a(this.g);
            }
            this.a.a(t.a, new com.censivn.a.a(jVar, j.class), new com.censivn.a.a(this.g, s.class));
        } catch (Exception e) {
            e.printStackTrace();
            this.a.a(t.b);
        }
    }
}
