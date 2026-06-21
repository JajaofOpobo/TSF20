package com.censivn.C3DEngine.b.f;

import java.util.Collections;

/* loaded from: classes.dex */
public class a extends l {
    private static b a;
    private boolean b = false;

    public a() {
        if (a == null) {
            a = new b(this);
        }
    }

    @Override // com.censivn.C3DEngine.b.f.l, com.censivn.C3DEngine.b.f.j
    public void dispatchDraw() {
        if (this.b) {
            a();
        }
        super.dispatchDraw();
    }

    public void a() {
        Collections.sort(children(), a);
    }
}
