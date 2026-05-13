package android.support.p013v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.support.p013v7.app.AbstractC0579d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* renamed from: android.support.v7.widget.x */
/* loaded from: classes.dex */
public class C0772x extends ContextWrapper {

    /* renamed from: a */
    private static final ArrayList<WeakReference<C0772x>> f2235a = new ArrayList<>();

    /* renamed from: b */
    private Resources f2236b;

    /* renamed from: c */
    private final Resources.Theme f2237c;

    /* renamed from: a */
    public static Context m11063a(Context context) {
        if (m11062b(context)) {
            int size = f2235a.size();
            for (int i = 0; i < size; i++) {
                WeakReference<C0772x> weakReference = f2235a.get(i);
                C0772x c0772x = weakReference != null ? weakReference.get() : null;
                if (c0772x != null && c0772x.getBaseContext() == context) {
                    return c0772x;
                }
            }
            C0772x c0772x2 = new C0772x(context);
            f2235a.add(new WeakReference<>(c0772x2));
            return c0772x2;
        }
        return context;
    }

    /* renamed from: b */
    private static boolean m11062b(Context context) {
        if ((context instanceof C0772x) || (context.getResources() instanceof C0774z) || (context.getResources() instanceof C0729ac)) {
            return false;
        }
        return !AbstractC0579d.m11978j() || Build.VERSION.SDK_INT <= 20;
    }

    private C0772x(Context context) {
        super(context);
        if (C0729ac.m11262a()) {
            this.f2237c = getResources().newTheme();
            this.f2237c.setTo(context.getTheme());
            return;
        }
        this.f2237c = null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return this.f2237c == null ? super.getTheme() : this.f2237c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f2237c == null) {
            super.setTheme(i);
        } else {
            this.f2237c.applyStyle(i, true);
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f2236b == null) {
            this.f2236b = this.f2237c == null ? new C0774z(this, super.getResources()) : new C0729ac(this, super.getResources());
        }
        return this.f2236b;
    }
}
