package com.tsf.shell.f.i.b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.f.e.h.a;
import com.tsf.shell.f.i.c.g;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class b extends com.tsf.shell.f.i.b implements a.InterfaceC0098a {
    private boolean a;
    private boolean b;
    private boolean f;
    private a g;

    public static g k() {
        return new com.tsf.shell.f.i.c.a();
    }

    public b(ItemInfo itemInfo) {
        super(itemInfo);
        this.a = false;
        this.b = false;
        this.f = false;
        itemInfo.iconType = 2;
        this.g = new a(true) { // from class: com.tsf.shell.f.i.b.a.b.1
            @Override // com.tsf.shell.f.i.b.a.a
            public Bitmap d() {
                return b.this.K().getPhoto();
            }

            @Override // com.tsf.shell.f.i.b.a.a
            public void e() {
                com.tsf.shell.f.e.h.a.a(b.this, 300, 300);
            }
        };
        setAABBPX(com.censivn.C3DEngine.b.b.a.b * (-180.0f), com.censivn.C3DEngine.b.b.a.b * (-300.0f), 0.0f, com.censivn.C3DEngine.b.b.a.b * 180.0f, com.censivn.C3DEngine.b.b.a.b * 100.0f, 0.0f);
        addChild(this.g);
    }

    @Override // com.tsf.shell.f.i.b
    public void W() {
        this.b = true;
        l();
        this.g.c();
    }

    @Override // com.tsf.shell.f.i.b
    public void X() {
        this.b = false;
        l();
    }

    @Override // com.tsf.shell.f.i.b
    public void n_() {
        this.a = true;
        l();
        super.n_();
    }

    @Override // com.tsf.shell.f.i.b
    public void c() {
        this.a = false;
        l();
        super.c();
    }

    @Override // com.tsf.shell.f.i.b
    public void m_() {
        super.m_();
    }

    @Override // com.tsf.shell.f.i.b
    public void q_() {
        this.f = true;
        l();
        super.q_();
    }

    @Override // com.tsf.shell.f.i.b
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

    @Override // com.tsf.shell.f.i.b
    public void g() {
        this.g.destroy();
        super.g();
    }

    @Override // com.tsf.shell.f.e.h.a.InterfaceC0098a
    public void a(Bitmap bitmap) {
        K().onUpdatePhoto(bitmap, null);
        this.g.a(K().getPhoto());
    }
}
