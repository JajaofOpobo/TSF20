package com.tsf.shell.preference.a.a.a;

import com.censivn.C3DEngine.b.f.m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i extends h {
    private ArrayList<m> a;
    private com.censivn.C3DEngine.b.b.c b;

    public i(String str, float f) {
        super(str, f);
        this.a = new ArrayList<>();
        e().removeFromParent();
        this.b = new com.censivn.C3DEngine.b.b.c();
        this.b.setLayoutParams(new com.censivn.C3DEngine.b.b.b());
        this.b.mouseEnabled(false);
        addChild(this.b);
    }

    public void a(String str) {
        m mVar = new m();
        mVar.a(str);
        mVar.b(1);
        mVar.d(38);
        mVar.a(true);
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(0.0f);
        bVar.b = com.censivn.C3DEngine.b.b.a.a(15.0f);
        mVar.setLayoutParams(bVar);
        mVar.d(38);
        mVar.position().x = (-a()) / 2.0f;
        this.b.addChild(mVar);
        this.a.add(mVar);
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        for (m mVar : this.a) {
            mVar.position().x = (-i) / 2.0f;
            mVar.f(i);
            a(mVar);
        }
        this.b.d();
        com.censivn.C3DEngine.b.b.b layoutParams = this.b.getLayoutParams();
        layoutParams.h = this.b.minX();
        layoutParams.j = this.b.maxX();
        layoutParams.i = this.b.minY();
        layoutParams.k = this.b.maxY();
        super.c(i);
    }

    private void a(m mVar) {
        mVar.b();
        com.censivn.C3DEngine.b.b.b layoutParams = mVar.getLayoutParams();
        layoutParams.h = mVar.minX();
        layoutParams.j = mVar.maxX();
        layoutParams.i = mVar.minY();
        layoutParams.k = mVar.maxY();
    }

    @Override // com.tsf.shell.preference.a.a.a.h, com.censivn.C3DEngine.b.e.f
    public void g() {
        super.g();
        Iterator<m> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}
