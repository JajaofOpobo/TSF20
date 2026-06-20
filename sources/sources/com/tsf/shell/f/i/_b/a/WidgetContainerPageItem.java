package com.tsf.shell.f.i._b.a;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.f.e._h.PhotoSelectorHelper;
import com.tsf.shell.f.i._c.WidgetGroupBase;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetContainerPageItem extends com.tsf.shell.f.i.PageItem implements a.InterfaceC0098a {
    private boolean a;
    private boolean b;
    private boolean f;
    private a g;

    public static g k() {
        return new com.tsf.shell.f.i._c.a();
    }

    public WidgetContainerPageItem(ItemInfo itemInfo) {
        super(itemInfo);
        this.a = false;
        this.b = false;
        this.f = false;
        itemInfo.iconType = 2;
        this.g = new a(true) { // from class: com.tsf.shell.f.i._b.a.WidgetContainerPageItem.1
            @Override // com.tsf.shell.f.i._b.a.WidgetContainer
            public Bitmap c() {
                                return b.this.K().getPhoto();
            }

            @Override // com.tsf.shell.f.i._b.a.WidgetContainer
            public void e() {
                com.tsf.shell.f.e._h.PhotoSelectorHelper.a(b.this, 300, 300);
            }
        };
        setAABBPX(com.censivn.C3DEngine.b.b.ScreenConstants.b * (-180.0f), com.censivn.C3DEngine.b.b.ScreenConstants.b * (-300.0f), 0.0f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 180.0f, com.censivn.C3DEngine.b.b.ScreenConstants.b * 100.0f, 0.0f);
        addChild(this.g);
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void W() {
        this.b = true;
        WidgetContainerPageItem();
        this.g.c();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void X() {
        this.b = false;
        WidgetContainerPageItem();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void n_() {
        this.a = true;
        WidgetContainerPageItem();
        super.n_();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void c() {
        this.a = false;
        WidgetContainerPageItem();
        super.c();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void m_() {
        super.m_();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void q_() {
        this.f = true;
        WidgetContainerPageItem();
        super.q_();
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void j() {
        this.f = false;
        WidgetContainerPageItem();
        super.j();
    }

    private void l() {
        if (this.f || this.a || this.b) {
            this.g.a();
        } else {
            this.g.b();
        }
    }

    @Override // com.tsf.shell.f.i.PageItem
    public void g() {
        this.g.destroy();
        super.g();
    }

    @Override // com.tsf.shell.f.e._h.PhotoSelectorHelper.InterfaceC0098a
    public void a(Bitmap bitmap) {
        K().onUpdatePhoto(bitmap, null);
        this.g.a(K().getPhoto());
    }
}
