package com.censivn.C3DEngine.b.h.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.GridRenderable;
import com.censivn.C3DEngine.b.g.TweenManager;
import com.censivn.C3DEngine.b.g.TweenParams;
import com.tsf.b;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LoadingSpinner extends GridRenderable {
    private TextureElement a;

    public LoadingSpinner() {
        super(com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k, false);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.IRenderable
    public void onDrawStart() {
        if (this.a.id == 0) {
            Bitmap bitmapA = x.a(b.d.res_loading, com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k);
            com.censivn.C3DEngine.C3DEngine.g().a(this.a, bitmapA);
            bitmapA.recycle();
        }
        rotation().z -= 10.0f;
        invalidate();
    }

    public void a() {
        com.censivn.C3DEngine.C3DEngine.g().a(this.a);
    }

    public void a(boolean z) {
        if (z) {
            d dVar = new d();
            dVar.a(255);
            c.a(this);
            c.a(this, VEasing.Back.easeIn, dVar);
            return;
        }
        alpha(255.0f);
    }

    public void b(boolean z) {
        if (z) {
            d dVar = new d() { // from class: com.censivn.C3DEngine.b.h.c.LoadingSpinner.1
                @Override // com.censivn.C3DEngine.b.g.TweenParams
                public void a() {
                    a.this.a();
                    a.this.removeFromParent();
                }
            };
            dVar.a(0);
            c.a(this);
            c.a(this, VEasing.Back.easeIn, dVar);
            return;
        }
        alpha(0.0f);
        a();
    }
}
