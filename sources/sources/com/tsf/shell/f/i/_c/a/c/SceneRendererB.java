package com.tsf.shell.f.i._c.a.c;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneRendererB {
    private com.censivn.C3DEngine.b.f._a.AltSpriteItemData a;
    private float b;
    private float c;

    public SceneRendererB(com.censivn.C3DEngine.b.f._a.AltSpriteItemData bVar, float f, float f2) {
        this.a = bVar;
        this.b = f;
        this.c = f2;
        a(f, f2);
    }

    public void a(float f, float f2) {
        double radians = Math.toRadians(f2);
        float fSin = (float) (Math.sin(radians) * ((double) f));
        this.a.i().x = (float) (Math.cos(radians) * ((double) f));
        this.a.i().y = fSin;
        this.a.h();
    }

    public void a() {
        com.censivn.C3DEngine.b.g.d dVar = new com.censivn.C3DEngine.b.g.d() { // from class: com.tsf.shell.f.i._c.a.c.SceneRendererB.1
            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                DeferredWidgetGroup.this.a(((float) (30.0d * Math.sin(((double) f) * 3.141592653589793d))) + DeferredWidgetGroup.this.b, DeferredWidgetGroup.this.c);
            }
        };
        com.censivn.C3DEngine.b.g.c.a(this.a);
        com.censivn.C3DEngine.b.g.c.a(this.a, 1000, dVar);
    }
}
