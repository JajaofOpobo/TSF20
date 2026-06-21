package com.tsf.shell.e.i.b.e;

/* loaded from: classes.dex */
public class g extends i {
    private com.tsf.shell.manager.a.i a;

    public g() {
        this.k.visible(true);
    }

    @Override // com.tsf.shell.e.i.b.e.i, com.tsf.shell.e.i.b.e.b
    protected void k() {
    }

    @Override // com.tsf.shell.e.i.b.e.i
    public void aV() {
        this.a.a();
    }

    @Override // com.tsf.shell.e.i.b.e.i, com.tsf.shell.e.i.b.e.b
    public void l() {
        this.a.a();
    }

    public void a(i iVar) {
        this.a = iVar.bd();
        this.k.textures().removeAll();
        this.k.textures().addElement(this.a.d);
    }

    public void aW() {
        this.k.textures().removeAll();
        this.a = null;
    }
}
