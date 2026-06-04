package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements l {
    private static int a = 0;
    private static int b = 0;
    private com.tsf.shell.workspace3D.h.a.e c;

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(int i, int i2, int i3, ArrayList arrayList) {
        int i4 = (i2 + i) / 2;
        a = i4;
        b = i4;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(com.tsf.shell.workspace3D.h.a.e eVar) {
        this.c = eVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(float f) {
        this.c.M().z = 90.0f * f;
        this.c.L().x = b * f;
        this.c.L().y = a * Math.abs(f);
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final l a() {
        return new h();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void b() {
        this.c.M().z = 0.0f;
        this.c.L().x = 0.0f;
        this.c.L().y = 0.0f;
        this.c = null;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void c() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void d() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void e() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(v vVar) {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void f() {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void g() {
    }
}
