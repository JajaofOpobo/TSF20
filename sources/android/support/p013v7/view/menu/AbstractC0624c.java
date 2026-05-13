package android.support.p013v7.view.menu;

import android.content.Context;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.p005b.p006a.InterfaceSubMenuC0129c;
import android.support.p002v4.p009d.C0160a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
/* renamed from: android.support.v7.view.menu.c */
/* loaded from: classes.dex */
abstract class AbstractC0624c<T> extends C0625d<T> {

    /* renamed from: a */
    final Context f1504a;

    /* renamed from: c */
    private Map<InterfaceMenuItemC0128b, MenuItem> f1505c;

    /* renamed from: d */
    private Map<InterfaceSubMenuC0129c, SubMenu> f1506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0624c(Context context, T t) {
        super(t);
        this.f1504a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem m11795a(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC0128b) {
            InterfaceMenuItemC0128b interfaceMenuItemC0128b = (InterfaceMenuItemC0128b) menuItem;
            if (this.f1505c == null) {
                this.f1505c = new C0160a();
            }
            MenuItem menuItem2 = this.f1505c.get(menuItem);
            if (menuItem2 == null) {
                MenuItem m11678a = C0647n.m11678a(this.f1504a, interfaceMenuItemC0128b);
                this.f1505c.put(interfaceMenuItemC0128b, m11678a);
                return m11678a;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu m11794a(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC0129c) {
            InterfaceSubMenuC0129c interfaceSubMenuC0129c = (InterfaceSubMenuC0129c) subMenu;
            if (this.f1506d == null) {
                this.f1506d = new C0160a();
            }
            SubMenu subMenu2 = this.f1506d.get(interfaceSubMenuC0129c);
            if (subMenu2 == null) {
                SubMenu m11677a = C0647n.m11677a(this.f1504a, interfaceSubMenuC0129c);
                this.f1506d.put(interfaceSubMenuC0129c, m11677a);
                return m11677a;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m11797a() {
        if (this.f1505c != null) {
            this.f1505c.clear();
        }
        if (this.f1506d != null) {
            this.f1506d.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m11796a(int i) {
        if (this.f1505c != null) {
            Iterator<InterfaceMenuItemC0128b> it = this.f1505c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m11793b(int i) {
        if (this.f1505c != null) {
            Iterator<InterfaceMenuItemC0128b> it = this.f1505c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
