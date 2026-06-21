package com.tsf.shell.e.h.a.a;

import com.tsf.shell.R;
import com.tsf.shell.manager.b.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends c {
    public boolean a;

    public f() {
        super(R.string.text_recents);
        this.a = false;
        b(10);
        this.a = g.au();
        if (!this.a) {
            visible(false);
        }
    }

    public void b(boolean z) {
        this.a = z;
        g.w(z);
        c(numChildren());
        if (!this.a) {
            e();
        }
    }

    @Override // com.tsf.shell.e.h.a.a.c
    public void c(int i) {
        if (i == 0 || !this.a) {
            visible(false);
        } else {
            visible(true);
        }
    }

    @Override // com.tsf.shell.e.h.a.a.c
    public ArrayList a(int i) {
        return com.tsf.shell.manager.c.d.a(i);
    }

    public boolean f() {
        return this.a;
    }
}
