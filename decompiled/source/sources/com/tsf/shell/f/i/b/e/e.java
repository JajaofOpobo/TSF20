package com.tsf.shell.f.i.b.e;
/* loaded from: classes.dex */
public class e extends g {
    private com.tsf.shell.manager.a.f a;

    public e() {
        this.k.visible(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.f.i.b.e.g, com.tsf.shell.f.i.b.e.b
    public void k() {
    }

    @Override // com.tsf.shell.f.i.b.e.g
    public void aV() {
        this.a.a();
    }

    @Override // com.tsf.shell.f.i.b.e.g, com.tsf.shell.f.i.b.e.b
    public void l() {
        this.a.a();
    }

    public void a(g gVar) {
        this.a = gVar.bd();
        this.k.textures().removeAll();
        this.k.textures().addElement(this.a.d);
    }

    public void aW() {
        this.k.textures().removeAll();
        this.a = null;
    }
}
