package com.tsf.shell.e.e;

import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.tween.VEasing;
import com.tsf.shell.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class v extends com.censivn.C3DEngine.b.f.l {
    private w d;
    private com.censivn.C3DEngine.b.f.m e;
    private TextureElement a = new TextureElement(0, false);
    private TextureElement b = new TextureElement(0, false);
    private boolean f = false;
    private ArrayList c = new ArrayList();

    public void a(int i) {
        if (!this.f) {
            this.f = true;
            if (this.a.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.a, com.tsf.shell.utils.x.a(R.drawable.shell_number));
            }
            if (this.b.id == 0) {
                com.censivn.C3DEngine.a.g().a(this.b, com.tsf.shell.utils.x.a(R.drawable.shell_number_bg));
            }
            if (this.e == null) {
                this.e = new com.censivn.C3DEngine.b.f.m(252.0f * com.censivn.C3DEngine.b.b.a.c, 162.0f * com.censivn.C3DEngine.b.b.a.c, false);
                this.e.alpha(0.0f);
                addChild(this.e);
            }
            this.e.textures().clear();
            this.e.textures().addElement(this.b);
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x();
            xVar.a(255);
            com.censivn.C3DEngine.b.g.w.a(this.e);
            com.censivn.C3DEngine.b.g.w.a(this.e, VEasing.Back.easeIn, xVar);
            if (parent() == null) {
                com.tsf.shell.manager.a.j.a(this);
            }
            b(i);
        }
    }

    public void a() {
        if (this.f) {
            this.f = false;
            com.censivn.C3DEngine.b.g.x xVar = new com.censivn.C3DEngine.b.g.x() { // from class: com.tsf.shell.e.e.v.1
                @Override // com.censivn.C3DEngine.b.g.x
                public void a() {
                    com.tsf.shell.manager.a.j.b(v.this);
                    if (v.this.a.id != 0) {
                        com.censivn.C3DEngine.a.g().a(v.this.a);
                    }
                    if (v.this.b.id != 0) {
                        com.censivn.C3DEngine.a.g().a(v.this.b);
                    }
                }
            };
            xVar.a(0);
            com.censivn.C3DEngine.b.g.w.a(this.e);
            com.censivn.C3DEngine.b.g.w.a(this.e, VEasing.Back.easeIn, xVar);
            if (this.d != null) {
                this.d.b(0);
                this.d = null;
            }
        }
    }

    public void b(int i) {
        boolean z;
        if (this.d == null || this.d.h != i) {
            if (this.d != null) {
                this.d.c();
                z = false;
            } else {
                z = true;
            }
            this.d = b();
            this.d.a(z ? 0 : 1, i);
        }
    }

    private w b() {
        w wVar;
        if (this.c.isEmpty()) {
            wVar = new w(this);
        } else {
            wVar = (w) this.c.remove(0);
        }
        wVar.textures().clear();
        wVar.textures().addElement(this.a);
        return wVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(w wVar) {
        wVar.removeFromParent();
        wVar.textures().clear();
        this.c.add(wVar);
    }
}
