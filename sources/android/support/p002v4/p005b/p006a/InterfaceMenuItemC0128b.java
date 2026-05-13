package android.support.p002v4.p005b.p006a;

import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.view.MenuItem;
import android.view.View;
/* renamed from: android.support.v4.b.a.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0128b extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC0128b mo11737a(AbstractC0388d abstractC0388d);

    /* renamed from: a */
    InterfaceMenuItemC0128b mo11736a(C0419q.InterfaceC0424e interfaceC0424e);

    /* renamed from: a */
    AbstractC0388d mo11739a();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i);
}
