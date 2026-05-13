package android.support.p013v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.app.ActionBar;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.InterfaceC0643l;
import android.support.p013v7.widget.InterfaceC0754n;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.k */
/* loaded from: classes.dex */
public class C0590k extends ActionBar {

    /* renamed from: a */
    private InterfaceC0754n f1319a;

    /* renamed from: b */
    private Window.Callback f1320b;

    /* renamed from: c */
    private boolean f1321c;

    /* renamed from: d */
    private boolean f1322d;

    /* renamed from: e */
    private ArrayList<ActionBar.InterfaceC0547a> f1323e;

    /* renamed from: f */
    private final Runnable f1324f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.app.k$1 */
    /* loaded from: classes.dex */
    public class RunnableC05911 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0590k f1325a;

        @Override // java.lang.Runnable
        public void run() {
            this.f1325a.m11934i();
        }
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11916a(boolean z) {
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11924a(float f) {
        C0309ai.m12903e(this.f1319a.mo11155a(), f);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: c */
    public Context mo11909c() {
        return this.f1319a.mo11145b();
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: c */
    public void mo11907c(boolean z) {
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: d */
    public void mo11904d(boolean z) {
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11922a(Configuration configuration) {
        super.mo11922a(configuration);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public void mo11917a(CharSequence charSequence) {
        this.f1319a.mo11147a(charSequence);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: g */
    public boolean mo11898g() {
        ViewGroup mo11155a = this.f1319a.mo11155a();
        if (mo11155a == null || mo11155a.hasFocus()) {
            return false;
        }
        mo11155a.requestFocus();
        return true;
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public int mo11925a() {
        return this.f1319a.mo11129o();
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: b */
    public boolean mo11914b() {
        return this.f1319a.mo11127q() == 0;
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: e */
    public boolean mo11936e() {
        this.f1319a.mo11155a().removeCallbacks(this.f1324f);
        C0309ai.m12919a(this.f1319a.mo11155a(), this.f1324f);
        return true;
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: f */
    public boolean mo11901f() {
        if (this.f1319a.mo11142c()) {
            this.f1319a.mo11140d();
            return true;
        }
        return false;
    }

    /* renamed from: i */
    void m11934i() {
        Menu m11933j = m11933j();
        C0628f c0628f = m11933j instanceof C0628f ? (C0628f) m11933j : null;
        if (c0628f != null) {
            c0628f.m11752g();
        }
        try {
            m11933j.clear();
            if (!this.f1320b.onCreatePanelMenu(0, m11933j) || !this.f1320b.onPreparePanel(0, null, m11933j)) {
                m11933j.clear();
            }
        } finally {
            if (c0628f != null) {
                c0628f.m11751h();
            }
        }
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: a */
    public boolean mo11939a(int i, KeyEvent keyEvent) {
        Menu m11933j = m11933j();
        if (m11933j != null) {
            m11933j.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            m11933j.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: h */
    public void mo11935h() {
        this.f1319a.mo11155a().removeCallbacks(this.f1324f);
    }

    @Override // android.support.p013v7.app.ActionBar
    /* renamed from: e */
    public void mo11902e(boolean z) {
        if (z != this.f1322d) {
            this.f1322d = z;
            int size = this.f1323e.size();
            for (int i = 0; i < size; i++) {
                this.f1323e.get(i).m12121a(z);
            }
        }
    }

    /* renamed from: j */
    private Menu m11933j() {
        if (!this.f1321c) {
            this.f1319a.mo11151a(new C0592a(this, null), new C0593b(this, null));
            this.f1321c = true;
        }
        return this.f1319a.mo11126r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.k$a */
    /* loaded from: classes.dex */
    public final class C0592a implements InterfaceC0643l.InterfaceC0644a {

        /* renamed from: b */
        private boolean f1327b;

        private C0592a() {
        }

        /* synthetic */ C0592a(C0590k c0590k, RunnableC05911 runnableC05911) {
            this();
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a_ */
        public boolean mo11114a_(C0628f c0628f) {
            if (C0590k.this.f1320b != null) {
                C0590k.this.f1320b.onMenuOpened(108, c0628f);
                return true;
            }
            return false;
        }

        @Override // android.support.p013v7.view.menu.InterfaceC0643l.InterfaceC0644a
        /* renamed from: a */
        public void mo11116a(C0628f c0628f, boolean z) {
            if (!this.f1327b) {
                this.f1327b = true;
                C0590k.this.f1319a.mo11130n();
                if (C0590k.this.f1320b != null) {
                    C0590k.this.f1320b.onPanelClosed(108, c0628f);
                }
                this.f1327b = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.k$b */
    /* loaded from: classes.dex */
    public final class C0593b implements C0628f.InterfaceC0629a {
        private C0593b() {
        }

        /* synthetic */ C0593b(C0590k c0590k, RunnableC05911 runnableC05911) {
            this();
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public boolean mo11117a(C0628f c0628f, MenuItem menuItem) {
            return false;
        }

        @Override // android.support.p013v7.view.menu.C0628f.InterfaceC0629a
        /* renamed from: a */
        public void mo11118a(C0628f c0628f) {
            if (C0590k.this.f1320b != null) {
                if (C0590k.this.f1319a.mo11135i()) {
                    C0590k.this.f1320b.onPanelClosed(108, c0628f);
                } else if (C0590k.this.f1320b.onPreparePanel(0, null, c0628f)) {
                    C0590k.this.f1320b.onMenuOpened(108, c0628f);
                }
            }
        }
    }
}
