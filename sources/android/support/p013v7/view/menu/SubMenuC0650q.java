package android.support.p013v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p005b.p006a.InterfaceSubMenuC0129c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.q */
/* loaded from: classes.dex */
public class SubMenuC0650q extends MenuC0648o implements SubMenu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0650q(Context context, InterfaceSubMenuC0129c interfaceSubMenuC0129c) {
        super(context, interfaceSubMenuC0129c);
    }

    /* renamed from: b */
    public InterfaceSubMenuC0129c m11667b() {
        return (InterfaceSubMenuC0129c) this.f1507b;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m11667b().setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m11667b().setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m11667b().setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m11667b().setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m11667b().setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        m11667b().clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        m11667b().setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        m11667b().setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m11795a(m11667b().getItem());
    }
}
