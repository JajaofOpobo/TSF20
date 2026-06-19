package com.tsf.shell.f.f.a._b;

import com.censivn.C3DEngine.api.element.Number3d;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DrawerTransitionManagerV2 extends com.tsf.shell.f.f.TransitionManager<k> {
    public DrawerTransitionManagerV2() {
        ArrayList<com.tsf.shell.f.f.TransitionRenderer> arrayList = new ArrayList<>();
        arrayList.add(new DrawerSmoothTransitionV2(10, false));
        arrayList.add(new DrawerCylinderTransitionV2(20, false));
        arrayList.add(new DrawerSphereTransitionV2(30, false));
        arrayList.add(new DrawerExtrusionTransitionV2(40, true));
        arrayList.add(new DrawerRandomTransitionV2(50, true));
        arrayList.add(new DrawerBottleTransitionV2(60, true));
        arrayList.add(new DrawerRotationYTransitionV2(70, true));
        arrayList.add(new DrawerTriangularTransitionV2(80, true));
        arrayList.add(new DrawerScaleTransitionV2(90, true));
        arrayList.add(new DrawerRotationZTransitionV2(100, true));
        a(arrayList);
    }

    public void a(int i, int i2, int i3, int i4, ArrayList<Number3d> arrayList) {
        int i5 = i();
        for (int i6 = 0; i6 < i5; i6++) {
            a(i6).a(i, i2, i3, i4, arrayList);
        }
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void f() {
        super.f();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(k kVar) {
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public void a(boolean z, String str) {
        com.tsf.shell.manager.b.ConfigManager.j(z);
        com.tsf.shell.manager.b.ConfigManager.h(str);
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public boolean b() {
        return com.tsf.shell.manager.b.ConfigManager.G();
    }

    @Override // com.tsf.shell.f.f.TransitionManager
    public String c() {
        return com.tsf.shell.manager.b.ConfigManager.H();
    }
}
