package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.b;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
abstract class e extends d {
    final Context a;
    final Window b;
    final Window.Callback c;
    final Window.Callback d;
    final c e;
    ActionBar f;
    MenuInflater g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    private CharSequence m;
    private boolean n;

    abstract android.support.v7.view.b a(b.a aVar);

    abstract void a(int i, Menu menu);

    abstract boolean a(int i, KeyEvent keyEvent);

    abstract boolean a(KeyEvent keyEvent);

    abstract void b(CharSequence charSequence);

    abstract boolean b(int i, Menu menu);

    abstract void k();

    e(Context context, Window window, c cVar) {
        this.a = context;
        this.b = window;
        this.e = cVar;
        this.c = this.b.getCallback();
        if (this.c instanceof a) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.d = a(this.c);
        this.b.setCallback(this.d);
    }

    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.d
    public ActionBar a() {
        k();
        return this.f;
    }

    final ActionBar l() {
        return this.f;
    }

    @Override // android.support.v7.app.d
    public MenuInflater b() {
        if (this.g == null) {
            k();
            this.g = new android.support.v7.view.g(this.f != null ? this.f.c() : this.a);
        }
        return this.g;
    }

    final Context m() {
        Context contextC = null;
        ActionBar actionBarA = a();
        if (actionBarA != null) {
            contextC = actionBarA.c();
        }
        if (contextC == null) {
            return this.a;
        }
        return contextC;
    }

    @Override // android.support.v7.app.d
    public void f() {
        this.n = true;
    }

    public boolean n() {
        return false;
    }

    @Override // android.support.v7.app.d
    public boolean h() {
        return false;
    }

    final boolean o() {
        return this.n;
    }

    final Window.Callback p() {
        return this.b.getCallback();
    }

    @Override // android.support.v7.app.d
    public final void a(CharSequence charSequence) {
        this.m = charSequence;
        b(charSequence);
    }

    @Override // android.support.v7.app.d
    public void c(Bundle bundle) {
    }

    final CharSequence q() {
        return this.c instanceof Activity ? ((Activity) this.c).getTitle() : this.m;
    }

    class a extends android.support.v7.view.i {
        a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.a(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof android.support.v7.view.menu.f)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            android.support.v7.view.menu.f fVar = menu instanceof android.support.v7.view.menu.f ? (android.support.v7.view.menu.f) menu : null;
            if (i == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.c(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (fVar != null) {
                fVar.c(false);
                return zOnPreparePanel;
            }
            return zOnPreparePanel;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            e.this.b(i, menu);
            return true;
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            e.this.a(i, menu);
        }
    }
}
