package com.tsf.shell.f.f.a._b;

import com.censivn.C3DEngine.api.element.Number3d;
import com.tsf.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerRotationZTransitionV2 extends DrawerTransitionBaseV2 {
    private static int a = 0;
    private static int b = 0;

    public DrawerRotationZTransitionV2(int i, boolean z) {
        super(i, DrawerCylinderTransitionV2.d.drawer_transition_effect_rotation_z, z);
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5 = (i2 + i) / 2;
        a = i5;
        b = i5;
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar, float f) {
        aVar.rotation().z = 90.0f * f;
        aVar.position().x = b * f;
        aVar.position().y = a * Math.abs(DrawerRotationYTransitionV2);
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void a(com.tsf.shell.f.f.a.PageContainerBase aVar) {
        aVar.rotation().z = 0.0f;
        aVar.position().x = 0.0f;
        aVar.position().y = 0.0f;
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void c(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void d(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void e(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void f(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void a(com.censivn.C3DEngine.b.f.j jVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void g(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void h(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }

    @Override // com.tsf.shell.f.f.a._b.DrawerTransitionBaseV2
    public void b(com.tsf.shell.f.f.a.PageContainerBase aVar) {
    }
}
