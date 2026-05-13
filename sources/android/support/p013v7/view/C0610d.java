package android.support.p013v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.support.p013v7.p014a.C0535a;
import android.view.LayoutInflater;
/* renamed from: android.support.v7.view.d */
/* loaded from: classes.dex */
public class C0610d extends ContextWrapper {

    /* renamed from: a */
    private int f1390a;

    /* renamed from: b */
    private Resources.Theme f1391b;

    /* renamed from: c */
    private LayoutInflater f1392c;

    public C0610d(Context context, int i) {
        super(context);
        this.f1390a = i;
    }

    public C0610d(Context context, Resources.Theme theme) {
        super(context);
        this.f1391b = theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1390a != i) {
            this.f1390a = i;
            m11866b();
        }
    }

    /* renamed from: a */
    public int m11868a() {
        return this.f1390a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        if (this.f1391b != null) {
            return this.f1391b;
        }
        if (this.f1390a == 0) {
            this.f1390a = C0535a.C0545j.Theme_AppCompat_Light;
        }
        m11866b();
        return this.f1391b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1392c == null) {
                this.f1392c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1392c;
        }
        return getBaseContext().getSystemService(str);
    }

    /* renamed from: a */
    protected void m11867a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: b */
    private void m11866b() {
        boolean z = this.f1391b == null;
        if (z) {
            this.f1391b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1391b.setTo(theme);
            }
        }
        m11867a(this.f1391b, this.f1390a, z);
    }
}
