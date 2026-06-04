package com.tsf.shell.workspace3D.h.a.a;

import com.censivn.C3DEngine.b.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k implements l {
    private com.tsf.shell.workspace3D.h.a.e a;

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(int i, int i2, int i3, ArrayList arrayList) {
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(float f) {
        this.a.N().setAll((f * 1.0f) + 1.0f, (f * 1.0f) + 1.0f, 0.0f);
        this.a.b(255 - ((int) (Math.abs(f) * 255.0f)));
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void a(com.tsf.shell.workspace3D.h.a.e eVar) {
        this.a = eVar;
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final l a() {
        return new k();
    }

    @Override // com.tsf.shell.workspace3D.h.a.a.l
    public final void b() {
        this.a.N().setAll(1.0f, 1.0f, 1.0f);
        this.a = null;
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
