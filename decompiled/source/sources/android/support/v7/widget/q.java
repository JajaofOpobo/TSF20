package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.a;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
/* loaded from: classes.dex */
public class q implements f.a, l.a {
    private Context a;
    private android.support.v7.view.menu.f b;
    private View c;
    private android.support.v7.view.menu.k d;
    private b e;
    private a f;

    /* loaded from: classes.dex */
    public interface a {
        void a(q qVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    public q(Context context, View view) {
        this(context, view, 0);
    }

    public q(Context context, View view, int i) {
        this(context, view, i, a.C0012a.popupMenuStyle, 0);
    }

    public q(Context context, View view, int i, int i2, int i3) {
        this.a = context;
        this.b = new android.support.v7.view.menu.f(context);
        this.b.a(this);
        this.c = view;
        this.d = new android.support.v7.view.menu.k(context, this.b, view, false, i2, i3);
        this.d.a(i);
        this.d.a(this);
    }

    public Menu a() {
        return this.b;
    }

    public void b() {
        this.d.a();
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    @Override // android.support.v7.view.menu.f.a
    public boolean a(android.support.v7.view.menu.f fVar, MenuItem menuItem) {
        if (this.e != null) {
            return this.e.a(menuItem);
        }
        return false;
    }

    @Override // android.support.v7.view.menu.l.a
    public void a(android.support.v7.view.menu.f fVar, boolean z) {
        if (this.f != null) {
            this.f.a(this);
        }
    }

    @Override // android.support.v7.view.menu.l.a
    public boolean a_(android.support.v7.view.menu.f fVar) {
        if (fVar == null) {
            return false;
        }
        if (fVar.hasVisibleItems()) {
            new android.support.v7.view.menu.k(this.a, fVar, this.c).a();
            return true;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.f.a
    public void a(android.support.v7.view.menu.f fVar) {
    }
}
