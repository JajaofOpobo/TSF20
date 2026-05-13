package com.censivn.C3DEngine.b.h.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.g.c;
import com.censivn.C3DEngine.b.g.d;
import com.tsf.b;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class a extends k {
    private TextureElement a;

    public a() {
        super(com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k, false);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.i
    public void onDrawStart() {
        if (this.a.id == 0) {
            Bitmap a = x.a(b.d.res_loading, com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k);
            com.censivn.C3DEngine.a.g().a(this.a, a);
            a.recycle();
        }
        rotation().z -= 10.0f;
        invalidate();
    }

    public void a() {
        com.censivn.C3DEngine.a.g().a(this.a);
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
            d dVar = new d() { // from class: com.censivn.C3DEngine.b.h.c.a.1
                @Override // com.censivn.C3DEngine.b.g.d
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
