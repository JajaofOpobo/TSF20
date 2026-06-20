package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerScaleTransition extends DrawerTransitionBase {
    public DrawerScaleTransition(int i, boolean z) {
        super(i, DrawerCylinderTransition.d.drawer_transition_effect_scale, z);
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar, float f) {
        aVar.scale().setAll((f * 1.0f) + 1.0f, (f * 1.0f) + 1.0f, 1.0f);
        aVar.alpha(255 - ((int) (Math.abs(DrawerRotationYTransition) * 255.0f)));
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar) {
        aVar.scale().setAll(1.0f, 1.0f, 1.0f);
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void c(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void d(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void e(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void f(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(com.censivn.C3DEngine.b.f.BaseRenderable jVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void g(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void h(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void b(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }
}
