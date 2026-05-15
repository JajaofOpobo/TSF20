package com.tsf.shell.f.i.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class e extends g {
    private com.tsf.shell.manager.a.f a;

    public e() {
        this.k.visible(true);
    }

    @Override // com.tsf.shell.f.i.b.e.g, com.tsf.shell.f.i.b.e.b
    protected void k() {
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
