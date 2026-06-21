package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class j extends a implements SubMenu {
    private a d;
    private c e;

    public j(Context context, a aVar, c cVar) {
        super(context);
        this.d = aVar;
        this.e = cVar;
    }

    @Override // android.support.v7.internal.view.menu.a, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.support.v7.internal.view.menu.a
    public boolean a() {
        return this.d.a();
    }

    @Override // android.support.v7.internal.view.menu.a
    public boolean b() {
        return this.d.b();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.e;
    }

    @Override // android.support.v7.internal.view.menu.a
    public void a(b bVar) {
        this.d.a(bVar);
    }

    @Override // android.support.v7.internal.view.menu.a
    public a j() {
        return this.d;
    }

    @Override // android.support.v7.internal.view.menu.a
    boolean a(a aVar, MenuItem menuItem) {
        return super.a(aVar, menuItem) || this.d.a(aVar, menuItem);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        super.a(android.support.v4.a.a.a(d(), i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.a(d().getResources().getString(i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.a(view);
        return this;
    }

    @Override // android.support.v7.internal.view.menu.a
    public boolean c(c cVar) {
        return this.d.c(cVar);
    }

    @Override // android.support.v7.internal.view.menu.a
    public boolean d(c cVar) {
        return this.d.d(cVar);
    }
}
