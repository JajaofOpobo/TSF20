package android.support.v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
abstract class c<T> extends d<T> {
    final Context a;
    private Map<android.support.v4.b.a.b, MenuItem> c;
    private Map<android.support.v4.b.a.c, SubMenu> d;

    c(Context context, T t) {
        super(t);
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof android.support.v4.b.a.b)) {
            return menuItem;
        }
        android.support.v4.b.a.b bVar = (android.support.v4.b.a.b) menuItem;
        if (this.c == null) {
            this.c = new android.support.v4.d.a();
        }
        MenuItem menuItem2 = this.c.get(menuItem);
        if (menuItem2 == null) {
            MenuItem menuItemA = n.a(this.a, bVar);
            this.c.put(bVar, menuItemA);
            return menuItemA;
        }
        return menuItem2;
    }

    final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof android.support.v4.b.a.c)) {
            return subMenu;
        }
        android.support.v4.b.a.c cVar = (android.support.v4.b.a.c) subMenu;
        if (this.d == null) {
            this.d = new android.support.v4.d.a();
        }
        SubMenu subMenu2 = this.d.get(cVar);
        if (subMenu2 == null) {
            SubMenu subMenuA = n.a(this.a, cVar);
            this.d.put(cVar, subMenuA);
            return subMenuA;
        }
        return subMenu2;
    }

    final void a() {
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
    }

    final void a(int i) {
        if (this.c != null) {
            Iterator<android.support.v4.b.a.b> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    final void b(int i) {
        if (this.c != null) {
            Iterator<android.support.v4.b.a.b> it = this.c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
