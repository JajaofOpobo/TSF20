package com.tsf.shell.workspace3D.h.a;

import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public class as extends n {
    private int E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public as() {
        super(r0);
        v vVar = new v();
        int[] iArr = new int[5];
        iArr[3] = 1;
        vVar.a = new int[][]{iArr, new int[]{0, 2, 0, 3, 1}, new int[]{1, 0, 1, 1, 2}};
        vVar.c = ThemeShellDescription.APP_PAGE_SORT_ICON;
        vVar.b = new int[]{3, 0, 1, 1};
        this.E = com.tsf.shell.a.t.O();
        a(com.tsf.shell.a.t.O(), false);
        b(com.tsf.shell.a.t.O(), true);
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public boolean e(int i) {
        if (i == this.E) {
            return false;
        }
        b(this.E, false);
        this.E = i;
        b(this.E, true);
        a(i, false);
        return true;
    }
}
