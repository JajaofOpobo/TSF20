package com.tsf.shell.f.f.a.b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerSmoothTransition extends DrawerTransitionBase {
    private static int a;

    public DrawerSmoothTransition(int i, boolean z) {
        super(i, DrawerCylinderTransition.d.drawer_transition_effect_smooth, z);
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        a = i;
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar, float f) {
        aVar.position().x = a * f;
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar) {
        aVar.position().x = 0.0f;
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void b(com.tsf.shell.f.f.a.PageContainerBase aVar) {
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
    public void a(com.censivn.C3DEngine.b.f.j jVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void g(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a.b.DrawerTransitionBase
    public void h(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }
}
