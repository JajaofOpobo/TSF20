package android.support.p013v7.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.C0614g;
import android.support.p013v7.view.Window$CallbackC0619i;
import android.support.p013v7.view.menu.C0628f;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0580e extends AbstractC0579d {

    /* renamed from: a */
    final Context f1287a;

    /* renamed from: b */
    final Window f1288b;

    /* renamed from: c */
    final Window.Callback f1289c;

    /* renamed from: d */
    final Window.Callback f1290d;

    /* renamed from: e */
    final InterfaceC0578c f1291e;

    /* renamed from: f */
    ActionBar f1292f;

    /* renamed from: g */
    MenuInflater f1293g;

    /* renamed from: h */
    boolean f1294h;

    /* renamed from: i */
    boolean f1295i;

    /* renamed from: j */
    boolean f1296j;

    /* renamed from: k */
    boolean f1297k;

    /* renamed from: l */
    boolean f1298l;

    /* renamed from: m */
    private CharSequence f1299m;

    /* renamed from: n */
    private boolean f1300n;

    /* renamed from: a */
    abstract AbstractC0607b mo11974a(AbstractC0607b.InterfaceC0608a interfaceC0608a);

    /* renamed from: a */
    abstract void mo11975a(int i, Menu menu);

    /* renamed from: a */
    abstract boolean mo11976a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    abstract boolean mo11973a(KeyEvent keyEvent);

    /* renamed from: b */
    abstract void mo11969b(CharSequence charSequence);

    /* renamed from: b */
    abstract boolean mo11970b(int i, Menu menu);

    /* renamed from: k */
    abstract void mo11967k();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0580e(Context context, Window window, InterfaceC0578c interfaceC0578c) {
        this.f1287a = context;
        this.f1288b = window;
        this.f1291e = interfaceC0578c;
        this.f1289c = this.f1288b.getCallback();
        if (this.f1289c instanceof C0581a) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f1290d = mo11953a(this.f1289c);
        this.f1288b.setCallback(this.f1290d);
    }

    /* renamed from: a */
    Window.Callback mo11953a(Window.Callback callback) {
        return new C0581a(callback);
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public ActionBar mo11977a() {
        mo11967k();
        return this.f1292f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final ActionBar m11966l() {
        return this.f1292f;
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: b */
    public MenuInflater mo11971b() {
        if (this.f1293g == null) {
            mo11967k();
            this.f1293g = new C0614g(this.f1292f != null ? this.f1292f.mo11909c() : this.f1287a);
        }
        return this.f1293g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final Context m11965m() {
        Context context = null;
        ActionBar mo11977a = mo11977a();
        if (mo11977a != null) {
            context = mo11977a.mo11909c();
        }
        if (context == null) {
            return this.f1287a;
        }
        return context;
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: f */
    public void mo11968f() {
        this.f1300n = true;
    }

    /* renamed from: n */
    public boolean mo11956n() {
        return false;
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: h */
    public boolean mo11957h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean m11964o() {
        return this.f1300n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Window.Callback m11963p() {
        return this.f1288b.getCallback();
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public final void mo11972a(CharSequence charSequence) {
        this.f1299m = charSequence;
        mo11969b(charSequence);
    }

    @Override // android.support.p013v7.app.AbstractC0579d
    /* renamed from: c */
    public void mo11959c(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final CharSequence m11962q() {
        return this.f1289c instanceof Activity ? ((Activity) this.f1289c).getTitle() : this.f1299m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.e$a */
    /* loaded from: classes.dex */
    public class C0581a extends Window$CallbackC0619i {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0581a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AbstractC0580e.this.mo11973a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AbstractC0580e.this.mo11976a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0628f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0628f c0628f = menu instanceof C0628f ? (C0628f) menu : null;
            if (i == 0 && c0628f == null) {
                return false;
            }
            if (c0628f != null) {
                c0628f.m11759c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0628f != null) {
                c0628f.m11759c(false);
                return onPreparePanel;
            }
            return onPreparePanel;
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AbstractC0580e.this.mo11970b(i, menu);
            return true;
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AbstractC0580e.this.mo11975a(i, menu);
        }
    }
}
