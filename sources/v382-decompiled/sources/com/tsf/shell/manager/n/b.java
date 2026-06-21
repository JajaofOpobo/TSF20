package com.tsf.shell.manager.n;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.g.w;
import com.censivn.C3DEngine.b.g.x;
import com.tsf.shell.manager.o.c;

/* loaded from: classes.dex */
public class b extends m {
    public Runnable a;
    final /* synthetic */ a d;
    private TextureElement e;
    private String f;
    private boolean g;
    private int h;

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        com.tsf.shell.manager.o.a.a aVar;
        if (this.g) {
            this.g = false;
            System.currentTimeMillis();
            aVar = this.d.s;
            Bitmap b = aVar.b(this.f);
            com.censivn.C3DEngine.a.g().a(this.e, b);
            b.recycle();
            a(this.e.width);
            b(this.e.height);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str) {
        super(0.0f, 0.0f);
        this.d = aVar;
        this.e = new TextureElement(0, false);
        this.f = "";
        this.g = false;
        position().y = 100.0f * com.censivn.C3DEngine.b.b.a.c;
        alpha(0.0f);
        textures().addElement(this.e);
        a(str);
        c.a(this, c.b);
    }

    public void a(String str) {
        if (str != null && !str.equals(this.f)) {
            this.g = true;
            this.f = str;
        }
    }

    protected void a() {
        a(this.h);
    }

    protected void a(int i) {
        float f;
        this.h = i;
        if (this.e.id != 0 || this.g) {
            x xVar = new x();
            f = this.d.e;
            xVar.h((-f) / 2.0f);
            xVar.a(255);
            w.a(this);
            w.a(this, 500, xVar);
            if (parent() == null) {
                this.d.b.addChild(this);
            }
            this.d.a(i);
        }
    }

    public void a(final boolean z) {
        x xVar = new x() { // from class: com.tsf.shell.manager.n.b.1
            @Override // com.censivn.C3DEngine.b.g.x
            public void a() {
                b.this.removeFromParent();
                if (z) {
                    b.this.d();
                }
            }
        };
        xVar.a(0);
        xVar.h(100.0f * com.censivn.C3DEngine.b.b.a.c);
        w.a(this);
        w.a(this, 500, xVar);
        this.d.a();
    }

    public void d() {
        removeFromParent();
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
        this.f = "";
    }
}
