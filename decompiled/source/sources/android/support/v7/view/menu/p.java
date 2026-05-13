package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.f;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public class p extends f implements SubMenu {
    private f d;
    private h e;

    public p(Context context, f fVar, h hVar) {
        super(context);
        this.d = fVar;
        this.e = hVar;
    }

    @Override // android.support.v7.view.menu.f, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }

    @Override // android.support.v7.view.menu.f
    public boolean b() {
        return this.d.b();
    }

    @Override // android.support.v7.view.menu.f
    public boolean c() {
        return this.d.c();
    }

    public Menu s() {
        return this.d;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.e;
    }

    @Override // android.support.v7.view.menu.f
    public void a(f.a aVar) {
        this.d.a(aVar);
    }

    @Override // android.support.v7.view.menu.f
    public f p() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.f
    public boolean a(f fVar, MenuItem menuItem) {
        return super.a(fVar, menuItem) || this.d.a(fVar, menuItem);
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
        super.a(android.support.v4.content.a.a(e(), i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        super.a(e().getResources().getString(i));
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        super.a(view);
        return this;
    }

    @Override // android.support.v7.view.menu.f
    public boolean c(h hVar) {
        return this.d.c(hVar);
    }

    @Override // android.support.v7.view.menu.f
    public boolean d(h hVar) {
        return this.d.d(hVar);
    }

    @Override // android.support.v7.view.menu.f
    public String a() {
        int itemId = this.e != null ? this.e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }
}
