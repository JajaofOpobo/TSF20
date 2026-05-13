package android.support.p002v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* renamed from: android.support.v4.view.d */
/* loaded from: classes.dex */
public abstract class AbstractC0388d {

    /* renamed from: a */
    private final Context f786a;

    /* renamed from: b */
    private InterfaceC0389a f787b;

    /* renamed from: c */
    private InterfaceC0390b f788c;

    /* renamed from: android.support.v4.view.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0389a {
        /* renamed from: a */
        void mo11622a(boolean z);
    }

    /* renamed from: android.support.v4.view.d$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0390b {
        /* renamed from: a */
        void mo11711a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo11709a();

    public AbstractC0388d(Context context) {
        this.f786a = context;
    }

    /* renamed from: a */
    public View mo11700a(MenuItem menuItem) {
        return mo11709a();
    }

    /* renamed from: b */
    public boolean mo11699b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo11698c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo11707d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo11706e() {
        return false;
    }

    /* renamed from: a */
    public void mo11708a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void m12650a(boolean z) {
        if (this.f787b != null) {
            this.f787b.mo11622a(z);
        }
    }

    /* renamed from: a */
    public void m12651a(InterfaceC0389a interfaceC0389a) {
        this.f787b = interfaceC0389a;
    }

    /* renamed from: a */
    public void mo11701a(InterfaceC0390b interfaceC0390b) {
        if (this.f788c != null && interfaceC0390b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f788c = interfaceC0390b;
    }

    /* renamed from: f */
    public void m12649f() {
        this.f788c = null;
        this.f787b = null;
    }
}
