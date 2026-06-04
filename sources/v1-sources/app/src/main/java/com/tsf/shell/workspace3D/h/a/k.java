package com.tsf.shell.workspace3D.h.a;

import com.tsf.shell.preference.SettingDrawerPreferenceActivity;
import com.tsf.shell.theme.inside.ThemeShellDescription;

/* loaded from: classes.dex */
public class k extends n {
    private x E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(x xVar) {
        super(r0);
        v vVar = new v();
        int[] iArr = new int[5];
        iArr[3] = 1;
        vVar.a = new int[][]{iArr, new int[]{0, 2, 0, 3, 1}, new int[]{1, 0, 1, 1, 2}};
        vVar.c = ThemeShellDescription.APP_PAGE_EDIT_ICON;
        vVar.b = new int[]{3, 0, 1, 1};
        this.E = xVar;
        i();
    }

    public final void i() {
        ((n) this).B.a(0).a(2, 0);
    }

    @Override // com.tsf.shell.workspace3D.h.a.n
    public final void j() {
        super.j();
        this.E.br();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        return true;
     */
    @Override // com.tsf.shell.workspace3D.h.a.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(int i) {
        switch (i) {
            case 0:
                if (this.E.by()) {
                    this.E.bx();
                    b(0, false);
                    i();
                    break;
                } else {
                    this.E.br();
                    this.E.bw();
                    b(0, true);
                    a(0, true);
                    break;
                }
            case 1:
                if (this.E.bv()) {
                    this.E.bt();
                    b(1, false);
                    i();
                    break;
                } else {
                    this.E.br();
                    this.E.bs();
                    b(1, true);
                    a(1, true);
                    break;
                }
            case 2:
                SettingDrawerPreferenceActivity.a();
                break;
        }
    }
}
