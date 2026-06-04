package com.tsf.shell.workspace3D.k;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.element.info.LauncherItem3DInfo;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class v implements Runnable {
    final /* synthetic */ t a;
    private final /* synthetic */ Method b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ LauncherItem3DInfo e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ y h;
    private final /* synthetic */ s i;

    v(t tVar, Method method, Object obj, Context context, LauncherItem3DInfo launcherItem3DInfo, String str, boolean z, y yVar, s sVar) {
        this.a = tVar;
        this.b = method;
        this.c = obj;
        this.d = context;
        this.e = launcherItem3DInfo;
        this.f = str;
        this.g = z;
        this.h = yVar;
        this.i = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            j jVar = (j) ((VObject3d) this.b.invoke(this.c, this.d, Integer.valueOf(this.e.appWidgetId))).getVirtualTarget();
            if (this.f.equals("com.tsf.shell.widget.weather")) {
                jVar.m(true);
            }
            jVar.L().x = this.e.cellX;
            jVar.L().y = this.e.cellY;
            jVar.M().z = this.e.rotation;
            this.e.setTarget(jVar);
            jVar.a(this.e);
            jVar.br();
            if (!this.g) {
                jVar.i_();
                com.censivn.C3DEngine.a.a().d(new w(this, this.e));
            }
            if (this.h != null) {
                this.h.a(this.i);
            }
            this.a.a(t.a, new com.censivn.a.a(jVar, j.class), new com.censivn.a.a(this.i, s.class));
        } catch (Exception e) {
            e.printStackTrace();
            String str = "load widget error:" + e.getMessage();
            this.a.a(t.b);
        }
    }
}
