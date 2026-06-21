package com.tsf.shell.plugin.themepicker.utils;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class h {
    final /* synthetic */ g a;
    private final j b;
    private boolean c;

    private h(g gVar, j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    /* synthetic */ h(g gVar, j jVar, h hVar) {
        this(gVar, jVar);
    }

    public OutputStream a(int i) {
        i iVar;
        synchronized (this.a) {
            if (this.b.e != this) {
                throw new IllegalStateException();
            }
            iVar = new i(this, new FileOutputStream(this.b.b(i)), null);
        }
        return iVar;
    }

    public void a() {
        if (this.c) {
            this.a.a(this, false);
            this.a.c(this.b.b);
        } else {
            this.a.a(this, true);
        }
    }

    public void b() {
        this.a.a(this, false);
    }
}
