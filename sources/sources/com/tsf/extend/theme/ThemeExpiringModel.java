package com.tsf.extend.theme;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeExpiringModel extends ThemePagedModel {
    public static long a = 86400000;
    private boolean b;
    private int c = 2;

    @Override // com.tsf.extend.theme.ThemePagedModel
    public boolean l() {
        return this.b;
    }

    @Override // com.tsf.extend.theme.ThemePagedModel
    public void b(boolean z) {
        this.b = z;
    }

    @Override // com.tsf.extend.theme.ThemePagedModel, com.tsf.extend.base.b.PagedListModel
    public boolean h() {
        return b();
    }

    @Override // com.tsf.extend.base.b.PagedListModel
    public boolean d() {
        return System.currentTimeMillis() - c() >= a;
    }
}
