package com.tsf.shell.manager.action.toggle;

import android.content.Intent;
import com.tsf.shell.e.i.b.e.k;
import com.tsf.shell.e.i.b.e.l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {
    public int a;
    private boolean d = false;
    private l c = new l(this);
    public ArrayList b = new ArrayList();

    public b(int i) {
        this.a = 0;
        this.a = i;
    }

    public l a() {
        this.d = true;
        this.c.aW();
        return this.c;
    }

    public void b() {
        this.d = false;
        if (this.b.isEmpty()) {
            this.c.aX();
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void a(Intent intent) {
    }

    public void a(int i) {
        this.c.b(i);
    }

    public void b(int i) {
        this.c.c(i);
    }

    public void a(k kVar) {
        if (!this.b.contains(kVar)) {
            this.b.add(kVar);
            if (this.b.size() == 1) {
                f();
            }
            kVar.a(this.c);
        }
    }

    public void b(k kVar) {
        this.b.remove(kVar);
        kVar.aW();
        if (this.b.isEmpty() && !this.d) {
            e();
        }
    }

    public void e() {
        this.c.aX();
        g();
    }

    public void f() {
        this.c.aW();
    }

    public void g() {
    }
}
