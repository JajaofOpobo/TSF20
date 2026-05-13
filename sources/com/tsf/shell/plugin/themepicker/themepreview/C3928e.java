package com.tsf.shell.plugin.themepicker.themepreview;

import android.content.Context;
import android.support.p002v4.app.AbstractC0094o;
import android.support.p002v4.app.AbstractC0105r;
import android.support.p002v4.app.Fragment;
import com.tsf.shell.plugin.themepicker.C3852f;
/* renamed from: com.tsf.shell.plugin.themepicker.themepreview.e */
/* loaded from: classes.dex */
public class C3928e extends AbstractC0105r {

    /* renamed from: a */
    private static final int[] f12870a = {C3852f.C3862j.theme_picker_theme_bottom_installed, C3852f.C3862j.theme_picker_theme_bottom_featured};

    /* renamed from: b */
    private Context f12871b;

    public C3928e(AbstractC0094o abstractC0094o, Context context) {
        super(abstractC0094o);
        this.f12871b = context;
    }

    @Override // android.support.p002v4.app.AbstractC0105r
    /* renamed from: a */
    public Fragment mo990a(int i) {
        return i == 0 ? new C3920c() : new C3924d();
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: b */
    public int mo938b() {
        return 2;
    }

    @Override // android.support.p002v4.view.AbstractC0299ac
    /* renamed from: c */
    public CharSequence mo989c(int i) {
        return this.f12871b.getString(f12870a[i]);
    }
}
