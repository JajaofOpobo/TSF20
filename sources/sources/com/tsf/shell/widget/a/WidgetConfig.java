package com.tsf.shell.widget.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class WidgetConfig {
    private com.censivn.C3DEngine.b.f.sprite.SpriteItemData a;
    private float b;
    private float c;

    public WidgetConfig(com.censivn.C3DEngine.b.f.sprite.SpriteItemData bVar, float f, float f2) {
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
        com.censivn.C3DEngine.b.g.TweenParams dVar = new com.censivn.C3DEngine.b.g.TweenParams() { // from class: com.tsf.shell.widget.a.WidgetConfig.1
            @Override // com.censivn.C3DEngine.b.g.TweenParams
            public void a(float f) {
                WidgetConfig.this.a(((float) (30.0d * Math.sin(((double) f) * 3.141592653589793d))) + WidgetConfig.this.b, WidgetConfig.this.c);
            }
        };
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a);
        com.censivn.C3DEngine.b.g.TweenUtils.a(this.a, 1000, dVar);
    }
}
