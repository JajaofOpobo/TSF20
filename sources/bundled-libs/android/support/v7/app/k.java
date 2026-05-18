package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.ai;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.l;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class k extends ActionBar {
    private android.support.v7.widget.n a;
    private Window.Callback b;
    private boolean c;
    private boolean d;
    private ArrayList<ActionBar.a> e;
    private final Runnable f;

    /* JADX INFO: renamed from: android.support.v7.app.k$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ k a;

        @Override // java.lang.Runnable
        public void run() {
            this.a.i();
        }
    }

    @Override // android.support.v7.app.ActionBar
    public void a(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public void a(float f) {
        ai.e(this.a.a(), f);
    }

    @Override // android.support.v7.app.ActionBar
    public Context c() {
        return this.a.b();
    }

    @Override // android.support.v7.app.ActionBar
    public void c(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public void d(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean g() {
        ViewGroup viewGroupA = this.a.a();
        if (viewGroupA == null || viewGroupA.hasFocus()) {
            return false;
        }
        viewGroupA.requestFocus();
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public int a() {
        return this.a.o();
    }

    @Override // android.support.v7.app.ActionBar
    public boolean b() {
        return this.a.q() == 0;
    }

    @Override // android.support.v7.app.ActionBar
    public boolean e() {
        this.a.a().removeCallbacks(this.f);
        ai.a(this.a.a(), this.f);
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public boolean f() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    void i() {
        Menu menuJ = j();
        android.support.v7.view.menu.f fVar = menuJ instanceof android.support.v7.view.menu.f ? (android.support.v7.view.menu.f) menuJ : null;
        if (fVar != null) {
            fVar.g();
        }
        try {
            menuJ.clear();
            if (!this.b.onCreatePanelMenu(0, menuJ) || !this.b.onPreparePanel(0, null, menuJ)) {
                menuJ.clear();
            }
        } finally {
            if (fVar != null) {
                fVar.h();
            }
        }
    }

    @Override // android.support.v7.app.ActionBar
    public boolean a(int i, KeyEvent keyEvent) {
        Menu menuJ = j();
        if (menuJ != null) {
            menuJ.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            menuJ.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    void h() {
        this.a.a().removeCallbacks(this.f);
    }

    @Override // android.support.v7.app.ActionBar
    public void e(boolean z) {
        if (z != this.d) {
            this.d = z;
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                this.e.get(i).a(z);
            }
        }
    }

    private Menu j() {
        AnonymousClass1 anonymousClass1 = null;
        if (!this.c) {
            this.a.a(new a(this, anonymousClass1), new b(this, anonymousClass1));
            this.c = true;
        }
        return this.a.r();
    }

    private final class a implements l.a {
        private boolean b;

        private a() {
        }

        /* synthetic */ a(k kVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.support.v7.view.menu.l.a
        public boolean a_(android.support.v7.view.menu.f fVar) {
            if (k.this.b == null) {
                return false;
            }
            k.this.b.onMenuOpened(108, fVar);
            return true;
        }

        @Override // android.support.v7.view.menu.l.a
        public void a(android.support.v7.view.menu.f fVar, boolean z) {
            if (!this.b) {
                this.b = true;
                k.this.a.n();
                if (k.this.b != null) {
                    k.this.b.onPanelClosed(108, fVar);
                }
                this.b = false;
            }
        }
    }

    private final class b implements f.a {
        private b() {
        }

        /* synthetic */ b(k kVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.support.v7.view.menu.f.a
        public boolean a(android.support.v7.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // android.support.v7.view.menu.f.a
        public void a(android.support.v7.view.menu.f fVar) {
            if (k.this.b != null) {
                if (k.this.a.i()) {
                    k.this.b.onPanelClosed(108, fVar);
                } else if (k.this.b.onPreparePanel(0, null, fVar)) {
                    k.this.b.onMenuOpened(108, fVar);
                }
            }
        }
    }
}
