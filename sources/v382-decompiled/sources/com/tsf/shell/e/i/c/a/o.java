package com.tsf.shell.e.i.c.a;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;
import com.censivn.C3DEngine.api.core.VObject3dContainer;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class o extends VObject3dContainer implements n, q {
    protected Context i;
    protected VTextureManager j;
    protected ArrayList k = new ArrayList();
    protected boolean l = false;
    private boolean a = false;
    private long b = 0;

    public abstract void d();

    public o(VTextureManager vTextureManager, Context context) {
        this.i = context;
        this.j = vTextureManager;
    }

    @Override // com.censivn.C3DEngine.api.core.VObject3d
    public void onDrawStart() {
    }

    protected void a(int i, VObject3d... vObject3dArr) {
        a(this, i, vObject3dArr);
    }

    protected void a(n nVar, int i, VObject3d... vObject3dArr) {
        this.k.add(new p(this, nVar, i, vObject3dArr));
    }

    protected void c(boolean z) {
        if (z) {
            Iterator it = ((ArrayList) this.k.clone()).iterator();
            while (it.hasNext()) {
                ((p) it.next()).f();
            }
            this.k.clear();
            return;
        }
        Iterator it2 = this.k.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).b((Object[]) new Void[0]);
        }
    }

    public void a(p pVar) {
        j.a("onTaskFinish:" + pVar);
        this.k.remove(pVar);
        if (this.k.size() == 0) {
            f();
            g();
        }
    }

    public void f() {
    }

    public void g() {
        j.a("-----------Finish Tasks Mission");
    }

    public void a(int i, TextureElement textureElement) {
    }

    public void a() {
        j.a("animationComplete");
        if (this.a) {
            d();
        }
    }
}
