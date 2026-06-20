package com.tsf.shell.preference.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.k;
import com.tsf.b;
import com.tsf.shell.f.e.SelectionFrame;
import com.tsf.shell.f.f.PageTouchHandler;
import com.tsf.shell.f.i.b.e.DrawerItemButton;
import com.tsf.shell.utils.GraphicsEngineBridge;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PreferenceThemeProvider extends com.censivn.C3DEngine.b.e.f {
    private i a;
    private com.censivn.C3DEngine.b.f.b.a b;
    private k f;
    private k h;
    private float j;
    private ArrayList<com.tsf.shell.f.i.b.e.DrawerShortcutItemBase> l;
    private TextureElement d = new TextureElement(0, false);
    private TextureElement e = new TextureElement(0, false);
    private TextureElement g = new TextureElement(0, false);
    private float i = 0.4f;
    private com.tsf.shell.manager.o.ButtonMetrics k = new com.tsf.shell.manager.o.ButtonMetrics(1.15f, 1.15f);

    public PreferenceThemeProvider() {
        a(1);
        a(true);
        com.censivn.C3DEngine.b.b.b layoutParams = getLayoutParams();
        layoutParams.a = com.censivn.C3DEngine.b.b.A.a(30.0f);
        layoutParams.b = com.censivn.C3DEngine.b.b.A.a(30.0f);
        this.b = new com.censivn.C3DEngine.b.f.b.a(n.a, n.b, com.censivn.C3DEngine.b.b.A.c, new com.censivn.C3DEngine.b.f.b.b(68, 68, 68, 68, 136, 136));
        this.b.textures().addElement(this.d);
        this.b.alpha(80.0f);
        addChild(this.b);
        this.a = new PreferenceItemInterface();
        addChild(this.a);
        this.f = new k(289.0f, 336.0f, false);
        this.f.textures().addElement(this.e);
        this.a.addChild(this.f);
        this.h = new k(392.0f, 95.0f, false);
        this.h.textures().addElement(this.g);
        this.a.addChild(this.h);
        this.l = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            h hVar = new h(this.k);
            hVar.aL();
            this.l.add(hVar);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        this.j = com.censivn.C3DEngine.b.b.A.d;
        PreferenceThemeProvider();
    }

    private void e() {
        float f = this.j / 3.0f;
        this.b.a((com.censivn.C3DEngine.b.b.A.D * this.i) + (40.0f * f));
        this.b.b((com.censivn.C3DEngine.b.b.A.E * this.i) + (40.0f * f));
        this.a.a(this.b.b() - (40.0f * f), this.b.c() - (40.0f * f));
        com.censivn.C3DEngine.b.b.b layoutParams = getLayoutParams();
        layoutParams.i = -this.b.c();
        layoutParams.k = 0.0f;
        d((int) this.b.c());
        PositionNumber3d positionNumber3dPosition = this.b.position();
        PositionNumber3d positionNumber3dPosition2 = this.a.position();
        float f2 = (-this.b.c()) / 2.0f;
        positionNumber3dPosition2.y = f2;
        positionNumber3dPosition.y = f2;
        if (parent() != null) {
            ((com.censivn.C3DEngine.b.b.c) parent()).d();
        }
        if (com.censivn.C3DEngine.b.b.A.O) {
            this.f.position().x = 0.0f;
            this.f.position().y = f * 180.0f;
        } else {
            this.f.position().x = ((-this.b.b()) * 0.5f) + (150.0f * f);
            this.f.position().y = f * 50.0f;
        }
        a(this.j);
    }

    public void a(float f) {
        this.j = f;
        float f2 = this.j / 3.0f;
        this.h.position().y = (((-com.censivn.C3DEngine.b.b.A.E) * this.i) / 2.0f) + ((this.h.c() * f2) / 2.0f) + (20.0f * this.i);
        Number3d number3dScale = this.h.scale();
        this.h.scale().y = f2;
        number3dScale.x = f2;
        if (com.censivn.C3DEngine.b.b.A.O) {
            Number3d number3dScale2 = this.f.scale();
            this.f.scale().y = f2;
            number3dScale2.x = f2;
        } else {
            Number3d number3dScale3 = this.f.scale();
            float f3 = f2 * 0.75f;
            this.f.scale().y = f3;
            number3dScale3.x = f3;
        }
    }

    private void h() {
        if (this.d.id == 0) {
            Bitmap bitmapA = x.a(PreferenceBaseFragment.d.preference_screen_frame, com.tsf.shell.manager.g.LayoutDimensionConstants.q, com.tsf.shell.manager.g.LayoutDimensionConstants.q);
            com.censivn.C3DEngine.C3DEngine.g().a(this.d, bitmapA);
            bitmapA.recycle();
        }
        if (this.e.id == 0) {
            Bitmap bitmapA2 = x.a(PreferenceBaseFragment.d.preference_screen_widget_clock);
            com.censivn.C3DEngine.C3DEngine.g().a(this.e, bitmapA2);
            bitmapA2.recycle();
        }
        if (this.g.id == 0) {
            Bitmap bitmapA3 = x.a(PreferenceBaseFragment.d.preference_screen_dock);
            com.censivn.C3DEngine.C3DEngine.g().a(this.g, bitmapA3);
            bitmapA3.recycle();
        }
    }

    private void m() {
        if (this.d.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.d);
        }
        if (this.e.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.e);
        }
        if (this.g.id != 0) {
            com.censivn.C3DEngine.C3DEngine.g().a(this.g);
        }
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        PreferenceThemeProvider();
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        PreferenceThemeProvider();
        super.c(i);
    }
}
