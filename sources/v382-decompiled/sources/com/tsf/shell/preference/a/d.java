package com.tsf.shell.preference.a;

import com.tsf.shell.e.i.b.e.j;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {
    private static final int[] b = {0, 1, 8, 3, 4};
    private com.tsf.shell.e.c.b.e a = new com.tsf.shell.e.c.b.e(true);
    private ArrayList c = new ArrayList();

    public d() {
        for (int i = 0; i < 5; i++) {
            j jVar = new j(com.tsf.shell.manager.o.b.c);
            jVar.aL();
            this.c.add(jVar);
        }
        this.a.b();
        this.a.f();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            this.a.a(1, (com.tsf.shell.e.i.b.e.b) it.next());
        }
    }

    public com.tsf.shell.e.c.b.e a() {
        if (this.a == null) {
            this.a = new com.tsf.shell.e.c.b.e(true);
        }
        return this.a;
    }

    public void b() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                com.tsf.shell.e.i.b.e.b bVar = (com.tsf.shell.e.i.b.e.b) this.c.get(i2);
                bVar.k.textures().clear();
                bVar.k.textures().addElement(com.tsf.shell.manager.a.B.a.a(b[i2]));
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void c() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 5) {
                ((com.tsf.shell.e.i.b.e.b) this.c.get(i2)).k.textures().clear();
                com.tsf.shell.manager.a.B.a.b(b[i2]);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
