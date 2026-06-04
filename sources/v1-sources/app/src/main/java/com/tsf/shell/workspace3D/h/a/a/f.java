package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements l {
    private static int a;
    private com.tsf.shell.workspace3D.h.a.e b;

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(int i, int i2, int i3, ArrayList arrayList) {
        a = i;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(com.tsf.shell.workspace3D.h.a.e eVar) {
        this.b = eVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(float f) {
        this.b.L().x = a * f;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final l a() {
        return new f();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void b() {
        this.b.L().x = 0.0f;
        this.b = null;
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
