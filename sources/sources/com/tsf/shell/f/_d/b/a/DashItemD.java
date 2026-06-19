package com.tsf.shell.f._d.b.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.b;
import com.tsf.shell.f.i.b.e.DrawerItemButton;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class DashItemD extends com.tsf.shell.f.f.TransitionRenderer {
    public static TextureElement b = new TextureElement(0, false);
    public b a;

    public DashItemD(int i, boolean z) {
        super(i, 0, z);
        this.a = new DashItemContainer(o());
    }

    public void a() {
    }

    public void a(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
    }

    public void b(com.tsf.shell.f.i.b.e.DrawerShortcutItemBase bVar) {
    }

    public void b() {
    }

    public void c() {
    }

    private h o() {
        h hVar = new h() { // from class: com.tsf.shell.f._d.b.a.DashItemD.1
            @Override // com.censivn.C3DEngine.b.f.j
            public void onDrawChildStart() {
                super.onDrawChildStart();
                if (d.b.id == 0) {
                    Bitmap bitmapA = com.tsf.shell.manager.o.ButtonPresetManager.a.a();
                    Canvas canvas = new Canvas(bitmapA);
                    canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
                    com.tsf.shell.manager.o.ButtonPresetManager.a.a(canvas, x.a(DashItemContainer.d.effect_icon_standard, com.tsf.shell.manager.o.ButtonPresetManager.a.H, com.tsf.shell.manager.o.ButtonPresetManager.a.I), true);
                    com.censivn.C3DEngine.A.g().a(d.b, bitmapA);
                }
                d.this.a(this);
            }

            @Override // com.tsf.shell.f.i.b.e.DrawerShortcutItemBase, com.tsf.shell.f.i.ShortcutItem, com.censivn.C3DEngine.b.f.j
            public void onDrawChildEnd() {
                super.onDrawChildEnd();
                d.this.b(this);
                com.tsf.shell.manager.i.PrimeEffectRenderer.a(d.this, com.censivn.C3DEngine.b.b.A.a(30.0f));
            }
        };
        hVar.f((float) (Math.random() * 200.0d));
        hVar.k.textures().addElement(DashItemContainer);
        return hVar;
    }

    public void d() {
        if (DashItemContainer.id != 0) {
            com.censivn.C3DEngine.A.g().a(DashItemContainer);
        }
    }

    public b e() {
        return this.a;
    }
}
