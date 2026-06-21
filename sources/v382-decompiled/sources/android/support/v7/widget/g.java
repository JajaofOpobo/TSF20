package android.support.v7.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class g implements android.support.v7.internal.view.menu.b, android.support.v7.internal.view.menu.g {
    private Context a;
    private android.support.v7.internal.view.menu.a b;
    private View c;
    private android.support.v7.internal.view.menu.d d;
    private i e;
    private h f;

    public g(Context context, View view) {
        this(context, view, 0);
    }

    public g(Context context, View view, int i) {
        this(context, view, i, android.support.v7.a.b.popupMenuStyle, 0);
    }

    public g(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.b = new android.support.v7.internal.view.menu.a(context);
        this.b.a(this);
        this.c = view;
        this.d = new android.support.v7.internal.view.menu.d(context, this.b, view, false, i2, i3);
        this.d.a(i);
        this.d.a(this);
    }

    public Menu a() {
        return this.b;
    }

    public void b() {
        this.d.a();
    }

    public void a(i iVar) {
        this.e = iVar;
    }

    @Override // android.support.v7.internal.view.menu.b
    public boolean a(android.support.v7.internal.view.menu.a aVar, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a(menuItem);
        }
        return false;
    }

    @Override // android.support.v7.internal.view.menu.g
    public void a(android.support.v7.internal.view.menu.a aVar, boolean z) {
        if (this.f != null) {
            this.f.a(this);
        }
    }

    @Override // android.support.v7.internal.view.menu.g
    public boolean a(android.support.v7.internal.view.menu.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (!aVar.hasVisibleItems()) {
            return true;
        }
        new android.support.v7.internal.view.menu.d(this.a, aVar, this.c).a();
        return true;
    }
}
