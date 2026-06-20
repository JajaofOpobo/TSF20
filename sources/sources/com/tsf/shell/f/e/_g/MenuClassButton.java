package com.tsf.shell.f.e._g;

import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MenuClassButton extends j {
    private MenuOverlay a;
    private com.censivn.C3DEngine.b.b.A.b b;
    private float c;
    private float e;
    private com.censivn.C3DEngine.b.b.A.d f;
    private float d = com.censivn.C3DEngine.b.b.A.a(20.0f);
    private boolean g = false;

    public MenuClassButton(MenuOverlay menuOverlay, float f) {
        this.a = dVar;
        this.c = f;
    }

    public void a(ArrayList<com.tsf.shell.f.e._g.a.MenuActionItem> arrayList) {
        this.f = new com.censivn.C3DEngine.b.b.A.d();
        this.b = new com.censivn.C3DEngine.b.b.A.b();
        this.f.c(this.b);
        addChild(this.f);
        Iterator<com.tsf.shell.f.e._g.a.MenuActionItem> it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.addChild(it.next().getTitleIcon());
        }
    }

    public void a() {
        this.b.numChildren();
        float fMaxX = this.b.maxX();
        this.e = fMaxX;
        if (fMaxX < com.censivn.C3DEngine.b.b.A.D) {
        }
    }

    public void b() {
        this.f.setAABBPX(0.0f, (-MenuOverlay.MENU_HEIGHT) / 2.0f, 0.0f, com.censivn.C3DEngine.b.b.A.D, MenuOverlay.MENU_HEIGHT / 2.0f, 0.0f);
        this.f.k();
        this.f.position().x = com.censivn.C3DEngine.b.b.A.z;
        this.f.a(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.e < com.censivn.C3DEngine.b.b.A.D) {
            this.g = false;
        } else {
            this.g = true;
            a((com.tsf.shell.f.e._g.a.MenuActionItem) this.a.getCurrentMenuItem(), false);
        }
    }

    public void a(com.tsf.shell.f.e._g.a.MenuActionItem bVar) {
        int iNumChildren = this.b.numChildren();
        for (int i = 0; i < iNumChildren; i++) {
            if (((MenuExpandItem) this.b.getChildAt(i)) == bVar.getTitleIcon()) {
                a(bVar, true);
                return;
            }
        }
    }

    private void a(com.tsf.shell.f.e._g.a.MenuActionItem bVar, boolean z) {
        if (this.g) {
            float f = (-bVar.getTitleIcon().position().x) + (com.censivn.C3DEngine.b.b.A.D / 2.0f);
            float f2 = 0.0f;
            float f3 = -(this.e - com.censivn.C3DEngine.b.b.A.D);
            if (f <= 0.0f) {
                f2 = f < f3 ? f3 : f;
            }
            this.f.a(f2, z);
        }
    }
}
