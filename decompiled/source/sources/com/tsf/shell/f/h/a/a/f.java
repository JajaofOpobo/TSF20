package com.tsf.shell.f.h.a.a;

import com.tsf.b;
/* loaded from: classes.dex */
public class f extends c {
    public boolean a;

    public f() {
        super(b.i.text_recents);
        this.a = false;
        a(10);
        this.a = com.tsf.shell.manager.b.e.aw();
        if (!this.a) {
            visible(false);
        }
    }

    public void a(boolean z) {
        this.a = z;
        com.tsf.shell.manager.b.e.x(z);
        b(numChildren());
        if (!this.a) {
            b();
        }
    }

    @Override // com.tsf.shell.f.h.a.a.c
    public void b(int i) {
        if (i == 0 || !this.a) {
            visible(false);
        } else {
            visible(true);
        }
    }

    public boolean c() {
        return this.a;
    }
}
