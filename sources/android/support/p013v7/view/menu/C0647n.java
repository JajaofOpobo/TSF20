package android.support.p013v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.p002v4.p005b.p006a.InterfaceMenuC0127a;
import android.support.p002v4.p005b.p006a.InterfaceMenuItemC0128b;
import android.support.p002v4.p005b.p006a.InterfaceSubMenuC0129c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
/* renamed from: android.support.v7.view.menu.n */
/* loaded from: classes.dex */
public final class C0647n {
    /* renamed from: a */
    public static Menu m11679a(Context context, InterfaceMenuC0127a interfaceMenuC0127a) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new MenuC0648o(context, interfaceMenuC0127a);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static MenuItem m11678a(Context context, InterfaceMenuItemC0128b interfaceMenuItemC0128b) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0639j(context, interfaceMenuItemC0128b);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new MenuItemC0634i(context, interfaceMenuItemC0128b);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static SubMenu m11677a(Context context, InterfaceSubMenuC0129c interfaceSubMenuC0129c) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new SubMenuC0650q(context, interfaceSubMenuC0129c);
        }
        throw new UnsupportedOperationException();
    }
}
