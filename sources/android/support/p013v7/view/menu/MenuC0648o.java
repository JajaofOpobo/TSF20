package android.support.p013v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p002v4.p005b.p006a.InterfaceMenuC0127a;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0648o extends AbstractC0624c<InterfaceMenuC0127a> implements Menu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuC0648o(Context context, InterfaceMenuC0127a interfaceMenuC0127a) {
        super(context, interfaceMenuC0127a);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m11794a(((InterfaceMenuC0127a) this.f1507b).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m11794a(((InterfaceMenuC0127a) this.f1507b).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m11794a(((InterfaceMenuC0127a) this.f1507b).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m11794a(((InterfaceMenuC0127a) this.f1507b).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((InterfaceMenuC0127a) this.f1507b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m11795a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m11793b(i);
        ((InterfaceMenuC0127a) this.f1507b).removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m11796a(i);
        ((InterfaceMenuC0127a) this.f1507b).removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        m11797a();
        ((InterfaceMenuC0127a) this.f1507b).clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0127a) this.f1507b).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0127a) this.f1507b).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0127a) this.f1507b).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0127a) this.f1507b).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0127a) this.f1507b).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m11795a(((InterfaceMenuC0127a) this.f1507b).getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0127a) this.f1507b).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0127a) this.f1507b).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0127a) this.f1507b).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0127a) this.f1507b).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0127a) this.f1507b).setQwertyMode(z);
    }
}
