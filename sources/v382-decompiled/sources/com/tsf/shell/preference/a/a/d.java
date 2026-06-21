package com.tsf.shell.preference.a.a;

import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.m;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class d extends com.censivn.C3DEngine.b.e.h {
    final l b = new l();

    public d() {
        a(com.censivn.C3DEngine.b.b.a.a(200.0f));
        g(R.string.text_transparency);
        h(R.string.text_floating_button_transparency_summary);
        i(0);
        j(100);
        a(" %");
        m a = com.censivn.C3DEngine.b.b.a.a(128.0f, 128.0f);
        a.textures().addElement(com.tsf.shell.manager.a.o.b().a());
        m a2 = com.censivn.C3DEngine.b.b.a.a(46.0f, 46.0f);
        a2.textures().addElement(com.tsf.shell.manager.a.o.b().b());
        this.b.addChild(a);
        this.b.addChild(a2);
        this.b.position().y = -com.censivn.C3DEngine.b.b.a.a(120.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.h, com.censivn.C3DEngine.b.e.k
    public void f(int i) {
        super.f(i);
        l(i);
    }

    @Override // com.censivn.C3DEngine.b.b.c, com.censivn.C3DEngine.b.f.l
    public void onDrawChildStart() {
        super.onDrawChildStart();
        this.b.dispatchDraw();
    }

    @Override // com.censivn.C3DEngine.b.e.k, com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        super.c(i);
        this.b.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(100.0f);
    }

    @Override // com.censivn.C3DEngine.b.e.k
    public void k(int i) {
        super.k(i);
        l(i);
    }

    private void l(int i) {
        this.b.alpha((i / 100.0f) * 255.0f);
    }
}
