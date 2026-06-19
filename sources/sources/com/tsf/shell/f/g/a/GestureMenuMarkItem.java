package com.tsf.shell.f.g.a;

import android.view.MotionEvent;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.b;
import com.tsf.shell.manager.p.ThemePreferenceProvider;
import com.tsf.shell.utils.HapticFeedbackManager;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class GestureMenuMarkItem extends GestureMenuBlankItem {
    public b a;
    private com.censivn.C3DEngine.b.h.b.h b;
    private GestureMenuEffectItem.a c;
    private m d;

    public f(b bVar) {
        super(GestureMenuOverlay.i.text_mark);
        this.a = bVar;
        this.d = new m();
        this.d.c(GestureMenuOverlay.i.notic_mark_introduction);
        this.d.d(34);
        this.d.a(true);
        com.tsf.shell.manager.o.ThemeColorConstants.a(this.d, com.tsf.shell.manager.o.ThemeColorConstants.n);
        setMenuHeight(com.censivn.C3DEngine.b.b.A.a(430.0f));
        this.b = new com.censivn.C3DEngine.b.h.b.h(com.censivn.C3DEngine.b.b.A.D, this.a.getHeight(), com.censivn.C3DEngine.b.b.A.c * 20.0f, com.censivn.C3DEngine.b.b.A.c * 20.0f, com.tsf.shell.manager.o.ButtonPresetManager.c.T * 0.9f, com.tsf.shell.manager.o.ButtonPresetManager.c.U * com.censivn.C3DEngine.b.b.A.c * 0.9f);
        this.b.a(new com.censivn.C3DEngine.b.h.b.b() { // from class: com.tsf.shell.f.g.a.GestureMenuMarkItem.1
            @Override // com.censivn.C3DEngine.b.h.b.b
            public int a() {
                return com.tsf.shell.manager.app.v.StateAccessor.i();
            }

            @Override // com.censivn.C3DEngine.b.h.b.b
            public i a(int i, i iVar) {
                com.tsf.shell.f._d.b.a.DashItemD dVarA = com.tsf.shell.manager.app.v.StateAccessor.a(i);
                com.tsf.shell.f._d.b.a.DashItemContainer bVarE = dVarA.e();
                bVarE.removeFromParent();
                if (dVarA.i()) {
                    bVarE.g();
                } else {
                    bVarE.h();
                }
                if (dVarA.n()) {
                    bVarE.c();
                } else {
                    bVarE.d();
                }
                return bVarE;
            }
        });
        this.d.position().y = com.censivn.C3DEngine.b.b.A.a(300.0f);
        this.b.a().addChild(this.d);
        this.b.a(new com.censivn.C3DEngine.b.h.b.f() { // from class: com.tsf.shell.f.g.a.GestureMenuMarkItem.2
            @Override // com.censivn.C3DEngine.b.h.b.f
            public void a(i iVar, int i, MotionEvent motionEvent) {
                com.tsf.shell.f._d.b.a.DashItemD dVarA = com.tsf.shell.manager.app.v.StateAccessor.a(i);
                w.b();
                com.tsf.shell.manager.app.v.StateAccessor.a((com.tsf.shell.f.f.TransitionRenderer) dVarA);
                f.this.b.d();
            }
        });
        this.c = com.tsf.shell.manager.app.AppListManager.a(this, com.tsf.shell.manager.p.ThemePreferenceProvider.h);
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public j getContentContainer() {
        return this.b;
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onLayout(float f, float f2, float f3, float f4) {
        this.b.a(f, f2, f3, f4);
        this.d.f((int) (com.censivn.C3DEngine.b.b.A.D - com.censivn.C3DEngine.b.b.A.a(150.0f)));
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onShow() {
        this.b.d();
        this.a.a();
    }

    @Override // com.tsf.shell.f.g.a.GestureMenuBlankItem
    public float b() {
        return com.censivn.C3DEngine.b.b.A.a(120.0f);
    }

    @Override // com.tsf.shell.f.g.a.GestureMenuBlankItem
    public void c() {
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onHide() {
        super.onHide();
        this.c.b();
        int i = com.tsf.shell.manager.app.v.StateAccessor.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.manager.app.v.StateAccessor.a(i2).l();
        }
    }

    @Override // com.tsf.shell.f.e._g.a.MenuItemBase
    public void onRecycle() {
        super.onRecycle();
        this.d.a();
        int i = com.tsf.shell.manager.app.v.StateAccessor.i();
        for (int i2 = 0; i2 < i; i2++) {
            com.tsf.shell.f._d.b.a.DashItemD dVarA = com.tsf.shell.manager.app.v.StateAccessor.a(i2);
            dVarA.h();
            dVarA.d();
            dVarA.a();
        }
        com.tsf.shell.manager.app.v.StateAccessor.j();
    }
}
