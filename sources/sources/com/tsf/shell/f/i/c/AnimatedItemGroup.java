package com.tsf.shell.f.i.c;

import com.censivn.C3DEngine.b.f.IRenderable;
import com.censivn.C3DEngine.b.f.BaseRenderable;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AnimatedItemGroup extends ItemGroupBase {
    private BaseRenderable k;
    private com.tsf.shell.f.i.b.a.ItemContainer l;

    public AnimatedItemGroup() {
        b(true);
    }

    @Override // com.tsf.shell.f.i.c.ItemGroupBase, com.tsf.shell.f.i.c.ItemLabelProvider
    public void b() {
        if (this.l != null) {
            this.l.g();
        }
    }

    @Override // com.tsf.shell.f.i.c.ItemGroupBase
    public i a(boolean z) {
        if (this.k == null) {
            this.k = p();
        } else {
            this.l.f();
        }
        return this.k;
    }

    private BaseRenderable p() {
        j jVar = new BaseRenderable() { // from class: com.tsf.shell.f.i.c.a.1
            int a = 0;
            double b = 0.017453292519943295d;

            @Override // com.censivn.C3DEngine.b.f.IRenderable
            public void onDrawStart() {
                rotation().y = (-19.0f) + (((float) Math.sin(this.b * ((double) this.a))) * 19.0f);
                this.a += 2;
            }
        };
        this.l = new com.tsf.shell.f.i.b.a.ItemContainer(false);
        this.l.scale().setAll(0.54f, 0.54f, 0.54f);
        this.l.setAnimationObjectState(true);
        jVar.addChild(this.l);
        return jVar;
    }
}
