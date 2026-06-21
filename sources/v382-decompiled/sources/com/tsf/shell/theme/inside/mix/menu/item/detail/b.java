package com.tsf.shell.theme.inside.mix.menu.item.detail;

import android.graphics.Bitmap;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.censivn.C3DEngine.b.f.o;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeListsManager;
import com.tsf.shell.theme.inside.ThemesMixManager;
import com.tsf.shell.theme.inside.element.ThemeElementChecker;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
class b extends l {
    private int a;
    public m b;
    public o c;
    final /* synthetic */ ThemeElementInfoLayout d;
    private ThemeListsManager.ThemeInfo f;
    private TextureElement e = new TextureElement(0, false);
    private boolean g = false;

    public b(ThemeElementInfoLayout themeElementInfoLayout, int i) {
        this.d = themeElementInfoLayout;
        this.a = i;
        this.b = new m(themeElementInfoLayout.mElementSize, themeElementInfoLayout.mElementSize, false);
        this.b.calAABB();
        this.b.textures().addElement(this.e);
        this.b.position().y = com.censivn.C3DEngine.b.b.a.a(100.0f);
        this.c = new o();
        this.c.d(35);
        this.c.position().y = -com.censivn.C3DEngine.b.b.a.a(50.0f);
        this.c.a(ThemesMixManager.getTypeTitle(com.censivn.C3DEngine.a.d(), i));
        this.c.b();
        setAABBPX(((-themeElementInfoLayout.mElementSize) / 2.0f) * 1.4f, (-themeElementInfoLayout.mElementSize) / 2.0f, 0.0f, (themeElementInfoLayout.mElementSize / 2.0f) * 1.4f, themeElementInfoLayout.mElementSize / 2.0f, 0.0f);
        addChild(this.b);
        addChild(this.c);
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawStart() {
        if (this.e.id == 0 && this.f != null) {
            Bitmap a = this.g ? a(this.f) : null;
            if (a == null) {
                a = x.a(R.drawable.theme_lose_icon, this.d.mElementSize, this.d.mElementSize);
            }
            com.censivn.C3DEngine.a.g().a(this.e, a);
            a.recycle();
        }
    }

    public void b(ThemeListsManager.ThemeInfo themeInfo) {
        a();
        this.f = themeInfo;
        this.g = ThemeElementChecker.isElementAbailable(this.f.context, this.a);
    }

    public void a() {
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
        this.c.a();
        this.f = null;
    }

    public Bitmap a(ThemeListsManager.ThemeInfo themeInfo) {
        return null;
    }
}
