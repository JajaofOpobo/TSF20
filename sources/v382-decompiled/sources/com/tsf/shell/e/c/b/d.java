package com.tsf.shell.e.c.b;

import com.tsf.shell.e.e.g;
import com.tsf.shell.manager.r.c.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends com.tsf.shell.e.e.f.e implements g {
    public d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(7);
        arrayList.add(6);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(4);
        a(arrayList, arrayList2);
    }

    public boolean a(g gVar, float f, float f2) {
        return false;
    }

    @Override // com.tsf.shell.e.e.g
    public int m() {
        return 1;
    }

    @Override // com.tsf.shell.e.e.g
    public g n() {
        return null;
    }

    @Override // com.tsf.shell.e.e.f.e
    public void a(final com.tsf.shell.e.i.e eVar) {
        Runnable runnable = new Runnable() { // from class: com.tsf.shell.e.c.b.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.removeChild(eVar);
            }
        };
        if (eVar instanceof com.tsf.shell.e.i.b.d.b) {
            i.a(eVar, null, runnable);
        } else {
            i.a(eVar, runnable);
        }
    }

    public boolean a() {
        return true;
    }

    @Override // com.tsf.shell.e.e.g
    public boolean o() {
        return false;
    }

    public void a(g gVar) {
    }

    public void d(g gVar) {
    }

    public void c(g gVar) {
    }

    public boolean b(g gVar) {
        return true;
    }

    public void e(g gVar) {
    }

    @Override // com.tsf.shell.e.e.g
    public void f(g gVar) {
    }

    @Override // com.tsf.shell.e.e.g
    public boolean h(g gVar) {
        return false;
    }

    @Override // com.tsf.shell.e.e.g
    public void g(g gVar) {
    }

    @Override // com.tsf.shell.e.e.g
    public void p() {
    }

    @Override // com.tsf.shell.e.e.g
    public g a(int i, int i2) {
        return null;
    }
}
