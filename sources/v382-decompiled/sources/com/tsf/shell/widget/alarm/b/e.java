package com.tsf.shell.widget.alarm.b;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VTextureManager;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.widget.alarm.u;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    protected Context i;
    protected VTextureManager j;
    protected TextureElement k;
    protected float l;
    protected float m;
    protected List n = new ArrayList();

    protected abstract void a();

    protected abstract float c();

    protected abstract float d();

    public e(Context context, VTextureManager vTextureManager) {
        this.i = context;
        this.j = vTextureManager;
        f_();
        e();
        a();
    }

    protected void f_() {
    }

    private void e() {
        this.l = c();
        this.m = d();
    }

    public TextureElement g() {
        return this.k;
    }

    public void h() {
        if (this.k != null) {
            this.n.add(this.k);
        }
    }

    public void i() {
        int i = 0;
        while (!this.n.isEmpty()) {
            this.j.deleteTexture((TextureElement) this.n.remove(0));
            i++;
        }
        u.c("=========TextureItem Recycler : " + i + "=============");
    }
}
