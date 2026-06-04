package com.tsf.shell.workspace3D;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q {
    private ArrayList a = new ArrayList();

    public final void a(com.tsf.shell.workspace3D.g.g gVar) {
        if (gVar != null && !this.a.contains(gVar)) {
            this.a.add(0, gVar);
        }
    }

    public final void b(com.tsf.shell.workspace3D.g.g gVar) {
        if (gVar != null && !this.a.contains(gVar)) {
            this.a.add(gVar);
        }
    }

    public final void c(com.tsf.shell.workspace3D.g.g gVar) {
        if (this.a.contains(gVar)) {
            this.a.remove(gVar);
        }
    }

    public final ArrayList a() {
        return this.a;
    }
}
