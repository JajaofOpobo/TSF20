package android.support.p013v7.widget;

import android.content.Context;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.view.menu.View$OnKeyListenerC0641k;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
/* renamed from: android.support.v7.widget.q */
/* loaded from: classes.dex */
public class C0758q implements C0628f.InterfaceC0629a, InterfaceC0643l.InterfaceC0644a {

    /* renamed from: a */
    private Context f2170a;

    /* renamed from: b */
    private C0628f f2171b;

    /* renamed from: c */
    private View f2172c;

    /* renamed from: d */
    private View$OnKeyListenerC0641k f2173d;

    /* renamed from: e */
    private InterfaceC0760b f2174e;

    /* renamed from: f */
    private InterfaceC0759a f2175f;

    /* renamed from: android.support.v7.widget.q$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0759a {
        /* renamed from: a */
        void m11112a(C0758q c0758q);
    }

    /* renamed from: android.support.v7.widget.q$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0760b {
        /* renamed from: a */
        boolean mo1188a(MenuItem menuItem);
    }

    public C0758q(Context context, View view) {
        this(context, view, 0);
    }

    public C0758q(Context context, View view, int i) {
        this(context, view, i, C0535a.C0536a.popupMenuStyle, 0);
    }

    public C0758q(Context context, View view, int i, int i2, int i3) {
        this.f2170a = context;
        this.f2171b = new C0628f(context);
        this.f2171b.mo11675a(this);
        this.f2172c = view;
        this.f2173d = new View$OnKeyListenerC0641k(context, this.f2171b, view, false, i2, i3);
        this.f2173d.m11696a(i);
        this.f2173d.m11694a(this);
    }

    /* renamed from: a */
    public Menu m11119a() {
        return this.f2171b;
    }

    /* renamed from: b */
    public void m11113b() {
        this.f2173d.m11697a();
    }

    /* renamed from: a */
    public void m11115a(InterfaceC0760b interfaceC0760b) {
        this.f2174e = interfaceC0760b;
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
        if (this.f2174e != null) {
            return this.f2174e.mo1188a(menuItem);
        }
        return false;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
    /* renamed from: a */
    public void mo11116a(C0628f c0628f, boolean z) {
        if (this.f2175f != null) {
            this.f2175f.m11112a(this);
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
    /* renamed from: a_ */
    public boolean mo11114a_(C0628f c0628f) {
        if (c0628f == null) {
            return false;
        }
        if (c0628f.hasVisibleItems()) {
            new View$OnKeyListenerC0641k(this.f2170a, c0628f, this.f2172c).m11697a();
            return true;
        }
        return true;
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public void mo11118a(C0628f c0628f) {
    }
}
