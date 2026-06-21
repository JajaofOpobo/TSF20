package com.tsf.shell.e.i.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.e.i.c;
import com.tsf.shell.e.i.c.i;

/* loaded from: classes.dex */
public class b extends c implements com.tsf.shell.e.e.h.b {
    private boolean a;
    private boolean b;
    private boolean f;
    private a g;

    public static i k() {
        return new com.tsf.shell.e.i.c.a();
    }

    public b(ItemInfo itemInfo) {
        super(itemInfo);
        this.a = false;
        this.b = false;
        this.f = false;
        itemInfo.iconType = 2;
        this.g = new a(true) { // from class: com.tsf.shell.e.i.b.a.b.1
            @Override // com.tsf.shell.e.i.b.a.a
            public Bitmap d() {
                return b.this.K().getPhoto();
            }

            @Override // com.tsf.shell.e.i.b.a.a
            public void e() {
                com.tsf.shell.e.e.h.a.a(b.this, 300, 300);
            }
        };
        setAABBPX(com.censivn.C3DEngine.b.b.a.b * (-180.0f), com.censivn.C3DEngine.b.b.a.b * (-300.0f), 0.0f, com.censivn.C3DEngine.b.b.a.b * 180.0f, com.censivn.C3DEngine.b.b.a.b * 100.0f, 0.0f);
        addChild(this.g);
    }

    @Override // com.tsf.shell.e.i.c
    public void W() {
        this.b = true;
        l();
        this.g.c();
    }

    @Override // com.tsf.shell.e.i.c
    public void X() {
        this.b = false;
        l();
    }

    @Override // com.tsf.shell.e.i.c
    public void l_() {
        this.a = true;
        l();
        super.l_();
    }

    @Override // com.tsf.shell.e.i.c
    public void c() {
        this.a = false;
        l();
        super.c();
    }

    @Override // com.tsf.shell.e.i.c
    public void k_() {
        super.k_();
    }

    @Override // com.tsf.shell.e.i.c
    public void o_() {
        this.f = true;
        l();
        super.o_();
    }

    @Override // com.tsf.shell.e.i.c
    public void j() {
        this.f = false;
        l();
        super.j();
    }

    private void l() {
        if (this.f || this.a || this.b) {
            this.g.a();
        } else {
            this.g.b();
        }
    }

    @Override // com.tsf.shell.e.i.c
    public void g() {
        this.g.destroy();
        super.g();
    }

    @Override // com.tsf.shell.e.e.h.b
    public void a(Bitmap bitmap) {
        K().onUpdatePhoto(bitmap, null);
        this.g.a(K().getPhoto());
    }
}
