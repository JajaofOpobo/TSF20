package com.tsf.shell.plugin.themepicker.themepreview;

import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
class b extends p {
    final /* synthetic */ ThemePreviewDetilActivity a;
    private ArrayList b;
    private String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ThemePreviewDetilActivity themePreviewDetilActivity, android.support.v4.app.k kVar, ArrayList arrayList, String str) {
        super(kVar);
        this.a = themePreviewDetilActivity;
        this.b = arrayList;
        this.c = str;
    }

    @Override // android.support.v4.app.p
    public Fragment a(int i) {
        return c.a(this.c, (Integer) this.b.get(i));
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }
}
