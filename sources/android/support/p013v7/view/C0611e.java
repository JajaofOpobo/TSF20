package android.support.p013v7.view;

import android.content.Context;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
/* renamed from: android.support.v7.view.e */
/* loaded from: classes.dex */
public class C0611e extends AbstractC0607b implements C0628f.InterfaceC0629a {

    /* renamed from: a */
    private Context f1393a;

    /* renamed from: b */
    private ActionBarContextView f1394b;

    /* renamed from: c */
    private AbstractC0607b.InterfaceC0608a f1395c;

    /* renamed from: d */
    private WeakReference<View> f1396d;

    /* renamed from: e */
    private boolean f1397e;

    /* renamed from: f */
    private boolean f1398f;

    /* renamed from: g */
    private C0628f f1399g;

    public C0611e(Context context, ActionBarContextView actionBarContextView, AbstractC0607b.InterfaceC0608a interfaceC0608a, boolean z) {
        this.f1393a = context;
        this.f1394b = actionBarContextView;
        this.f1395c = interfaceC0608a;
        this.f1399g = new C0628f(actionBarContextView.getContext()).m11786a(1);
        this.f1399g.mo11675a(this);
        this.f1398f = z;
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: b */
    public void mo11858b(CharSequence charSequence) {
        this.f1394b.setTitle(charSequence);
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: a */
    public void mo11862a(CharSequence charSequence) {
        this.f1394b.setSubtitle(charSequence);
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: a */
    public void mo11864a(int i) {
        mo11858b(this.f1393a.getString(i));
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: b */
    public void mo11859b(int i) {
        mo11862a((CharSequence) this.f1393a.getString(i));
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: a */
    public void mo11861a(boolean z) {
        super.mo11861a(z);
        this.f1394b.setTitleOptional(z);
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: h */
    public boolean mo11853h() {
        return this.f1394b.m11661d();
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: a */
    public void mo11863a(View view) {
        this.f1394b.setCustomView(view);
        this.f1396d = view != null ? new WeakReference<>(view) : null;
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: d */
    public void mo11856d() {
        this.f1395c.mo11846b(this, this.f1399g);
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: c */
    public void mo11857c() {
        if (!this.f1397e) {
            this.f1397e = true;
            this.f1394b.sendAccessibilityEvent(32);
            this.f1395c.mo11851a(this);
        }
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: b */
    public Menu mo11860b() {
        return this.f1399g;
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: f */
    public CharSequence mo11855f() {
        return this.f1394b.getTitle();
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: g */
    public CharSequence mo11854g() {
        return this.f1394b.getSubtitle();
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: i */
    public View mo11852i() {
        if (this.f1396d != null) {
            return this.f1396d.get();
        }
        return null;
    }

    @Override // android.support.p013v7.view.AbstractC0607b
    /* renamed from: a */
    public MenuInflater mo11865a() {
        return new C0614g(this.f1394b.getContext());
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
        return this.f1395c.mo11849a(this, menuItem);
    }

    @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
    /* renamed from: a */
    public void mo11118a(C0628f c0628f) {
        mo11856d();
        this.f1394b.mo11309a();
    }
}
