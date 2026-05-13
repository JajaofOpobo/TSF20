package android.support.p013v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p013v7.app.AbstractC0580e;
import android.support.p013v7.view.AbstractC0607b;
import android.support.p013v7.view.C0612f;
import android.view.ActionMode;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.g */
/* loaded from: classes.dex */
public class C0583g extends C0582f {

    /* renamed from: r */
    private static C0595m f1302r;

    /* renamed from: s */
    private int f1303s;

    /* renamed from: t */
    private boolean f1304t;

    /* renamed from: u */
    private boolean f1305u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0583g(Context context, Window window, InterfaceC0578c interfaceC0578c) {
        super(context, window, interfaceC0578c);
        this.f1303s = -100;
        this.f1305u = true;
    }

    @Override // android.support.p013v7.app.AppCompatDelegateImplV7, android.support.p013v7.app.AbstractC0579d
    /* renamed from: a */
    public void mo11960a(Bundle bundle) {
        super.mo11960a(bundle);
        if (bundle != null && this.f1303s == -100) {
            this.f1303s = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: a */
    Window.Callback mo11953a(Window.Callback callback) {
        return new C0584a(callback);
    }

    @Override // android.support.p013v7.app.AbstractC0580e
    /* renamed from: n */
    public boolean mo11956n() {
        return this.f1305u;
    }

    @Override // android.support.p013v7.app.AbstractC0580e, android.support.p013v7.app.AbstractC0579d
    /* renamed from: h */
    public boolean mo11957h() {
        this.f1304t = true;
        int mo11952d = mo11952d(this.f1303s == -100 ? m11979i() : this.f1303s);
        if (mo11952d != -1) {
            return m11958e(mo11952d);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo11952d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                return m11955s().m11930a() ? 2 : 1;
            default:
                return i;
        }
    }

    @Override // android.support.p013v7.app.AbstractC0580e, android.support.p013v7.app.AbstractC0579d
    /* renamed from: c */
    public void mo11959c(Bundle bundle) {
        super.mo11959c(bundle);
        if (this.f1303s != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f1303s);
        }
    }

    /* renamed from: e */
    private boolean m11958e(int i) {
        Resources resources = this.f1287a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 != i3) {
            Configuration configuration2 = new Configuration(configuration);
            configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private C0595m m11955s() {
        if (f1302r == null) {
            f1302r = new C0595m(this.f1287a.getApplicationContext());
        }
        return f1302r;
    }

    /* renamed from: android.support.v7.app.g$a */
    /* loaded from: classes.dex */
    class C0584a extends AbstractC0580e.C0581a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C0584a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.p013v7.view.Window$CallbackC0619i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C0583g.this.mo11956n() ? m11954a(callback) : super.onWindowStartingActionMode(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode m11954a(ActionMode.Callback callback) {
            C0612f.C0613a c0613a = new C0612f.C0613a(C0583g.this.f1287a, callback);
            AbstractC0607b b = C0583g.this.m12082b(c0613a);
            if (b != null) {
                return c0613a.m11847b(b);
            }
            return null;
        }
    }
}
