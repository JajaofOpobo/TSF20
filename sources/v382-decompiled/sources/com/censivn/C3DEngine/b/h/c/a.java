package com.censivn.C3DEngine.b.h.c;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.tsf.shell.R;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class a extends m {
    private TextureElement a;

    public a() {
        super(com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k, false);
        this.a = new TextureElement(0, false);
        textures().addElement(this.a);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.a.id == 0) {
            Bitmap a = x.a(R.drawable.res_loading, com.tsf.shell.manager.g.a.k, com.tsf.shell.manager.g.a.k);
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
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.a(255);
            w.a(this);
            w.a(this, VEasing.Back.easeIn, xVar);
            return;
        }
        alpha(255.0f);
    }

    public void b(boolean z) {
        if (z) {
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.censivn.C3DEngine.b.h.c.a.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    a.this.a();
                    a.this.removeFromParent();
                }
            };
            xVar.a(0);
            w.a(this);
            w.a(this, VEasing.Back.easeIn, xVar);
            return;
        }
        alpha(0.0f);
        a();
    }
}
