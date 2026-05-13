package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.e;
import android.support.v7.view.f;
import android.view.ActionMode;
import android.view.Window;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g extends f {
    private static m r;
    private int s;
    private boolean t;
    private boolean u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, Window window, c cVar) {
        super(context, window, cVar);
        this.s = -100;
        this.u = true;
    }

    @Override // android.support.v7.app.AppCompatDelegateImplV7, android.support.v7.app.d
    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.s == -100) {
            this.s = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // android.support.v7.app.e
    Window.Callback a(Window.Callback callback) {
        return new a(callback);
    }

    @Override // android.support.v7.app.e
    public boolean n() {
        return this.u;
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public boolean h() {
        this.t = true;
        int d = d(this.s == -100 ? i() : this.s);
        if (d != -1) {
            return e(d);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                return s().a() ? 2 : 1;
            default:
                return i;
        }
    }

    @Override // android.support.v7.app.e, android.support.v7.app.d
    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.s != -100) {
            bundle.putInt("appcompat:local_night_mode", this.s);
        }
    }

    private boolean e(int i) {
        Resources resources = this.a.getResources();
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

    private m s() {
        if (r == null) {
            r = new m(this.a.getApplicationContext());
        }
        return r;
    }

    /* loaded from: classes.dex */
    class a extends e.a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // android.support.v7.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return g.this.n() ? a(callback) : super.onWindowStartingActionMode(callback);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final ActionMode a(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.a, callback);
            android.support.v7.view.b b = g.this.b(aVar);
            if (b != null) {
                return aVar.b(b);
            }
            return null;
        }
    }
}
