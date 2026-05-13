package android.support.p013v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
/* renamed from: android.support.v7.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0607b {

    /* renamed from: a */
    private Object f1388a;

    /* renamed from: b */
    private boolean f1389b;

    /* renamed from: android.support.v7.view.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0608a {
        /* renamed from: a */
        void mo11851a(AbstractC0607b abstractC0607b);

        /* renamed from: a */
        boolean mo11850a(AbstractC0607b abstractC0607b, Menu menu);

        /* renamed from: a */
        boolean mo11849a(AbstractC0607b abstractC0607b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo11846b(AbstractC0607b abstractC0607b, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo11865a();

    /* renamed from: a */
    public abstract void mo11864a(int i);

    /* renamed from: a */
    public abstract void mo11863a(View view);

    /* renamed from: a */
    public abstract void mo11862a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo11860b();

    /* renamed from: b */
    public abstract void mo11859b(int i);

    /* renamed from: b */
    public abstract void mo11858b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo11857c();

    /* renamed from: d */
    public abstract void mo11856d();

    /* renamed from: f */
    public abstract CharSequence mo11855f();

    /* renamed from: g */
    public abstract CharSequence mo11854g();

    /* renamed from: i */
    public abstract View mo11852i();

    /* renamed from: a */
    public void m11871a(Object obj) {
        this.f1388a = obj;
    }

    /* renamed from: j */
    public Object m11870j() {
        return this.f1388a;
    }

    /* renamed from: a */
    public void mo11861a(boolean z) {
        this.f1389b = z;
    }

    /* renamed from: k */
    public boolean m11869k() {
        return this.f1389b;
    }

    /* renamed from: h */
    public boolean mo11853h() {
        return false;
    }
}
