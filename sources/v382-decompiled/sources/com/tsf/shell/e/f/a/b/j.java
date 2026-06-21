package com.tsf.shell.e.f.a.b;

import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class j extends l {
    public j(int i, boolean z) {
        super(i, R.drawable.drawer_transition_effect_scale, z);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar, float f) {
        aVar.scale().setAll((f * 1.0f) + 1.0f, (f * 1.0f) + 1.0f, 1.0f);
        aVar.alpha(255 - ((int) (Math.abs(f) * 255.0f)));
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.tsf.shell.e.f.a.a aVar) {
        aVar.scale().setAll(1.0f, 1.0f, 1.0f);
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(int i, int i2, int i3, int i4, ArrayList arrayList) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void c(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void d(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void e(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void f(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void a(com.censivn.C3DEngine.b.f.l lVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void g(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void h(com.tsf.shell.e.f.a.a aVar) {
    }

    @Override // com.tsf.shell.e.f.a.b.l
    public void b(com.tsf.shell.e.f.a.a aVar) {
    }
}
