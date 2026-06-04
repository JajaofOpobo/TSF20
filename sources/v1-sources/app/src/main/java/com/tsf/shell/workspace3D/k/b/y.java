package com.tsf.shell.workspace3D.k.b;

import com.tsf.shell.theme.inside.ThemeShellDescription;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class y {
    final /* synthetic */ k a;
    private ArrayList b = new ArrayList();
    private ArrayList c = new ArrayList();
    private int d = ThemeShellDescription.PICKER_MENU;
    private int e = ThemeShellDescription.PAGE_PREVIEW_SELECT;

    public y(k kVar) {
        this.a = kVar;
        b();
    }

    private void b() {
        for (int i = 0; i < this.e; i++) {
            this.b.add(Integer.valueOf(this.d + i));
        }
        this.d += this.e;
    }

    public final int a() {
        int i;
        int intValue;
        int size = this.b.size();
        do {
            if (size == 0) {
                b();
                i = this.b.size();
            } else {
                i = size;
            }
            intValue = ((Integer) this.b.remove(i - 1)).intValue();
            size = i - 1;
        } while (this.c.contains(Integer.valueOf(intValue)));
        return intValue;
    }

    public final void a(Integer num) {
        if (this.c.contains(num)) {
            this.c.remove(num);
            this.b.add(num);
            String str = "release id:" + num + "   pool size:" + this.b.size();
        }
    }

    public final void b(Integer num) {
        if (!this.c.contains(num)) {
            this.c.add(num);
        }
    }
}
