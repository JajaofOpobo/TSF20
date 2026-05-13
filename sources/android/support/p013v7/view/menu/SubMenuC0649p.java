package android.support.p013v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v4.content.C0144a;
import android.support.p013v7.view.menu.C0628f;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: android.support.v7.view.menu.p */
/* loaded from: classes.dex */
public class SubMenuC0649p extends C0628f implements SubMenu {

    /* renamed from: d */
    private C0628f f1604d;

    /* renamed from: e */
    private C0632h f1605e;

    public SubMenuC0649p(Context context, C0628f c0628f, C0632h c0632h) {
        super(context);
        this.f1604d = c0628f;
        this.f1605e = c0632h;
    }

    @Override // android.support.p013v7.view.menu.C0628f, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1604d.setQwertyMode(z);
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: b */
    public boolean mo11673b() {
        return this.f1604d.mo11673b();
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: c */
    public boolean mo11672c() {
        return this.f1604d.mo11672c();
    }

    /* renamed from: s */
    public Menu m11668s() {
        return this.f1604d;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1605e;
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: a */
    public void mo11675a(C0628f.InterfaceC0629a interfaceC0629a) {
        this.f1604d.mo11675a(interfaceC0629a);
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: p */
    public C0628f mo11669p() {
        return this.f1604d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: a */
    public boolean mo11674a(C0628f c0628f, MenuItem menuItem) {
        return super.mo11674a(c0628f, menuItem) || this.f1604d.mo11674a(c0628f, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1605e.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1605e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m11779a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.m11779a(C0144a.m13403a(m11755e(), i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m11769a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.m11769a(m11755e().getResources().getString(i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.m11770a(view);
        return this;
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: c */
    public boolean mo11671c(C0632h c0632h) {
        return this.f1604d.mo11671c(c0632h);
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: d */
    public boolean mo11670d(C0632h c0632h) {
        return this.f1604d.mo11670d(c0632h);
    }

    @Override // android.support.p013v7.view.menu.C0628f
    /* renamed from: a */
    public String mo11676a() {
        int itemId = this.f1605e != null ? this.f1605e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo11676a() + ":" + itemId;
    }
}
