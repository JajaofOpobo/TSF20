package com.tsf.shell.f.f.a._d._a;

import com.censivn.C3DEngine.b.f.IRenderable;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.Comparator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSortBaseV2 extends com.tsf.shell.f.f.TransitionRenderer {
    protected int a;
    protected Comparator<com.tsf.shell.f.i.PageItem> b;
    protected Comparator<IRenderable> c;
    protected String d;

    public DrawerSortBaseV2(int i, int i2) {
        super(i2, i, false);
        this.d = x.c(i2);
    }

    public Comparator<? super com.tsf.shell.f.i.PageItem> a() {
        return this.b;
    }

    public Comparator<? super i> b() {
        return this.c;
    }

    @Override // com.tsf.shell.f.f.TransitionRenderer
    public int k() {
        return this.a;
    }

    public String c() {
        return this.d;
    }
}
